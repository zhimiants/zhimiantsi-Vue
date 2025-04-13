package com.ruoyi.zngl.mapper;

import java.util.List;
import com.ruoyi.zngl.domain.ZnOrderBase;

/**
 * 订单管理Mapper接口
 * 
 * @author zngl
 * @date 2025-04-13
 */
public interface ZnOrderBaseMapper 
{
    /**
     * 查询订单管理
     * 
     * @param id 订单管理主键
     * @return 订单管理
     */
    public ZnOrderBase selectZnOrderBaseById(Long id);

    /**
     * 查询订单管理列表
     * 
     * @param znOrderBase 订单管理
     * @return 订单管理集合
     */
    public List<ZnOrderBase> selectZnOrderBaseList(ZnOrderBase znOrderBase);

    /**
     * 新增订单管理
     * 
     * @param znOrderBase 订单管理
     * @return 结果
     */
    public int insertZnOrderBase(ZnOrderBase znOrderBase);

    /**
     * 修改订单管理
     * 
     * @param znOrderBase 订单管理
     * @return 结果
     */
    public int updateZnOrderBase(ZnOrderBase znOrderBase);

    /**
     * 删除订单管理
     * 
     * @param id 订单管理主键
     * @return 结果
     */
    public int deleteZnOrderBaseById(Long id);

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteZnOrderBaseByIds(Long[] ids);
}
