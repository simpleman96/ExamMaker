package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.MonHoc;
import main.ReadWriteData;
import main.TracNghiem;
import main.TuLuan;

public class FrameThemTuLuan extends JFrame {

	private JPanel contentPane;
	private JButton btnQuayLai;
	private JButton btnThemCauHoi;
	private JTextArea taDeBai;
	private JTextArea taGoiYDapAn;
	private JComboBox cbChuong;
	private JComboBox cbDoKho;
	
	private Integer mon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameThemTuLuan frame = new FrameThemTuLuan(1);
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
	public FrameThemTuLuan(Integer mon) {
		this.mon = mon;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 450, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblThmCuHi = new JLabel("Thêm câu hỏi tự luận");
		lblThmCuHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmCuHi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		taDeBai = new JTextArea();

		JLabel lbDeBai = new JLabel("Đề bài");
		lbDeBai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lbDapAn = new JLabel("Gợi ý đáp án");
		lbDapAn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		taGoiYDapAn = new JTextArea();
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		
		btnThemCauHoi = new JButton("Thêm");
		btnThemCauHoi.setBackground(SystemColor.activeCaptionBorder);
		
		JLabel lblNewLabel = new JLabel("Độ khó");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Chương");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cbChuong = new JComboBox();
		cbChuong.setBackground(SystemColor.activeCaptionBorder);
		
		cbDoKho = new JComboBox();
		cbDoKho.setBackground(SystemColor.activeCaptionBorder);
		
		initData();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(78)
							.addComponent(lblThmCuHi))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lbDeBai, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(taDeBai, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lbDapAn))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel))
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(cbDoKho, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cbChuong, 0, 67, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(10)
								.addComponent(btnQuayLai)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnThemCauHoi))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(taGoiYDapAn, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblThmCuHi)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(cbChuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cbDoKho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addComponent(lbDeBai)
					.addGap(6)
					.addComponent(taDeBai, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(lbDapAn)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taGoiYDapAn, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuayLai)
						.addComponent(btnThemCauHoi)))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void initData() {
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

		btnThemCauHoi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TuLuan tuLuan = new TuLuan(monHoc.getMaHocPhan(), cbChuong.getSelectedIndex() + 1,
						taDeBai.getText(), cbDoKho.getSelectedIndex() + 1, taGoiYDapAn.getText());
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
						"data/cauhoi/" + tenMon.trim() + "_tl_c" + (cbChuong.getSelectedIndex()+1) + ".DAT");
				ArrayList<TuLuan> dsTuLuan = (ArrayList<TuLuan>) ReadWriteData.readObject(nameFile);
				dsTuLuan.add(tuLuan);
				boolean check = ReadWriteData.writeObject(dsTuLuan, nameFile);
				if (check) {
					JOptionPane.showMessageDialog(null, "Thêm câu hỏi thành công!");
				} else {
					JOptionPane.showMessageDialog(null, "Đã có lỗi!");
				}
			}
		});

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
