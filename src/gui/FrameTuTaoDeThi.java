package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import main.CauHoi;
import main.DeThi;
import main.MonHoc;
import main.ReadWriteData;
import main.TracNghiem;
import main.TuLuan;
import sun.awt.AWTAccessor.CheckboxMenuItemAccessor;

import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class FrameTuTaoDeThi extends JFrame {

	private JPanel contentPane;
	private JList listChuong;
	private JList listTracNghiem;
	private JList listTuLuan;
	private JList listDe;

	private JButton btnThemTN;
	private JButton btnThemTL;
	private JButton btnQuayLai;
	private JButton btnXoa;
	private JButton btnXuatDe;

	private Integer mon = null;
	private MonHoc monHoc = null;
	private String tenMon = null;
	private JLabel lblNewLabel;
	private JTextField tfTongDiem;
	private JLabel lblHcK;
	private JTextField tfHocKy;
	private JCheckBox chbXaoTronCH;
	private JLabel lblThiGian;
	private JTextField tfThoiGian;

	private boolean setListenenr = false;

	DefaultListModel<String> chuongModel = new DefaultListModel<>();
	ArrayList<DefaultListModel<String>> listTNModel = new ArrayList<>();
	ArrayList<DefaultListModel<String>> listTLModel = new ArrayList<>();
	DefaultListModel<String> listDeModel = new DefaultListModel<>();

	ArrayList<ArrayList<TracNghiem>> dsTNCacChuong = new ArrayList<>();
	ArrayList<ArrayList<TuLuan>> dsTLCacChuong = new ArrayList<>();
	ArrayList<CauHoi> dsCauHoiDe = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTuTaoDeThi frame = new FrameTuTaoDeThi(1);
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
	public FrameTuTaoDeThi(Integer m) {
		this.mon = m;
		monHoc = new MonHoc(mon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 1000, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblChng = new JLabel("Chương");
		lblChng.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnThemTL = new JButton("Thêm các câu hỏi vào đề");
		btnThemTL.setBackground(SystemColor.activeCaptionBorder);

		btnXuatDe = new JButton("Xuất đề");
		btnXuatDe.setBackground(SystemColor.activeCaptionBorder);

		btnQuayLai = new JButton("Quay lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);

		JScrollPane scrollPane_1 = new JScrollPane();

		listChuong = new JList();
		listChuong.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listChuong.setModel(chuongModel);
		scrollPane_1.setViewportView(listChuong);

		JScrollPane scrollPane = new JScrollPane();
		listTracNghiem = new JList();
		// listTracNghiem.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollPane.setViewportView(listTracNghiem);

		JScrollPane scrollPane_2 = new JScrollPane();
		listTuLuan = new JList();
		// listTuLuan.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollPane_2.setViewportView(listTuLuan);

		JScrollPane scrollPane_3 = new JScrollPane();
		listDe = new JList();
		scrollPane_3.setViewportView(listDe);

		JLabel label = new JLabel("Câu hỏi trắc nghiệm");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel label_1 = new JLabel("Câu hỏi tự luận");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel label_2 = new JLabel("Câu hỏi trong đề");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel label_3 = new JLabel("Tạo đề thi tự tạo");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

		btnThemTN = new JButton("Thêm các câu hỏi vào đề");
		btnThemTN.setBackground(SystemColor.activeCaptionBorder);

		btnXoa = new JButton("Xóa");
		btnXoa.setBackground(SystemColor.activeCaptionBorder);

		lblNewLabel = new JLabel("Tổng điểm");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));

		tfTongDiem = new JTextField();
		tfTongDiem.setColumns(10);

		chbXaoTronCH = new JCheckBox("có xáo trộn các câu hỏi");
		chbXaoTronCH.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblHcK = new JLabel("Học kỳ");
		lblHcK.setFont(new Font("Tahoma", Font.PLAIN, 14));

		tfHocKy = new JTextField();
		tfHocKy.setColumns(10);

		lblThiGian = new JLabel("Thời gian");
		lblThiGian.setFont(new Font("Tahoma", Font.PLAIN, 14));

		tfThoiGian = new JTextField();
		tfThoiGian.setColumns(10);

		JButton btnXutpn = new JButton("Xuất Đáp Án");
		btnXutpn.setBackground(SystemColor.activeCaptionBorder);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane
						.createSequentialGroup().addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(352).addComponent(label_3))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(20)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(tfTongDiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(178).addComponent(chbXaoTronCH, GroupLayout.PREFERRED_SIZE, 247,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(20)
										.addComponent(lblHcK, GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(tfHocKy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(178)
										.addComponent(lblThiGian, GroupLayout.PREFERRED_SIZE, 247,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(tfThoiGian,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(20)
										.addComponent(lblChng, GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(label, GroupLayout.PREFERRED_SIZE, 254,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 247,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10).addComponent(label_2, GroupLayout.PREFERRED_SIZE, 253,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(20).addComponent(btnQuayLai))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup().addGap(20)
														.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 130,
																GroupLayout.PREFERRED_SIZE)
														.addGap(10).addComponent(scrollPane, GroupLayout.PREFERRED_SIZE,
																254, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup().addGap(160)
														.addComponent(btnThemTN)))
										.addGap(10)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnThemTL).addComponent(scrollPane_2,
														GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
										.addGap(10)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnXoa)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnXutpn).addGap(18).addComponent(btnXuatDe))
												.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 253,
														GroupLayout.PREFERRED_SIZE))))
						.addGap(40)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(14)
				.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addGap(30)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(2).addComponent(tfTongDiem,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(chbXaoTronCH))
				.addGap(11)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(2).addComponent(lblHcK))
						.addComponent(tfHocKy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(2)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblThiGian).addComponent(tfThoiGian, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addGap(14)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblChng)
						.addComponent(label).addComponent(label_1).addComponent(label_2))
				.addGap(11)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
				.addGap(6)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnThemTL)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnXuatDe)
								.addComponent(btnXutpn))
						.addComponent(btnXoa).addGroup(gl_contentPane.createSequentialGroup().addComponent(btnThemTN)
								.addGap(3).addComponent(btnQuayLai)))));

		listChuong.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int chuong = listChuong.getSelectedIndex();
				if (chuong < 0 || chuong >= monHoc.getSoChuong()) {
					chuong = 0;
				}
				DefaultListModel<String> tnModel;
				if (listTNModel.size() == 0) {
					tnModel = new DefaultListModel<>();
					tnModel.addElement("");
				} else {
					tnModel = listTNModel.get(chuong);
				}
				listTracNghiem.setModel(tnModel);
				listTracNghiem.setSelectedIndex(0);

				DefaultListModel<String> tlModel;
				if (listTLModel.size() == 0) {
					tlModel = new DefaultListModel<>();
					tlModel.addElement("");
				} else {
					tlModel = listTLModel.get(chuong);
				}
				listTuLuan.setModel(tlModel);
				listTuLuan.setSelectedIndex(0);

			}
		});

		btnThemTN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int chuong = listChuong.getSelectedIndex();
				int cauHoi = listTracNghiem.getSelectedIndex();
				listDeModel.addElement(listTNModel.get(chuong).getElementAt(cauHoi));
				dsCauHoiDe.add(dsTNCacChuong.get(chuong).get(cauHoi));
				listDe.setModel(listDeModel);

			}
		});

		btnThemTL.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int chuong = listChuong.getSelectedIndex();
				int cauHoi = listTuLuan.getSelectedIndex();
				listDeModel.addElement(listTLModel.get(chuong).getElementAt(cauHoi));
				dsCauHoiDe.add(dsTLCacChuong.get(chuong).get(cauHoi));
				listDe.setModel(listDeModel);
			}
		});

		btnXoa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listDeModel.clear();
				dsCauHoiDe.clear();
				listDe.setModel(listDeModel);
			}
		});

		btnXuatDe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
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

		contentPane.setLayout(gl_contentPane);
	}

	public void initListsData() {

		chuongModel.clear();
		listTNModel.clear();
		listTLModel.clear();
		dsTNCacChuong.clear();
		dsTLCacChuong.clear();
		dsCauHoiDe.clear();
		listDeModel.clear();

		for (int i = 1; i <= monHoc.getSoChuong(); i++) {
			chuongModel.addElement("Chuong " + i);
		}

		if (mon == 1) {
			tenMon = "csdl";
		} else if (mon == 2) {
			tenMon = "ttnt";
		} else if (mon == 3) {
			tenMon = "lthdt";
		} else if (mon == 4) {
			tenMon = "mmt";
		}

		for (int i = 1; i <= monHoc.getSoChuong(); i++) {
			ArrayList<TracNghiem> dsTracNghiem = null;
			ArrayList<TuLuan> dsTuLuan = null;

			DefaultListModel<String> tracNghiemModel = new DefaultListModel<>();
			String nameFileTN = new String("data/cauhoi/" + tenMon.trim() + "_tn_c" + i + ".DAT");
			dsTracNghiem = (ArrayList<TracNghiem>) ReadWriteData.readObject(nameFileTN.trim());
			dsTNCacChuong.add(dsTracNghiem);
			for (int j = 0; j < dsTracNghiem.size(); j++) {
				tracNghiemModel.addElement("Cau " + (j + 1) + ":" + dsTracNghiem.get(j).inCauHoi());
			}

			listTNModel.add(tracNghiemModel);
			DefaultListModel<String> tuLuanModel = new DefaultListModel<>();
			String nameFileTL = new String("data/cauhoi/" + tenMon.trim() + "_tl_c" + i + ".DAT");
			dsTuLuan = (ArrayList<TuLuan>) ReadWriteData.readObject(nameFileTL.trim());
			dsTLCacChuong.add(dsTuLuan);
			for (int j = 0; j < dsTuLuan.size(); j++) {
				tuLuanModel.addElement("Cau " + (j + 1) + ":" + dsTuLuan.get(j).inCauHoi());
			}
			listTLModel.add(tuLuanModel);
		}
		listChuong.setSelectedIndex(0);

	}

	public JList getListChuong() {
		return listChuong;
	}

	public void setListChuong(JList listChuong) {
		this.listChuong = listChuong;
	}

	public JList getListTracNghiem() {
		return listTracNghiem;
	}

	public void setListTracNghiem(JList listTracNghiem) {
		this.listTracNghiem = listTracNghiem;
	}

	public JList getListTuLuan() {
		return listTuLuan;
	}

	public void setListTuLuan(JList listTuLuan) {
		this.listTuLuan = listTuLuan;
	}

	public JList getListDe() {
		return listDe;
	}

	public void setListDe(JList listDe) {
		this.listDe = listDe;
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
