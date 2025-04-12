package com.ruoyi.ershouche.mapper;

import java.util.List;
import com.ruoyi.ershouche.domain.PurchaseRecord;

/**
 * 车辆采购记录Mapper接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface PurchaseRecordMapper 
{
    /**
     * 查询车辆采购记录
     * 
     * @param id 车辆采购记录主键
     * @return 车辆采购记录
     */
    public PurchaseRecord selectPurchaseRecordById(Long id);

    /**
     * 查询车辆采购记录列表
     * 
     * @param purchaseRecord 车辆采购记录
     * @return 车辆采购记录集合
     */
    public List<PurchaseRecord> selectPurchaseRecordList(PurchaseRecord purchaseRecord);

    /**
     * 新增车辆采购记录
     * 
     * @param purchaseRecord 车辆采购记录
     * @return 结果
     */
    public int insertPurchaseRecord(PurchaseRecord purchaseRecord);

    /**
     * 修改车辆采购记录
     * 
     * @param purchaseRecord 车辆采购记录
     * @return 结果
     */
    public int updatePurchaseRecord(PurchaseRecord purchaseRecord);

    /**
     * 删除车辆采购记录
     * 
     * @param id 车辆采购记录主键
     * @return 结果
     */
    public int deletePurchaseRecordById(Long id);

    /**
     * 批量删除车辆采购记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePurchaseRecordByIds(Long[] ids);
}
