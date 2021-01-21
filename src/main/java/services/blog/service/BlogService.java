package services.blog.service;

import java.util.List;
import java.util.Map;

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
	Map<String,String> insertArticle(String userName,String title, String article);
	
	//删除文章
	int deleteArticle(int uid); 
	

}
