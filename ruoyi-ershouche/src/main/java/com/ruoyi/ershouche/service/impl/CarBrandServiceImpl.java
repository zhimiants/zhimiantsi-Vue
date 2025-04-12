package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ershouche.mapper.CarBrandMapper;
import com.ruoyi.ershouche.domain.CarBrand;
import com.ruoyi.ershouche.service.ICarBrandService;

/**
 * 车辆品牌管理Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class CarBrandServiceImpl implements ICarBrandService 
{
    @Autowired
    private CarBrandMapper carBrandMapper;

    /**
     * 查询车辆品牌管理
     * 
     * @param id 车辆品牌管理主键
     * @return 车辆品牌管理
     */
    @Override
    public CarBrand selectCarBrandById(Long id)
    {
        return carBrandMapper.selectCarBrandById(id);
    }

    /**
     * 查询车辆品牌管理列表
     * 
     * @param carBrand 车辆品牌管理
     * @return 车辆品牌管理
     */
    @Override
    public List<CarBrand> selectCarBrandList(CarBrand carBrand)
    {
        return carBrandMapper.selectCarBrandList(carBrand);
    }

    /**
     * 新增车辆品牌管理
     * 
     * @param carBrand 车辆品牌管理
     * @return 结果
     */
    @Override
    public int insertCarBrand(CarBrand carBrand)
    {
        carBrand.setCreateTime(DateUtils.getNowDate());
        return carBrandMapper.insertCarBrand(carBrand);
    }

    /**
     * 修改车辆品牌管理
     * 
     * @param carBrand 车辆品牌管理
     * @return 结果
     */
    @Override
    public int updateCarBrand(CarBrand carBrand)
    {
        carBrand.setUpdateTime(DateUtils.getNowDate());
        return carBrandMapper.updateCarBrand(carBrand);
    }

    /**
     * 批量删除车辆品牌管理
     * 
     * @param ids 需要删除的车辆品牌管理主键
     * @return 结果
     */
    @Override
    public int deleteCarBrandByIds(Long[] ids)
    {
        return carBrandMapper.deleteCarBrandByIds(ids);
    }

    /**
     * 删除车辆品牌管理信息
     * 
     * @param id 车辆品牌管理主键
     * @return 结果
     */
    @Override
    public int deleteCarBrandById(Long id)
    {
        return carBrandMapper.deleteCarBrandById(id);
    }
}
