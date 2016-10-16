package gui;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ThemCauHoi extends JFrame {

	private ChonLoaiCauHoi pnChonLoai;
	private Integer mon;


	/**
	 * Create the frame.
	 */
	public ThemCauHoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mon = 0;
		setBounds(450, 150, 400, 400);
		pnChonLoai = new ChonLoaiCauHoi();
		setContentPane(pnChonLoai);
	}


	public Integer getMon() {
		return mon;
	}


	public void setMon(Integer mon) {
		this.mon = mon;
	}


	public ChonLoaiCauHoi getPnChonLoai() {
		return pnChonLoai;
	}


	public void setPnChonLoai(ChonLoaiCauHoi pnChonLoai) {
		this.pnChonLoai = pnChonLoai;
	}

}

class ChonLoaiCauHoi extends JPanel{
	private JLabel label;
	private JButton btnTracNghiem;
	private JButton btnTuLuan;
	private JButton btnQuayLai;
	
	public ChonLoaiCauHoi(){
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		label = new JLabel("Chon loại câu hỏi sẽ thêm");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(90, 30, 190, 30);
		add(label);
		
		btnTracNghiem = new JButton("Trắc Nghiệm");
		btnTracNghiem.setBackground(SystemColor.activeCaptionBorder);
		btnTracNghiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTracNghiem.setBounds(110, 99, 150, 30);
		add(btnTracNghiem);
		
		btnTuLuan = new JButton("Tự Luận");
		btnTuLuan.setBackground(SystemColor.activeCaptionBorder);
		btnTuLuan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTuLuan.setBounds(110, 150, 150, 30);
		add(btnTuLuan);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQuayLai.setBounds(30, 300, 90, 25);
		add(btnQuayLai);
		
	}
	
	
	
	public JLabel getLabel() {
		return label;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public JButton getBtnTracNghiem() {
		return btnTracNghiem;
	}
	public void setBtnTracNghiem(JButton btnTracNghiem) {
		this.btnTracNghiem = btnTracNghiem;
	}
	public JButton getBtnTuLuan() {
		return btnTuLuan;
	}
	public void setBtnTuLuan(JButton btnTuLuan) {
		this.btnTuLuan = btnTuLuan;
	}
	public JButton getBtnQuayLai() {
		return btnQuayLai;
	}
	public void setBtnQuayLai(JButton btnQuayLai) {
		this.btnQuayLai = btnQuayLai;
	}
	
}
