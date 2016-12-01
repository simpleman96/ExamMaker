package main;

import java.util.ArrayList;
import java.util.Collections;

public class TracNghiem extends CauHoi {
	private boolean xaoTron;
	private ArrayList<DapAn> cacDapAn;

	public TracNghiem() {
		super();
		this.xaoTron = false;
		this.cacDapAn = new ArrayList<>();
	}

	public TracNghiem(String maMonHoc, int thuocChuong, String deBai, int doKho, boolean xaoTron,
			ArrayList<DapAn> cacDapAn) {
		super(maMonHoc, thuocChuong, deBai, doKho);
		this.xaoTron = xaoTron;
		this.cacDapAn = cacDapAn;
	}

	@Override
	public String inCauHoi() {
		StringBuffer ndCauHoi = new StringBuffer();
		ndCauHoi.append(" " + getDeBai());
		if(xaoTron){
			Collections.shuffle(cacDapAn);
		}
		
		for(int i = 0; i< cacDapAn.size(); i++){
			ndCauHoi.append("\n\t" + (i+1) + ". " + cacDapAn.get(i).getNoiDung());
		}
		
		return ndCauHoi.toString();
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
