package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import com.itextpdf.io.font.*;
import com.itextpdf.kernel.font.*;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;

public class PrintPDF {
	
	public void xuatDeThi(String filePath, String deThi) throws IOException{
		PdfWriter writer  = null;
		try {
			writer = new PdfWriter(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        PdfDocument pdf = new PdfDocument(writer);
        Document report = new Document(pdf, PageSize.A4.rotate());
       
        PdfFont rfont = PdfFontFactory.createFont("C:\\Windows\\Fonts\\Calibri.ttf", PdfEncodings.IDENTITY_H, true);
        float fontSize = 14;
     
        report.setMargins(20, 20, 50, 20);
        
        report.add(new Paragraph(deThi)).setFont(rfont).setTextAlignment(TextAlignment.CENTER).setFontSize(fontSize);;
        report.close();
        
	}
	
	
}
