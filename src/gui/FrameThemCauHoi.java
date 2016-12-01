package gui;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameThemCauHoi extends JFrame {

	private FrameThemTracNghiem frmThemTN;
	private FrameThemTuLuan frmThemTL;
	
	private JPanel panel;
	private JLabel label;
	private JButton btnTracNghiem;
	private JButton btnTuLuan;
	private JButton btnQuayLai;
	private Integer mon;


	/**
	 * Create the frame.
	 */
	public FrameThemCauHoi(Integer m) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mon = m;
		setBounds(450, 150, 400, 400);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		setContentPane(panel);
		
		//Tạo Frame Thêm câu hỏi Trắc Nghiệm, Tự Luận
		frmThemTN = new FrameThemTracNghiem(mon);
		frmThemTL = new FrameThemTuLuan(mon);
		
		label = new JLabel("Chon loại câu hỏi sẽ thêm");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(90, 30, 190, 30);
		panel.add(label);
		
		btnTracNghiem = new JButton("Trắc Nghiệm");
		btnTracNghiem.setBackground(SystemColor.activeCaptionBorder);
		btnTracNghiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTracNghiem.setBounds(110, 99, 150, 30);
		btnTracNghiem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
//				frmThemTN.setMon(mon);
				if(mon == 1){
					frmThemTN.setTitle("Thêm Trắc Nghiệm - Cơ Sở Dữ Liệu");
				}else if(mon == 2){
					frmThemTN.setTitle("Thêm Trắc Nghiệm - Trí Tuệ Nhân Tạo");
				}else if(mon == 3){
					frmThemTN.setTitle("Thêm Trắc Nghiệm - Lập Trình Hướng Đối Tượng");
				}else {
					frmThemTN.setTitle("Thêm Trắc Nghiệm - Mạng Máy Tính");
				}
				frmThemTN.setVisible(true);
				
			}
		});
		panel.add(btnTracNghiem);
		
		btnTuLuan = new JButton("Tự Luận");
		btnTuLuan.setBackground(SystemColor.activeCaptionBorder);
		btnTuLuan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTuLuan.setBounds(110, 150, 150, 30);
		btnTuLuan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
//				frmThemTL.setMon(mon);
				if(mon == 1){
					frmThemTL.setTitle("Thêm Tự Luận - Cơ Sở Dữ Liệu");
				}else if(mon == 2){
					frmThemTL.setTitle("Thêm Tự Luận - Trí Tuệ Nhân Tạo");
				}else if(mon == 3){
					frmThemTL.setTitle("Thêm Tự Luận - Lập Trình Hướng Đối Tượng");
				}else {
					frmThemTL.setTitle("Thêm Tự Luận - Mạng Máy Tính");
				}
				frmThemTL.setVisible(true);
			}
		});
		panel.add(btnTuLuan);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQuayLai.setBounds(30, 300, 90, 25);
		panel.add(btnQuayLai);
		
		//Set Button Quay Lại cho frame Thêm Câu hỏi Trắc Nghiệm, Tự Luận
		
		frmThemTN.getBtnQuayLai().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frmThemTN.setVisible(false);
				setVisible(true);
				
			}
		});
		
		frmThemTL.getBtnQuayLai().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frmThemTL.setVisible(false);
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
