package com.ruoyi.zngl.mapper;

import java.util.List;
import com.ruoyi.zngl.domain.ZnArticle;

/**
 * 农业资讯管理Mapper接口
 * 
 * @author zmts
 * @date 2025-04-13
 */
public interface ZnArticleMapper 
{
    /**
     * 查询农业资讯管理
     * 
     * @param id 农业资讯管理主键
     * @return 农业资讯管理
     */
    public ZnArticle selectZnArticleById(Long id);

    /**
     * 查询农业资讯管理列表
     * 
     * @param znArticle 农业资讯管理
     * @return 农业资讯管理集合
     */
    public List<ZnArticle> selectZnArticleList(ZnArticle znArticle);

    /**
     * 新增农业资讯管理
     * 
     * @param znArticle 农业资讯管理
     * @return 结果
     */
    public int insertZnArticle(ZnArticle znArticle);

    /**
     * 修改农业资讯管理
     * 
     * @param znArticle 农业资讯管理
     * @return 结果
     */
    public int updateZnArticle(ZnArticle znArticle);

    /**
     * 删除农业资讯管理
     * 
     * @param id 农业资讯管理主键
     * @return 结果
     */
    public int deleteZnArticleById(Long id);

    /**
     * 批量删除农业资讯管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteZnArticleByIds(Long[] ids);
}
