package com.ruoyi.ershouche.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 卖家信息管理对象 tb_supplier
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class Supplier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 供应商名称/姓名 */
    @Excel(name = "供应商名称/姓名")
    private String name;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contactPerson;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 电子邮箱 */
    @Excel(name = "电子邮箱")
    private String email;

    /** 供应商评级 */
    @Excel(name = "供应商评级")
    private Integer rating;

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

    public void setContactPerson(String contactPerson) 
    {
        this.contactPerson = contactPerson;
    }

    public String getContactPerson() 
    {
        return contactPerson;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setRating(Integer rating) 
    {
        this.rating = rating;
    }

    public Integer getRating() 
    {
        return rating;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("contactPerson", getContactPerson())
            .append("phone", getPhone())
            .append("type", getType())
            .append("address", getAddress())
            .append("email", getEmail())
            .append("rating", getRating())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
