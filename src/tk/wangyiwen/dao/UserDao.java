package tk.wangyiwen.dao;

import java.util.List;

import org.hibernate.sql.Delete;

import tk.wangyiwen.entity.User;


public interface UserDao {

		public boolean add(User user);
		public boolean delete(User user);
		public List<User> findAll();
		public User findUserByName(String username);
		
}
