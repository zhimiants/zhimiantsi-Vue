package com.ruoyi.ershouche.mapper;

import java.util.List;
import com.ruoyi.ershouche.domain.CustomerLead;
import com.ruoyi.ershouche.domain.LeadFollowUp;

/**
 * 客户线索管理Mapper接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface CustomerLeadMapper 
{
    /**
     * 查询客户线索管理
     * 
     * @param id 客户线索管理主键
     * @return 客户线索管理
     */
    public CustomerLead selectCustomerLeadById(Long id);

    /**
     * 查询客户线索管理列表
     * 
     * @param customerLead 客户线索管理
     * @return 客户线索管理集合
     */
    public List<CustomerLead> selectCustomerLeadList(CustomerLead customerLead);

    /**
     * 新增客户线索管理
     * 
     * @param customerLead 客户线索管理
     * @return 结果
     */
    public int insertCustomerLead(CustomerLead customerLead);

    /**
     * 修改客户线索管理
     * 
     * @param customerLead 客户线索管理
     * @return 结果
     */
    public int updateCustomerLead(CustomerLead customerLead);

    /**
     * 删除客户线索管理
     * 
     * @param id 客户线索管理主键
     * @return 结果
     */
    public int deleteCustomerLeadById(Long id);

    /**
     * 批量删除客户线索管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerLeadByIds(Long[] ids);

    /**
     * 批量删除线索跟进记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLeadFollowUpByLeadIds(Long[] ids);
    
    /**
     * 批量新增线索跟进记录
     * 
     * @param leadFollowUpList 线索跟进记录列表
     * @return 结果
     */
    public int batchLeadFollowUp(List<LeadFollowUp> leadFollowUpList);
    

    /**
     * 通过客户线索管理主键删除线索跟进记录信息
     * 
     * @param id 客户线索管理ID
     * @return 结果
     */
    public int deleteLeadFollowUpByLeadId(Long id);
}
