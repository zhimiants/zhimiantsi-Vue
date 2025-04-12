package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ershouche.mapper.PurchaseRecordMapper;
import com.ruoyi.ershouche.domain.PurchaseRecord;
import com.ruoyi.ershouche.service.IPurchaseRecordService;

/**
 * 车辆采购记录Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class PurchaseRecordServiceImpl implements IPurchaseRecordService 
{
    @Autowired
    private PurchaseRecordMapper purchaseRecordMapper;

    /**
     * 查询车辆采购记录
     * 
     * @param id 车辆采购记录主键
     * @return 车辆采购记录
     */
    @Override
    public PurchaseRecord selectPurchaseRecordById(Long id)
    {
        return purchaseRecordMapper.selectPurchaseRecordById(id);
    }

    /**
     * 查询车辆采购记录列表
     * 
     * @param purchaseRecord 车辆采购记录
     * @return 车辆采购记录
     */
    @Override
    public List<PurchaseRecord> selectPurchaseRecordList(PurchaseRecord purchaseRecord)
    {
        return purchaseRecordMapper.selectPurchaseRecordList(purchaseRecord);
    }

    /**
     * 新增车辆采购记录
     * 
     * @param purchaseRecord 车辆采购记录
     * @return 结果
     */
    @Override
    public int insertPurchaseRecord(PurchaseRecord purchaseRecord)
    {
        purchaseRecord.setCreateTime(DateUtils.getNowDate());
        return purchaseRecordMapper.insertPurchaseRecord(purchaseRecord);
    }

    /**
     * 修改车辆采购记录
     * 
     * @param purchaseRecord 车辆采购记录
     * @return 结果
     */
    @Override
    public int updatePurchaseRecord(PurchaseRecord purchaseRecord)
    {
        purchaseRecord.setUpdateTime(DateUtils.getNowDate());
        return purchaseRecordMapper.updatePurchaseRecord(purchaseRecord);
    }

    /**
     * 批量删除车辆采购记录
     * 
     * @param ids 需要删除的车辆采购记录主键
     * @return 结果
     */
    @Override
    public int deletePurchaseRecordByIds(Long[] ids)
    {
        return purchaseRecordMapper.deletePurchaseRecordByIds(ids);
    }

    /**
     * 删除车辆采购记录信息
     * 
     * @param id 车辆采购记录主键
     * @return 结果
     */
    @Override
    public int deletePurchaseRecordById(Long id)
    {
        return purchaseRecordMapper.deletePurchaseRecordById(id);
    }
}
