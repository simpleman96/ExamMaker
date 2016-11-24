package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;

public class FrameDeThiDaLuu extends JFrame {

	private JPanel contentPane;
	private JList listDe;
	private JEditorPane showDe;
	private JButton btnQuayLai;
	
	private Integer mon;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDeThiDaLuu frame = new FrameDeThiDaLuu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameDeThiDaLuu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listDe = new JList();
		listDe.setBounds(10, 36, 136, 575);
		contentPane.add(listDe);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(160, 11, 814, 600);
		contentPane.add(scrollPane);
		
		showDe = new JEditorPane();
		scrollPane.setViewportView(showDe);
		
		JLabel lblThi = new JLabel("Mời chọn đề");
		lblThi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThi.setBounds(10, 11, 136, 24);
		contentPane.add(lblThi);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLai.setBounds(10, 627, 89, 23);
		contentPane.add(btnQuayLai);
		
		JButton btnSDng = new JButton("Sử dụng đề");
		btnSDng.setBackground(SystemColor.activeCaptionBorder);
		btnSDng.setBounds(854, 627, 120, 23);
		contentPane.add(btnSDng);
	}

	public JList getListDe() {
		return listDe;
	}

	public void setListDe(JList listDe) {
		this.listDe = listDe;
	}

	public JEditorPane getShowDe() {
		return showDe;
	}

	public void setShowDe(JEditorPane showDe) {
		this.showDe = showDe;
	}

	public JButton getBtnQuayLai() {
		return btnQuayLai;
	}

	public void setBtnQuayLai(JButton btnQuayLai) {
		this.btnQuayLai = btnQuayLai;
	}

	public Integer getMon() {
		return mon;
	}

	public void setMon(Integer mon) {
		this.mon = mon;
	}
	
}
