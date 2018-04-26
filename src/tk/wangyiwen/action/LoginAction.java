package tk.wangyiwen.action;

import org.apache.struts2.ServletActionContext;
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
		User u  = loginService.login(user);
		if(u!=null) {
			//��¼�ɹ������û���¼��Ϣ����session��
			ServletActionContext.getRequest().getSession().setAttribute("user", u);
			return "success";
		}
		else {
			prompt = "�û������������";
			return "login";
		}
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
