package com.ruoyi.zngl.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农业培训管理对象 zn_training_course
 * 
 * @author zngl
 * @date 2025-04-13
 */
public class ZnTrainingCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 课程标题 */
    @Excel(name = "课程标题")
    private String title;

    /** 课程描述 */
    @Excel(name = "课程描述")
    private String description;

    /** 机构 */
    @Excel(name = "机构")
    private String instructor;

    /** 课程时长 */
    @Excel(name = "课程时长")
    private String duration;

    /** 授课方式 */
    @Excel(name = "授课方式")
    private String location;

    /** 开课时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开课时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 目标人群 */
    @Excel(name = "目标人群")
    private String targetAudience;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 课程封面 */
    @Excel(name = "课程封面")
    private String coverImageUrl;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setInstructor(String instructor) 
    {
        this.instructor = instructor;
    }

    public String getInstructor() 
    {
        return instructor;
    }

    public void setDuration(String duration) 
    {
        this.duration = duration;
    }

    public String getDuration() 
    {
        return duration;
    }

    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }

    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }

    public void setTargetAudience(String targetAudience) 
    {
        this.targetAudience = targetAudience;
    }

    public String getTargetAudience() 
    {
        return targetAudience;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setCoverImageUrl(String coverImageUrl) 
    {
        this.coverImageUrl = coverImageUrl;
    }

    public String getCoverImageUrl() 
    {
        return coverImageUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("description", getDescription())
            .append("instructor", getInstructor())
            .append("duration", getDuration())
            .append("location", getLocation())
            .append("startDate", getStartDate())
            .append("targetAudience", getTargetAudience())
            .append("status", getStatus())
            .append("coverImageUrl", getCoverImageUrl())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
