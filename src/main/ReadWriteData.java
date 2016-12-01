package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadWriteData {

	public static void main(String[] args) {
		
//		ArrayList<TracNghiem> dsTracNghiemr =(ArrayList<TracNghiem>) readObject(nameFile);
//		for (int i = 0; i < dsTracNghiemr.size(); i++) {
//			dsTracNghiemr.get(i).inCauHoi();
//		}
	}

	// Doc - ghi object
	public static boolean writeObject(Object dt, String nameFile) {
		File file = new File(nameFile);
		FileOutputStream fo = null;
		ObjectOutputStream oStream = null;
		try {
			fo = new FileOutputStream(file);
			oStream = new ObjectOutputStream(fo);
			oStream.writeObject(dt);
			oStream.close();
			fo.close();
			return true;
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ReadWriteData.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(ReadWriteData.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				oStream.close();
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public static Object readObject(String nameFile) {
		File file = new File(nameFile);
		FileInputStream fis = null;
		ObjectInputStream inStream = null;
		Object s = null;
		try {
			fis = new FileInputStream(file);
			inStream = new ObjectInputStream(fis);
			s = inStream.readObject();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ReadWriteData.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				inStream.close();
				fis.close();
			} catch (IOException ex) {
				Logger.getLogger(ReadWriteData.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		return s;
	}

	// public static boolean ghiDeThi(ArrayList<DeThi> dsDeThi, String path) {
	//
	// try {
	// FileOutputStream fos = new FileOutputStream(path);
	// ObjectOutputStream oos = new ObjectOutputStream(fos);
	// oos.writeObject(dsDeThi);
	// oos.close();
	// fos.close();
	// return true;
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// return false;
	// }
	//
	// public static ArrayList<DeThi> docDeThi(String path) {
	// ArrayList<DeThi> dsDeThi = null;
	// try {
	// FileInputStream fis = new FileInputStream(path);
	// ObjectInputStream ois = new ObjectInputStream(fis);
	// dsDeThi = (ArrayList<DeThi>) ois.readObject();
	// ois.close();
	// fis.close();
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// return dsDeThi;
	// }

	public static ArrayList<TracNghiem> taoDSCauHoiTN(int mon, int soCauHoi) {
		ArrayList<TracNghiem> dsTracNghiem = new ArrayList<>();
		MonHoc monHoc = new MonHoc(mon);

		ArrayList<DapAn> cacDapAn = new ArrayList<DapAn>();
		for (int i = 0; i < 4; i++) {
			cacDapAn.add(new DapAn("Dap an " + i, true));

		}

		ArrayList<String> cacDeBai = new ArrayList<>();

		cacDeBai.add("Ngôn ngữ lập trình hướng đối tượng");
		cacDeBai.add("Mục đích của Constructor mặc định?");
		cacDeBai.add("Quá tải phương thức (Method Overloading) là gì?");
		cacDeBai.add("Ghi đè phương thức (Method Overriding) là gì?");

		for (int i = 0; i < soCauHoi; i++) {
			Collections.shuffle(cacDeBai);
			StringBuffer deBai = new StringBuffer();
			for (String e : cacDeBai) {
				deBai.append(e);
			}
			TracNghiem tracNghiem = new TracNghiem(monHoc.getMaHocPhan(), i % monHoc.getSoChuong(), deBai.toString(),
					i % 3, true, cacDapAn);
			dsTracNghiem.add(tracNghiem);
		}
		return dsTracNghiem;
	}

	public static ArrayList<TuLuan> taoDSCauHoiTL(int mon, int soCauHoi) {
		ArrayList<TuLuan> dsTuLuan = new ArrayList<>();
		MonHoc monHoc = new MonHoc(mon);

		ArrayList<String> cacDeBai = new ArrayList<>();

		cacDeBai.add("Ngôn ngữ lập trình hướng đối tượng");
		cacDeBai.add("Mục đích của Constructor mặc định?");
		cacDeBai.add("Quá tải phương thức (Method Overloading) là gì?");
		cacDeBai.add("Ghi đè phương thức (Method Overriding) là gì?");

		for (int i = 0; i < soCauHoi; i++) {
			Collections.shuffle(cacDeBai);
			StringBuffer deBai = new StringBuffer();
			for (String e : cacDeBai) {
				deBai.append(e);
			}
			String goiYDapAn = new String("Đây là gợi ý đáp án.");
			TuLuan tuLuan = new TuLuan(monHoc.getMaHocPhan(), i % monHoc.getSoChuong(), deBai.toString(), i % 3,
					goiYDapAn);
			dsTuLuan.add(tuLuan);
		}
		return dsTuLuan;
	}
//
//	public static DeThi taoDuLieuDeThi(int mon) {
//		ArrayList<CauHoi> cacCauHoi = new ArrayList<>();
//		MonHoc monHoc = new MonHoc(mon);
//
//		cacCauHoi.addAll(taoDSCauHoiTN(mon, 8));
//		cacCauHoi.addAll(taoDSCauHoiTL(mon, 4));
//
//		Collections.shuffle(cacCauHoi);
//		DeThi deThi = new DeThi(monHoc.getTenMonHoc(), monHoc.getMaHocPhan(), "20161", "30-11-2016", 10.0f, cacCauHoi);
//
//		return deThi;
//	}

}
