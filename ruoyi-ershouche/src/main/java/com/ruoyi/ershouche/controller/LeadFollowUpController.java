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
import com.ruoyi.ershouche.domain.LeadFollowUp;
import com.ruoyi.ershouche.service.ILeadFollowUpService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 线索跟进记录Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/up")
public class LeadFollowUpController extends BaseController
{
    @Autowired
    private ILeadFollowUpService leadFollowUpService;

    /**
     * 查询线索跟进记录列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:up:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeadFollowUp leadFollowUp)
    {
        startPage();
        List<LeadFollowUp> list = leadFollowUpService.selectLeadFollowUpList(leadFollowUp);
        return getDataTable(list);
    }

    /**
     * 导出线索跟进记录列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:up:export')")
    @Log(title = "线索跟进记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeadFollowUp leadFollowUp)
    {
        List<LeadFollowUp> list = leadFollowUpService.selectLeadFollowUpList(leadFollowUp);
        ExcelUtil<LeadFollowUp> util = new ExcelUtil<LeadFollowUp>(LeadFollowUp.class);
        util.exportExcel(response, list, "线索跟进记录数据");
    }

    /**
     * 获取线索跟进记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:up:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(leadFollowUpService.selectLeadFollowUpById(id));
    }

    /**
     * 新增线索跟进记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:up:add')")
    @Log(title = "线索跟进记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeadFollowUp leadFollowUp)
    {
        return toAjax(leadFollowUpService.insertLeadFollowUp(leadFollowUp));
    }

    /**
     * 修改线索跟进记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:up:edit')")
    @Log(title = "线索跟进记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeadFollowUp leadFollowUp)
    {
        return toAjax(leadFollowUpService.updateLeadFollowUp(leadFollowUp));
    }

    /**
     * 删除线索跟进记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:up:remove')")
    @Log(title = "线索跟进记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(leadFollowUpService.deleteLeadFollowUpByIds(ids));
    }
}
