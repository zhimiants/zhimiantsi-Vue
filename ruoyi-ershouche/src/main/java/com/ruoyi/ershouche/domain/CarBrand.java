package com.ruoyi.ershouche.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆品牌管理对象 tb_car_brand
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class CarBrand extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 品牌 */
    @Excel(name = "品牌")
    private String name;

    /** Logo */
    @Excel(name = "Logo")
    private String logoUrl;

    /** 首字母 */
    @Excel(name = "首字母")
    private String initial;

    /** 排序字段 */
    private Long sortOrder;

    /** 国家 */
    @Excel(name = "国家")
    private String country;

    /** 官网地址 */
    @Excel(name = "官网地址")
    private String website;

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

    public void setLogoUrl(String logoUrl) 
    {
        this.logoUrl = logoUrl;
    }

    public String getLogoUrl() 
    {
        return logoUrl;
    }

    public void setInitial(String initial) 
    {
        this.initial = initial;
    }

    public String getInitial() 
    {
        return initial;
    }

    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }

    public void setCountry(String country) 
    {
        this.country = country;
    }

    public String getCountry() 
    {
        return country;
    }

    public void setWebsite(String website) 
    {
        this.website = website;
    }

    public String getWebsite() 
    {
        return website;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("logoUrl", getLogoUrl())
            .append("initial", getInitial())
            .append("sortOrder", getSortOrder())
            .append("country", getCountry())
            .append("website", getWebsite())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
