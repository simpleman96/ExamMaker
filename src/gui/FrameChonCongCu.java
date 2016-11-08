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
import javax.swing.JTextField;

public class FrameChonCongCu extends JFrame {

	private JPanel contentPane;
	private FrameTaoDeThi frmTaoDeThi;
	private FrameThemCauHoi frmThemCauHoi;
	private JButton btnTaoDeThi;
	private JButton btnThemCauHoi;
	private JButton btnQuayLai;
	private Integer mon;

	/**
	 * Create the frame.
	 */
	public FrameChonCongCu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTaoDeThi = new FrameTaoDeThi();
		frmThemCauHoi = new FrameThemCauHoi();
		setBounds(450, 150, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		mon = 0;
		
		JLabel lbChonCongCu = new JLabel("Chọn công cụ");
		lbChonCongCu.setHorizontalAlignment(SwingConstants.CENTER);
		lbChonCongCu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbChonCongCu.setBounds(90, 30, 190, 30);
		contentPane.add(lbChonCongCu);
		
		btnTaoDeThi = new JButton("Tạo đề thi");
		btnTaoDeThi.setBackground(SystemColor.activeCaptionBorder);
		btnTaoDeThi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTaoDeThi.setBounds(110, 99, 150, 30);
		btnTaoDeThi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frmTaoDeThi.setMon(mon);
				if(mon == 1){
					frmTaoDeThi.setTitle("Tạo Đề Thi - Cơ Sở Dữ Liệu");
				}else if(mon == 2){
					frmTaoDeThi.setTitle("Tạo Đề Thi - Trí Tuệ Nhân Tạo");
				}else if(mon == 3){
					frmTaoDeThi.setTitle("Tạo Đề Thi - Lập Trình Hướng Đối Tượng");
				}else {
					frmTaoDeThi.setTitle("Tạo Đề Thi - Mạng Máy Tính");
				}
				frmTaoDeThi.setVisible(true);
			}
		});
		contentPane.add(btnTaoDeThi);
		
		btnThemCauHoi = new JButton("Thêm câu hỏi");
		btnThemCauHoi.setBackground(SystemColor.activeCaptionBorder);
		btnThemCauHoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnThemCauHoi.setBounds(110, 150, 150, 30);
		btnThemCauHoi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frmThemCauHoi.setMon(mon);
				if(mon == 1){
					frmThemCauHoi.setTitle("Thêm câu hỏi - Cơ Sở Dữ Liệu");
				}else if(mon == 2){
					frmThemCauHoi.setTitle("Thêm câu hỏi - Trí Tuệ Nhân Tạo");
				}else if(mon == 3){
					frmThemCauHoi.setTitle("Thêm câu hỏi - Lập Trình Hướng Đối Tượng");
				}else {
					frmThemCauHoi.setTitle("Thêm câu hỏi - Mạng Máy Tính");
				}
				frmThemCauHoi.setVisible(true);
			}
		});
		contentPane.add(btnThemCauHoi);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQuayLai.setBounds(30, 300, 90, 25);
		contentPane.add(btnQuayLai);
		
		JButton btnDeThiDaLuu = new JButton("Đề thi đã  tạo");
		btnDeThiDaLuu.setBackground(SystemColor.activeCaptionBorder);
		btnDeThiDaLuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDeThiDaLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDeThiDaLuu.setBounds(110, 200, 150, 30);
		contentPane.add(btnDeThiDaLuu);
		//===================
		
		frmTaoDeThi.getBtnQuayLai().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frmTaoDeThi.setVisible(false);
				setVisible(true);
			}
		});
		
		frmThemCauHoi.getBtnQuayLai().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frmThemCauHoi.setVisible(false);
				setVisible(true);
			}
		});
		
	}
	
	public JButton getBtnTaoDeThi(){
		return btnTaoDeThi;
	}
	
	public JButton getBtnThemCauHoi(){
		return btnThemCauHoi;
	}
	
	public JButton getBtnQuayLai(){
		return btnQuayLai;
	}

	public Integer getMon() {
		return mon;
	}

	public void setMon(Integer mon) {
		this.mon = mon;
	}

	public FrameTaoDeThi getFrmTaoDeThi() {
		return frmTaoDeThi;
	}

	public void setFrmTaoDeThi(FrameTaoDeThi frmTaoDeThi) {
		this.frmTaoDeThi = frmTaoDeThi;
	}

	public FrameThemCauHoi getFrmThemCauHoi() {
		return frmThemCauHoi;
	}

	public void setFrmThemCauHoi(FrameThemCauHoi frmThemCauHoi) {
		this.frmThemCauHoi = frmThemCauHoi;
	}
}
