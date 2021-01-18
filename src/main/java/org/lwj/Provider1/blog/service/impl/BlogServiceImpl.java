package org.lwj.Provider1.blog.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.lwj.Provider1.blog.dao.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;

import entitys.blog.entity.Article;
import services.blog.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogDao blogDao;
	
	@Override
	public List<Article> getArticle(String userName) {
		// TODO Auto-generated method stub
		return blogDao.getArticle(userName);
	}

	@Override
	public List<Article> getArticleByDate(String userName, String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertArticle(String title, String article, String date) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteArticle(int uid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
