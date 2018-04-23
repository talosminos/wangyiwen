package tk.wangyiwen.entity;
/**
 * 定义实体类User
 * @author Administrator
 *
 */
public class User {
	/**
	 * 声明实体类的属性
	 * 用户名username
	 * 密码passowrd	
	 */
	private String username;
	private String nickname;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", nickname=" + nickname + ", password=" + password + "]";
	}
}
