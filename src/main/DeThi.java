package main;

import java.util.ArrayList;
import java.util.Collections;

public class DeThi {
	private String tenMonHoc;
	private String maHocPhan;
	private String hocKy;
	private String thoiGian;
	private float tongDiem;
	private ArrayList<CauHoi> danhSachCauHoi;
	
	public DeThi(){
		tenMonHoc = "Khong co ten mon hoc.";
		maHocPhan = "Khong co ma hoc phan.";
		hocKy = "00000";
		thoiGian = "00-00-0000";
		tongDiem = 0.0f;
		danhSachCauHoi = new ArrayList<>();
	}
	
	public DeThi(String tenMonHoc, String maHocPhan, String hocKy, String thoiGian, float tongDiem){
		this.tenMonHoc = tenMonHoc;
		this.maHocPhan = maHocPhan;
		this.hocKy = hocKy;
		this.thoiGian = thoiGian;
		this.tongDiem = tongDiem;
		danhSachCauHoi = new ArrayList<>();
	}
	
	public DeThi(String tenMonHoc, String maHocPhan, String hocKy, String thoiGian,
							float tongDiem, ArrayList<CauHoi> danhSachCauHoi){
		this.tenMonHoc = tenMonHoc;
		this.maHocPhan = maHocPhan;
		this.hocKy = hocKy;
		this.thoiGian = thoiGian;
		this.tongDiem = tongDiem;
		danhSachCauHoi = new ArrayList<>();
		danhSachCauHoi.addAll(danhSachCauHoi);
	}
	
	public void themCauHoi(CauHoi cauHoi){
		danhSachCauHoi.add(cauHoi);
	}
	
	
// Các hàm được comment này sẽ chuyển vào trong file giao diện
	
//	public String taoDeThiTuDong(boolean xaoTronCauHoi){
//		StringBuffer buffer = new StringBuffer();
//		buffer.append("\t\tKiem tra\n");
//		buffer.append("\nMon: " + tenMonHoc + "\t\tMa hoc phan: " + maHocPhan);
//		buffer.append("\nHoc Ky: " + hocKy + "\t\tThoi Gian: " + thoiGian + "\t\tTong diem:" + tongDiem);
//		buffer.append("\nHo va Ten: \t\t\t\t\tMSSV:");
//		buffer.append("\n\n");
//		if(xaoTronCauHoi){
//			Collections.shuffle(danhSachCauHoi);
//			for(int i = 0; i < danhSachCauHoi.size(); i++){
//				buffer.append("\n\nCau " + i + ": ");
//				buffer.append(danhSachCauHoi.get(i).getDeBai());
//				if( danhSachCauHoi.get(i) instanceof TracNghiem){
//					TracNghiem temp = (TracNghiem)danhSachCauHoi.get(i);
//					if(temp.getXaoTron()) Collections.shuffle(temp.getCacDapAn());
//					for(int j = 0; j< temp.getCacDapAn().size(); j++){
//						buffer.append("\n\t" + j + ". " + temp.getCacDapAn().get(j).getNoiDung());
//					}
//				}else {
//					buffer.append("\n\n\n\n\n\n\n\n");
//				}
//			}
//		}else{
//			StringBuffer tracNghiemBuffer = new StringBuffer();
//			StringBuffer tuLuanBuffer = new StringBuffer();
//			
//			for(int i = 0; i < danhSachCauHoi.size(); i++){
//				if(danhSachCauHoi.get(i) instanceof TracNghiem){
//					tracNghiemBuffer.append("\n\nCau " + i + ": ");
//					tracNghiemBuffer.append(danhSachCauHoi.get(i).getDeBai());
//					TracNghiem temp = (TracNghiem)danhSachCauHoi.get(i);
//					if(temp.getXaoTron()) Collections.shuffle(temp.getCacDapAn());
//					for(int j = 0; j< temp.getCacDapAn().size(); j++){
//						buffer.append("\n\t" + j + ". " + temp.getCacDapAn().get(j).getNoiDung());
//					}
//				} else {
//					tuLuanBuffer.append("\n\nCau "+ i + ": ");
//					tracNghiemBuffer.append(danhSachCauHoi.get(i).getDeBai());
//					tracNghiemBuffer.append("\n\n\n\n\n\n\n\n");
//				}
//			}
//			buffer.append(tracNghiemBuffer);
//			buffer.append(tuLuanBuffer);
//		}
//		return buffer.toString();
//	}
//	
//	
//	public String taoDeThiBangTay(){
//		return new String();
//	}
//	


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
	
	
}
