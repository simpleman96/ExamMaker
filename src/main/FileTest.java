package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileTest {
	private static ObjectOutputStream obOutput;
	private static ObjectInputStream obInput;

	public static void main(String[] args){
		File file = new File("test.DAT");
//		String[] string = {"Hello", "Hi"};
//		DapAn dapAn = new DapAn("Dap An 1", true);
//		ArrayList<DapAn> alDapAn = new ArrayList<>();
//		alDapAn.add(dapAn);
//		TracNghiem tracNghiem = new TracNghiem("MH001", 1, "Đây là đề bài.", 1, 1, false, alDapAn);
		
		TracNghiem tracNghiem = new TracNghiem();
//		String[] string = new String[2];;
//		FileOutputStream fileOputStream;
		FileInputStream fileInputStream;	
		try {
//			fileOputStream = new FileOutputStream(file);
//			obOutput = new ObjectOutputStream(fileOputStream);
//			obOutput.writeObject(tracNghiem);
			fileInputStream = new FileInputStream(file);
			obInput = new ObjectInputStream(fileInputStream);
			tracNghiem = (TracNghiem)obInput.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(tracNghiem.getDeBai() + "|" + tracNghiem.getThuocChuong()+"|"+ 
		tracNghiem.getMaMonHoc()+"|"+tracNghiem.getDoKho()+"|"+tracNghiem.getDiem()
		+"|"+ tracNghiem.getCacDapAn().get(0).getNoiDung());
	}
}
