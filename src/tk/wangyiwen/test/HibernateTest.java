package tk.wangyiwen.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateTest {

	@Test
	public void hibernateEntityTest() {
		//����hibernate���������ļ�
		Configuration cfg = new Configuration();
		cfg.configure();
		//����SessionFactory����
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		//ʹ��SessionFactory����session����
		Session session = sessionFactory.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//д�����߼�crud����
			//���
		//�ύ����
		tx.commit();
		//�ر���Դ
		session.close();
		sessionFactory.close();
	}
}
