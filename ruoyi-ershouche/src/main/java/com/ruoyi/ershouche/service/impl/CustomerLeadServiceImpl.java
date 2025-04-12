package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.ershouche.domain.LeadFollowUp;
import com.ruoyi.ershouche.mapper.CustomerLeadMapper;
import com.ruoyi.ershouche.domain.CustomerLead;
import com.ruoyi.ershouche.service.ICustomerLeadService;

/**
 * 客户线索管理Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class CustomerLeadServiceImpl implements ICustomerLeadService 
{
    @Autowired
    private CustomerLeadMapper customerLeadMapper;

    /**
     * 查询客户线索管理
     * 
     * @param id 客户线索管理主键
     * @return 客户线索管理
     */
    @Override
    public CustomerLead selectCustomerLeadById(Long id)
    {
        return customerLeadMapper.selectCustomerLeadById(id);
    }

    /**
     * 查询客户线索管理列表
     * 
     * @param customerLead 客户线索管理
     * @return 客户线索管理
     */
    @Override
    public List<CustomerLead> selectCustomerLeadList(CustomerLead customerLead)
    {
        return customerLeadMapper.selectCustomerLeadList(customerLead);
    }

    /**
     * 新增客户线索管理
     * 
     * @param customerLead 客户线索管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCustomerLead(CustomerLead customerLead)
    {
        customerLead.setCreateTime(DateUtils.getNowDate());
        int rows = customerLeadMapper.insertCustomerLead(customerLead);
        insertLeadFollowUp(customerLead);
        return rows;
    }

    /**
     * 修改客户线索管理
     * 
     * @param customerLead 客户线索管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCustomerLead(CustomerLead customerLead)
    {
        customerLead.setUpdateTime(DateUtils.getNowDate());
        customerLeadMapper.deleteLeadFollowUpByLeadId(customerLead.getId());
        insertLeadFollowUp(customerLead);
        return customerLeadMapper.updateCustomerLead(customerLead);
    }

    /**
     * 批量删除客户线索管理
     * 
     * @param ids 需要删除的客户线索管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCustomerLeadByIds(Long[] ids)
    {
        customerLeadMapper.deleteLeadFollowUpByLeadIds(ids);
        return customerLeadMapper.deleteCustomerLeadByIds(ids);
    }

    /**
     * 删除客户线索管理信息
     * 
     * @param id 客户线索管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCustomerLeadById(Long id)
    {
        customerLeadMapper.deleteLeadFollowUpByLeadId(id);
        return customerLeadMapper.deleteCustomerLeadById(id);
    }

    /**
     * 新增线索跟进记录信息
     * 
     * @param customerLead 客户线索管理对象
     */
    public void insertLeadFollowUp(CustomerLead customerLead)
    {
        List<LeadFollowUp> leadFollowUpList = customerLead.getLeadFollowUpList();
        Long id = customerLead.getId();
        if (StringUtils.isNotNull(leadFollowUpList))
        {
            List<LeadFollowUp> list = new ArrayList<LeadFollowUp>();
            for (LeadFollowUp leadFollowUp : leadFollowUpList)
            {
                leadFollowUp.setLeadId(id);
                list.add(leadFollowUp);
            }
            if (list.size() > 0)
            {
                customerLeadMapper.batchLeadFollowUp(list);
            }
        }
    }
}
