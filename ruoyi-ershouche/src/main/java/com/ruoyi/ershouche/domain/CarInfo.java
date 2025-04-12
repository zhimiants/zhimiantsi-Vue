package com.ruoyi.ershouche.domain;

import java.math.BigDecimal;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆信息管理对象 tb_car_info
 * 
 * @author zmts
 * @date 2025-04-12
 */
public class CarInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 品牌 */
    @Excel(name = "品牌")
    private Long brandId;

    /** 型号 */
    @Excel(name = "型号")
    private Long modelId;

    /** 车架号(VIN) */
    @Excel(name = "车架号(VIN)")
    private String vin;

    /** 车辆颜色 */
    @Excel(name = "车辆颜色")
    private String color;

    /** 车辆年份(例如 2020) */
    @Excel(name = "车辆年份(例如 2020)")
    private Long year;

    /** 行驶里程(公里) */
    @Excel(name = "行驶里程(公里)")
    private Long mileage;

    /** 燃油类型(例如: 汽油, 柴油, 纯电, 油电混合) */
    @Excel(name = "燃油类型(例如: 汽油, 柴油, 纯电, 油电混合)")
    private String fuelType;

    /** 拟售价格(元) */
    @Excel(name = "拟售价格(元)")
    private BigDecimal sellingPrice;

    /** 车辆状态(例如: 待检测, 在售, 已预订, 已售, 已下架) */
    @Excel(name = "车辆状态(例如: 待检测, 在售, 已预订, 已售, 已下架)")
    private String status;

    /** 是否特价(0:否, 1:是) */
    @Excel(name = "是否特价(0:否, 1:是)")
    private Integer isSpecialOffer;

    /** 车辆所在地/库位 */
    @Excel(name = "车辆所在地/库位")
    private String location;

    /** 简要车况描述 */
    @Excel(name = "简要车况描述")
    private String conditionDesc;

    /** 车辆图片信息 */
    private List<CarImage> carImageList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setBrandId(Long brandId) 
    {
        this.brandId = brandId;
    }

    public Long getBrandId() 
    {
        return brandId;
    }

    public void setModelId(Long modelId) 
    {
        this.modelId = modelId;
    }

    public Long getModelId() 
    {
        return modelId;
    }

    public void setVin(String vin) 
    {
        this.vin = vin;
    }

    public String getVin() 
    {
        return vin;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }

    public void setYear(Long year) 
    {
        this.year = year;
    }

    public Long getYear() 
    {
        return year;
    }

    public void setMileage(Long mileage) 
    {
        this.mileage = mileage;
    }

    public Long getMileage() 
    {
        return mileage;
    }

    public void setFuelType(String fuelType) 
    {
        this.fuelType = fuelType;
    }

    public String getFuelType() 
    {
        return fuelType;
    }

    public void setSellingPrice(BigDecimal sellingPrice) 
    {
        this.sellingPrice = sellingPrice;
    }

    public BigDecimal getSellingPrice() 
    {
        return sellingPrice;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setIsSpecialOffer(Integer isSpecialOffer) 
    {
        this.isSpecialOffer = isSpecialOffer;
    }

    public Integer getIsSpecialOffer() 
    {
        return isSpecialOffer;
    }

    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }

    public void setConditionDesc(String conditionDesc) 
    {
        this.conditionDesc = conditionDesc;
    }

    public String getConditionDesc() 
    {
        return conditionDesc;
    }

    public List<CarImage> getCarImageList()
    {
        return carImageList;
    }

    public void setCarImageList(List<CarImage> carImageList)
    {
        this.carImageList = carImageList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("brandId", getBrandId())
            .append("modelId", getModelId())
            .append("vin", getVin())
            .append("color", getColor())
            .append("year", getYear())
            .append("mileage", getMileage())
            .append("fuelType", getFuelType())
            .append("sellingPrice", getSellingPrice())
            .append("status", getStatus())
            .append("isSpecialOffer", getIsSpecialOffer())
            .append("location", getLocation())
            .append("conditionDesc", getConditionDesc())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("carImageList", getCarImageList())
            .toString();
    }
}
