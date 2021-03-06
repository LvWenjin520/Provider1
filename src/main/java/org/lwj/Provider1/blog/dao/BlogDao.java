package org.lwj.Provider1.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import entitys.blog.entity.Article;

@Repository
@Mapper
public interface BlogDao {
	//获取所有的文章
	List<Article> getArticle(String userName);
	
	//获取所有的文章
	List<Article> getArticleByDate(String userName,String start,String end);
	
	//写文章
	int insertArticle(String userName,String title, String article,String date);
	
	//删除文章
	int deleteArticle(int articleId); 
	
}
