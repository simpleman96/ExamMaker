package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrameNgauNhien extends JFrame {

	private JPanel contentPane;
	private JComboBox<Object> cbTracNghiem;
	private JComboBox<Object> cbTuLuan;
	
	private JButton btnXemTruoc;
	private JButton btnXuatDA;
	private JButton btnQuayLai;
	
	
	private Integer soCauTracNghiem;
	private Integer soCauTuluan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameNgauNhien frame = new FrameNgauNhien();
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
	public FrameNgauNhien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Đọc file lấy nọi dung các câu hỏi và tổng số câu hiện có mỗi loại câu hỏi
		soCauTracNghiem = 20;
		soCauTuluan = 10;
		
		
		
		JLabel lblTyChn = new JLabel("Tùy chọn đề thi");
		lblTyChn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTyChn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblSCuTrc = new JLabel("Số câu trắc nghiệm: ");
		lblSCuTrc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 cbTracNghiem = new JComboBox<Object>();
		 cbTracNghiem.setBackground(SystemColor.activeCaptionBorder);
		 DefaultComboBoxModel<Object> modelTracNghiem = new DefaultComboBoxModel<>();
		 for(int i = 1; i<=soCauTracNghiem; i++){
			 modelTracNghiem.addElement(i);
		 }
		 cbTracNghiem.setModel(modelTracNghiem);
		
		JLabel lblSCuHi = new JLabel("Số câu hỏi tự luận:");
		lblSCuHi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cbTuLuan = new JComboBox<Object>();
		cbTuLuan.setBackground(SystemColor.activeCaptionBorder);
		DefaultComboBoxModel<Object> modelTuLuan = new DefaultComboBoxModel<>();
		 for(int i = 1; i<=soCauTuluan; i++){
			 modelTuLuan.addElement(i);
		 }
		 cbTuLuan.setModel(modelTuLuan);
		
		btnXemTruoc= new JButton("Xem trước");
		btnXemTruoc.setBackground(SystemColor.activeCaptionBorder);
		
		btnXuatDA = new JButton("Xuất đáp án");
		btnXuatDA.setBackground(SystemColor.activeCaptionBorder);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		
		JButton btnXuatDe = new JButton("Xuất đề");
		btnXuatDe.setBackground(SystemColor.activeCaptionBorder);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(55)
							.addComponent(lblTyChn, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addComponent(lblSCuTrc)
							.addGap(6)
							.addComponent(cbTracNghiem, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(55)
							.addComponent(btnQuayLai))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(55)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnXemTruoc)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnXuatDe)
									.addGap(11)
									.addComponent(btnXuatDA))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSCuHi, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(cbTuLuan, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))))
					.addGap(40))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblTyChn)
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(lblSCuTrc))
						.addComponent(cbTracNghiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(lblSCuHi))
						.addComponent(cbTuLuan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnXemTruoc)
						.addComponent(btnXuatDA)
						.addComponent(btnXuatDe))
					.addGap(89)
					.addComponent(btnQuayLai)
					.addGap(34))
		);
		contentPane.setLayout(gl_contentPane);
	}

	
	
	
	
	
	public JComboBox<Object> getCbTracNghiem() {
		return cbTracNghiem;
	}

	public void setCbTracNghiem(JComboBox<Object> cbTracNghiem) {
		this.cbTracNghiem = cbTracNghiem;
	}

	public JComboBox<Object> getCbTuLuan() {
		return cbTuLuan;
	}

	public void setCbTuLuan(JComboBox<Object> cbTuLuan) {
		this.cbTuLuan = cbTuLuan;
	}

	public JButton getBtnXemTruoc() {
		return btnXemTruoc;
	}

	public void setBtnXemTruoc(JButton btnXemTruoc) {
		this.btnXemTruoc = btnXemTruoc;
	}

	public JButton getBtnTaoDe() {
		return btnXuatDA;
	}

	public void setBtnTaoDe(JButton btnTaoDe) {
		this.btnXuatDA = btnTaoDe;
	}

	public JButton getBtnQuayLai() {
		return btnQuayLai;
	}

	public void setBtnQuayLai(JButton btnQuayLai) {
		this.btnQuayLai = btnQuayLai;
	}

	public Integer getSoCauTracNghiem() {
		return soCauTracNghiem;
	}

	public void setSoCauTracNghiem(Integer soCauTracNghiem) {
		this.soCauTracNghiem = soCauTracNghiem;
	}

	public Integer getSoCauTuluan() {
		return soCauTuluan;
	}

	public void setSoCauTuluan(Integer soCauTuluan) {
		this.soCauTuluan = soCauTuluan;
	}
}
