package com.ruoyi.zngl.mapper;

import java.util.List;
import com.ruoyi.zngl.domain.ZnOrderDelivery;

/**
 * 订单配送管理Mapper接口
 * 
 * @author zngl
 * @date 2025-04-13
 */
public interface ZnOrderDeliveryMapper 
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
     * 删除订单配送管理
     * 
     * @param id 订单配送管理主键
     * @return 结果
     */
    public int deleteZnOrderDeliveryById(Long id);

    /**
     * 批量删除订单配送管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteZnOrderDeliveryByIds(Long[] ids);
}
