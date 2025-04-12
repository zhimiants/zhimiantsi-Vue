package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.ershouche.domain.CarImage;
import com.ruoyi.ershouche.mapper.CarInfoMapper;
import com.ruoyi.ershouche.domain.CarInfo;
import com.ruoyi.ershouche.service.ICarInfoService;

/**
 * 车辆信息管理Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class CarInfoServiceImpl implements ICarInfoService 
{
    @Autowired
    private CarInfoMapper carInfoMapper;

    /**
     * 查询车辆信息管理
     * 
     * @param id 车辆信息管理主键
     * @return 车辆信息管理
     */
    @Override
    public CarInfo selectCarInfoById(Long id)
    {
        return carInfoMapper.selectCarInfoById(id);
    }

    /**
     * 查询车辆信息管理列表
     * 
     * @param carInfo 车辆信息管理
     * @return 车辆信息管理
     */
    @Override
    public List<CarInfo> selectCarInfoList(CarInfo carInfo)
    {
        return carInfoMapper.selectCarInfoList(carInfo);
    }

    /**
     * 新增车辆信息管理
     * 
     * @param carInfo 车辆信息管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCarInfo(CarInfo carInfo)
    {
        carInfo.setCreateTime(DateUtils.getNowDate());
        int rows = carInfoMapper.insertCarInfo(carInfo);
        insertCarImage(carInfo);
        return rows;
    }

    /**
     * 修改车辆信息管理
     * 
     * @param carInfo 车辆信息管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCarInfo(CarInfo carInfo)
    {
        carInfo.setUpdateTime(DateUtils.getNowDate());
        carInfoMapper.deleteCarImageByCarId(carInfo.getId());
        insertCarImage(carInfo);
        return carInfoMapper.updateCarInfo(carInfo);
    }

    /**
     * 批量删除车辆信息管理
     * 
     * @param ids 需要删除的车辆信息管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCarInfoByIds(Long[] ids)
    {
        carInfoMapper.deleteCarImageByCarIds(ids);
        return carInfoMapper.deleteCarInfoByIds(ids);
    }

    /**
     * 删除车辆信息管理信息
     * 
     * @param id 车辆信息管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCarInfoById(Long id)
    {
        carInfoMapper.deleteCarImageByCarId(id);
        return carInfoMapper.deleteCarInfoById(id);
    }

    /**
     * 新增车辆图片信息
     * 
     * @param carInfo 车辆信息管理对象
     */
    public void insertCarImage(CarInfo carInfo)
    {
        List<CarImage> carImageList = carInfo.getCarImageList();
        Long id = carInfo.getId();
        if (StringUtils.isNotNull(carImageList))
        {
            List<CarImage> list = new ArrayList<CarImage>();
            for (CarImage carImage : carImageList)
            {
                carImage.setCarId(id);
                list.add(carImage);
            }
            if (list.size() > 0)
            {
                carInfoMapper.batchCarImage(list);
            }
        }
    }
}
