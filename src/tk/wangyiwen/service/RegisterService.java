package tk.wangyiwen.service;

import java.io.File;

import org.springframework.transaction.annotation.Transactional;

import tk.wangyiwen.dao.UserDao;
import tk.wangyiwen.entity.User;

@Transactional
public class RegisterService {

	private File userFile;
	private UserDao userDao;

	public boolean register(User user) {
		/**
		 * 用户注册成功创建用户目录
		 */
		if(userDao.add(user)) {
			 userFile = new File("D://wangyiwen//" + user.getUsername());
			 userFile.mkdir();
			 return true;
		}
		return false;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
