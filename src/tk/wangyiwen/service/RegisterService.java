package tk.wangyiwen.service;

import org.springframework.transaction.annotation.Transactional;

import tk.wangyiwen.dao.UserDao;
import tk.wangyiwen.entity.User;

@Transactional
public class RegisterService {

	private UserDao userDao;

	public boolean register(User user) {
		return userDao.add(user);
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
