package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ershouche.mapper.LeadFollowUpMapper;
import com.ruoyi.ershouche.domain.LeadFollowUp;
import com.ruoyi.ershouche.service.ILeadFollowUpService;

/**
 * 线索跟进记录Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class LeadFollowUpServiceImpl implements ILeadFollowUpService 
{
    @Autowired
    private LeadFollowUpMapper leadFollowUpMapper;

    /**
     * 查询线索跟进记录
     * 
     * @param id 线索跟进记录主键
     * @return 线索跟进记录
     */
    @Override
    public LeadFollowUp selectLeadFollowUpById(Long id)
    {
        return leadFollowUpMapper.selectLeadFollowUpById(id);
    }

    /**
     * 查询线索跟进记录列表
     * 
     * @param leadFollowUp 线索跟进记录
     * @return 线索跟进记录
     */
    @Override
    public List<LeadFollowUp> selectLeadFollowUpList(LeadFollowUp leadFollowUp)
    {
        return leadFollowUpMapper.selectLeadFollowUpList(leadFollowUp);
    }

    /**
     * 新增线索跟进记录
     * 
     * @param leadFollowUp 线索跟进记录
     * @return 结果
     */
    @Override
    public int insertLeadFollowUp(LeadFollowUp leadFollowUp)
    {
        leadFollowUp.setCreateTime(DateUtils.getNowDate());
        return leadFollowUpMapper.insertLeadFollowUp(leadFollowUp);
    }

    /**
     * 修改线索跟进记录
     * 
     * @param leadFollowUp 线索跟进记录
     * @return 结果
     */
    @Override
    public int updateLeadFollowUp(LeadFollowUp leadFollowUp)
    {
        leadFollowUp.setUpdateTime(DateUtils.getNowDate());
        return leadFollowUpMapper.updateLeadFollowUp(leadFollowUp);
    }

    /**
     * 批量删除线索跟进记录
     * 
     * @param ids 需要删除的线索跟进记录主键
     * @return 结果
     */
    @Override
    public int deleteLeadFollowUpByIds(Long[] ids)
    {
        return leadFollowUpMapper.deleteLeadFollowUpByIds(ids);
    }

    /**
     * 删除线索跟进记录信息
     * 
     * @param id 线索跟进记录主键
     * @return 结果
     */
    @Override
    public int deleteLeadFollowUpById(Long id)
    {
        return leadFollowUpMapper.deleteLeadFollowUpById(id);
    }
}
