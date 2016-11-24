package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class FrameThemTuLuan extends JFrame {

	private JPanel contentPane;
	private JButton btnQuayLai;
	private JButton btnThemCauHoi;
	private JTextField tfDiem;
	
	private Integer mon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameThemTuLuan frame = new FrameThemTuLuan();
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
	public FrameThemTuLuan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblThmCuHi = new JLabel("Thêm câu hỏi tự luận");
		lblThmCuHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmCuHi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextArea taDeBai = new JTextArea();
		taDeBai.setText("Thêm đề bài ...");

		JLabel lbDeBai = new JLabel("Đề bài");
		lbDeBai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lbDapAn = new JLabel("Gợi ý đáp án");
		lbDapAn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextArea taGoiYDapAn = new JTextArea();
		taGoiYDapAn.setText("Thêm gợi ý đáp án ...");
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		
		btnThemCauHoi = new JButton("Thêm câu hỏi");
		btnThemCauHoi.setBackground(SystemColor.activeCaptionBorder);
		
		JLabel lblNewLabel = new JLabel("Độ khó");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Điểm");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Chương");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfDiem = new JTextField();
		tfDiem.setColumns(10);
		
		JComboBox cbChuong = new JComboBox();
		cbChuong.setBackground(SystemColor.activeCaptionBorder);
		
		JComboBox cbDoKho = new JComboBox();
		cbDoKho.setBackground(SystemColor.activeCaptionBorder);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbDapAn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbDeBai, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblThmCuHi)
								.addComponent(cbChuong, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(cbDoKho, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(tfDiem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnQuayLai)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnThemCauHoi))
							.addComponent(taGoiYDapAn, Alignment.LEADING)
							.addComponent(taDeBai, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblThmCuHi)
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbChuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tfDiem, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cbDoKho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lbDeBai)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taDeBai, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbDapAn, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taGoiYDapAn, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnThemCauHoi))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JButton getBtnQuayLai() {
		return btnQuayLai;
	}

	public void setBtnQuayLai(JButton btnQuayLai) {
		this.btnQuayLai = btnQuayLai;
	}

	public JButton getBtnThemCauHoi() {
		return btnThemCauHoi;
	}

	public void setBtnThemCauHoi(JButton btnThemCauHoi) {
		this.btnThemCauHoi = btnThemCauHoi;
	}

	public Integer getMon() {
		return mon;
	}

	public void setMon(Integer mon) {
		this.mon = mon;
	}
}
