package com.guoruifeng.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoruifeng.entity.Article;
import com.guoruifeng.entity.Tocp;
import com.guoruifeng.service.ArticleService;

@Controller
public class ArticleController {
@Autowired 
ArticleService s;
@RequestMapping("list")
public String list(HttpServletRequest request,Tocp t){
	List<Article> list = s.list(t);
	request.setAttribute("list", list);
	System.out.println(list.toString());
	return "list";
	
}
}
