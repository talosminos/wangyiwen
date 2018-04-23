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
		// ��һ�� ����hibernate���������ļ�
		Configuration configuration = new Configuration();
		configuration.configure();
		// �ڶ��� ����sessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// ������ ����session
		Session session = sessionFactory.openSession();
		// ���Ĳ� ��ʼ����
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
		//�������ݿ���Ϣ
		 ComboPooledDataSource dataSource = new ComboPooledDataSource();
		 dataSource.setDriverClass("com.mysql.jdbc.Driver");
		 dataSource.setJdbcUrl("jdbc:mysql:///ssh");
		 dataSource.setUser("root");
		 dataSource.setPassword("minos");
		 
			//����jdbcTemplate����
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			
			//����update����ʵ��ɾ��
			String sql = "insert into t_user(username,password) values(?,?)";
			int rows = jdbcTemplate.update(sql, "lucy","250");
			System.out.println(rows);
	}

	@Test
	public void testJDBCTemplate() {
		
		//�������ݿ���Ϣ
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///ssh");
		dataSource.setUsername("root");
		dataSource.setPassword("minos");
		
		//����jdbcTemplate����
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//����update����ʵ��ɾ��
		String sql = "delete from t_user where username=?";
		int rows = jdbcTemplate.update(sql, "minos");
		System.out.println(rows);
	}
}
