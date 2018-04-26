package tk.wangyiwen.service;

import tk.wangyiwen.dao.UserDao;
import tk.wangyiwen.entity.User;

public class LoginService {

	private User u;
	private UserDao userDao;
	private boolean prompt;
	public User login(User user) {
		u = userDao.findUserByName(user.getUsername());
		if(u!=null && u.getPassword().equals(user.getPassword()))
			return u;
		else
			return null;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
