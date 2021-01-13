package org.lwj.Provider1.users.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import entitys.user.entity.User;

/***
 * 服务提供者的UserDao
 * @author LvWenJin
 *
 */
@Repository
@Mapper
public interface UserDao {
	
	//获取数据库的用户名和密码，通过用户名获取
	User getUser(String userName);
	//获取此用户名的数量
	int queryUsersCountByUserName(String userName);
	//保存用户，注册用
	int insertUser(User user);
}
