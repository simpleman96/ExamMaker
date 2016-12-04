package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import main.DeThi;
import main.ReadWriteData;

public class FrameDeThiDaLuu extends JFrame {

	private JPanel contentPane;
	private JList listDe;
	private JEditorPane showDe;
	private JButton btnQuayLai;

	private Integer mon;
	private DefaultListModel<String> deModel = new DefaultListModel<>();
	private ArrayList<DeThi> dsDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDeThiDaLuu frame = new FrameDeThiDaLuu(1);
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
	public FrameDeThiDaLuu(Integer m) {
		this.mon = m;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		listDe = new JList();
		listDe.setBounds(10, 36, 136, 575);
		contentPane.add(listDe);
		listDe.setModel(deModel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(160, 11, 814, 600);
		contentPane.add(scrollPane);

		showDe = new JEditorPane();
		scrollPane.setViewportView(showDe);

		JLabel lblThi = new JLabel("Mời chọn đề");
		lblThi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThi.setBounds(10, 11, 136, 24);
		contentPane.add(lblThi);

		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLai.setBounds(10, 627, 89, 23);
		contentPane.add(btnQuayLai);

		JButton btnSDng = new JButton("Sử dụng đề");
		btnSDng.setBackground(SystemColor.activeCaptionBorder);
		btnSDng.setBounds(854, 627, 120, 23);

		// initData();
		listDe.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int de = listDe.getSelectedIndex();
				if (de < 0 || de >= dsDe.size())
					de = 0;
				showDe.setText(dsDe.get(de).inDeThi());
			}
		});

		contentPane.add(btnSDng);
	}

	public void initData() {
		deModel.addElement("");
		deModel.clear();
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

		String nameFile = new String("data/dedaluu/" + tenMon.trim() + ".DAT");
		dsDe = (ArrayList<DeThi>) ReadWriteData.readObject(nameFile);

		for (int i = 0; i < dsDe.size(); i++) {
			deModel.addElement("Đề số " + (i + 1));
		}

	}

	public JList getListDe() {
		return listDe;
	}

	public void setListDe(JList listDe) {
		this.listDe = listDe;
	}

	public JEditorPane getShowDe() {
		return showDe;
	}

	public void setShowDe(JEditorPane showDe) {
		this.showDe = showDe;
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
