package com.ruoyi.ershouche.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆采购记录对象 tb_purchase_record
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class PurchaseRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 车辆 */
    @Excel(name = "车辆")
    private Long carId;

    /** 供应商 */
    @Excel(name = "供应商")
    private Long supplierId;

    /** 采购日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "采购日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date purchaseDate;

    /** 采购价格 */
    @Excel(name = "采购价格")
    private BigDecimal purchasePrice;

    /** 经办采购员 */
    @Excel(name = "经办采购员")
    private Long purchaseByUserId;

    /** 付款状态 */
    @Excel(name = "付款状态")
    private String paymentStatus;

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

    public void setSupplierId(Long supplierId) 
    {
        this.supplierId = supplierId;
    }

    public Long getSupplierId() 
    {
        return supplierId;
    }

    public void setPurchaseDate(Date purchaseDate) 
    {
        this.purchaseDate = purchaseDate;
    }

    public Date getPurchaseDate() 
    {
        return purchaseDate;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) 
    {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getPurchasePrice() 
    {
        return purchasePrice;
    }

    public void setPurchaseByUserId(Long purchaseByUserId) 
    {
        this.purchaseByUserId = purchaseByUserId;
    }

    public Long getPurchaseByUserId() 
    {
        return purchaseByUserId;
    }

    public void setPaymentStatus(String paymentStatus) 
    {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentStatus() 
    {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("carId", getCarId())
            .append("supplierId", getSupplierId())
            .append("purchaseDate", getPurchaseDate())
            .append("purchasePrice", getPurchasePrice())
            .append("purchaseByUserId", getPurchaseByUserId())
            .append("paymentStatus", getPaymentStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
