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
import com.ruoyi.zngl.domain.ZnOrderPayment;
import com.ruoyi.zngl.service.IZnOrderPaymentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单支付管理Controller
 * 
 * @author zngl
 * @date 2025-04-13
 */
@RestController
@RequestMapping("/zngl/payment")
public class ZnOrderPaymentController extends BaseController
{
    @Autowired
    private IZnOrderPaymentService znOrderPaymentService;

    /**
     * 查询订单支付管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:payment:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZnOrderPayment znOrderPayment)
    {
        startPage();
        List<ZnOrderPayment> list = znOrderPaymentService.selectZnOrderPaymentList(znOrderPayment);
        return getDataTable(list);
    }

    /**
     * 导出订单支付管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:payment:export')")
    @Log(title = "订单支付管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ZnOrderPayment znOrderPayment)
    {
        List<ZnOrderPayment> list = znOrderPaymentService.selectZnOrderPaymentList(znOrderPayment);
        ExcelUtil<ZnOrderPayment> util = new ExcelUtil<ZnOrderPayment>(ZnOrderPayment.class);
        util.exportExcel(response, list, "订单支付管理数据");
    }

    /**
     * 获取订单支付管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('zngl:payment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(znOrderPaymentService.selectZnOrderPaymentById(id));
    }

    /**
     * 新增订单支付管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:payment:add')")
    @Log(title = "订单支付管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZnOrderPayment znOrderPayment)
    {
        return toAjax(znOrderPaymentService.insertZnOrderPayment(znOrderPayment));
    }

    /**
     * 修改订单支付管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:payment:edit')")
    @Log(title = "订单支付管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZnOrderPayment znOrderPayment)
    {
        return toAjax(znOrderPaymentService.updateZnOrderPayment(znOrderPayment));
    }

    /**
     * 删除订单支付管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:payment:remove')")
    @Log(title = "订单支付管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(znOrderPaymentService.deleteZnOrderPaymentByIds(ids));
    }
}
