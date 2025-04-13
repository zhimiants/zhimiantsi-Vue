package com.ruoyi.zngl.service;

import java.util.List;
import com.ruoyi.zngl.domain.ZnTrainingCourse;

/**
 * 农业培训管理Service接口
 * 
 * @author zngl
 * @date 2025-04-13
 */
public interface IZnTrainingCourseService 
{
    /**
     * 查询农业培训管理
     * 
     * @param id 农业培训管理主键
     * @return 农业培训管理
     */
    public ZnTrainingCourse selectZnTrainingCourseById(Long id);

    /**
     * 查询农业培训管理列表
     * 
     * @param znTrainingCourse 农业培训管理
     * @return 农业培训管理集合
     */
    public List<ZnTrainingCourse> selectZnTrainingCourseList(ZnTrainingCourse znTrainingCourse);

    /**
     * 新增农业培训管理
     * 
     * @param znTrainingCourse 农业培训管理
     * @return 结果
     */
    public int insertZnTrainingCourse(ZnTrainingCourse znTrainingCourse);

    /**
     * 修改农业培训管理
     * 
     * @param znTrainingCourse 农业培训管理
     * @return 结果
     */
    public int updateZnTrainingCourse(ZnTrainingCourse znTrainingCourse);

    /**
     * 批量删除农业培训管理
     * 
     * @param ids 需要删除的农业培训管理主键集合
     * @return 结果
     */
    public int deleteZnTrainingCourseByIds(Long[] ids);

    /**
     * 删除农业培训管理信息
     * 
     * @param id 农业培训管理主键
     * @return 结果
     */
    public int deleteZnTrainingCourseById(Long id);
}
