package main;

public class TuLuan extends CauHoi{
	private String goiYDapAn;

	public TuLuan(){
		super();
		goiYDapAn = "Khong co goi y.";
	}
	
	public TuLuan(String maMonHoc, int thuocChuong, String deBai, int doKho, float diem, String goiYDapAn){
		super(maMonHoc, thuocChuong, deBai, doKho, diem);
		this.goiYDapAn = goiYDapAn;
	}
	
	
	public String getGoiYDapAn() {
		return goiYDapAn;
	}

	public void setGoiYDapAn(String goiYDapAn) {
		this.goiYDapAn = goiYDapAn;
	}
	
}
