package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FrameTuTaoDeThi extends JFrame {

	private JPanel contentPane;
	private JList listChuong;
	private JList listTracNghiem;
	private JList listTuLuan;
	private JList listDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTuTaoDeThi frame = new FrameTuTaoDeThi();
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
	public FrameTuTaoDeThi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 900, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblToThi = new JLabel("Tạo đề thi tự tạo");
		lblToThi.setHorizontalAlignment(SwingConstants.CENTER);
		lblToThi.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblChng = new JLabel("Chương");
		lblChng.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblCuHiTrc = new JLabel("Câu hỏi trắc nghiệm");
		lblCuHiTrc.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblCuHiT = new JLabel("Câu hỏi tự luận");
		lblCuHiT.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblCuHiTrong = new JLabel("Câu hỏi trong đề");
		lblCuHiTrong.setFont(new Font("Tahoma", Font.PLAIN, 14));

		listChuong = new JList();

		listTracNghiem = new JList();

		listTuLuan = new JList();

		listDe = new JList();

		initListsData();

		JButton btnThemCauHoi = new JButton("Thêm các câu hỏi vào đề");
		btnThemCauHoi.setBackground(SystemColor.activeCaptionBorder);

		JButton btnXuatDe = new JButton("Xuất đề");
		btnXuatDe.setBackground(SystemColor.activeCaptionBorder);

		JButton btnQuayLai = new JButton("Quay lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane.createSequentialGroup().addGap(175).addComponent(lblToThi,
										GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(25)
								.addComponent(lblChng, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addComponent(lblCuHiTrc, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addComponent(lblCuHiT, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addGap(20).addComponent(lblCuHiTrong, GroupLayout.PREFERRED_SIZE, 220,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING,
										false)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(25)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnQuayLai)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(listChuong, GroupLayout.PREFERRED_SIZE, 130,
																GroupLayout.PREFERRED_SIZE)
														.addGap(20)
														.addComponent(listTracNghiem, GroupLayout.PREFERRED_SIZE, 200,
																GroupLayout.PREFERRED_SIZE)
														.addGap(20).addComponent(listTuLuan, GroupLayout.PREFERRED_SIZE,
																200, GroupLayout.PREFERRED_SIZE)))
										.addGap(20))
								.addGroup(Alignment.TRAILING,
										gl_contentPane.createSequentialGroup()
												.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnThemCauHoi).addGap(31)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(listDe, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 220,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnXuatDe, Alignment.TRAILING))))
				.addGap(39)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(20).addComponent(lblToThi).addGap(11)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblChng)
						.addComponent(lblCuHiTrc).addComponent(lblCuHiT).addComponent(lblCuHiTrong))
				.addGap(11)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(listChuong, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addComponent(listTracNghiem, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addComponent(listTuLuan, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addComponent(listDe, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
				.addGap(6)
				.addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnXuatDe).addGap(17).addComponent(btnQuayLai))
						.addComponent(btnThemCauHoi))
				.addGap(23)));
		contentPane.setLayout(gl_contentPane);
	}

	private void initListsData() {

		DefaultListModel<String> chuongModel = new DefaultListModel<>();
		for (int i = 0; i < 5; i++) {
			chuongModel.addElement("Chuong " + i);
		}

		listChuong.setModel(chuongModel);
		listChuong.setSelectedIndex(0);

		DefaultListModel<String> c0TracNghiemModel = new DefaultListModel<>();
		for (int i = 0; i < 20; i++) {
			c0TracNghiemModel.addElement("Cau hoi Trac Nghiem c0 so " + i);
		}

		DefaultListModel<String> c1TracNghiemModel = new DefaultListModel<>();
		for (int i = 0; i < 10; i++) {
			c1TracNghiemModel.addElement("Cau hoi Trac Nghiem c1 so " + i);
		}

		DefaultListModel<String> c2TracNghiemModel = new DefaultListModel<>();
		for (int i = 0; i < 10; i++) {
			c2TracNghiemModel.addElement("Cau hoi Trac Nghiem c2 so " + i);
		}

		DefaultListModel<String> c3TracNghiemModel = new DefaultListModel<>();
		for (int i = 0; i < 10; i++) {
			c3TracNghiemModel.addElement("Cau hoi Trac Nghiem c3 so " + i);
		}

		DefaultListModel<String> c4TracNghiemModel = new DefaultListModel<>();
		for (int i = 0; i < 10; i++) {
			c4TracNghiemModel.addElement("Cau hoi Trac Nghiem c4 so " + i);
		}

		DefaultListModel<String> c0TuLuanModel = new DefaultListModel<>();
		for (int i = 0; i < 7; i++) {
			c0TuLuanModel.addElement("Cau hoi Tu Luan c0 so " + i);
		}

		DefaultListModel<String> c1TuLuanModel = new DefaultListModel<>();
		for (int i = 0; i < 7; i++) {
			c1TuLuanModel.addElement("Cau hoi Tu Luan c1 so " + i);
		}

		DefaultListModel<String> c2TuLuanModel = new DefaultListModel<>();
		for (int i = 0; i < 7; i++) {
			c2TuLuanModel.addElement("Cau hoi Tu Luan c2 so " + i);
		}

		DefaultListModel<String> c3TuLuanModel = new DefaultListModel<>();
		for (int i = 0; i < 7; i++) {
			c3TuLuanModel.addElement("Cau hoi Tu Luan c3 so " + i);
		}

		DefaultListModel<String> c4TuLuanModel = new DefaultListModel<>();
		for (int i = 0; i < 7; i++) {
			c4TuLuanModel.addElement("Cau hoi Tu Luan c4 so " + i);
		}

		listChuong.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int index = listChuong.getSelectedIndex();
				switch (index) {
				case 0: {
					listTracNghiem.setModel(c0TracNghiemModel);
					listTuLuan.setModel(c0TuLuanModel);
				}
					break;
				case 1: {
					listTracNghiem.setModel(c1TracNghiemModel);
					listTuLuan.setModel(c1TuLuanModel);
				}
					break;
				case 2: {
					listTracNghiem.setModel(c2TracNghiemModel);
					listTuLuan.setModel(c2TuLuanModel);
				}
					break;
				case 3: {
					listTracNghiem.setModel(c3TracNghiemModel);
					listTuLuan.setModel(c3TuLuanModel);
				}
					break;
				case 4: {
					listTracNghiem.setModel(c4TracNghiemModel);
					listTuLuan.setModel(c4TuLuanModel);
				}
					break;
				default:{
					listTracNghiem.setModel(c0TracNghiemModel);
					listTuLuan.setModel(c0TuLuanModel);
				}
					break;
				}
			}
		});
		
	}

}
