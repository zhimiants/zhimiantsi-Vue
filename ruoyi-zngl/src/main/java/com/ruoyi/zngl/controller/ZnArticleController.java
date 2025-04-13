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
import com.ruoyi.zngl.domain.ZnArticle;
import com.ruoyi.zngl.service.IZnArticleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农业资讯管理Controller
 * 
 * @author zmts
 * @date 2025-04-13
 */
@RestController
@RequestMapping("/zngl/article")
public class ZnArticleController extends BaseController
{
    @Autowired
    private IZnArticleService znArticleService;

    /**
     * 查询农业资讯管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:article:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZnArticle znArticle)
    {
        startPage();
        List<ZnArticle> list = znArticleService.selectZnArticleList(znArticle);
        return getDataTable(list);
    }

    /**
     * 导出农业资讯管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:article:export')")
    @Log(title = "农业资讯管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ZnArticle znArticle)
    {
        List<ZnArticle> list = znArticleService.selectZnArticleList(znArticle);
        ExcelUtil<ZnArticle> util = new ExcelUtil<ZnArticle>(ZnArticle.class);
        util.exportExcel(response, list, "农业资讯管理数据");
    }

    /**
     * 获取农业资讯管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('zngl:article:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(znArticleService.selectZnArticleById(id));
    }

    /**
     * 新增农业资讯管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:article:add')")
    @Log(title = "农业资讯管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZnArticle znArticle)
    {
        return toAjax(znArticleService.insertZnArticle(znArticle));
    }

    /**
     * 修改农业资讯管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:article:edit')")
    @Log(title = "农业资讯管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZnArticle znArticle)
    {
        return toAjax(znArticleService.updateZnArticle(znArticle));
    }

    /**
     * 删除农业资讯管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:article:remove')")
    @Log(title = "农业资讯管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(znArticleService.deleteZnArticleByIds(ids));
    }
}
