package com.ruoyi.zngl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zngl.mapper.ZnTrainingCourseMapper;
import com.ruoyi.zngl.domain.ZnTrainingCourse;
import com.ruoyi.zngl.service.IZnTrainingCourseService;

/**
 * 农业培训管理Service业务层处理
 * 
 * @author zngl
 * @date 2025-04-13
 */
@Service
public class ZnTrainingCourseServiceImpl implements IZnTrainingCourseService 
{
    @Autowired
    private ZnTrainingCourseMapper znTrainingCourseMapper;

    /**
     * 查询农业培训管理
     * 
     * @param id 农业培训管理主键
     * @return 农业培训管理
     */
    @Override
    public ZnTrainingCourse selectZnTrainingCourseById(Long id)
    {
        return znTrainingCourseMapper.selectZnTrainingCourseById(id);
    }

    /**
     * 查询农业培训管理列表
     * 
     * @param znTrainingCourse 农业培训管理
     * @return 农业培训管理
     */
    @Override
    public List<ZnTrainingCourse> selectZnTrainingCourseList(ZnTrainingCourse znTrainingCourse)
    {
        return znTrainingCourseMapper.selectZnTrainingCourseList(znTrainingCourse);
    }

    /**
     * 新增农业培训管理
     * 
     * @param znTrainingCourse 农业培训管理
     * @return 结果
     */
    @Override
    public int insertZnTrainingCourse(ZnTrainingCourse znTrainingCourse)
    {
        znTrainingCourse.setCreateTime(DateUtils.getNowDate());
        return znTrainingCourseMapper.insertZnTrainingCourse(znTrainingCourse);
    }

    /**
     * 修改农业培训管理
     * 
     * @param znTrainingCourse 农业培训管理
     * @return 结果
     */
    @Override
    public int updateZnTrainingCourse(ZnTrainingCourse znTrainingCourse)
    {
        znTrainingCourse.setUpdateTime(DateUtils.getNowDate());
        return znTrainingCourseMapper.updateZnTrainingCourse(znTrainingCourse);
    }

    /**
     * 批量删除农业培训管理
     * 
     * @param ids 需要删除的农业培训管理主键
     * @return 结果
     */
    @Override
    public int deleteZnTrainingCourseByIds(Long[] ids)
    {
        return znTrainingCourseMapper.deleteZnTrainingCourseByIds(ids);
    }

    /**
     * 删除农业培训管理信息
     * 
     * @param id 农业培训管理主键
     * @return 结果
     */
    @Override
    public int deleteZnTrainingCourseById(Long id)
    {
        return znTrainingCourseMapper.deleteZnTrainingCourseById(id);
    }
}
