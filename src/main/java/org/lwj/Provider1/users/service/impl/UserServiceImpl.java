package org.lwj.Provider1.users.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.lwj.Provider1.users.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entitys.user.entity.User;
import services.user.service.UserService;


/***
 * 用户服务
 * @author LvWenJin
 *
 */
@Component
@Service  //Dubbo的注解
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public int usersCount(String userName) {
		// TODO Auto-generated method stub
		return userDao.queryUsersCountByUserName(userName);
	}

	/**
	 * 获取用户实体
	 */
	@Override
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	/****
	 * 
	 * 保存用户，返回1为成功，返回0为已存在用户，返回-1为系统错误
	 * 
	 */
	public int insertUser(User user) {
		int usersCount = usersCount(user.getUserName());
		
		if(usersCount > 0) {
			return 0;
		}
		
		//加密
		Md5Hash md5 = new Md5Hash(user.getPassWord(),"fuckoff",1024);
		//加密后的密码
		String password = md5.toHex();
		//更新加密后的密码
		user.setPassWord(password);
		
		int insertFlag = 0;
		insertFlag = userDao.insertUser(user);
		if(insertFlag == 1) {
			return 1;
		}
		return -1;
	}

}
