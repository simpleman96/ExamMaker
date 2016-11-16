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

public class FrameThemTuLuan extends JFrame {

	private JPanel contentPane;
	private JButton btnXemCauHoi;
	private JButton btnQuayLai;
	private JButton btnThemCauHoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameThemTracNghiem frame = new FrameThemTracNghiem();
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
		
		btnXemCauHoi = new JButton("Xem câu hỏi");
		btnXemCauHoi.setBackground(SystemColor.activeCaptionBorder);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(taDeBai, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(taGoiYDapAn, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnQuayLai)
							.addPreferredGap(ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnXemCauHoi)
								.addComponent(btnThemCauHoi))))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(148, Short.MAX_VALUE)
					.addComponent(lblThmCuHi)
					.addGap(124))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbDeBai, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(363, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbDapAn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(334, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(lblThmCuHi)
					.addGap(18)
					.addComponent(lbDeBai)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taDeBai, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lbDapAn, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taGoiYDapAn, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnXemCauHoi)
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnThemCauHoi))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JButton getBtnXemCauHoi() {
		return btnXemCauHoi;
	}

	public void setBtnXemCauHoi(JButton btnXemCauHoi) {
		this.btnXemCauHoi = btnXemCauHoi;
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
}
