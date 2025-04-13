package com.ruoyi.zngl.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农民信息管理对象 zn_farmer_profile
 * 
 * @author zngl
 * @date 2025-04-13
 */
public class ZnFarmerProfile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 用户 */
    @Excel(name = "用户")
    private Long userId;

    /** 真实姓名 */
    @Excel(name = "真实姓名")
    private String realName;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 农场地址 */
    @Excel(name = "农场地址")
    private String farmAddress;

    /** 农场面积 */
    @Excel(name = "农场面积")
    private BigDecimal farmArea;

    /** 主要作物 */
    @Excel(name = "主要作物")
    private String mainCrop;

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

    public void setRealName(String realName) 
    {
        this.realName = realName;
    }

    public String getRealName() 
    {
        return realName;
    }

    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }

    public void setFarmAddress(String farmAddress) 
    {
        this.farmAddress = farmAddress;
    }

    public String getFarmAddress() 
    {
        return farmAddress;
    }

    public void setFarmArea(BigDecimal farmArea) 
    {
        this.farmArea = farmArea;
    }

    public BigDecimal getFarmArea() 
    {
        return farmArea;
    }

    public void setMainCrop(String mainCrop) 
    {
        this.mainCrop = mainCrop;
    }

    public String getMainCrop() 
    {
        return mainCrop;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("realName", getRealName())
            .append("idCard", getIdCard())
            .append("farmAddress", getFarmAddress())
            .append("farmArea", getFarmArea())
            .append("mainCrop", getMainCrop())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
