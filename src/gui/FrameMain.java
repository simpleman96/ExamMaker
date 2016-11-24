package gui;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

public class FrameMain extends JFrame {

	private JPanel contentPane;
	private JButton btnCoSo;
	private JButton btnTriTue;
	private JButton btnLapTrinh;
	private JButton btnMang;

	/**
	 * Create the frame.
	 */
	public FrameMain() {
		setTitle("Chương Trình Soạn Đề Thi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbChonMon = new JLabel("Chọn môn của bạn");
		lbChonMon.setHorizontalAlignment(SwingConstants.CENTER);
		lbChonMon.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbChonMon.setBounds(90, 30, 216, 25);
		contentPane.add(lbChonMon);
		
		btnCoSo = new JButton("Cơ sở dữ liệu");
		btnCoSo.setBackground(SystemColor.activeCaptionBorder);
		btnCoSo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCoSo.setBounds(110, 110, 180, 30);
		contentPane.add(btnCoSo);
		
		btnTriTue = new JButton("Trí tuệ nhân tạo");
		btnTriTue.setBackground(SystemColor.activeCaptionBorder);
		btnTriTue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTriTue.setBounds(110, 150, 180, 30);
		contentPane.add(btnTriTue);
		
		btnLapTrinh = new JButton("Lập trình hướng đối tượng");
		btnLapTrinh.setBackground(SystemColor.activeCaptionBorder);
		btnLapTrinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLapTrinh.setBounds(110, 190, 180, 30);
		contentPane.add(btnLapTrinh);
		
		btnMang = new JButton("Mạng máy tính");
		btnMang.setBackground(SystemColor.activeCaptionBorder);
		btnMang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMang.setBounds(110, 230, 180, 30);
		contentPane.add(btnMang);
	}
	
	public JButton getBtnCoSo(){
		return btnCoSo;
	}
	
	public JButton getBtnTriTue(){
		return btnTriTue;
	}
	
	public JButton getBtnLapTrinh(){
		return btnLapTrinh;
	}
	
	public JButton getBtnMang(){
		return btnMang;
	}
}
