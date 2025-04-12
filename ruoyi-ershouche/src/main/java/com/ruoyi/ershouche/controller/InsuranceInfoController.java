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
import com.ruoyi.ershouche.domain.InsuranceInfo;
import com.ruoyi.ershouche.service.IInsuranceInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 保险信息管理Controller
 * 
 * @author zmts
 * @date 2025-04-12
 */
@RestController
@RequestMapping("/ershouche/insuranceinfo")
public class InsuranceInfoController extends BaseController
{
    @Autowired
    private IInsuranceInfoService insuranceInfoService;

    /**
     * 查询保险信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:insuranceinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(InsuranceInfo insuranceInfo)
    {
        startPage();
        List<InsuranceInfo> list = insuranceInfoService.selectInsuranceInfoList(insuranceInfo);
        return getDataTable(list);
    }

    /**
     * 导出保险信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('ershouche:insuranceinfo:export')")
    @Log(title = "保险信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InsuranceInfo insuranceInfo)
    {
        List<InsuranceInfo> list = insuranceInfoService.selectInsuranceInfoList(insuranceInfo);
        ExcelUtil<InsuranceInfo> util = new ExcelUtil<InsuranceInfo>(InsuranceInfo.class);
        util.exportExcel(response, list, "保险信息管理数据");
    }

    /**
     * 获取保险信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('ershouche:insuranceinfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(insuranceInfoService.selectInsuranceInfoById(id));
    }

    /**
     * 新增保险信息管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:insuranceinfo:add')")
    @Log(title = "保险信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InsuranceInfo insuranceInfo)
    {
        return toAjax(insuranceInfoService.insertInsuranceInfo(insuranceInfo));
    }

    /**
     * 修改保险信息管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:insuranceinfo:edit')")
    @Log(title = "保险信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InsuranceInfo insuranceInfo)
    {
        return toAjax(insuranceInfoService.updateInsuranceInfo(insuranceInfo));
    }

    /**
     * 删除保险信息管理
     */
    @PreAuthorize("@ss.hasPermi('ershouche:insuranceinfo:remove')")
    @Log(title = "保险信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(insuranceInfoService.deleteInsuranceInfoByIds(ids));
    }
}
