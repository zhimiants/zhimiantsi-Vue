package com.ruoyi.zngl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zngl.mapper.ZnSellerProfileMapper;
import com.ruoyi.zngl.domain.ZnSellerProfile;
import com.ruoyi.zngl.service.IZnSellerProfileService;

/**
 * 卖家信息管理Service业务层处理
 * 
 * @author zngl
 * @date 2025-04-13
 */
@Service
public class ZnSellerProfileServiceImpl implements IZnSellerProfileService 
{
    @Autowired
    private ZnSellerProfileMapper znSellerProfileMapper;

    /**
     * 查询卖家信息管理
     * 
     * @param id 卖家信息管理主键
     * @return 卖家信息管理
     */
    @Override
    public ZnSellerProfile selectZnSellerProfileById(Long id)
    {
        return znSellerProfileMapper.selectZnSellerProfileById(id);
    }

    /**
     * 查询卖家信息管理列表
     * 
     * @param znSellerProfile 卖家信息管理
     * @return 卖家信息管理
     */
    @Override
    public List<ZnSellerProfile> selectZnSellerProfileList(ZnSellerProfile znSellerProfile)
    {
        return znSellerProfileMapper.selectZnSellerProfileList(znSellerProfile);
    }

    /**
     * 新增卖家信息管理
     * 
     * @param znSellerProfile 卖家信息管理
     * @return 结果
     */
    @Override
    public int insertZnSellerProfile(ZnSellerProfile znSellerProfile)
    {
        znSellerProfile.setCreateTime(DateUtils.getNowDate());
        return znSellerProfileMapper.insertZnSellerProfile(znSellerProfile);
    }

    /**
     * 修改卖家信息管理
     * 
     * @param znSellerProfile 卖家信息管理
     * @return 结果
     */
    @Override
    public int updateZnSellerProfile(ZnSellerProfile znSellerProfile)
    {
        znSellerProfile.setUpdateTime(DateUtils.getNowDate());
        return znSellerProfileMapper.updateZnSellerProfile(znSellerProfile);
    }

    /**
     * 批量删除卖家信息管理
     * 
     * @param ids 需要删除的卖家信息管理主键
     * @return 结果
     */
    @Override
    public int deleteZnSellerProfileByIds(Long[] ids)
    {
        return znSellerProfileMapper.deleteZnSellerProfileByIds(ids);
    }

    /**
     * 删除卖家信息管理信息
     * 
     * @param id 卖家信息管理主键
     * @return 结果
     */
    @Override
    public int deleteZnSellerProfileById(Long id)
    {
        return znSellerProfileMapper.deleteZnSellerProfileById(id);
    }
}
