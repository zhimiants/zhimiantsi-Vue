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
import com.ruoyi.zngl.domain.ZnTrainingCourse;
import com.ruoyi.zngl.service.IZnTrainingCourseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农业培训管理Controller
 * 
 * @author zngl
 * @date 2025-04-13
 */
@RestController
@RequestMapping("/zngl/course")
public class ZnTrainingCourseController extends BaseController
{
    @Autowired
    private IZnTrainingCourseService znTrainingCourseService;

    /**
     * 查询农业培训管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:course:list')")
    @GetMapping("/list")
    public TableDataInfo list(ZnTrainingCourse znTrainingCourse)
    {
        startPage();
        List<ZnTrainingCourse> list = znTrainingCourseService.selectZnTrainingCourseList(znTrainingCourse);
        return getDataTable(list);
    }

    /**
     * 导出农业培训管理列表
     */
    @PreAuthorize("@ss.hasPermi('zngl:course:export')")
    @Log(title = "农业培训管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ZnTrainingCourse znTrainingCourse)
    {
        List<ZnTrainingCourse> list = znTrainingCourseService.selectZnTrainingCourseList(znTrainingCourse);
        ExcelUtil<ZnTrainingCourse> util = new ExcelUtil<ZnTrainingCourse>(ZnTrainingCourse.class);
        util.exportExcel(response, list, "农业培训管理数据");
    }

    /**
     * 获取农业培训管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('zngl:course:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(znTrainingCourseService.selectZnTrainingCourseById(id));
    }

    /**
     * 新增农业培训管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:course:add')")
    @Log(title = "农业培训管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ZnTrainingCourse znTrainingCourse)
    {
        return toAjax(znTrainingCourseService.insertZnTrainingCourse(znTrainingCourse));
    }

    /**
     * 修改农业培训管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:course:edit')")
    @Log(title = "农业培训管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ZnTrainingCourse znTrainingCourse)
    {
        return toAjax(znTrainingCourseService.updateZnTrainingCourse(znTrainingCourse));
    }

    /**
     * 删除农业培训管理
     */
    @PreAuthorize("@ss.hasPermi('zngl:course:remove')")
    @Log(title = "农业培训管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(znTrainingCourseService.deleteZnTrainingCourseByIds(ids));
    }
}
