package com.ruoyi.zngl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zngl.mapper.ZnOrderBaseMapper;
import com.ruoyi.zngl.domain.ZnOrderBase;
import com.ruoyi.zngl.service.IZnOrderBaseService;

/**
 * 订单管理Service业务层处理
 * 
 * @author zngl
 * @date 2025-04-13
 */
@Service
public class ZnOrderBaseServiceImpl implements IZnOrderBaseService 
{
    @Autowired
    private ZnOrderBaseMapper znOrderBaseMapper;

    /**
     * 查询订单管理
     * 
     * @param id 订单管理主键
     * @return 订单管理
     */
    @Override
    public ZnOrderBase selectZnOrderBaseById(Long id)
    {
        return znOrderBaseMapper.selectZnOrderBaseById(id);
    }

    /**
     * 查询订单管理列表
     * 
     * @param znOrderBase 订单管理
     * @return 订单管理
     */
    @Override
    public List<ZnOrderBase> selectZnOrderBaseList(ZnOrderBase znOrderBase)
    {
        return znOrderBaseMapper.selectZnOrderBaseList(znOrderBase);
    }

    /**
     * 新增订单管理
     * 
     * @param znOrderBase 订单管理
     * @return 结果
     */
    @Override
    public int insertZnOrderBase(ZnOrderBase znOrderBase)
    {
        znOrderBase.setCreateTime(DateUtils.getNowDate());
        return znOrderBaseMapper.insertZnOrderBase(znOrderBase);
    }

    /**
     * 修改订单管理
     * 
     * @param znOrderBase 订单管理
     * @return 结果
     */
    @Override
    public int updateZnOrderBase(ZnOrderBase znOrderBase)
    {
        znOrderBase.setUpdateTime(DateUtils.getNowDate());
        return znOrderBaseMapper.updateZnOrderBase(znOrderBase);
    }

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的订单管理主键
     * @return 结果
     */
    @Override
    public int deleteZnOrderBaseByIds(Long[] ids)
    {
        return znOrderBaseMapper.deleteZnOrderBaseByIds(ids);
    }

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理主键
     * @return 结果
     */
    @Override
    public int deleteZnOrderBaseById(Long id)
    {
        return znOrderBaseMapper.deleteZnOrderBaseById(id);
    }
}
