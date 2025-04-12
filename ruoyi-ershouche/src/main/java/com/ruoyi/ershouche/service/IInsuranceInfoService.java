package com.ruoyi.ershouche.service;

import java.util.List;
import com.ruoyi.ershouche.domain.InsuranceInfo;

/**
 * 保险信息管理Service接口
 * 
 * @author zmts
 * @date 2025-04-12
 */
public interface IInsuranceInfoService 
{
    /**
     * 查询保险信息管理
     * 
     * @param id 保险信息管理主键
     * @return 保险信息管理
     */
    public InsuranceInfo selectInsuranceInfoById(Long id);

    /**
     * 查询保险信息管理列表
     * 
     * @param insuranceInfo 保险信息管理
     * @return 保险信息管理集合
     */
    public List<InsuranceInfo> selectInsuranceInfoList(InsuranceInfo insuranceInfo);

    /**
     * 新增保险信息管理
     * 
     * @param insuranceInfo 保险信息管理
     * @return 结果
     */
    public int insertInsuranceInfo(InsuranceInfo insuranceInfo);

    /**
     * 修改保险信息管理
     * 
     * @param insuranceInfo 保险信息管理
     * @return 结果
     */
    public int updateInsuranceInfo(InsuranceInfo insuranceInfo);

    /**
     * 批量删除保险信息管理
     * 
     * @param ids 需要删除的保险信息管理主键集合
     * @return 结果
     */
    public int deleteInsuranceInfoByIds(Long[] ids);

    /**
     * 删除保险信息管理信息
     * 
     * @param id 保险信息管理主键
     * @return 结果
     */
    public int deleteInsuranceInfoById(Long id);
}
