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
import com.ruoyi.ershouche.domain.CarModel;
import com.ruoyi.ershouche.service.ICarModelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆型号管理Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/model")
public class CarModelController extends BaseController
{
    @Autowired
    private ICarModelService carModelService;

    /**
     * 查询车辆型号管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:model:list')")
    @GetMapping("/list")
    public TableDataInfo list(CarModel carModel)
    {
        startPage();
        List<CarModel> list = carModelService.selectCarModelList(carModel);
        return getDataTable(list);
    }

    /**
     * 导出车辆型号管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:model:export')")
    @Log(title = "车辆型号管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CarModel carModel)
    {
        List<CarModel> list = carModelService.selectCarModelList(carModel);
        ExcelUtil<CarModel> util = new ExcelUtil<CarModel>(CarModel.class);
        util.exportExcel(response, list, "车辆型号管理数据");
    }

    /**
     * 获取车辆型号管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:model:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(carModelService.selectCarModelById(id));
    }

    /**
     * 新增车辆型号管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:model:add')")
    @Log(title = "车辆型号管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CarModel carModel)
    {
        return toAjax(carModelService.insertCarModel(carModel));
    }

    /**
     * 修改车辆型号管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:model:edit')")
    @Log(title = "车辆型号管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CarModel carModel)
    {
        return toAjax(carModelService.updateCarModel(carModel));
    }

    /**
     * 删除车辆型号管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:model:remove')")
    @Log(title = "车辆型号管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(carModelService.deleteCarModelByIds(ids));
    }
}
