package tk.wangyiwen.service;

import org.springframework.transaction.annotation.Transactional;

import tk.wangyiwen.dao.UserDao;

@Transactional
public class UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add() {
		System.out.println("service.............add");
	}
}
