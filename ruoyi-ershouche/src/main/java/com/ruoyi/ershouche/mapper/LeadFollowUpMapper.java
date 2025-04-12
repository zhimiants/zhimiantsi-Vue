package com.ruoyi.ershouche.mapper;

import java.util.List;
import com.ruoyi.ershouche.domain.LeadFollowUp;

/**
 * 线索跟进记录Mapper接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface LeadFollowUpMapper 
{
    /**
     * 查询线索跟进记录
     * 
     * @param id 线索跟进记录主键
     * @return 线索跟进记录
     */
    public LeadFollowUp selectLeadFollowUpById(Long id);

    /**
     * 查询线索跟进记录列表
     * 
     * @param leadFollowUp 线索跟进记录
     * @return 线索跟进记录集合
     */
    public List<LeadFollowUp> selectLeadFollowUpList(LeadFollowUp leadFollowUp);

    /**
     * 新增线索跟进记录
     * 
     * @param leadFollowUp 线索跟进记录
     * @return 结果
     */
    public int insertLeadFollowUp(LeadFollowUp leadFollowUp);

    /**
     * 修改线索跟进记录
     * 
     * @param leadFollowUp 线索跟进记录
     * @return 结果
     */
    public int updateLeadFollowUp(LeadFollowUp leadFollowUp);

    /**
     * 删除线索跟进记录
     * 
     * @param id 线索跟进记录主键
     * @return 结果
     */
    public int deleteLeadFollowUpById(Long id);

    /**
     * 批量删除线索跟进记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLeadFollowUpByIds(Long[] ids);
}
