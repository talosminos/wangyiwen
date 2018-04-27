package tk.wangyiwen.entity;

public class Photo {
	private Long photoId;
	private String photoName;
	private Album ablum;
	public Long getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public Album getAblum() {
		return ablum;
	}
	public void setAblum(Album ablum) {
		this.ablum = ablum;
	}
}
