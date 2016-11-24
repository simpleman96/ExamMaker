package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.DapAn;
import main.MonHoc;
import main.TracNghiem;

public class FrameThemTracNghiem extends JFrame {

	private JPanel contentPane;
	
	private JComboBox cbChuong;
	private JComboBox cbDoKho;
	private JButton btnThemDA;
	private JButton btnQuayLai;
	private JButton btnThemCauHoi;
	private JTextField tfDiem;
	private JCheckBox chbLaDung;
	private JCheckBox chbXaoTron;

	private TracNghiem cauHoiTracNghiem;
	private ArrayList<DapAn> dsDapAn;
	private DapAn tempDapAn;
	
	private Integer mon;
	
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
	public FrameThemTracNghiem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 450, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblThmCuHi = new JLabel("Thêm câu hỏi trắc nghiệm");
		lblThmCuHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmCuHi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextArea taDeBai = new JTextArea();
		taDeBai.setText("Thêm đề bài ...");
		
		JLabel lbDeBai = new JLabel("Đề bài");
		lbDeBai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lbDapAn = new JLabel("Các đáp án");
		lbDapAn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextArea taDapAn = new JTextArea();
		taDapAn.setText("Thêm đáp án ...");
		
		btnThemDA = new JButton("Thêm đáp án");
		btnThemDA.setBackground(SystemColor.activeCaptionBorder);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		
		btnThemCauHoi = new JButton("Thêm câu hỏi");
		btnThemCauHoi.setBackground(SystemColor.activeCaptionBorder);
		
		chbLaDung = new JCheckBox("là đáp án đúng");
		
		JLabel lblNewLabel = new JLabel("Chương");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Điểm");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Độ khó");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfDiem = new JTextField();
		tfDiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfDiem.setColumns(10);
		
		cbChuong = new JComboBox();
		cbChuong.setBackground(SystemColor.activeCaptionBorder);
		
		cbDoKho = new JComboBox();
		cbDoKho.setBackground(SystemColor.activeCaptionBorder);
		
		chbXaoTron = new JCheckBox("có xáo trộn các đáp án");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(132)
							.addComponent(lblThmCuHi))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbDapAn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel)
												.addComponent(lblNewLabel_1))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(cbChuong, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(cbDoKho, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(tfDiem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
											.addGap(293))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
											.addGap(369))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnQuayLai)
												.addComponent(chbLaDung))
											.addGap(18)
											.addComponent(chbXaoTron)
											.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnThemCauHoi)
												.addComponent(btnThemDA))
											.addGap(84)))
									.addGap(95))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(taDapAn, Alignment.LEADING)
									.addComponent(taDeBai, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbDeBai, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblThmCuHi)
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cbChuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tfDiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(cbDoKho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(lbDeBai)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taDeBai, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lbDapAn, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taDapAn, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chbLaDung)
						.addComponent(btnThemDA)
						.addComponent(chbXaoTron))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnThemCauHoi))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		
		//========== Phần code kết nối tạo câu hỏi lưu vào file
		dsDapAn = new ArrayList();
		
		btnThemDA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tempDapAn = new DapAn(taDapAn.getText(), chbLaDung.isSelected());
				dsDapAn.add(tempDapAn);
			}
		});
		
//		MonHoc monHoc = new MonHoc(mon);
//		btnThemCauHoi.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String maMon = monHoc.getMaHocPhan();
//				int chuong = Integer.parseInt(cbChuong.getSelectedItem().toString());
//				String deBai = taDeBai.getText();
//				int doKho = Integer.parseInt(cbChuong.getSelectedItem().toString());
//				float diem = Float.parseFloat(tfDiem.getText());
//				boolean xaoTron = chbXaoTron.isSelected();
//				
//				cauHoiTracNghiem = new TracNghiem(maMon, chuong, deBai, doKho, diem, xaoTron, dsDapAn);
//				
//				
//				
//			}
//		});
//		
	}

	public JButton getBtnThemDA() {
		return btnThemDA;
	}

	public void setBtnThemDA(JButton btnThemDA) {
		this.btnThemDA = btnThemDA;
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

	public JComboBox getCbChuong() {
		return cbChuong;
	}

	public void setCbChuong(JComboBox cbChuong) {
		this.cbChuong = cbChuong;
	}

	public JComboBox getCbDoKho() {
		return cbDoKho;
	}

	public void setCbDoKho(JComboBox cbDoKho) {
		this.cbDoKho = cbDoKho;
	}

	public JTextField getTfDiem() {
		return tfDiem;
	}

	public void setTfDiem(JTextField tfDiem) {
		this.tfDiem = tfDiem;
	}

	public TracNghiem getCauHoiTracNghiem() {
		return cauHoiTracNghiem;
	}

	public void setCauHoiTracNghiem(TracNghiem cauHoiTracNghiem) {
		this.cauHoiTracNghiem = cauHoiTracNghiem;
	}

	public ArrayList<DapAn> getDsDapAn() {
		return dsDapAn;
	}

	public void setDsDapAn(ArrayList<DapAn> dsDapAn) {
		this.dsDapAn = dsDapAn;
	}

	public Integer getMon() {
		return mon;
	}

	public void setMon(Integer mon) {
		this.mon = mon;
	}
}
