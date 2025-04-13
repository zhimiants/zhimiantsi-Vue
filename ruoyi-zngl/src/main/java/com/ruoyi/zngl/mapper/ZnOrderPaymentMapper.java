package com.ruoyi.zngl.mapper;

import java.util.List;
import com.ruoyi.zngl.domain.ZnOrderPayment;

/**
 * 订单支付管理Mapper接口
 * 
 * @author zngl
 * @date 2025-04-13
 */
public interface ZnOrderPaymentMapper 
{
    /**
     * 查询订单支付管理
     * 
     * @param id 订单支付管理主键
     * @return 订单支付管理
     */
    public ZnOrderPayment selectZnOrderPaymentById(Long id);

    /**
     * 查询订单支付管理列表
     * 
     * @param znOrderPayment 订单支付管理
     * @return 订单支付管理集合
     */
    public List<ZnOrderPayment> selectZnOrderPaymentList(ZnOrderPayment znOrderPayment);

    /**
     * 新增订单支付管理
     * 
     * @param znOrderPayment 订单支付管理
     * @return 结果
     */
    public int insertZnOrderPayment(ZnOrderPayment znOrderPayment);

    /**
     * 修改订单支付管理
     * 
     * @param znOrderPayment 订单支付管理
     * @return 结果
     */
    public int updateZnOrderPayment(ZnOrderPayment znOrderPayment);

    /**
     * 删除订单支付管理
     * 
     * @param id 订单支付管理主键
     * @return 结果
     */
    public int deleteZnOrderPaymentById(Long id);

    /**
     * 批量删除订单支付管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteZnOrderPaymentByIds(Long[] ids);
}
