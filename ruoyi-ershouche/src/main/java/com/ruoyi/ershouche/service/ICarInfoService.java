package com.ruoyi.ershouche.service;

import java.util.List;
import com.ruoyi.ershouche.domain.CarInfo;

/**
 * 车辆信息管理Service接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface ICarInfoService 
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
     * 批量删除车辆信息管理
     * 
     * @param ids 需要删除的车辆信息管理主键集合
     * @return 结果
     */
    public int deleteCarInfoByIds(Long[] ids);

    /**
     * 删除车辆信息管理信息
     * 
     * @param id 车辆信息管理主键
     * @return 结果
     */
    public int deleteCarInfoById(Long id);
}
