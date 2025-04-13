package com.ruoyi.zngl.service;

import java.util.List;
import com.ruoyi.zngl.domain.ZnOrderDelivery;

/**
 * 订单配送管理Service接口
 * 
 * @author zngl
 * @date 2025-04-13
 */
public interface IZnOrderDeliveryService 
{
    /**
     * 查询订单配送管理
     * 
     * @param id 订单配送管理主键
     * @return 订单配送管理
     */
    public ZnOrderDelivery selectZnOrderDeliveryById(Long id);

    /**
     * 查询订单配送管理列表
     * 
     * @param znOrderDelivery 订单配送管理
     * @return 订单配送管理集合
     */
    public List<ZnOrderDelivery> selectZnOrderDeliveryList(ZnOrderDelivery znOrderDelivery);

    /**
     * 新增订单配送管理
     * 
     * @param znOrderDelivery 订单配送管理
     * @return 结果
     */
    public int insertZnOrderDelivery(ZnOrderDelivery znOrderDelivery);

    /**
     * 修改订单配送管理
     * 
     * @param znOrderDelivery 订单配送管理
     * @return 结果
     */
    public int updateZnOrderDelivery(ZnOrderDelivery znOrderDelivery);

    /**
     * 批量删除订单配送管理
     * 
     * @param ids 需要删除的订单配送管理主键集合
     * @return 结果
     */
    public int deleteZnOrderDeliveryByIds(Long[] ids);

    /**
     * 删除订单配送管理信息
     * 
     * @param id 订单配送管理主键
     * @return 结果
     */
    public int deleteZnOrderDeliveryById(Long id);
}
