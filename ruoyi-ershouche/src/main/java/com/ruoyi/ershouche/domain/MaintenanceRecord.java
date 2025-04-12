package com.ruoyi.ershouche.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 维修保养记录对象 tb_maintenance_record
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class MaintenanceRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 车辆 */
    @Excel(name = "车辆")
    private Long carId;

    /** 记录日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordDate;

    /** 维修保养描述 */
    @Excel(name = "维修保养描述")
    private String itemDescription;

    /** 花费金额(元) */
    @Excel(name = "花费金额(元)")
    private BigDecimal cost;

    /** 维修厂名称 */
    @Excel(name = "维修厂名称")
    private String workshop;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setCarId(Long carId) 
    {
        this.carId = carId;
    }

    public Long getCarId() 
    {
        return carId;
    }

    public void setRecordDate(Date recordDate) 
    {
        this.recordDate = recordDate;
    }

    public Date getRecordDate() 
    {
        return recordDate;
    }

    public void setItemDescription(String itemDescription) 
    {
        this.itemDescription = itemDescription;
    }

    public String getItemDescription() 
    {
        return itemDescription;
    }

    public void setCost(BigDecimal cost) 
    {
        this.cost = cost;
    }

    public BigDecimal getCost() 
    {
        return cost;
    }

    public void setWorkshop(String workshop) 
    {
        this.workshop = workshop;
    }

    public String getWorkshop() 
    {
        return workshop;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("carId", getCarId())
            .append("recordDate", getRecordDate())
            .append("itemDescription", getItemDescription())
            .append("cost", getCost())
            .append("workshop", getWorkshop())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
