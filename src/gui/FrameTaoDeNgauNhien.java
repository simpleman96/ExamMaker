package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.CauHoi;
import main.DeThi;
import main.MonHoc;
import main.ReadWriteData;
import main.TracNghiem;
import main.TuLuan;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class FrameTaoDeNgauNhien extends JFrame {

	private JPanel contentPane;
	private JComboBox<Object> cbTracNghiem;
	private JComboBox<Object> cbTuLuan;
	private JButton btnXuatDe;
	private JButton btnXuatDA;
	private JButton btnQuayLai;

	private Integer mon = 2;
	private String tenMon;
	private Integer soCauTracNghiem;
	private Integer soCauTuluan;

	private DefaultComboBoxModel<Object> modelTuLuan = new DefaultComboBoxModel<>();
	private DefaultComboBoxModel<Object> modelTracNghiem = new DefaultComboBoxModel<>();

	private ArrayList<CauHoi> dsCauHoiDe = new ArrayList<>();
	private JTextField tfHocKy;
	private JLabel lblThiGian;
	private JTextField tfThoiGian;
	private JCheckBox chbXaoTronCH;
	private JLabel lblTngim;
	private JTextField tfTongDiem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTaoDeNgauNhien frame = new FrameTaoDeNgauNhien(1);
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
	public FrameTaoDeNgauNhien(Integer mon) {
		this.mon = mon;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 420, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblTyChn = new JLabel("Tùy chọn đề thi");
		lblTyChn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTyChn.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblSCuTrc = new JLabel("Số câu trắc nghiệm: ");
		lblSCuTrc.setFont(new Font("Tahoma", Font.PLAIN, 14));

		cbTracNghiem = new JComboBox<Object>();
		cbTracNghiem.setBackground(SystemColor.activeCaptionBorder);

		JLabel lblSCuHi = new JLabel("Số câu hỏi tự luận:");
		lblSCuHi.setFont(new Font("Tahoma", Font.PLAIN, 14));

		cbTuLuan = new JComboBox<Object>();
		cbTuLuan.setBackground(SystemColor.activeCaptionBorder);

		btnXuatDA = new JButton("Xuất đáp án");
		btnXuatDA.setBackground(SystemColor.activeCaptionBorder);

		btnXuatDe = new JButton("Xuất đề");
		btnXuatDe.setBackground(SystemColor.activeCaptionBorder);

		chbXaoTronCH = new JCheckBox("có xáo trộn các câu hỏi");
		chbXaoTronCH.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblHcK = new JLabel("Học kỳ");
		lblHcK.setFont(new Font("Tahoma", Font.PLAIN, 14));

		tfHocKy = new JTextField();
		tfHocKy.setColumns(10);

		lblThiGian = new JLabel("Thời gian");
		lblThiGian.setFont(new Font("Tahoma", Font.PLAIN, 14));

		tfThoiGian = new JTextField();
		tfThoiGian.setColumns(10);

		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);

		lblTngim = new JLabel("Tổng điểm");
		lblTngim.setFont(new Font("Tahoma", Font.PLAIN, 14));

		tfTongDiem = new JTextField();
		tfTongDiem.setColumns(10);

		initData();

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(lblTyChn,
						GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(btnQuayLai).addGap(91)
						.addComponent(btnXuatDe).addGap(41).addComponent(btnXuatDA))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(42).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(chbXaoTronCH).addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING,
										gl_contentPane.createSequentialGroup().addComponent(lblSCuHi)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(cbTuLuan, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING,
										gl_contentPane.createSequentialGroup().addComponent(lblSCuTrc)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(cbTracNghiem, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING,
										gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblHcK)
														.addGap(121).addComponent(tfHocKy, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblTngim)
														.addGap(96).addComponent(tfTongDiem, GroupLayout.PREFERRED_SIZE,
																89, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblThiGian).addGap(109).addComponent(tfThoiGian,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))))
								.addContainerGap()))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(14).addComponent(lblTyChn).addGap(32)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblTngim).addComponent(
						tfTongDiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(24)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblSCuTrc).addComponent(
						cbTracNghiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(23)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblSCuHi).addComponent(
						cbTuLuan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(chbXaoTronCH).addGap(26)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblHcK).addComponent(
						tfHocKy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(25)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblThiGian).addComponent(
						tfThoiGian, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(20).addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnQuayLai)
						.addComponent(btnXuatDe).addComponent(btnXuatDA))));
		contentPane.setLayout(gl_contentPane);
	}

	private void initData() {
		MonHoc monHoc = new MonHoc(mon);
		if (mon == 1) {
			tenMon = "csdl";
		} else if (mon == 2) {
			tenMon = "ttnt";
		} else if (mon == 3) {
			tenMon = "lthdt";
		} else if (mon == 4) {
			tenMon = "mmt";
		}

		ArrayList<TracNghiem> dsTracNghiem = new ArrayList<>();
		ArrayList<TuLuan> dsTuLuan = new ArrayList<>();

		for (int i = 1; i <= monHoc.getSoChuong(); i++) {

			String nameFileTN = new String("data/cauhoi/" + tenMon.trim() + "_tn_c" + i + ".DAT");
			dsTracNghiem.addAll((ArrayList<TracNghiem>) ReadWriteData.readObject(nameFileTN.trim()));

			String nameFileTL = new String("data/cauhoi/" + tenMon.trim() + "_tl_c" + i + ".DAT");
			dsTuLuan.addAll((ArrayList<TuLuan>) ReadWriteData.readObject(nameFileTL.trim()));
		}

		for (int i = 0; i < dsTracNghiem.size(); i++) {
			modelTracNghiem.addElement("" + (i + 1));
		}
		cbTracNghiem.setModel(modelTracNghiem);

		for (int i = 0; i < dsTuLuan.size(); i++) {
			modelTuLuan.addElement("" + (i + 1));
		}
		cbTuLuan.setModel(modelTuLuan);

		btnXuatDe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int tn = cbTracNghiem.getSelectedIndex() + 1;
				int tl = cbTuLuan.getSelectedIndex() + 1;

				Collections.shuffle(dsTracNghiem);
				Collections.shuffle(dsTuLuan);

				for (int i = 0; i < tn; i++) {
					dsCauHoiDe.add(dsTracNghiem.get(i));
				}

				for (int i = 0; i < tl; i++) {
					dsCauHoiDe.add(dsTuLuan.get(i));
				}

				DeThi deThi = new DeThi(monHoc.getTenMonHoc(), monHoc.getMaHocPhan(), tfHocKy.getText().trim(),
						tfThoiGian.getText().trim(), Float.parseFloat(tfTongDiem.getText().trim()),
						chbXaoTronCH.isSelected(), dsCauHoiDe);
				String nameFile = new String("data/dedaluu/" + tenMon.trim() + ".DAT");
				ArrayList<DeThi> dsDe = new ArrayList<>();
				dsDe = (ArrayList<DeThi>) ReadWriteData.readObject(nameFile.trim());
				dsDe.add(deThi);
				boolean check = ReadWriteData.writeObject(dsDe, nameFile);
				if (check) {
					JOptionPane.showMessageDialog(null, "Xuất đề thành công!");
				} else {
					JOptionPane.showMessageDialog(null, "Đã có lỗi!");
				}
			}
		});

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

	public Integer getMon() {
		return mon;
	}

	public void setMon(Integer mon) {
		this.mon = mon;
	}
}
