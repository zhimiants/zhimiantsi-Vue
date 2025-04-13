package com.ruoyi.zngl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zngl.mapper.ZnFarmerProfileMapper;
import com.ruoyi.zngl.domain.ZnFarmerProfile;
import com.ruoyi.zngl.service.IZnFarmerProfileService;

/**
 * 农民信息管理Service业务层处理
 * 
 * @author zngl
 * @date 2025-04-13
 */
@Service
public class ZnFarmerProfileServiceImpl implements IZnFarmerProfileService 
{
    @Autowired
    private ZnFarmerProfileMapper znFarmerProfileMapper;

    /**
     * 查询农民信息管理
     * 
     * @param id 农民信息管理主键
     * @return 农民信息管理
     */
    @Override
    public ZnFarmerProfile selectZnFarmerProfileById(Long id)
    {
        return znFarmerProfileMapper.selectZnFarmerProfileById(id);
    }

    /**
     * 查询农民信息管理列表
     * 
     * @param znFarmerProfile 农民信息管理
     * @return 农民信息管理
     */
    @Override
    public List<ZnFarmerProfile> selectZnFarmerProfileList(ZnFarmerProfile znFarmerProfile)
    {
        return znFarmerProfileMapper.selectZnFarmerProfileList(znFarmerProfile);
    }

    /**
     * 新增农民信息管理
     * 
     * @param znFarmerProfile 农民信息管理
     * @return 结果
     */
    @Override
    public int insertZnFarmerProfile(ZnFarmerProfile znFarmerProfile)
    {
        znFarmerProfile.setCreateTime(DateUtils.getNowDate());
        return znFarmerProfileMapper.insertZnFarmerProfile(znFarmerProfile);
    }

    /**
     * 修改农民信息管理
     * 
     * @param znFarmerProfile 农民信息管理
     * @return 结果
     */
    @Override
    public int updateZnFarmerProfile(ZnFarmerProfile znFarmerProfile)
    {
        znFarmerProfile.setUpdateTime(DateUtils.getNowDate());
        return znFarmerProfileMapper.updateZnFarmerProfile(znFarmerProfile);
    }

    /**
     * 批量删除农民信息管理
     * 
     * @param ids 需要删除的农民信息管理主键
     * @return 结果
     */
    @Override
    public int deleteZnFarmerProfileByIds(Long[] ids)
    {
        return znFarmerProfileMapper.deleteZnFarmerProfileByIds(ids);
    }

    /**
     * 删除农民信息管理信息
     * 
     * @param id 农民信息管理主键
     * @return 结果
     */
    @Override
    public int deleteZnFarmerProfileById(Long id)
    {
        return znFarmerProfileMapper.deleteZnFarmerProfileById(id);
    }
}
