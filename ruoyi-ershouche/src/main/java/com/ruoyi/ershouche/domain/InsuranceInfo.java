package com.ruoyi.ershouche.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 保险信息管理对象 tb_insurance_info
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class InsuranceInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 车辆 */
    @Excel(name = "车辆")
    private Long carId;

    /** 交强险到期日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交强险到期日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date compulsoryExpiryDate;

    /** 商业险简述 */
    @Excel(name = "商业险简述")
    private String commercialInfo;

    /** 保险公司 */
    @Excel(name = "保险公司")
    private String insuranceCompany;

    /** 保单号码 */
    @Excel(name = "保单号码")
    private String policyNo;

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

    public void setCompulsoryExpiryDate(Date compulsoryExpiryDate) 
    {
        this.compulsoryExpiryDate = compulsoryExpiryDate;
    }

    public Date getCompulsoryExpiryDate() 
    {
        return compulsoryExpiryDate;
    }

    public void setCommercialInfo(String commercialInfo) 
    {
        this.commercialInfo = commercialInfo;
    }

    public String getCommercialInfo() 
    {
        return commercialInfo;
    }

    public void setInsuranceCompany(String insuranceCompany) 
    {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceCompany() 
    {
        return insuranceCompany;
    }

    public void setPolicyNo(String policyNo) 
    {
        this.policyNo = policyNo;
    }

    public String getPolicyNo() 
    {
        return policyNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("carId", getCarId())
            .append("compulsoryExpiryDate", getCompulsoryExpiryDate())
            .append("commercialInfo", getCommercialInfo())
            .append("insuranceCompany", getInsuranceCompany())
            .append("policyNo", getPolicyNo())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
