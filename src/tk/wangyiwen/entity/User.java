package tk.wangyiwen.entity;

import java.util.Set;

/**
 * ����ʵ����User
 * @author Administrator
 *
 */
public class User {
	/**
	 * ����ʵ���������
	 * �û���username
	 * ����passowrd	
	 */
	private String username;
	private String nickname;
	private String password;
	private Set<Album> albumSet;
	
	public Set<Album> getAlbumSet() {
		return albumSet;
	}
	public void setAlbumSet(Set<Album> albumSet) {
		this.albumSet = albumSet;
	}
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
