package com.ruoyi.ershouche.service;

import java.util.List;
import com.ruoyi.ershouche.domain.CarBrand;

/**
 * 车辆品牌管理Service接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface ICarBrandService 
{
    /**
     * 查询车辆品牌管理
     * 
     * @param id 车辆品牌管理主键
     * @return 车辆品牌管理
     */
    public CarBrand selectCarBrandById(Long id);

    /**
     * 查询车辆品牌管理列表
     * 
     * @param carBrand 车辆品牌管理
     * @return 车辆品牌管理集合
     */
    public List<CarBrand> selectCarBrandList(CarBrand carBrand);

    /**
     * 新增车辆品牌管理
     * 
     * @param carBrand 车辆品牌管理
     * @return 结果
     */
    public int insertCarBrand(CarBrand carBrand);

    /**
     * 修改车辆品牌管理
     * 
     * @param carBrand 车辆品牌管理
     * @return 结果
     */
    public int updateCarBrand(CarBrand carBrand);

    /**
     * 批量删除车辆品牌管理
     * 
     * @param ids 需要删除的车辆品牌管理主键集合
     * @return 结果
     */
    public int deleteCarBrandByIds(Long[] ids);

    /**
     * 删除车辆品牌管理信息
     * 
     * @param id 车辆品牌管理主键
     * @return 结果
     */
    public int deleteCarBrandById(Long id);
}
