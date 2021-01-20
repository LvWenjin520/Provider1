package services.blog.service;

import java.util.List;

import entitys.blog.entity.Article;

/**
 * 博客的公共接口
 * @author LvWenJin
 *
 */
public interface BlogService {
	//获取所有的文章
	List<Article> getArticle(String userName);
	
	//获取所有的文章
	List<Article> getArticleByDate(String userName,String start,String end);
	
	//写文章
	int insertArticle(String title, String article,String date);
	
	//删除文章
	int deleteArticle(int uid); 
	

}
