package com.ruoyi.zngl.mapper;

import java.util.List;
import com.ruoyi.zngl.domain.ZnFarmerProfile;

/**
 * 农民信息管理Mapper接口
 * 
 * @author zngl
 * @date 2025-04-13
 */
public interface ZnFarmerProfileMapper 
{
    /**
     * 查询农民信息管理
     * 
     * @param id 农民信息管理主键
     * @return 农民信息管理
     */
    public ZnFarmerProfile selectZnFarmerProfileById(Long id);

    /**
     * 查询农民信息管理列表
     * 
     * @param znFarmerProfile 农民信息管理
     * @return 农民信息管理集合
     */
    public List<ZnFarmerProfile> selectZnFarmerProfileList(ZnFarmerProfile znFarmerProfile);

    /**
     * 新增农民信息管理
     * 
     * @param znFarmerProfile 农民信息管理
     * @return 结果
     */
    public int insertZnFarmerProfile(ZnFarmerProfile znFarmerProfile);

    /**
     * 修改农民信息管理
     * 
     * @param znFarmerProfile 农民信息管理
     * @return 结果
     */
    public int updateZnFarmerProfile(ZnFarmerProfile znFarmerProfile);

    /**
     * 删除农民信息管理
     * 
     * @param id 农民信息管理主键
     * @return 结果
     */
    public int deleteZnFarmerProfileById(Long id);

    /**
     * 批量删除农民信息管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteZnFarmerProfileByIds(Long[] ids);
}
