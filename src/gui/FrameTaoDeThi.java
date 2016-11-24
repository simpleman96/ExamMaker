package gui;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameTaoDeThi extends JFrame {
	
	private FrameTaoDeNgauNhien frmTaoDeNgauNhien;

	private JPanel panel;
	private JLabel label;
	private JButton btnTuTao;
	private JButton btnTaoNgauNhien;
	private JButton btnQuayLai;
	private Integer mon;	
	
	public FrameTaoDeThi(){
		frmTaoDeNgauNhien = new FrameTaoDeNgauNhien();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 400, 400);
		mon = 0;
		panel = new JPanel();
		setContentPane(panel);
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		label = new JLabel("Chon hình thức sinh đề thi");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(90, 30, 190, 30);
		panel.add(label);
		
		btnTuTao = new JButton("Tự Tạo");
		btnTuTao.setBackground(SystemColor.activeCaptionBorder);
		btnTuTao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTuTao.setBounds(110, 99, 150, 30);
		panel.add(btnTuTao);
		
		btnTaoNgauNhien = new JButton("Tạo Ngẫu Nhiên");
		btnTaoNgauNhien.setBackground(SystemColor.activeCaptionBorder);
		btnTaoNgauNhien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTaoNgauNhien.setBounds(110, 150, 150, 30);
		btnTaoNgauNhien.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(mon == 1){
					frmTaoDeNgauNhien.setTitle("Tạo Ngẫu Nhiên - Cơ Sở Dữ Liệu");
				}else if(mon == 2){
					frmTaoDeNgauNhien.setTitle("Tạo Ngẫu Nhiên - Trí Tuệ Nhân Tạo");
				}else if(mon == 3){
					frmTaoDeNgauNhien.setTitle("Tạo Ngẫu Nhiên - Lập Trình Hướng Đối Tượng");
				}else {
					frmTaoDeNgauNhien.setTitle("Tạo Ngẫu Nhiên - Mạng Máy Tính");
				}
				frmTaoDeNgauNhien.setVisible(true);
			}
		});
		panel.add(btnTaoNgauNhien);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQuayLai.setBounds(30, 300, 90, 25);
		panel.add(btnQuayLai);
		
		frmTaoDeNgauNhien.getBtnQuayLai().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frmTaoDeNgauNhien.setVisible(false);
				setVisible(true);
				
			}
		});
				
		
		
	}

	public Integer getMon() {
		return mon;
	}


	public void setMon(Integer mon) {
		this.mon = mon;
	}


	public JButton getBtnQuayLai() {
		return btnQuayLai;
	}


	public void setBtnQuayLai(JButton btnQuayLai) {
		this.btnQuayLai = btnQuayLai;
	}


}