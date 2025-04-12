package com.ruoyi.ershouche.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.ershouche.domain.CarInfo;
import com.ruoyi.ershouche.service.ICarInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆信息管理Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/info")
public class CarInfoController extends BaseController
{
    @Autowired
    private ICarInfoService carInfoService;

    /**
     * 查询车辆信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(CarInfo carInfo)
    {
        startPage();
        List<CarInfo> list = carInfoService.selectCarInfoList(carInfo);
        return getDataTable(list);
    }

    /**
     * 导出车辆信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:info:export')")
    @Log(title = "车辆信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CarInfo carInfo)
    {
        List<CarInfo> list = carInfoService.selectCarInfoList(carInfo);
        ExcelUtil<CarInfo> util = new ExcelUtil<CarInfo>(CarInfo.class);
        util.exportExcel(response, list, "车辆信息管理数据");
    }

    /**
     * 获取车辆信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(carInfoService.selectCarInfoById(id));
    }

    /**
     * 新增车辆信息管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:info:add')")
    @Log(title = "车辆信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CarInfo carInfo)
    {
        return toAjax(carInfoService.insertCarInfo(carInfo));
    }

    /**
     * 修改车辆信息管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:info:edit')")
    @Log(title = "车辆信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CarInfo carInfo)
    {
        return toAjax(carInfoService.updateCarInfo(carInfo));
    }

    /**
     * 删除车辆信息管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:info:remove')")
    @Log(title = "车辆信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(carInfoService.deleteCarInfoByIds(ids));
    }
}
