package tk.wangyiwen.service;

import tk.wangyiwen.dao.UserDao;
import tk.wangyiwen.entity.User;

public class LoginService {

	private User u;
	private UserDao userDao;
	private boolean prompt;
	public boolean login(User user) {
		u = userDao.findUserByName(user.getUsername());
		if(u!=null && u.getPassword().equals(user.getPassword()))
			return true;
		else
			return false;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
