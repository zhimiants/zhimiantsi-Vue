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
import com.ruoyi.zngl.domain.ZnOrderDelivery;
import com.ruoyi.zngl.service.IZnOrderDeliveryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单配送管理Controller
 * 
 * @author zngl
 * @date 2025-04-13
 */
@RestController
@RequestMapping("/zngl/delivery")
public class ZnOrderDeliveryController extends BaseController
{
    @Autowired
    private IZnOrderDeliveryService znOrderDeliveryService;

    /**
     * 查询订单配送管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:delivery:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZnOrderDelivery znOrderDelivery)
    {
        startPage();
        List<ZnOrderDelivery> list = znOrderDeliveryService.selectZnOrderDeliveryList(znOrderDelivery);
        return getDataTable(list);
    }

    /**
     * 导出订单配送管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:delivery:export')")
    @Log(title = "订单配送管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ZnOrderDelivery znOrderDelivery)
    {
        List<ZnOrderDelivery> list = znOrderDeliveryService.selectZnOrderDeliveryList(znOrderDelivery);
        ExcelUtil<ZnOrderDelivery> util = new ExcelUtil<ZnOrderDelivery>(ZnOrderDelivery.class);
        util.exportExcel(response, list, "订单配送管理数据");
    }

    /**
     * 获取订单配送管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('zngl:delivery:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(znOrderDeliveryService.selectZnOrderDeliveryById(id));
    }

    /**
     * 新增订单配送管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:delivery:add')")
    @Log(title = "订单配送管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZnOrderDelivery znOrderDelivery)
    {
        return toAjax(znOrderDeliveryService.insertZnOrderDelivery(znOrderDelivery));
    }

    /**
     * 修改订单配送管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:delivery:edit')")
    @Log(title = "订单配送管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZnOrderDelivery znOrderDelivery)
    {
        return toAjax(znOrderDeliveryService.updateZnOrderDelivery(znOrderDelivery));
    }

    /**
     * 删除订单配送管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:delivery:remove')")
    @Log(title = "订单配送管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(znOrderDeliveryService.deleteZnOrderDeliveryByIds(ids));
    }
}
