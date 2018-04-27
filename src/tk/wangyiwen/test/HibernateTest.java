package tk.wangyiwen.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateTest {

	@Test
	public void hibernateEntityTest() {
		//加载hibernate核心配置文件
		Configuration cfg = new Configuration();
		cfg.configure();
		//创建SessionFactory对象
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		//使用SessionFactory创建session对象
		Session session = sessionFactory.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//写具体逻辑crud操作
			//添加
		//提交事务
		tx.commit();
		//关闭资源
		session.close();
		sessionFactory.close();
	}
}
