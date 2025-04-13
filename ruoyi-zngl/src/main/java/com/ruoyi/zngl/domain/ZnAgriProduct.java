package com.ruoyi.zngl.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农资商品管理对象 zn_agri_product
 * 
 * @author zmts
 * @date 2025-04-13
 */
public class ZnAgriProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 卖家用户 */
    @Excel(name = "卖家用户")
    private Long sellerId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String name;

    /** 商品描述 */
    @Excel(name = "商品描述")
    private String description;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String imageUrl;

    /** 价格(元) */
    @Excel(name = "价格(元)")
    private BigDecimal price;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long stock;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 商品状态 */
    @Excel(name = "商品状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setSellerId(Long sellerId) 
    {
        this.sellerId = sellerId;
    }

    public Long getSellerId() 
    {
        return sellerId;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setStock(Long stock) 
    {
        this.stock = stock;
    }

    public Long getStock() 
    {
        return stock;
    }

    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sellerId", getSellerId())
            .append("name", getName())
            .append("description", getDescription())
            .append("imageUrl", getImageUrl())
            .append("price", getPrice())
            .append("stock", getStock())
            .append("unit", getUnit())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
