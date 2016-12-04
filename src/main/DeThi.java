package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class DeThi implements Serializable{
	private String tenMonHoc;
	private String maHocPhan;
	private String hocKy;
	private String thoiGian;
	private float tongDiem;
	private boolean xaoTronCauHoi;
	private ArrayList<CauHoi> danhSachCauHoi;
	
	public DeThi(){
		tenMonHoc = "Khong co ten mon hoc.";
		maHocPhan = "Khong co ma hoc phan.";
		hocKy = "00000";
		thoiGian = "00-00-0000";
		tongDiem = 0.0f;
		xaoTronCauHoi = false;
		danhSachCauHoi = new ArrayList<>();
	}
	
	public DeThi(String tenMonHoc, String maHocPhan, String hocKy, String thoiGian, float tongDiem){
		this.tenMonHoc = tenMonHoc;
		this.maHocPhan = maHocPhan;
		this.hocKy = hocKy;
		this.thoiGian = thoiGian;
		this.tongDiem = tongDiem;
		xaoTronCauHoi = false;
		danhSachCauHoi = new ArrayList<>();
	}
	
	public DeThi(String tenMonHoc, String maHocPhan, String hocKy, String thoiGian,
							float tongDiem, boolean xaoTronCauHoi, ArrayList<CauHoi> danhSachCauHoi){
		this.tenMonHoc = tenMonHoc;
		this.maHocPhan = maHocPhan;
		this.hocKy = hocKy;
		this.thoiGian = thoiGian;
		this.tongDiem = tongDiem;
		this.xaoTronCauHoi = xaoTronCauHoi;
		this.danhSachCauHoi = danhSachCauHoi;
	}
	
	public void themCauHoi(CauHoi cauHoi){
		danhSachCauHoi.add(cauHoi);
	}
	
	
	public String inDeThi(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n\n\t\tKiem tra\n");
		buffer.append("\nMon: " + tenMonHoc + "\t\tMa hoc phan: " + maHocPhan);
		buffer.append("\nHoc Ky: " + hocKy + "\t\tThoi Gian: " + thoiGian + " phút" +  "\t\tTong diem:" + tongDiem);
		buffer.append("\nHo va Ten: \t\t\t\t\tMSSV:");
		buffer.append("\n\n");
		if(xaoTronCauHoi){
			Collections.shuffle(danhSachCauHoi);
		}
		for(int i = 0; i < danhSachCauHoi.size(); i++){
			buffer.append("\n\nCau " + i + ": ");
			buffer.append(danhSachCauHoi.get(i).getDeBai());
			buffer.append(danhSachCauHoi.get(i).inCauHoi());
		}
		return buffer.toString();
	}


// Các getter setter
	
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
	public String getHocKy() {
		return hocKy;
	}
	public void setHocKy(String hocKy) {
		this.hocKy = hocKy;
	}
	public String getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}
	public float getTongDiem() {
		return tongDiem;
	}
	public void setTongDiem(float tongDiem) {
		this.tongDiem = tongDiem;
	}

	public ArrayList<CauHoi> getDanhSachCauHoi() {
		return danhSachCauHoi;
	}

	public void setDanhSachCauHoi(ArrayList<CauHoi> danhSachCauHoi) {
		this.danhSachCauHoi = danhSachCauHoi;
	}

	public boolean isXaoTronCauHoi() {
		return xaoTronCauHoi;
	}

	public void setXaoTronCauHoi(boolean xaoTronCauHoi) {
		this.xaoTronCauHoi = xaoTronCauHoi;
	}
	
	
}
