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
import com.ruoyi.zngl.domain.ZnFarmerProfile;
import com.ruoyi.zngl.service.IZnFarmerProfileService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农民信息管理Controller
 * 
 * @author zngl
 * @date 2025-04-13
 */
@RestController
@RequestMapping("/zngl/profile")
public class ZnFarmerProfileController extends BaseController
{
    @Autowired
    private IZnFarmerProfileService znFarmerProfileService;

    /**
     * 查询农民信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:profile:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZnFarmerProfile znFarmerProfile)
    {
        startPage();
        List<ZnFarmerProfile> list = znFarmerProfileService.selectZnFarmerProfileList(znFarmerProfile);
        return getDataTable(list);
    }

    /**
     * 导出农民信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:profile:export')")
    @Log(title = "农民信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ZnFarmerProfile znFarmerProfile)
    {
        List<ZnFarmerProfile> list = znFarmerProfileService.selectZnFarmerProfileList(znFarmerProfile);
        ExcelUtil<ZnFarmerProfile> util = new ExcelUtil<ZnFarmerProfile>(ZnFarmerProfile.class);
        util.exportExcel(response, list, "农民信息管理数据");
    }

    /**
     * 获取农民信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('zngl:profile:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(znFarmerProfileService.selectZnFarmerProfileById(id));
    }

    /**
     * 新增农民信息管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:profile:add')")
    @Log(title = "农民信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZnFarmerProfile znFarmerProfile)
    {
        return toAjax(znFarmerProfileService.insertZnFarmerProfile(znFarmerProfile));
    }

    /**
     * 修改农民信息管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:profile:edit')")
    @Log(title = "农民信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZnFarmerProfile znFarmerProfile)
    {
        return toAjax(znFarmerProfileService.updateZnFarmerProfile(znFarmerProfile));
    }

    /**
     * 删除农民信息管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:profile:remove')")
    @Log(title = "农民信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(znFarmerProfileService.deleteZnFarmerProfileByIds(ids));
    }
}
