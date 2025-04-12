package com.ruoyi.ershouche.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆型号管理对象 tb_car_model
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class CarModel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 品牌 */
    @Excel(name = "品牌")
    private Long brandId;

    /** 型号名称 */
    @Excel(name = "型号名称")
    private String name;

    /** 排序字段 */
    private Long sortOrder;

    /** 车身类型 */
    @Excel(name = "车身类型")
    private String bodyType;

    /** 生产状态 */
    @Excel(name = "生产状态")
    private String productionStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setBrandId(Long brandId) 
    {
        this.brandId = brandId;
    }

    public Long getBrandId() 
    {
        return brandId;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }

    public void setBodyType(String bodyType) 
    {
        this.bodyType = bodyType;
    }

    public String getBodyType() 
    {
        return bodyType;
    }

    public void setProductionStatus(String productionStatus) 
    {
        this.productionStatus = productionStatus;
    }

    public String getProductionStatus() 
    {
        return productionStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("brandId", getBrandId())
            .append("name", getName())
            .append("sortOrder", getSortOrder())
            .append("bodyType", getBodyType())
            .append("productionStatus", getProductionStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
