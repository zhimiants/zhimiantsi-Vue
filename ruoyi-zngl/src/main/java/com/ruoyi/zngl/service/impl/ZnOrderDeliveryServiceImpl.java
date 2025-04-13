package com.ruoyi.zngl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zngl.mapper.ZnOrderDeliveryMapper;
import com.ruoyi.zngl.domain.ZnOrderDelivery;
import com.ruoyi.zngl.service.IZnOrderDeliveryService;

/**
 * 订单配送管理Service业务层处理
 * 
 * @author zngl
 * @date 2025-04-13
 */
@Service
public class ZnOrderDeliveryServiceImpl implements IZnOrderDeliveryService 
{
    @Autowired
    private ZnOrderDeliveryMapper znOrderDeliveryMapper;

    /**
     * 查询订单配送管理
     * 
     * @param id 订单配送管理主键
     * @return 订单配送管理
     */
    @Override
    public ZnOrderDelivery selectZnOrderDeliveryById(Long id)
    {
        return znOrderDeliveryMapper.selectZnOrderDeliveryById(id);
    }

    /**
     * 查询订单配送管理列表
     * 
     * @param znOrderDelivery 订单配送管理
     * @return 订单配送管理
     */
    @Override
    public List<ZnOrderDelivery> selectZnOrderDeliveryList(ZnOrderDelivery znOrderDelivery)
    {
        return znOrderDeliveryMapper.selectZnOrderDeliveryList(znOrderDelivery);
    }

    /**
     * 新增订单配送管理
     * 
     * @param znOrderDelivery 订单配送管理
     * @return 结果
     */
    @Override
    public int insertZnOrderDelivery(ZnOrderDelivery znOrderDelivery)
    {
        znOrderDelivery.setCreateTime(DateUtils.getNowDate());
        return znOrderDeliveryMapper.insertZnOrderDelivery(znOrderDelivery);
    }

    /**
     * 修改订单配送管理
     * 
     * @param znOrderDelivery 订单配送管理
     * @return 结果
     */
    @Override
    public int updateZnOrderDelivery(ZnOrderDelivery znOrderDelivery)
    {
        znOrderDelivery.setUpdateTime(DateUtils.getNowDate());
        return znOrderDeliveryMapper.updateZnOrderDelivery(znOrderDelivery);
    }

    /**
     * 批量删除订单配送管理
     * 
     * @param ids 需要删除的订单配送管理主键
     * @return 结果
     */
    @Override
    public int deleteZnOrderDeliveryByIds(Long[] ids)
    {
        return znOrderDeliveryMapper.deleteZnOrderDeliveryByIds(ids);
    }

    /**
     * 删除订单配送管理信息
     * 
     * @param id 订单配送管理主键
     * @return 结果
     */
    @Override
    public int deleteZnOrderDeliveryById(Long id)
    {
        return znOrderDeliveryMapper.deleteZnOrderDeliveryById(id);
    }
}
