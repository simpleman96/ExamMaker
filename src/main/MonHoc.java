package main;

public class MonHoc {
	private String tenMonHoc;
	private String maHocPhan;
	private Integer soChuong;
	
	public MonHoc(Integer mon){
		if(mon == 1){
			tenMonHoc = "Cơ Sở Dữ Liệu";
			maHocPhan = "IT3090";
			soChuong = 6;
		}else if(mon == 2){
			tenMonHoc = "Trí Tuệ Nhân Tạo";
			maHocPhan = "IT3100";
			soChuong  = 9;
		}else if(mon == 3){
			tenMonHoc = "Lập Trình Hướng Đối Tượng";
			maHocPhan = "IT3110";
			soChuong = 12;
		}else{
			tenMonHoc = "Mạng Máy Tính";
			maHocPhan = "IT3120";
			soChuong = 5;
		}
	}
	
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public String getMaHocPhan() {
		return maHocPhan;
	}
	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}
	public Integer getSoChuong() {
		return soChuong;
	}
	public void setSoChuong(Integer soChuong) {
		this.soChuong = soChuong;
	}
	
	
}
