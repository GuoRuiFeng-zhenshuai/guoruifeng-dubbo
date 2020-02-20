package com.guoruifeng.service.impl;

import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guoruifeng.dao.ArticleMapper;
import com.guoruifeng.entity.Article;
import com.guoruifeng.entity.Tocp;
import com.guoruifeng.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
@Autowired
ArticleMapper m;
	public List<Article> list(Tocp t) {
		// TODO Auto-generated method stub
		return m.l(t);
	}

}
