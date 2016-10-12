package main;

public class CauHoi {
	private String maMonHoc;
	private int thuocChuong;
	private String deBai;
	private int doKho;
	private float diem;
	
	public CauHoi(){
		maMonHoc = "MH000";
		thuocChuong = 0;
		deBai = "Khong co de bai";
		doKho = 0;
		diem = 0.0f;
	}
	
	public CauHoi(String maMonHoc, int thuocChuong, String deBai, int doKho, float diem){
		this.maMonHoc = maMonHoc;
		this.thuocChuong = thuocChuong;
		this.deBai = deBai;
		this.doKho = doKho;
		this.diem = diem;
	}
	
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}
	public int getThuocChuong() {
		return thuocChuong;
	}
	public void setThuocChuong(int thuocChuong) {
		this.thuocChuong = thuocChuong;
	}
	public String getDeBai() {
		return deBai;
	}
	public void setDeBai(String deBai) {
		this.deBai = deBai;
	}
	public int getDoKho() {
		return doKho;
	}
	public void setDoKho(int doKho) {
		this.doKho = doKho;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	
	

}
