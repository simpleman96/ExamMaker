package gui;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameTaoDeThi extends JFrame {

	private ChonHinhThucTao pnChonHinhThuc;
	
	private Integer mon;
	
	
	public FrameTaoDeThi(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 400, 400);
		mon = 0;
		pnChonHinhThuc = new ChonHinhThucTao();
		setContentPane(pnChonHinhThuc);
		
	}


	public ChonHinhThucTao getPnChonHinhThuc() {
		return pnChonHinhThuc;
	}


	public void setPnChonHinhThuc(ChonHinhThucTao pnChonHinhThuc) {
		this.pnChonHinhThuc = pnChonHinhThuc;
	}


	public Integer getMon() {
		return mon;
	}


	public void setMon(Integer mon) {
		this.mon = mon;
	}
	
}

class ChonHinhThucTao extends JPanel{
	private JLabel label;
	private JButton btnTuTao;
	private JButton btnTaoNgauNhien;
	private JButton btnQuayLai;

		/**
	 * Create the frame.
	 */
	public ChonHinhThucTao() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		label = new JLabel("Chon hình thức sinh đề thi");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(90, 30, 190, 30);
		add(label);
		
		btnTuTao = new JButton("Tự Tạo");
		btnTuTao.setBackground(SystemColor.activeCaptionBorder);
		btnTuTao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTuTao.setBounds(110, 99, 150, 30);
		add(btnTuTao);
		
		btnTaoNgauNhien = new JButton("Tạo Ngẫu Nhiên");
		btnTaoNgauNhien.setBackground(SystemColor.activeCaptionBorder);
		btnTaoNgauNhien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTaoNgauNhien.setBounds(110, 150, 150, 30);
		add(btnTaoNgauNhien);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQuayLai.setBounds(30, 300, 90, 25);
		add(btnQuayLai);
		
	}

	public JButton getBtnTuTao() {
		return btnTuTao;
	}

	public void setBtnTuTao(JButton btnTuTao) {
		this.btnTuTao = btnTuTao;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JButton getBtnTaoNgauNhien() {
		return btnTaoNgauNhien;
	}

	public void setBtnTaoNgauNhien(JButton btnTaoNgauNhien) {
		this.btnTaoNgauNhien = btnTaoNgauNhien;
	}

	public JButton getBtnQuayLai() {
		return btnQuayLai;
	}

	public void setBtnQuayLai(JButton btnQuayLai) {
		this.btnQuayLai = btnQuayLai;
	}

}

//class TaoTuDong{
//	private JLabel label;
//	private 
//}
