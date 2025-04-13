package com.ruoyi.zngl.service;

import java.util.List;
import com.ruoyi.zngl.domain.ZnSellerProfile;

/**
 * 卖家信息管理Service接口
 * 
 * @author zngl
 * @date 2025-04-13
 */
public interface IZnSellerProfileService 
{
    /**
     * 查询卖家信息管理
     * 
     * @param id 卖家信息管理主键
     * @return 卖家信息管理
     */
    public ZnSellerProfile selectZnSellerProfileById(Long id);

    /**
     * 查询卖家信息管理列表
     * 
     * @param znSellerProfile 卖家信息管理
     * @return 卖家信息管理集合
     */
    public List<ZnSellerProfile> selectZnSellerProfileList(ZnSellerProfile znSellerProfile);

    /**
     * 新增卖家信息管理
     * 
     * @param znSellerProfile 卖家信息管理
     * @return 结果
     */
    public int insertZnSellerProfile(ZnSellerProfile znSellerProfile);

    /**
     * 修改卖家信息管理
     * 
     * @param znSellerProfile 卖家信息管理
     * @return 结果
     */
    public int updateZnSellerProfile(ZnSellerProfile znSellerProfile);

    /**
     * 批量删除卖家信息管理
     * 
     * @param ids 需要删除的卖家信息管理主键集合
     * @return 结果
     */
    public int deleteZnSellerProfileByIds(Long[] ids);

    /**
     * 删除卖家信息管理信息
     * 
     * @param id 卖家信息管理主键
     * @return 结果
     */
    public int deleteZnSellerProfileById(Long id);
}
