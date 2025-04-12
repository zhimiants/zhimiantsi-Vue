package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ershouche.mapper.SupplierMapper;
import com.ruoyi.ershouche.domain.Supplier;
import com.ruoyi.ershouche.service.ISupplierService;

/**
 * 卖家信息管理Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class SupplierServiceImpl implements ISupplierService 
{
    @Autowired
    private SupplierMapper supplierMapper;

    /**
     * 查询卖家信息管理
     * 
     * @param id 卖家信息管理主键
     * @return 卖家信息管理
     */
    @Override
    public Supplier selectSupplierById(Long id)
    {
        return supplierMapper.selectSupplierById(id);
    }

    /**
     * 查询卖家信息管理列表
     * 
     * @param supplier 卖家信息管理
     * @return 卖家信息管理
     */
    @Override
    public List<Supplier> selectSupplierList(Supplier supplier)
    {
        return supplierMapper.selectSupplierList(supplier);
    }

    /**
     * 新增卖家信息管理
     * 
     * @param supplier 卖家信息管理
     * @return 结果
     */
    @Override
    public int insertSupplier(Supplier supplier)
    {
        supplier.setCreateTime(DateUtils.getNowDate());
        return supplierMapper.insertSupplier(supplier);
    }

    /**
     * 修改卖家信息管理
     * 
     * @param supplier 卖家信息管理
     * @return 结果
     */
    @Override
    public int updateSupplier(Supplier supplier)
    {
        supplier.setUpdateTime(DateUtils.getNowDate());
        return supplierMapper.updateSupplier(supplier);
    }

    /**
     * 批量删除卖家信息管理
     * 
     * @param ids 需要删除的卖家信息管理主键
     * @return 结果
     */
    @Override
    public int deleteSupplierByIds(Long[] ids)
    {
        return supplierMapper.deleteSupplierByIds(ids);
    }

    /**
     * 删除卖家信息管理信息
     * 
     * @param id 卖家信息管理主键
     * @return 结果
     */
    @Override
    public int deleteSupplierById(Long id)
    {
        return supplierMapper.deleteSupplierById(id);
    }
}
