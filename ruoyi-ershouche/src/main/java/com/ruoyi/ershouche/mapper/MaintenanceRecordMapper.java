package com.ruoyi.ershouche.mapper;

import java.util.List;
import com.ruoyi.ershouche.domain.MaintenanceRecord;

/**
 * 维修保养记录Mapper接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface MaintenanceRecordMapper 
{
    /**
     * 查询维修保养记录
     * 
     * @param id 维修保养记录主键
     * @return 维修保养记录
     */
    public MaintenanceRecord selectMaintenanceRecordById(Long id);

    /**
     * 查询维修保养记录列表
     * 
     * @param maintenanceRecord 维修保养记录
     * @return 维修保养记录集合
     */
    public List<MaintenanceRecord> selectMaintenanceRecordList(MaintenanceRecord maintenanceRecord);

    /**
     * 新增维修保养记录
     * 
     * @param maintenanceRecord 维修保养记录
     * @return 结果
     */
    public int insertMaintenanceRecord(MaintenanceRecord maintenanceRecord);

    /**
     * 修改维修保养记录
     * 
     * @param maintenanceRecord 维修保养记录
     * @return 结果
     */
    public int updateMaintenanceRecord(MaintenanceRecord maintenanceRecord);

    /**
     * 删除维修保养记录
     * 
     * @param id 维修保养记录主键
     * @return 结果
     */
    public int deleteMaintenanceRecordById(Long id);

    /**
     * 批量删除维修保养记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMaintenanceRecordByIds(Long[] ids);
}
