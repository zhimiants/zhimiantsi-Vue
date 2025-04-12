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
import com.ruoyi.ershouche.domain.PurchaseRecord;
import com.ruoyi.ershouche.service.IPurchaseRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆采购记录Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/purchaserecord")
public class PurchaseRecordController extends BaseController
{
    @Autowired
    private IPurchaseRecordService purchaseRecordService;

    /**
     * 查询车辆采购记录列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:purchaserecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(PurchaseRecord purchaseRecord)
    {
        startPage();
        List<PurchaseRecord> list = purchaseRecordService.selectPurchaseRecordList(purchaseRecord);
        return getDataTable(list);
    }

    /**
     * 导出车辆采购记录列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:purchaserecord:export')")
    @Log(title = "车辆采购记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PurchaseRecord purchaseRecord)
    {
        List<PurchaseRecord> list = purchaseRecordService.selectPurchaseRecordList(purchaseRecord);
        ExcelUtil<PurchaseRecord> util = new ExcelUtil<PurchaseRecord>(PurchaseRecord.class);
        util.exportExcel(response, list, "车辆采购记录数据");
    }

    /**
     * 获取车辆采购记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:purchaserecord:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(purchaseRecordService.selectPurchaseRecordById(id));
    }

    /**
     * 新增车辆采购记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:purchaserecord:add')")
    @Log(title = "车辆采购记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PurchaseRecord purchaseRecord)
    {
        return toAjax(purchaseRecordService.insertPurchaseRecord(purchaseRecord));
    }

    /**
     * 修改车辆采购记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:purchaserecord:edit')")
    @Log(title = "车辆采购记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PurchaseRecord purchaseRecord)
    {
        return toAjax(purchaseRecordService.updatePurchaseRecord(purchaseRecord));
    }

    /**
     * 删除车辆采购记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:purchaserecord:remove')")
    @Log(title = "车辆采购记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(purchaseRecordService.deletePurchaseRecordByIds(ids));
    }
}
