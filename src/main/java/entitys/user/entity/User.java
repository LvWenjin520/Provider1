package entitys.user.entity;

import java.io.Serializable;

/***
 * 公共实体类
 * @author LvWenJin
 *	需要实例化
 */
public class User implements Serializable{
	private int id;
	private String userName;
	private String passWord;
	private String mail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public User(int id, String userName, String passWord, String mail) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.mail = mail;
	}
	public User(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	public User(String userName, String passWord, String mail) {
		this.userName = userName;
		this.passWord = passWord;
		this.mail = mail;
	}
	public User() {
	}
}
