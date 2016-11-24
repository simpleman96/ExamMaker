package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
	private JButton btnQuayLai;

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
		setBounds(300, 100, 1000, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblChng = new JLabel("Chương");
		lblChng.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btnThemCauHoi = new JButton("Thêm các câu hỏi vào đề");
		btnThemCauHoi.setBackground(SystemColor.activeCaptionBorder);

		JButton btnXuatDe = new JButton("Xuất đề");
		btnXuatDe.setBackground(SystemColor.activeCaptionBorder);

		btnQuayLai = new JButton("Quay lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		listChuong = new JList();
		listChuong.setSelectedIndex(0);
		scrollPane_1.setViewportView(listChuong);

		JScrollPane scrollPane = new JScrollPane();		
		listTracNghiem = new JList();
		scrollPane.setViewportView(listTracNghiem);

		
		JScrollPane scrollPane_2 = new JScrollPane();
		listTuLuan = new JList();
		scrollPane_2.setViewportView(listTuLuan);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		listDe = new JList();
		scrollPane_3.setViewportView(listDe);
		
		initListsData();
		
		JLabel label = new JLabel("Câu hỏi trắc nghiệm");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_1 = new JLabel("Câu hỏi tự luận");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_2 = new JLabel("Câu hỏi trong đề");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_3 = new JLabel("Tạo đề thi tự tạo");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(45)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblChng, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
								.addComponent(btnQuayLai, Alignment.LEADING))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnThemCauHoi)
										.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(157)
											.addComponent(btnXuatDe))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
												.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(328)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChng)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
						.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
						.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnThemCauHoi)
								.addComponent(btnXuatDe))
							.addGap(37))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnQuayLai)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}

	private void initListsData() {

		DefaultListModel<String> chuongModel = new DefaultListModel<>();
		for (int i = 0; i < 5; i++) {
			chuongModel.addElement("Chuong " + i);
		}
		listChuong.setModel(chuongModel);

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

//		DefaultListModel<String> c3TracNghiemModel = new DefaultListModel<>();
//		for (int i = 0; i < 10; i++) {
//			c3TracNghiemModel.addElement("Cau hoi Trac Nghiem c3 so " + i);
//		}
//
//		DefaultListModel<String> c4TracNghiemModel = new DefaultListModel<>();
//		for (int i = 0; i < 10; i++) {
//			c4TracNghiemModel.addElement("Cau hoi Trac Nghiem c4 so " + i);
//		}

		DefaultListModel<String> c0TuLuanModel = new DefaultListModel<>();
		ArrayList<String> c0TuLuanStringList = new ArrayList<>();
		
		for (int i = 0; i < 7; i++) {
			c0TuLuanStringList.add("Cau hoi Tu Luan c0 so " + i);
			c0TuLuanModel.addElement(c0TuLuanStringList.get(i));
		}
		
		DefaultListModel<String> c1TuLuanModel = new DefaultListModel<>();
		for (int i = 0; i < 7; i++) {
			c1TuLuanModel.addElement("Cau hoi Tu Luan c1 so " + i);
		}

		DefaultListModel<String> c2TuLuanModel = new DefaultListModel<>();
		for (int i = 0; i < 7; i++) {
			c2TuLuanModel.addElement("Cau hoi Tu Luan c2 so " + i);
		}

//		DefaultListModel<String> c3TuLuanModel = new DefaultListModel<>();
//		for (int i = 0; i < 7; i++) {
//			c3TuLuanModel.addElement("Cau hoi Tu Luan c3 so " + i);
//		}

//		DefaultListModel<String> c4TuLuanModel = new DefaultListModel<>();
//		for (int i = 0; i < 7; i++) {
//			c4TuLuanModel.addElement("Cau hoi Tu Luan c4 so " + i);
//		}
		
		listChuong.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(listChuong.getSelectedIndex() == 0){
					listTracNghiem.setModel(c0TracNghiemModel);
					listTuLuan.setModel(c0TuLuanModel);
				}else if(listChuong.getSelectedIndex() == 1){
					listTracNghiem.setModel(c1TracNghiemModel);
					listTuLuan.setModel(c1TuLuanModel);
				}else if(listChuong.getSelectedIndex() == 2){
					listTracNghiem.setModel(c2TracNghiemModel);
					listTuLuan.setModel(c2TuLuanModel);
				}
			}
		});
		
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
	
	
}
