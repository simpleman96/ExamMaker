package main;

public class TuLuan extends CauHoi{
	private String goiYDapAn;

	public TuLuan(){
		super();
		goiYDapAn = "Khong co goi y.";
	}
	
	public TuLuan(String maMonHoc, int thuocChuong, String deBai, int doKho, String goiYDapAn){
		super(maMonHoc, thuocChuong, deBai, doKho);
		this.goiYDapAn = goiYDapAn;
	}
	
	@Override
	public String inCauHoi() {
		StringBuffer ndCauHoi = new StringBuffer();
		ndCauHoi.append(" " + getDeBai());
		ndCauHoi.append("\n\n\n\n\n\n\n\n");
		return ndCauHoi.toString();
	}
	
	
	public String getGoiYDapAn() {
		return goiYDapAn;
	}

	public void setGoiYDapAn(String goiYDapAn) {
		this.goiYDapAn = goiYDapAn;
	}

}
