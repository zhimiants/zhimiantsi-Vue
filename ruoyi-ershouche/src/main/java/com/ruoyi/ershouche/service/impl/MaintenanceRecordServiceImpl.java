package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ershouche.mapper.MaintenanceRecordMapper;
import com.ruoyi.ershouche.domain.MaintenanceRecord;
import com.ruoyi.ershouche.service.IMaintenanceRecordService;

/**
 * 维修保养记录Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class MaintenanceRecordServiceImpl implements IMaintenanceRecordService 
{
    @Autowired
    private MaintenanceRecordMapper maintenanceRecordMapper;

    /**
     * 查询维修保养记录
     * 
     * @param id 维修保养记录主键
     * @return 维修保养记录
     */
    @Override
    public MaintenanceRecord selectMaintenanceRecordById(Long id)
    {
        return maintenanceRecordMapper.selectMaintenanceRecordById(id);
    }

    /**
     * 查询维修保养记录列表
     * 
     * @param maintenanceRecord 维修保养记录
     * @return 维修保养记录
     */
    @Override
    public List<MaintenanceRecord> selectMaintenanceRecordList(MaintenanceRecord maintenanceRecord)
    {
        return maintenanceRecordMapper.selectMaintenanceRecordList(maintenanceRecord);
    }

    /**
     * 新增维修保养记录
     * 
     * @param maintenanceRecord 维修保养记录
     * @return 结果
     */
    @Override
    public int insertMaintenanceRecord(MaintenanceRecord maintenanceRecord)
    {
        maintenanceRecord.setCreateTime(DateUtils.getNowDate());
        return maintenanceRecordMapper.insertMaintenanceRecord(maintenanceRecord);
    }

    /**
     * 修改维修保养记录
     * 
     * @param maintenanceRecord 维修保养记录
     * @return 结果
     */
    @Override
    public int updateMaintenanceRecord(MaintenanceRecord maintenanceRecord)
    {
        maintenanceRecord.setUpdateTime(DateUtils.getNowDate());
        return maintenanceRecordMapper.updateMaintenanceRecord(maintenanceRecord);
    }

    /**
     * 批量删除维修保养记录
     * 
     * @param ids 需要删除的维修保养记录主键
     * @return 结果
     */
    @Override
    public int deleteMaintenanceRecordByIds(Long[] ids)
    {
        return maintenanceRecordMapper.deleteMaintenanceRecordByIds(ids);
    }

    /**
     * 删除维修保养记录信息
     * 
     * @param id 维修保养记录主键
     * @return 结果
     */
    @Override
    public int deleteMaintenanceRecordById(Long id)
    {
        return maintenanceRecordMapper.deleteMaintenanceRecordById(id);
    }
}
