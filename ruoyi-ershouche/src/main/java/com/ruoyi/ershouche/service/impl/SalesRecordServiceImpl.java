package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ershouche.mapper.SalesRecordMapper;
import com.ruoyi.ershouche.domain.SalesRecord;
import com.ruoyi.ershouche.service.ISalesRecordService;

/**
 * 销售记录Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class SalesRecordServiceImpl implements ISalesRecordService 
{
    @Autowired
    private SalesRecordMapper salesRecordMapper;

    /**
     * 查询销售记录
     * 
     * @param id 销售记录主键
     * @return 销售记录
     */
    @Override
    public SalesRecord selectSalesRecordById(Long id)
    {
        return salesRecordMapper.selectSalesRecordById(id);
    }

    /**
     * 查询销售记录列表
     * 
     * @param salesRecord 销售记录
     * @return 销售记录
     */
    @Override
    public List<SalesRecord> selectSalesRecordList(SalesRecord salesRecord)
    {
        return salesRecordMapper.selectSalesRecordList(salesRecord);
    }

    /**
     * 新增销售记录
     * 
     * @param salesRecord 销售记录
     * @return 结果
     */
    @Override
    public int insertSalesRecord(SalesRecord salesRecord)
    {
        salesRecord.setCreateTime(DateUtils.getNowDate());
        return salesRecordMapper.insertSalesRecord(salesRecord);
    }

    /**
     * 修改销售记录
     * 
     * @param salesRecord 销售记录
     * @return 结果
     */
    @Override
    public int updateSalesRecord(SalesRecord salesRecord)
    {
        salesRecord.setUpdateTime(DateUtils.getNowDate());
        return salesRecordMapper.updateSalesRecord(salesRecord);
    }

    /**
     * 批量删除销售记录
     * 
     * @param ids 需要删除的销售记录主键
     * @return 结果
     */
    @Override
    public int deleteSalesRecordByIds(Long[] ids)
    {
        return salesRecordMapper.deleteSalesRecordByIds(ids);
    }

    /**
     * 删除销售记录信息
     * 
     * @param id 销售记录主键
     * @return 结果
     */
    @Override
    public int deleteSalesRecordById(Long id)
    {
        return salesRecordMapper.deleteSalesRecordById(id);
    }
}
