package tk.wangyiwen.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import tk.wangyiwen.entity.User;

public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;

	public boolean add(User user) {
		if (findUserByName(user.getUsername()) != null) {
			return false;
		} else {
			hibernateTemplate.save(user);
			return true;
		}
	}

	public boolean delete(User user) {
		return false;
	}

	public List<User> findAll() {
		return null;
	}

	public User findUserByName(String username) {
		return hibernateTemplate.get(User.class, username);
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
