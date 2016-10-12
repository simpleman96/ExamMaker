package main;

public class DapAn {
	private String noiDung;
	private boolean laDapAnDung;
	
	public DapAn(){
		noiDung = "Khong co noi dung.";
		laDapAnDung = false;
	}
	
	public DapAn(String noiDung, boolean laDapAnDung){
		this.noiDung = noiDung;
		this.laDapAnDung = laDapAnDung;
	}
	
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public boolean isLaDapAnDung() {
		return laDapAnDung;
	}
	public void setLaDapAnDung(boolean laDapAnDung) {
		this.laDapAnDung = laDapAnDung;
	}
	
}
