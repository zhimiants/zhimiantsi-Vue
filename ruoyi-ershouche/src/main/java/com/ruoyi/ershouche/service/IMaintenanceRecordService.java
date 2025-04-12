package com.ruoyi.ershouche.service;

import java.util.List;
import com.ruoyi.ershouche.domain.MaintenanceRecord;

/**
 * 维修保养记录Service接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface IMaintenanceRecordService 
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
     * 批量删除维修保养记录
     * 
     * @param ids 需要删除的维修保养记录主键集合
     * @return 结果
     */
    public int deleteMaintenanceRecordByIds(Long[] ids);

    /**
     * 删除维修保养记录信息
     * 
     * @param id 维修保养记录主键
     * @return 结果
     */
    public int deleteMaintenanceRecordById(Long id);
}
