package com.ruoyi.ershouche.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户线索管理对象 tb_customer_lead
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class CustomerLead extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String name;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 线索来源 */
    @Excel(name = "线索来源")
    private String source;

    /** 意向车型简述 */
    @Excel(name = "意向车型简述")
    private String intendedCarInfo;

    /** 预算范围 */
    @Excel(name = "预算范围")
    private String budget;

    /** 跟进状态 */
    @Excel(name = "跟进状态")
    private String followUpStatus;

    /** 分配销售员 */
    @Excel(name = "分配销售员")
    private Long salespersonUserId;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 线索跟进记录信息 */
    private List<LeadFollowUp> leadFollowUpList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }

    public void setIntendedCarInfo(String intendedCarInfo) 
    {
        this.intendedCarInfo = intendedCarInfo;
    }

    public String getIntendedCarInfo() 
    {
        return intendedCarInfo;
    }

    public void setBudget(String budget) 
    {
        this.budget = budget;
    }

    public String getBudget() 
    {
        return budget;
    }

    public void setFollowUpStatus(String followUpStatus) 
    {
        this.followUpStatus = followUpStatus;
    }

    public String getFollowUpStatus() 
    {
        return followUpStatus;
    }

    public void setSalespersonUserId(Long salespersonUserId) 
    {
        this.salespersonUserId = salespersonUserId;
    }

    public Long getSalespersonUserId() 
    {
        return salespersonUserId;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }

    public List<LeadFollowUp> getLeadFollowUpList()
    {
        return leadFollowUpList;
    }

    public void setLeadFollowUpList(List<LeadFollowUp> leadFollowUpList)
    {
        this.leadFollowUpList = leadFollowUpList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("source", getSource())
            .append("intendedCarInfo", getIntendedCarInfo())
            .append("budget", getBudget())
            .append("followUpStatus", getFollowUpStatus())
            .append("salespersonUserId", getSalespersonUserId())
            .append("gender", getGender())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("leadFollowUpList", getLeadFollowUpList())
            .toString();
    }
}
