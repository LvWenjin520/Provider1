package org.lwj.Provider1.blog.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.dubbo.config.annotation.Service;
import org.lwj.Provider1.blog.dao.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import entitys.blog.entity.Article;
import services.blog.service.BlogService;
import utils.JsonMsg;

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

	/**
	 * 保存文章
	 */
	@Override
	@Transactional  //开启事务注解
	public Map<String,String> insertArticle(String userName,String title, String article) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String date = format.format(new Date());
		int result = blogDao.insertArticle(userName,title, article, date);
		if(result == 1) {
			return JsonMsg.success("save article success");
		}
		return JsonMsg.faild("save article faild");
	}

	@Override
	public int deleteArticle(int uid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
