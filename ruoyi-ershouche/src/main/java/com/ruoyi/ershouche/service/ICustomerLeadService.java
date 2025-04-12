package com.ruoyi.ershouche.service;

import java.util.List;
import com.ruoyi.ershouche.domain.CustomerLead;

/**
 * 客户线索管理Service接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface ICustomerLeadService 
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
     * 批量删除客户线索管理
     * 
     * @param ids 需要删除的客户线索管理主键集合
     * @return 结果
     */
    public int deleteCustomerLeadByIds(Long[] ids);

    /**
     * 删除客户线索管理信息
     * 
     * @param id 客户线索管理主键
     * @return 结果
     */
    public int deleteCustomerLeadById(Long id);
}
