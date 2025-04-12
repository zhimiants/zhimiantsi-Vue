package com.ruoyi.ershouche.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ershouche.mapper.InsuranceInfoMapper;
import com.ruoyi.ershouche.domain.InsuranceInfo;
import com.ruoyi.ershouche.service.IInsuranceInfoService;

/**
 * 保险信息管理Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-12
 */
@Service
public class InsuranceInfoServiceImpl implements IInsuranceInfoService 
{
    @Autowired
    private InsuranceInfoMapper insuranceInfoMapper;

    /**
     * 查询保险信息管理
     * 
     * @param id 保险信息管理主键
     * @return 保险信息管理
     */
    @Override
    public InsuranceInfo selectInsuranceInfoById(Long id)
    {
        return insuranceInfoMapper.selectInsuranceInfoById(id);
    }

    /**
     * 查询保险信息管理列表
     * 
     * @param insuranceInfo 保险信息管理
     * @return 保险信息管理
     */
    @Override
    public List<InsuranceInfo> selectInsuranceInfoList(InsuranceInfo insuranceInfo)
    {
        return insuranceInfoMapper.selectInsuranceInfoList(insuranceInfo);
    }

    /**
     * 新增保险信息管理
     * 
     * @param insuranceInfo 保险信息管理
     * @return 结果
     */
    @Override
    public int insertInsuranceInfo(InsuranceInfo insuranceInfo)
    {
        insuranceInfo.setCreateTime(DateUtils.getNowDate());
        return insuranceInfoMapper.insertInsuranceInfo(insuranceInfo);
    }

    /**
     * 修改保险信息管理
     * 
     * @param insuranceInfo 保险信息管理
     * @return 结果
     */
    @Override
    public int updateInsuranceInfo(InsuranceInfo insuranceInfo)
    {
        insuranceInfo.setUpdateTime(DateUtils.getNowDate());
        return insuranceInfoMapper.updateInsuranceInfo(insuranceInfo);
    }

    /**
     * 批量删除保险信息管理
     * 
     * @param ids 需要删除的保险信息管理主键
     * @return 结果
     */
    @Override
    public int deleteInsuranceInfoByIds(Long[] ids)
    {
        return insuranceInfoMapper.deleteInsuranceInfoByIds(ids);
    }

    /**
     * 删除保险信息管理信息
     * 
     * @param id 保险信息管理主键
     * @return 结果
     */
    @Override
    public int deleteInsuranceInfoById(Long id)
    {
        return insuranceInfoMapper.deleteInsuranceInfoById(id);
    }
}
