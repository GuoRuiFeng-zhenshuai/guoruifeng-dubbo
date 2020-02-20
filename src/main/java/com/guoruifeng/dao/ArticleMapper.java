package com.guoruifeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.guoruifeng.entity.Article;
import com.guoruifeng.entity.Tocp;

public interface ArticleMapper {
	
List<Article> l(Tocp t);
}
