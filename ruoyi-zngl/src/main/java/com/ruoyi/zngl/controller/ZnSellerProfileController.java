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
import com.ruoyi.zngl.domain.ZnSellerProfile;
import com.ruoyi.zngl.service.IZnSellerProfileService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 卖家信息管理Controller
 * 
 * @author zngl
 * @date 2025-04-13
 */
@RestController
@RequestMapping("/zngl/sellerprofile")
public class ZnSellerProfileController extends BaseController
{
    @Autowired
    private IZnSellerProfileService znSellerProfileService;

    /**
     * 查询卖家信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:sellerprofile:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZnSellerProfile znSellerProfile)
    {
        startPage();
        List<ZnSellerProfile> list = znSellerProfileService.selectZnSellerProfileList(znSellerProfile);
        return getDataTable(list);
    }

    /**
     * 导出卖家信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:sellerprofile:export')")
    @Log(title = "卖家信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ZnSellerProfile znSellerProfile)
    {
        List<ZnSellerProfile> list = znSellerProfileService.selectZnSellerProfileList(znSellerProfile);
        ExcelUtil<ZnSellerProfile> util = new ExcelUtil<ZnSellerProfile>(ZnSellerProfile.class);
        util.exportExcel(response, list, "卖家信息管理数据");
    }

    /**
     * 获取卖家信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('zngl:sellerprofile:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(znSellerProfileService.selectZnSellerProfileById(id));
    }

    /**
     * 新增卖家信息管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:sellerprofile:add')")
    @Log(title = "卖家信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZnSellerProfile znSellerProfile)
    {
        return toAjax(znSellerProfileService.insertZnSellerProfile(znSellerProfile));
    }

    /**
     * 修改卖家信息管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:sellerprofile:edit')")
    @Log(title = "卖家信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZnSellerProfile znSellerProfile)
    {
        return toAjax(znSellerProfileService.updateZnSellerProfile(znSellerProfile));
    }

    /**
     * 删除卖家信息管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:sellerprofile:remove')")
    @Log(title = "卖家信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(znSellerProfileService.deleteZnSellerProfileByIds(ids));
    }
}
