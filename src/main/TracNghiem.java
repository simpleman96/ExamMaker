package main;

import java.util.ArrayList;

public class TracNghiem extends CauHoi {
	private boolean xaoTron;
	private ArrayList<DapAn> cacDapAn;

	public TracNghiem() {
		super();
		this.xaoTron = false;
		this.cacDapAn = new ArrayList<>();
	}

	public TracNghiem(String maMonHoc, int thuocChuong, String deBai, int doKho, float diem, boolean xaoTron,
			ArrayList<DapAn> cacDapAn) {
		super(maMonHoc, thuocChuong, deBai, doKho, diem);
		this.xaoTron = xaoTron;
		this.cacDapAn = cacDapAn;
	}

	public boolean getXaoTron() {
		return xaoTron;
	}

	public void setXaoTron(boolean xaoTron) {
		this.xaoTron = xaoTron;
	}

	public ArrayList<DapAn> getCacDapAn() {
		return cacDapAn;
	}

	public void setCacDapAn(ArrayList<DapAn> cacDapAn) {
		this.cacDapAn = cacDapAn;
	}
}
