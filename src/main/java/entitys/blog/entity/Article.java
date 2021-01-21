package entitys.blog.entity;

import java.io.Serializable;

/***
 * 文章的实体类
 * @author LvWenJin
 *
 */
public class Article implements Serializable{
	private int id;
	private String userName;
	private String title;
	private String arcitle;
	private String createDate;
	private int clickNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArcitle() {
		return arcitle;
	}
	public void setArcitle(String arcitle) {
		this.arcitle = arcitle;
	}

	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getClickNum() {
		return clickNum;
	}
	public void setClickNum(int clickNum) {
		this.clickNum = clickNum;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Article(int id, String userName, String title, String arcitle, String createDate, int clickNum) {
		this.id = id;
		this.userName = userName;
		this.title = title;
		this.arcitle = arcitle;
		this.createDate = createDate;
		this.clickNum = clickNum;
	}
	public Article(String userName, String title, String arcitle, String createDate) {
		this.userName = userName;
		this.title = title;
		this.arcitle = arcitle;
		this.createDate = createDate;
	}
	
	
	
}
