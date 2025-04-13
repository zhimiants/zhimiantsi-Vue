package com.ruoyi.zngl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 卖家信息管理对象 zn_seller_profile
 * 
 * @author zngl
 * @date 2025-04-13
 */
public class ZnSellerProfile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 用户 */
    @Excel(name = "用户")
    private Long userId;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String shopName;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String contactName;

    /** 营业执照 */
    @Excel(name = "营业执照")
    private String businessLicenseUrl;

    /** 店铺地址 */
    @Excel(name = "店铺地址")
    private String shopAddress;

    /** 店铺描述 */
    @Excel(name = "店铺描述")
    private String shopDescription;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String approvalStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
    }

    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }

    public void setBusinessLicenseUrl(String businessLicenseUrl) 
    {
        this.businessLicenseUrl = businessLicenseUrl;
    }

    public String getBusinessLicenseUrl() 
    {
        return businessLicenseUrl;
    }

    public void setShopAddress(String shopAddress) 
    {
        this.shopAddress = shopAddress;
    }

    public String getShopAddress() 
    {
        return shopAddress;
    }

    public void setShopDescription(String shopDescription) 
    {
        this.shopDescription = shopDescription;
    }

    public String getShopDescription() 
    {
        return shopDescription;
    }

    public void setApprovalStatus(String approvalStatus) 
    {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalStatus() 
    {
        return approvalStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("shopName", getShopName())
            .append("contactName", getContactName())
            .append("businessLicenseUrl", getBusinessLicenseUrl())
            .append("shopAddress", getShopAddress())
            .append("shopDescription", getShopDescription())
            .append("approvalStatus", getApprovalStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
