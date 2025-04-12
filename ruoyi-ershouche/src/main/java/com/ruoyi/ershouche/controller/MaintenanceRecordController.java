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
import com.ruoyi.ershouche.domain.MaintenanceRecord;
import com.ruoyi.ershouche.service.IMaintenanceRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 维修保养记录Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/maintenancerecord")
public class MaintenanceRecordController extends BaseController
{
    @Autowired
    private IMaintenanceRecordService maintenanceRecordService;

    /**
     * 查询维修保养记录列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:maintenancerecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(MaintenanceRecord maintenanceRecord)
    {
        startPage();
        List<MaintenanceRecord> list = maintenanceRecordService.selectMaintenanceRecordList(maintenanceRecord);
        return getDataTable(list);
    }

    /**
     * 导出维修保养记录列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:maintenancerecord:export')")
    @Log(title = "维修保养记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MaintenanceRecord maintenanceRecord)
    {
        List<MaintenanceRecord> list = maintenanceRecordService.selectMaintenanceRecordList(maintenanceRecord);
        ExcelUtil<MaintenanceRecord> util = new ExcelUtil<MaintenanceRecord>(MaintenanceRecord.class);
        util.exportExcel(response, list, "维修保养记录数据");
    }

    /**
     * 获取维修保养记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:maintenancerecord:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(maintenanceRecordService.selectMaintenanceRecordById(id));
    }

    /**
     * 新增维修保养记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:maintenancerecord:add')")
    @Log(title = "维修保养记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MaintenanceRecord maintenanceRecord)
    {
        return toAjax(maintenanceRecordService.insertMaintenanceRecord(maintenanceRecord));
    }

    /**
     * 修改维修保养记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:maintenancerecord:edit')")
    @Log(title = "维修保养记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MaintenanceRecord maintenanceRecord)
    {
        return toAjax(maintenanceRecordService.updateMaintenanceRecord(maintenanceRecord));
    }

    /**
     * 删除维修保养记录
     */
    @PreAuthorize("@ss.hasPermi('ershouche:maintenancerecord:remove')")
    @Log(title = "维修保养记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(maintenanceRecordService.deleteMaintenanceRecordByIds(ids));
    }
}
