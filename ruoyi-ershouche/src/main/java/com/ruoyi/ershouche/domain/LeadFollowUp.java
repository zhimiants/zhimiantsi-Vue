package com.ruoyi.ershouche.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 线索跟进记录对象 tb_lead_follow_up
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class LeadFollowUp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 客户线索 */
    @Excel(name = "客户线索")
    private Long leadId;

    /** 跟进时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "跟进时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date followUpTime;

    /** 跟进方式 */
    @Excel(name = "跟进方式")
    private String followUpMethod;

    /** 内容详情 */
    @Excel(name = "内容详情")
    private String content;

    /** 计划下次 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划下次", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nextFollowUpTime;

    /** 本次结果 */
    @Excel(name = "本次结果")
    private String outcomeStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLeadId(Long leadId) 
    {
        this.leadId = leadId;
    }

    public Long getLeadId() 
    {
        return leadId;
    }
    public void setFollowUpTime(Date followUpTime) 
    {
        this.followUpTime = followUpTime;
    }

    public Date getFollowUpTime() 
    {
        return followUpTime;
    }
    public void setFollowUpMethod(String followUpMethod) 
    {
        this.followUpMethod = followUpMethod;
    }

    public String getFollowUpMethod() 
    {
        return followUpMethod;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setNextFollowUpTime(Date nextFollowUpTime) 
    {
        this.nextFollowUpTime = nextFollowUpTime;
    }

    public Date getNextFollowUpTime() 
    {
        return nextFollowUpTime;
    }
    public void setOutcomeStatus(String outcomeStatus) 
    {
        this.outcomeStatus = outcomeStatus;
    }

    public String getOutcomeStatus() 
    {
        return outcomeStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("leadId", getLeadId())
            .append("followUpTime", getFollowUpTime())
            .append("followUpMethod", getFollowUpMethod())
            .append("content", getContent())
            .append("nextFollowUpTime", getNextFollowUpTime())
            .append("outcomeStatus", getOutcomeStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
