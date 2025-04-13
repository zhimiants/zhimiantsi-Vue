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
import com.ruoyi.zngl.domain.ZnOrderBase;
import com.ruoyi.zngl.service.IZnOrderBaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单管理Controller
 * 
 * @author zngl
 * @date 2025-04-13
 */
@RestController
@RequestMapping("/zngl/base")
public class ZnOrderBaseController extends BaseController
{
    @Autowired
    private IZnOrderBaseService znOrderBaseService;

    /**
     * 查询订单管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:base:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZnOrderBase znOrderBase)
    {
        startPage();
        List<ZnOrderBase> list = znOrderBaseService.selectZnOrderBaseList(znOrderBase);
        return getDataTable(list);
    }

    /**
     * 导出订单管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:base:export')")
    @Log(title = "订单管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ZnOrderBase znOrderBase)
    {
        List<ZnOrderBase> list = znOrderBaseService.selectZnOrderBaseList(znOrderBase);
        ExcelUtil<ZnOrderBase> util = new ExcelUtil<ZnOrderBase>(ZnOrderBase.class);
        util.exportExcel(response, list, "订单管理数据");
    }

    /**
     * 获取订单管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('zngl:base:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(znOrderBaseService.selectZnOrderBaseById(id));
    }

    /**
     * 新增订单管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:base:add')")
    @Log(title = "订单管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZnOrderBase znOrderBase)
    {
        return toAjax(znOrderBaseService.insertZnOrderBase(znOrderBase));
    }

    /**
     * 修改订单管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:base:edit')")
    @Log(title = "订单管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZnOrderBase znOrderBase)
    {
        return toAjax(znOrderBaseService.updateZnOrderBase(znOrderBase));
    }

    /**
     * 删除订单管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:base:remove')")
    @Log(title = "订单管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(znOrderBaseService.deleteZnOrderBaseByIds(ids));
    }
}
