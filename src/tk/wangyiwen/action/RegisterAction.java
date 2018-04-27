package tk.wangyiwen.action;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tk.wangyiwen.entity.User;
import tk.wangyiwen.service.RegisterService;

public class RegisterAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	private String reset_password;
	private String prompt;
	private RegisterService registerService;

	public String execute() throws Exception {
		if(user.getUsername() == null) {
			return ERROR;
		}
		if (user.getUsername().isEmpty()) {
			prompt = "�û�������Ϊ��";
			return ERROR;
		}
		if (user.getNickname() == null || user.getNickname().isEmpty()) {
			prompt = "�ǳƲ���Ϊ��";
			return ERROR;
		}
		if (user.getPassword() == null ||user.getPassword().isEmpty()) {
			prompt = "���벻��Ϊ��";
			return ERROR;
		}
		if (!user.getPassword().equals(reset_password)) {
			prompt = "���벻һ��";
			return ERROR;
		} else if (user.getPassword().length() < 8) {
			prompt = "���������ڰ�λ��";
			return ERROR;
		} else if (!registerService.register(user)) {
			prompt = "�û����Ѵ���";
			return ERROR;
		} else {
			return SUCCESS;
		}
	}

	public User getModel() {
		return user;
	}

	public String getReset_password() {
		return reset_password;
	}

	public void setReset_password(String reset_password) {
		this.reset_password = reset_password;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

}
