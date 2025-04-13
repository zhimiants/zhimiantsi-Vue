package com.ruoyi.zngl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zngl.mapper.ZnOrderPaymentMapper;
import com.ruoyi.zngl.domain.ZnOrderPayment;
import com.ruoyi.zngl.service.IZnOrderPaymentService;

/**
 * 订单支付管理Service业务层处理
 * 
 * @author zngl
 * @date 2025-04-13
 */
@Service
public class ZnOrderPaymentServiceImpl implements IZnOrderPaymentService 
{
    @Autowired
    private ZnOrderPaymentMapper znOrderPaymentMapper;

    /**
     * 查询订单支付管理
     * 
     * @param id 订单支付管理主键
     * @return 订单支付管理
     */
    @Override
    public ZnOrderPayment selectZnOrderPaymentById(Long id)
    {
        return znOrderPaymentMapper.selectZnOrderPaymentById(id);
    }

    /**
     * 查询订单支付管理列表
     * 
     * @param znOrderPayment 订单支付管理
     * @return 订单支付管理
     */
    @Override
    public List<ZnOrderPayment> selectZnOrderPaymentList(ZnOrderPayment znOrderPayment)
    {
        return znOrderPaymentMapper.selectZnOrderPaymentList(znOrderPayment);
    }

    /**
     * 新增订单支付管理
     * 
     * @param znOrderPayment 订单支付管理
     * @return 结果
     */
    @Override
    public int insertZnOrderPayment(ZnOrderPayment znOrderPayment)
    {
        znOrderPayment.setCreateTime(DateUtils.getNowDate());
        return znOrderPaymentMapper.insertZnOrderPayment(znOrderPayment);
    }

    /**
     * 修改订单支付管理
     * 
     * @param znOrderPayment 订单支付管理
     * @return 结果
     */
    @Override
    public int updateZnOrderPayment(ZnOrderPayment znOrderPayment)
    {
        znOrderPayment.setUpdateTime(DateUtils.getNowDate());
        return znOrderPaymentMapper.updateZnOrderPayment(znOrderPayment);
    }

    /**
     * 批量删除订单支付管理
     * 
     * @param ids 需要删除的订单支付管理主键
     * @return 结果
     */
    @Override
    public int deleteZnOrderPaymentByIds(Long[] ids)
    {
        return znOrderPaymentMapper.deleteZnOrderPaymentByIds(ids);
    }

    /**
     * 删除订单支付管理信息
     * 
     * @param id 订单支付管理主键
     * @return 结果
     */
    @Override
    public int deleteZnOrderPaymentById(Long id)
    {
        return znOrderPaymentMapper.deleteZnOrderPaymentById(id);
    }
}
