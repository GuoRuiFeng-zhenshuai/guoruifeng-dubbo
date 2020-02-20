package com.guoruifeng.service;

import java.util.List;

import com.guoruifeng.entity.Article;
import com.guoruifeng.entity.Tocp;


public interface ArticleService {
	List<Article> list(Tocp t);
}
