package services.user.service;

import entitys.user.entity.User;

/**
 * 公共接口
 * @author LvWenJin
 *
 */
public interface UserService {
	
	//获取此用户名的数量
	int usersCount(String userName);
	
	//获取数据库的用户名和密码，通过用户名获取
	User getUser(String userName);
	
	//保存用户，注册用
	int insertUser(User user);
}
