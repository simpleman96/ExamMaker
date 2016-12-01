package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.management.remote.TargetedNotification;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.DapAn;
import main.MonHoc;
import main.ReadWriteData;
import main.TracNghiem;

public class FrameThemTracNghiem extends JFrame {

	private JPanel contentPane;

	private JComboBox cbChuong;
	private JComboBox cbDoKho;
	private JButton btnThemDA;
	private JButton btnQuayLai;
	private JButton btnThemCauHoi;
	private JCheckBox chbLaDung;
	private JCheckBox chbXaoTron;
	private JTextArea taDapAn;
	private JTextArea taDeBai;

	private ArrayList<DapAn> dsDapAn;

	private Integer mon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameThemTracNghiem frame = new FrameThemTracNghiem(1);
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
	public FrameThemTracNghiem(Integer mon) {
		this.mon = mon;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 450, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblThmCuHi = new JLabel("Thêm câu hỏi trắc nghiệm");
		lblThmCuHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmCuHi.setFont(new Font("Tahoma", Font.PLAIN, 16));

		taDeBai = new JTextArea();
		taDeBai.setText("Thêm đề bài ...");

		JLabel lbDeBai = new JLabel("Đề bài");
		lbDeBai.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lbDapAn = new JLabel("Các đáp án");
		lbDapAn.setFont(new Font("Tahoma", Font.PLAIN, 14));

		taDapAn = new JTextArea();
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

		JLabel lblNewLabel_2 = new JLabel("Độ khó");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		cbChuong = new JComboBox();
		cbChuong.setBackground(SystemColor.activeCaptionBorder);

		chbXaoTron = new JCheckBox("có xáo trộn các đáp án");

		cbDoKho = new JComboBox();
		cbDoKho.setBackground(SystemColor.activeCaptionBorder);
		
		initData();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(108).addComponent(lblThmCuHi))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(lblNewLabel).addGap(48)
						.addComponent(cbChuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(cbDoKho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(lbDeBai,
						GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(lbDapAn))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(chbLaDung).addGap(1)
						.addComponent(chbXaoTron).addGap(36).addComponent(btnThemDA))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(btnQuayLai).addGap(194)
						.addComponent(btnThemCauHoi))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING,
								gl_contentPane.createSequentialGroup().addContainerGap().addComponent(taDapAn))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGap(10)
								.addComponent(taDeBai, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(14).addComponent(lblThmCuHi).addGap(23)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel).addComponent(
						cbChuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(20)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_2)
						.addComponent(cbDoKho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(20).addComponent(lbDeBai).addGap(6)
				.addComponent(taDeBai, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE).addGap(15)
				.addComponent(lbDapAn).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(taDapAn, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE).addGap(15)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(chbLaDung)
						.addComponent(chbXaoTron).addComponent(btnThemDA))
				.addGap(14).addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnQuayLai)
						.addComponent(btnThemCauHoi))));
		contentPane.setLayout(gl_contentPane);
	}

	public void initData() {
		dsDapAn = new ArrayList<>();
		MonHoc monHoc = new MonHoc(mon);
		DefaultComboBoxModel<String> chuongModel = new DefaultComboBoxModel<>();
		for (int i = 1; i <= monHoc.getSoChuong(); i++) {
			chuongModel.addElement("" + i);
		}
		cbChuong.setModel(chuongModel);

		DefaultComboBoxModel<String> doKhoModel = new DefaultComboBoxModel<>();
		for (int i = 1; i < 4; i++) {
			doKhoModel.addElement("" + i);
		}
		cbDoKho.setModel(doKhoModel);

		btnThemDA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DapAn dapAn = new DapAn(taDapAn.getText().trim(), chbLaDung.isSelected());
				dsDapAn.add(dapAn);
			}
		});

		btnThemCauHoi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TracNghiem tracNghiem = new TracNghiem(monHoc.getMaHocPhan(), cbChuong.getSelectedIndex() + 1,
						taDeBai.getText(), cbDoKho.getSelectedIndex() + 1, chbXaoTron.isSelected(), dsDapAn);
				String tenMon = "";
				if (mon == 1) {
					tenMon = "csdl";
				} else if (mon == 2) {
					tenMon = "ttnt";
				} else if (mon == 3) {
					tenMon = "lthdt";
				} else if (mon == 4) {
					tenMon = "mmt";
				}
				String nameFile = new String(
						"data/cauhoi/" + tenMon.trim() + "_tn_c" + (cbChuong.getSelectedIndex()+1) + ".DAT");
				ArrayList<TracNghiem> dsTracNghiem = (ArrayList<TracNghiem>) ReadWriteData.readObject(nameFile);
				dsTracNghiem.add(tracNghiem);
				boolean check = ReadWriteData.writeObject(dsTracNghiem, nameFile);
				if (check) {
					JOptionPane.showMessageDialog(null, "Thêm câu hỏi thành công!");
				} else {
					JOptionPane.showMessageDialog(null, "Đã có lỗi!");
				}
			}
		});

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
