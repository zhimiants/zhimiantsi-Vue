package com.ruoyi.zngl.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单管理对象 zn_order_base
 * 
 * @author zngl
 * @date 2025-04-13
 */
public class ZnOrderBase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;

    /** 购买用户 */
    @Excel(name = "购买用户")
    private Long buyerUserId;

    /** 卖家用户 */
    @Excel(name = "卖家用户")
    private Long sellerUserId;

    /** 金额(元) */
    @Excel(name = "金额(元)")
    private BigDecimal totalAmount;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String status;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private String paymentMethod;

    /** 订单快照 */
    @Excel(name = "订单快照")
    private String itemsSnapshot;

    /** 收货人 */
    @Excel(name = "收货人")
    private String receiverName;

    /** 电话 */
    @Excel(name = "电话")
    private String receiverPhone;

    /** 地址 */
    @Excel(name = "地址")
    private String receiverAddress;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }

    public void setBuyerUserId(Long buyerUserId) 
    {
        this.buyerUserId = buyerUserId;
    }

    public Long getBuyerUserId() 
    {
        return buyerUserId;
    }

    public void setSellerUserId(Long sellerUserId) 
    {
        this.sellerUserId = sellerUserId;
    }

    public Long getSellerUserId() 
    {
        return sellerUserId;
    }

    public void setTotalAmount(BigDecimal totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalAmount() 
    {
        return totalAmount;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setPaymentMethod(String paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() 
    {
        return paymentMethod;
    }

    public void setItemsSnapshot(String itemsSnapshot) 
    {
        this.itemsSnapshot = itemsSnapshot;
    }

    public String getItemsSnapshot() 
    {
        return itemsSnapshot;
    }

    public void setReceiverName(String receiverName) 
    {
        this.receiverName = receiverName;
    }

    public String getReceiverName() 
    {
        return receiverName;
    }

    public void setReceiverPhone(String receiverPhone) 
    {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverPhone() 
    {
        return receiverPhone;
    }

    public void setReceiverAddress(String receiverAddress) 
    {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverAddress() 
    {
        return receiverAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("buyerUserId", getBuyerUserId())
            .append("sellerUserId", getSellerUserId())
            .append("totalAmount", getTotalAmount())
            .append("status", getStatus())
            .append("paymentMethod", getPaymentMethod())
            .append("itemsSnapshot", getItemsSnapshot())
            .append("receiverName", getReceiverName())
            .append("receiverPhone", getReceiverPhone())
            .append("receiverAddress", getReceiverAddress())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
