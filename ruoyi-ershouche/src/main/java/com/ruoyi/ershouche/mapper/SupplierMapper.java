package com.ruoyi.ershouche.mapper;

import java.util.List;
import com.ruoyi.ershouche.domain.Supplier;

/**
 * 卖家信息管理Mapper接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface SupplierMapper 
{
    /**
     * 查询卖家信息管理
     * 
     * @param id 卖家信息管理主键
     * @return 卖家信息管理
     */
    public Supplier selectSupplierById(Long id);

    /**
     * 查询卖家信息管理列表
     * 
     * @param supplier 卖家信息管理
     * @return 卖家信息管理集合
     */
    public List<Supplier> selectSupplierList(Supplier supplier);

    /**
     * 新增卖家信息管理
     * 
     * @param supplier 卖家信息管理
     * @return 结果
     */
    public int insertSupplier(Supplier supplier);

    /**
     * 修改卖家信息管理
     * 
     * @param supplier 卖家信息管理
     * @return 结果
     */
    public int updateSupplier(Supplier supplier);

    /**
     * 删除卖家信息管理
     * 
     * @param id 卖家信息管理主键
     * @return 结果
     */
    public int deleteSupplierById(Long id);

    /**
     * 批量删除卖家信息管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSupplierByIds(Long[] ids);
}
