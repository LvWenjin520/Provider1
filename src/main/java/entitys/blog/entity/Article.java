package entitys.blog.entity;

import java.io.Serializable;
import java.util.Date;

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
	private Date createDate;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
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
	public Article(String title, String arcitle, Date createDate, int clickNum) {
		this.title = title;
		this.arcitle = arcitle;
		this.createDate = createDate;
		this.clickNum = clickNum;
	}
	public Article(int id, String title, String arcitle, Date createDate, int clickNum) {
		this.id = id;
		this.title = title;
		this.arcitle = arcitle;
		this.createDate = createDate;
		this.clickNum = clickNum;
	}
	
	
	
}
