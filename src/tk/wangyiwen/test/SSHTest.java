package tk.wangyiwen.test;

import java.beans.PropertyVetoException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import tk.wangyiwen.entity.User;

public class SSHTest {

	@Test
	public void SpringIOC() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
	}

	@Test
	public void HibernateTest() {
		// 第一步 加载hibernate加载配置文件
		Configuration configuration = new Configuration();
		configuration.configure();
		// 第二步 创建sessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// 第三步 创建session
		Session session = sessionFactory.openSession();
		// 第四步 开始事物
		Transaction tx = session.beginTransaction();
		User user = new User();
		user.setUsername("minos");
		user.setPassword("minos");
		session.save(user);
		tx.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void C3p0() throws PropertyVetoException {
		//设置数据库信息
		 ComboPooledDataSource dataSource = new ComboPooledDataSource();
		 dataSource.setDriverClass("com.mysql.jdbc.Driver");
		 dataSource.setJdbcUrl("jdbc:mysql:///ssh");
		 dataSource.setUser("root");
		 dataSource.setPassword("minos");
		 
			//创建jdbcTemplate对象
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			
			//调用update方法实现删除
			String sql = "insert into t_user(username,password) values(?,?)";
			int rows = jdbcTemplate.update(sql, "lucy","250");
			System.out.println(rows);
	}

	@Test
	public void testJDBCTemplate() {
		
		//设置数据库信息
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///ssh");
		dataSource.setUsername("root");
		dataSource.setPassword("minos");
		
		//创建jdbcTemplate对象
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//调用update方法实现删除
		String sql = "delete from t_user where username=?";
		int rows = jdbcTemplate.update(sql, "minos");
		System.out.println(rows);
	}
}
