package com.ruoyi.zngl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农业资讯管理对象 zn_article
 * 
 * @author zmts
 * @date 2025-04-13
 */
public class ZnArticle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 文章标题 */
    @Excel(name = "文章标题")
    private String title;

    /** 文章内容 */
    @Excel(name = "文章内容")
    private String content;

    /** 作者 */
    @Excel(name = "作者")
    private String author;

    /** 分类 */
    @Excel(name = "分类")
    private String category;

    /** 封面 */
    @Excel(name = "封面")
    private String coverImageUrl;

    /** 阅读量 */
    @Excel(name = "阅读量")
    private Long views;

    /** 发布状态 */
    @Excel(name = "发布状态")
    private String publishStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }

    public void setCoverImageUrl(String coverImageUrl) 
    {
        this.coverImageUrl = coverImageUrl;
    }

    public String getCoverImageUrl() 
    {
        return coverImageUrl;
    }

    public void setViews(Long views) 
    {
        this.views = views;
    }

    public Long getViews() 
    {
        return views;
    }

    public void setPublishStatus(String publishStatus) 
    {
        this.publishStatus = publishStatus;
    }

    public String getPublishStatus() 
    {
        return publishStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("content", getContent())
            .append("author", getAuthor())
            .append("category", getCategory())
            .append("coverImageUrl", getCoverImageUrl())
            .append("views", getViews())
            .append("publishStatus", getPublishStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
