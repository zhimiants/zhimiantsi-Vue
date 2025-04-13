package com.ruoyi.zngl.service;

import java.util.List;
import com.ruoyi.zngl.domain.ZnAgriProduct;

/**
 * 农资商品管理Service接口
 * 
 * @author zmts
 * @date 2025-04-13
 */
public interface IZnAgriProductService 
{
    /**
     * 查询农资商品管理
     * 
     * @param id 农资商品管理主键
     * @return 农资商品管理
     */
    public ZnAgriProduct selectZnAgriProductById(Long id);

    /**
     * 查询农资商品管理列表
     * 
     * @param znAgriProduct 农资商品管理
     * @return 农资商品管理集合
     */
    public List<ZnAgriProduct> selectZnAgriProductList(ZnAgriProduct znAgriProduct);

    /**
     * 新增农资商品管理
     * 
     * @param znAgriProduct 农资商品管理
     * @return 结果
     */
    public int insertZnAgriProduct(ZnAgriProduct znAgriProduct);

    /**
     * 修改农资商品管理
     * 
     * @param znAgriProduct 农资商品管理
     * @return 结果
     */
    public int updateZnAgriProduct(ZnAgriProduct znAgriProduct);

    /**
     * 批量删除农资商品管理
     * 
     * @param ids 需要删除的农资商品管理主键集合
     * @return 结果
     */
    public int deleteZnAgriProductByIds(Long[] ids);

    /**
     * 删除农资商品管理信息
     * 
     * @param id 农资商品管理主键
     * @return 结果
     */
    public int deleteZnAgriProductById(Long id);
}
