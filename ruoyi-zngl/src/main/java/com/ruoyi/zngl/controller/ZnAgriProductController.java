package com.ruoyi.zngl.controller;

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
import com.ruoyi.zngl.domain.ZnAgriProduct;
import com.ruoyi.zngl.service.IZnAgriProductService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农资商品管理Controller
 * 
 * @author zmts
 * @date 2025-04-13
 */
@RestController
@RequestMapping("/zngl/product")
public class ZnAgriProductController extends BaseController
{
    @Autowired
    private IZnAgriProductService znAgriProductService;

    /**
     * 查询农资商品管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:product:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZnAgriProduct znAgriProduct)
    {
        startPage();
        List<ZnAgriProduct> list = znAgriProductService.selectZnAgriProductList(znAgriProduct);
        return getDataTable(list);
    }

    /**
     * 导出农资商品管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:product:export')")
    @Log(title = "农资商品管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ZnAgriProduct znAgriProduct)
    {
        List<ZnAgriProduct> list = znAgriProductService.selectZnAgriProductList(znAgriProduct);
        ExcelUtil<ZnAgriProduct> util = new ExcelUtil<ZnAgriProduct>(ZnAgriProduct.class);
        util.exportExcel(response, list, "农资商品管理数据");
    }

    /**
     * 获取农资商品管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('zngl:product:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(znAgriProductService.selectZnAgriProductById(id));
    }

    /**
     * 新增农资商品管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:product:add')")
    @Log(title = "农资商品管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZnAgriProduct znAgriProduct)
    {
        return toAjax(znAgriProductService.insertZnAgriProduct(znAgriProduct));
    }

    /**
     * 修改农资商品管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:product:edit')")
    @Log(title = "农资商品管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZnAgriProduct znAgriProduct)
    {
        return toAjax(znAgriProductService.updateZnAgriProduct(znAgriProduct));
    }

    /**
     * 删除农资商品管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:product:remove')")
    @Log(title = "农资商品管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(znAgriProductService.deleteZnAgriProductByIds(ids));
    }
}
