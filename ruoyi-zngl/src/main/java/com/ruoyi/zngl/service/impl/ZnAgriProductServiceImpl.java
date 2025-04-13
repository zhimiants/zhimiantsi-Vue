package com.ruoyi.zngl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zngl.mapper.ZnAgriProductMapper;
import com.ruoyi.zngl.domain.ZnAgriProduct;
import com.ruoyi.zngl.service.IZnAgriProductService;

/**
 * 农资商品管理Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-13
 */
@Service
public class ZnAgriProductServiceImpl implements IZnAgriProductService 
{
    @Autowired
    private ZnAgriProductMapper znAgriProductMapper;

    /**
     * 查询农资商品管理
     * 
     * @param id 农资商品管理主键
     * @return 农资商品管理
     */
    @Override
    public ZnAgriProduct selectZnAgriProductById(Long id)
    {
        return znAgriProductMapper.selectZnAgriProductById(id);
    }

    /**
     * 查询农资商品管理列表
     * 
     * @param znAgriProduct 农资商品管理
     * @return 农资商品管理
     */
    @Override
    public List<ZnAgriProduct> selectZnAgriProductList(ZnAgriProduct znAgriProduct)
    {
        return znAgriProductMapper.selectZnAgriProductList(znAgriProduct);
    }

    /**
     * 新增农资商品管理
     * 
     * @param znAgriProduct 农资商品管理
     * @return 结果
     */
    @Override
    public int insertZnAgriProduct(ZnAgriProduct znAgriProduct)
    {
        znAgriProduct.setCreateTime(DateUtils.getNowDate());
        return znAgriProductMapper.insertZnAgriProduct(znAgriProduct);
    }

    /**
     * 修改农资商品管理
     * 
     * @param znAgriProduct 农资商品管理
     * @return 结果
     */
    @Override
    public int updateZnAgriProduct(ZnAgriProduct znAgriProduct)
    {
        znAgriProduct.setUpdateTime(DateUtils.getNowDate());
        return znAgriProductMapper.updateZnAgriProduct(znAgriProduct);
    }

    /**
     * 批量删除农资商品管理
     * 
     * @param ids 需要删除的农资商品管理主键
     * @return 结果
     */
    @Override
    public int deleteZnAgriProductByIds(Long[] ids)
    {
        return znAgriProductMapper.deleteZnAgriProductByIds(ids);
    }

    /**
     * 删除农资商品管理信息
     * 
     * @param id 农资商品管理主键
     * @return 结果
     */
    @Override
    public int deleteZnAgriProductById(Long id)
    {
        return znAgriProductMapper.deleteZnAgriProductById(id);
    }
}
