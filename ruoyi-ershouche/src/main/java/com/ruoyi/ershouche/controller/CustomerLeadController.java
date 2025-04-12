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
import com.ruoyi.ershouche.domain.CustomerLead;
import com.ruoyi.ershouche.service.ICustomerLeadService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户线索管理Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/lead")
public class CustomerLeadController extends BaseController
{
    @Autowired
    private ICustomerLeadService customerLeadService;

    /**
     * 查询客户线索管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:lead:list')")
    @GetMapping("/list")
    public TableDataInfo list(CustomerLead customerLead)
    {
        startPage();
        List<CustomerLead> list = customerLeadService.selectCustomerLeadList(customerLead);
        return getDataTable(list);
    }

    /**
     * 导出客户线索管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:lead:export')")
    @Log(title = "客户线索管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CustomerLead customerLead)
    {
        List<CustomerLead> list = customerLeadService.selectCustomerLeadList(customerLead);
        ExcelUtil<CustomerLead> util = new ExcelUtil<CustomerLead>(CustomerLead.class);
        util.exportExcel(response, list, "客户线索管理数据");
    }

    /**
     * 获取客户线索管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:lead:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(customerLeadService.selectCustomerLeadById(id));
    }

    /**
     * 新增客户线索管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:lead:add')")
    @Log(title = "客户线索管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CustomerLead customerLead)
    {
        return toAjax(customerLeadService.insertCustomerLead(customerLead));
    }

    /**
     * 修改客户线索管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:lead:edit')")
    @Log(title = "客户线索管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CustomerLead customerLead)
    {
        return toAjax(customerLeadService.updateCustomerLead(customerLead));
    }

    /**
     * 删除客户线索管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:lead:remove')")
    @Log(title = "客户线索管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(customerLeadService.deleteCustomerLeadByIds(ids));
    }
}
