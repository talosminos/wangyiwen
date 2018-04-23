package tk.wangyiwen.action;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tk.wangyiwen.entity.User;
import tk.wangyiwen.service.LoginService;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	private String prompt;
	private LoginService loginService;
	
	public String execute() throws Exception {
		if(loginService.login(user))
			return "success";
		else {
			prompt = "用户名或密码错误！";
			return "login";
		}
			
/*		Session session = null;
		Transaction tx = null;
		User u = null;
		try {
			// 获得与线程绑定的session
			session = HibernateUtiles.openSession();
			// 开启事物
			tx = session.beginTransaction();
			// 做操作
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.eq("username", user.getUsername()))
					.add(Restrictions.eq("password", user.getPassword()));
			u = (User) criteria.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// 回滚事物
			tx.rollback();
		} finally {

		}
		if (u != null)
			return SUCCESS;
		else {
			prompt="用户名密码错误！";
			return "login";
		}*/
	}

	public User getModel() {
		return user;
	}
	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
