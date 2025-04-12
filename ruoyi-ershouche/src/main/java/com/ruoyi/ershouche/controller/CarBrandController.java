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
import com.ruoyi.ershouche.domain.CarBrand;
import com.ruoyi.ershouche.service.ICarBrandService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆品牌管理Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/brand")
public class CarBrandController extends BaseController
{
    @Autowired
    private ICarBrandService carBrandService;

    /**
     * 查询车辆品牌管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:brand:list')")
    @GetMapping("/list")
    public TableDataInfo list(CarBrand carBrand)
    {
        startPage();
        List<CarBrand> list = carBrandService.selectCarBrandList(carBrand);
        return getDataTable(list);
    }

    /**
     * 导出车辆品牌管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:brand:export')")
    @Log(title = "车辆品牌管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CarBrand carBrand)
    {
        List<CarBrand> list = carBrandService.selectCarBrandList(carBrand);
        ExcelUtil<CarBrand> util = new ExcelUtil<CarBrand>(CarBrand.class);
        util.exportExcel(response, list, "车辆品牌管理数据");
    }

    /**
     * 获取车辆品牌管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:brand:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(carBrandService.selectCarBrandById(id));
    }

    /**
     * 新增车辆品牌管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:brand:add')")
    @Log(title = "车辆品牌管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CarBrand carBrand)
    {
        return toAjax(carBrandService.insertCarBrand(carBrand));
    }

    /**
     * 修改车辆品牌管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:brand:edit')")
    @Log(title = "车辆品牌管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CarBrand carBrand)
    {
        return toAjax(carBrandService.updateCarBrand(carBrand));
    }

    /**
     * 删除车辆品牌管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:brand:remove')")
    @Log(title = "车辆品牌管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(carBrandService.deleteCarBrandByIds(ids));
    }
}
