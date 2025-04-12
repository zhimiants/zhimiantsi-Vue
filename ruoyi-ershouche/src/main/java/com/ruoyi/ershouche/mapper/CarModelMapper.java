package com.ruoyi.ershouche.mapper;

import java.util.List;
import com.ruoyi.ershouche.domain.CarModel;

/**
 * 车辆型号管理Mapper接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface CarModelMapper 
{
    /**
     * 查询车辆型号管理
     * 
     * @param id 车辆型号管理主键
     * @return 车辆型号管理
     */
    public CarModel selectCarModelById(Long id);

    /**
     * 查询车辆型号管理列表
     * 
     * @param carModel 车辆型号管理
     * @return 车辆型号管理集合
     */
    public List<CarModel> selectCarModelList(CarModel carModel);

    /**
     * 新增车辆型号管理
     * 
     * @param carModel 车辆型号管理
     * @return 结果
     */
    public int insertCarModel(CarModel carModel);

    /**
     * 修改车辆型号管理
     * 
     * @param carModel 车辆型号管理
     * @return 结果
     */
    public int updateCarModel(CarModel carModel);

    /**
     * 删除车辆型号管理
     * 
     * @param id 车辆型号管理主键
     * @return 结果
     */
    public int deleteCarModelById(Long id);

    /**
     * 批量删除车辆型号管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCarModelByIds(Long[] ids);
}
