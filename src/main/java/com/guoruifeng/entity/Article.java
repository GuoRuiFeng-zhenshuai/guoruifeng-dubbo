/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Article.java 
 * @Prject: -cms
 * @Package: com.guoruifeng.beans 
 * @Description: TODO
 * @作者: ZJ 
 * @时间: 2019年11月14日
 * @version: V1.0   
 */
package com.guoruifeng.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;





/**
 * @ClassName: Article
 * @Description: TODO
 * @作者: ZJ
 * @时间: 2019年11月14日
 */
// 索引库的名称或者类型,统统都是小写,否则报错!!!!!!!!!!!!!!!!!!!!!!!!

public class Article  {

	private Integer id;
	// 文章标题

	private String title;
	// 文章内容

	private String content;
	// 标题图片的url 地址
	private String picture;
	// 频道
	private Integer channelId;

	

	// 点击数量
	private int hits;
	// 是否为热门文章 1 是 0 否
	private int hot;
	// 0 待审核 1 审核通过 2 审核未通过
	private int status;
	// 是否被删除
	private int deleted;

	// 发表时间
	private Date created;

	// 最后修改时间
	private Date updated;

	// 评论的数量
	private int commentCnt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getHot() {
		return hot;
	}

	public void setHot(int hot) {
		this.hot = hot;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}

	public Article(Integer id, String title, String content, String picture,
			Integer channelId, int hits, int hot, int status, int deleted,
			Date created, Date updated, int commentCnt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.picture = picture;
		this.channelId = channelId;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.commentCnt = commentCnt;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content="
				+ content + ", picture=" + picture + ", channelId=" + channelId
				+ ", hits=" + hits + ", hot=" + hot + ", status=" + status
				+ ", deleted=" + deleted + ", created=" + created
				+ ", updated=" + updated + ", commentCnt=" + commentCnt + "]";
	}

	public Article() {
		super();
	}

	// 文章类型(变为枚举类型)


}
