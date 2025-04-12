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
import com.ruoyi.ershouche.domain.SalesRecord;
import com.ruoyi.ershouche.service.ISalesRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售记录Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/salesrecord")
public class SalesRecordController extends BaseController
{
    @Autowired
    private ISalesRecordService salesRecordService;

    /**
     * 查询销售记录列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:salesrecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(SalesRecord salesRecord)
    {
        startPage();
        List<SalesRecord> list = salesRecordService.selectSalesRecordList(salesRecord);
        return getDataTable(list);
    }

    /**
     * 导出销售记录列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:salesrecord:export')")
    @Log(title = "销售记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SalesRecord salesRecord)
    {
        List<SalesRecord> list = salesRecordService.selectSalesRecordList(salesRecord);
        ExcelUtil<SalesRecord> util = new ExcelUtil<SalesRecord>(SalesRecord.class);
        util.exportExcel(response, list, "销售记录数据");
    }

    /**
     * 获取销售记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:salesrecord:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(salesRecordService.selectSalesRecordById(id));
    }

    /**
     * 新增销售记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:salesrecord:add')")
    @Log(title = "销售记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SalesRecord salesRecord)
    {
        return toAjax(salesRecordService.insertSalesRecord(salesRecord));
    }

    /**
     * 修改销售记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:salesrecord:edit')")
    @Log(title = "销售记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SalesRecord salesRecord)
    {
        return toAjax(salesRecordService.updateSalesRecord(salesRecord));
    }

    /**
     * 删除销售记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:salesrecord:remove')")
    @Log(title = "销售记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(salesRecordService.deleteSalesRecordByIds(ids));
    }
}
