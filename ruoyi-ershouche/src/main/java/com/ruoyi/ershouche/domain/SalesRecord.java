package com.ruoyi.ershouche.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售记录对象 tb_sales_record
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class SalesRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 销售单号 */
    @Excel(name = "销售单号")
    private String recordNo;

    /** 车辆 */
    @Excel(name = "车辆")
    private Long carId;

    /** 客户线索 (可选) */
    private Long leadId;

    /** 购买客户姓名 */
    @Excel(name = "购买客户姓名")
    private String customerName;

    /** 购买客户电话 */
    @Excel(name = "购买客户电话")
    private String customerPhone;

    /** 最终成交价格(元) */
    @Excel(name = "最终成交价格(元)")
    private BigDecimal finalPrice;

    /** 销售日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "销售日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date saleDate;

    /** 经办销售员 */
    @Excel(name = "经办销售员")
    private Long salespersonUserId;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private String paymentMethod;

    /** 车辆交付日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "车辆交付日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setRecordNo(String recordNo) 
    {
        this.recordNo = recordNo;
    }

    public String getRecordNo() 
    {
        return recordNo;
    }

    public void setCarId(Long carId) 
    {
        this.carId = carId;
    }

    public Long getCarId() 
    {
        return carId;
    }

    public void setLeadId(Long leadId) 
    {
        this.leadId = leadId;
    }

    public Long getLeadId() 
    {
        return leadId;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    public void setCustomerPhone(String customerPhone) 
    {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() 
    {
        return customerPhone;
    }

    public void setFinalPrice(BigDecimal finalPrice) 
    {
        this.finalPrice = finalPrice;
    }

    public BigDecimal getFinalPrice() 
    {
        return finalPrice;
    }

    public void setSaleDate(Date saleDate) 
    {
        this.saleDate = saleDate;
    }

    public Date getSaleDate() 
    {
        return saleDate;
    }

    public void setSalespersonUserId(Long salespersonUserId) 
    {
        this.salespersonUserId = salespersonUserId;
    }

    public Long getSalespersonUserId() 
    {
        return salespersonUserId;
    }

    public void setPaymentMethod(String paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() 
    {
        return paymentMethod;
    }

    public void setDeliveryDate(Date deliveryDate) 
    {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() 
    {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("recordNo", getRecordNo())
            .append("carId", getCarId())
            .append("leadId", getLeadId())
            .append("customerName", getCustomerName())
            .append("customerPhone", getCustomerPhone())
            .append("finalPrice", getFinalPrice())
            .append("saleDate", getSaleDate())
            .append("salespersonUserId", getSalespersonUserId())
            .append("paymentMethod", getPaymentMethod())
            .append("deliveryDate", getDeliveryDate())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
