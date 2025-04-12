package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ershouche.mapper.CarModelMapper;
import com.ruoyi.ershouche.domain.CarModel;
import com.ruoyi.ershouche.service.ICarModelService;

/**
 * 车辆型号管理Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class CarModelServiceImpl implements ICarModelService 
{
    @Autowired
    private CarModelMapper carModelMapper;

    /**
     * 查询车辆型号管理
     * 
     * @param id 车辆型号管理主键
     * @return 车辆型号管理
     */
    @Override
    public CarModel selectCarModelById(Long id)
    {
        return carModelMapper.selectCarModelById(id);
    }

    /**
     * 查询车辆型号管理列表
     * 
     * @param carModel 车辆型号管理
     * @return 车辆型号管理
     */
    @Override
    public List<CarModel> selectCarModelList(CarModel carModel)
    {
        return carModelMapper.selectCarModelList(carModel);
    }

    /**
     * 新增车辆型号管理
     * 
     * @param carModel 车辆型号管理
     * @return 结果
     */
    @Override
    public int insertCarModel(CarModel carModel)
    {
        carModel.setCreateTime(DateUtils.getNowDate());
        return carModelMapper.insertCarModel(carModel);
    }

    /**
     * 修改车辆型号管理
     * 
     * @param carModel 车辆型号管理
     * @return 结果
     */
    @Override
    public int updateCarModel(CarModel carModel)
    {
        carModel.setUpdateTime(DateUtils.getNowDate());
        return carModelMapper.updateCarModel(carModel);
    }

    /**
     * 批量删除车辆型号管理
     * 
     * @param ids 需要删除的车辆型号管理主键
     * @return 结果
     */
    @Override
    public int deleteCarModelByIds(Long[] ids)
    {
        return carModelMapper.deleteCarModelByIds(ids);
    }

    /**
     * 删除车辆型号管理信息
     * 
     * @param id 车辆型号管理主键
     * @return 结果
     */
    @Override
    public int deleteCarModelById(Long id)
    {
        return carModelMapper.deleteCarModelById(id);
    }
}
