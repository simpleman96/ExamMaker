package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {

	private FrameMain frmMain;
	private FrameChonCongCu frmChonCongCu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new FrameMain();
		// frmChonCongCu = new FrameChonCongCu();
		frmMain.getBtnCoSo().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frmMain.setVisible(false);
				frmChonCongCu = new FrameChonCongCu(1);
				frmChonCongCu.setTitle("Cơ Sở Dữ Liệu");
				frmChonCongCu.getBtnQuayLai().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						frmChonCongCu.setVisible(false);
						frmMain.setVisible(true);
					}
				});

				frmChonCongCu.setVisible(true);
			}
		});

		frmMain.getBtnTriTue().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frmMain.setVisible(false);
				frmChonCongCu = new FrameChonCongCu(2);
				frmChonCongCu.setTitle("Trí Tuệ Nhân Tạo");
				frmChonCongCu.getBtnQuayLai().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						frmChonCongCu.setVisible(false);
						frmMain.setVisible(true);
					}
				});

				frmChonCongCu.setVisible(true);
			}
		});

		frmMain.getBtnLapTrinh().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frmMain.setVisible(false);
				frmChonCongCu = new FrameChonCongCu(3);
				frmChonCongCu.setTitle("Lập Trình Hướng Đối Tượng");
				frmChonCongCu.getBtnQuayLai().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						frmChonCongCu.setVisible(false);
						frmMain.setVisible(true);
					}
				});

				frmChonCongCu.setVisible(true);
			}
		});

		frmMain.getBtnMang().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frmMain.setVisible(false);
				frmChonCongCu = new FrameChonCongCu(4);
				frmChonCongCu.setTitle("Mạng Máy Tính");
				frmChonCongCu.getBtnQuayLai().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						frmChonCongCu.setVisible(false);
						frmMain.setVisible(true);
					}
				});

				frmChonCongCu.setVisible(true);
			}
		});


	}

}
