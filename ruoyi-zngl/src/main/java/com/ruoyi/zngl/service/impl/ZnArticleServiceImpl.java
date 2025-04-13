package com.ruoyi.zngl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zngl.mapper.ZnArticleMapper;
import com.ruoyi.zngl.domain.ZnArticle;
import com.ruoyi.zngl.service.IZnArticleService;

/**
 * 农业资讯管理Service业务层处理
 * 
 * @author zmts
 * @date 2025-04-13
 */
@Service
public class ZnArticleServiceImpl implements IZnArticleService 
{
    @Autowired
    private ZnArticleMapper znArticleMapper;

    /**
     * 查询农业资讯管理
     * 
     * @param id 农业资讯管理主键
     * @return 农业资讯管理
     */
    @Override
    public ZnArticle selectZnArticleById(Long id)
    {
        return znArticleMapper.selectZnArticleById(id);
    }

    /**
     * 查询农业资讯管理列表
     * 
     * @param znArticle 农业资讯管理
     * @return 农业资讯管理
     */
    @Override
    public List<ZnArticle> selectZnArticleList(ZnArticle znArticle)
    {
        return znArticleMapper.selectZnArticleList(znArticle);
    }

    /**
     * 新增农业资讯管理
     * 
     * @param znArticle 农业资讯管理
     * @return 结果
     */
    @Override
    public int insertZnArticle(ZnArticle znArticle)
    {
        znArticle.setCreateTime(DateUtils.getNowDate());
        return znArticleMapper.insertZnArticle(znArticle);
    }

    /**
     * 修改农业资讯管理
     * 
     * @param znArticle 农业资讯管理
     * @return 结果
     */
    @Override
    public int updateZnArticle(ZnArticle znArticle)
    {
        znArticle.setUpdateTime(DateUtils.getNowDate());
        return znArticleMapper.updateZnArticle(znArticle);
    }

    /**
     * 批量删除农业资讯管理
     * 
     * @param ids 需要删除的农业资讯管理主键
     * @return 结果
     */
    @Override
    public int deleteZnArticleByIds(Long[] ids)
    {
        return znArticleMapper.deleteZnArticleByIds(ids);
    }

    /**
     * 删除农业资讯管理信息
     * 
     * @param id 农业资讯管理主键
     * @return 结果
     */
    @Override
    public int deleteZnArticleById(Long id)
    {
        return znArticleMapper.deleteZnArticleById(id);
    }
}
