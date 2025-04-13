package com.ruoyi.zngl.mapper;

import java.util.List;
import com.ruoyi.zngl.domain.ZnTrainingCourse;

/**
 * 农业培训管理Mapper接口
 * 
 * @author zngl
 * @date 2025-04-13
 */
public interface ZnTrainingCourseMapper 
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
     * 删除农业培训管理
     * 
     * @param id 农业培训管理主键
     * @return 结果
     */
    public int deleteZnTrainingCourseById(Long id);

    /**
     * 批量删除农业培训管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteZnTrainingCourseByIds(Long[] ids);
}
