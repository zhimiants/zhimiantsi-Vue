package com.ruoyi.ershouche.mapper;

import java.util.List;
import com.ruoyi.ershouche.domain.CarInfo;
import com.ruoyi.ershouche.domain.CarImage;

/**
 * 车辆信息管理Mapper接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface CarInfoMapper 
{
    /**
     * 查询车辆信息管理
     * 
     * @param id 车辆信息管理主键
     * @return 车辆信息管理
     */
    public CarInfo selectCarInfoById(Long id);

    /**
     * 查询车辆信息管理列表
     * 
     * @param carInfo 车辆信息管理
     * @return 车辆信息管理集合
     */
    public List<CarInfo> selectCarInfoList(CarInfo carInfo);

    /**
     * 新增车辆信息管理
     * 
     * @param carInfo 车辆信息管理
     * @return 结果
     */
    public int insertCarInfo(CarInfo carInfo);

    /**
     * 修改车辆信息管理
     * 
     * @param carInfo 车辆信息管理
     * @return 结果
     */
    public int updateCarInfo(CarInfo carInfo);

    /**
     * 删除车辆信息管理
     * 
     * @param id 车辆信息管理主键
     * @return 结果
     */
    public int deleteCarInfoById(Long id);

    /**
     * 批量删除车辆信息管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCarInfoByIds(Long[] ids);

    /**
     * 批量删除车辆图片
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCarImageByCarIds(Long[] ids);
    
    /**
     * 批量新增车辆图片
     * 
     * @param carImageList 车辆图片列表
     * @return 结果
     */
    public int batchCarImage(List<CarImage> carImageList);
    

    /**
     * 通过车辆信息管理主键删除车辆图片信息
     * 
     * @param id 车辆信息管理ID
     * @return 结果
     */
    public int deleteCarImageByCarId(Long id);
}
