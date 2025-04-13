package com.ruoyi.zngl.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单配送管理对象 zn_order_delivery
 * 
 * @author zngl
 * @date 2025-04-13
 */
public class ZnOrderDelivery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 订单 */
    @Excel(name = "订单")
    private Long orderId;

    /** 快递公司 */
    @Excel(name = "快递公司")
    private String deliveryCompany;

    /** 快递单号 */
    @Excel(name = "快递单号")
    private String deliveryNo;

    /** 发货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryTime;

    /** 收货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "收货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date receiveTime;

    /** 配送状态 */
    @Excel(name = "配送状态")
    private String deliveryStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }

    public void setDeliveryCompany(String deliveryCompany) 
    {
        this.deliveryCompany = deliveryCompany;
    }

    public String getDeliveryCompany() 
    {
        return deliveryCompany;
    }

    public void setDeliveryNo(String deliveryNo) 
    {
        this.deliveryNo = deliveryNo;
    }

    public String getDeliveryNo() 
    {
        return deliveryNo;
    }

    public void setDeliveryTime(Date deliveryTime) 
    {
        this.deliveryTime = deliveryTime;
    }

    public Date getDeliveryTime() 
    {
        return deliveryTime;
    }

    public void setReceiveTime(Date receiveTime) 
    {
        this.receiveTime = receiveTime;
    }

    public Date getReceiveTime() 
    {
        return receiveTime;
    }

    public void setDeliveryStatus(String deliveryStatus) 
    {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryStatus() 
    {
        return deliveryStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderId", getOrderId())
            .append("deliveryCompany", getDeliveryCompany())
            .append("deliveryNo", getDeliveryNo())
            .append("deliveryTime", getDeliveryTime())
            .append("receiveTime", getReceiveTime())
            .append("deliveryStatus", getDeliveryStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
