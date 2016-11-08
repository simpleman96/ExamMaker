package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTable;

public class FrameTaoDeNgauNhien extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTaoDeNgauNhien frame = new FrameTaoDeNgauNhien();
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
	public FrameTaoDeNgauNhien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblChnSLng = new JLabel("Tùy chọn các câu hỏi");
		lblChnSLng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChnSLng.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSCuHi = new JLabel("Số câu hỏi trắc nghiệm:");
		JComboBox<Object> cbSoChuongTN = new JComboBox<Object>();
		
		JLabel lbCauDe = new JLabel("Số câu dễ:     ");
		
		JComboBox<Object> cbSoCauDeTN = new JComboBox<Object>();
		
		JLabel lbCauTrungBinh = new JLabel("Số câu TB:");
		
		JComboBox<Object> lbSoCauTBTN = new JComboBox<Object>();
		
		JLabel lbCauKho = new JLabel("Số câu khó:");
		
		JPanel pnSoCauHoiTracNghiem = new JPanel();
		DefaultComboBoxModel<Object> modelChuong = new DefaultComboBoxModel<>();
		modelChuong.addElement("Chuong 1 ");
		modelChuong.addElement("Chuong 2 ");
		DefaultComboBoxModel<Object> modelDe = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<Object> modelTB = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<Object> modelKho = new DefaultComboBoxModel<>();
		
		JLabel lblimCuHi = new JLabel("Điểm câu hỏi trắc nghiệm: ");
		
		JComboBox<Object> cbDienChuongTN = new JComboBox<Object>();
		
		JLabel diemCauDe = new JLabel("Điểm câu dễ: ");
		
		JComboBox<Object> cbDiemDeTN = new JComboBox<Object>();
		
		JLabel diemCauTB = new JLabel("Điểm câu TB: ");
		
		JComboBox<Object> cbDiemTBTN = new JComboBox<Object>();
		
		JLabel lblimCuKh = new JLabel("Điểm câu khó: ");
		
		JPanel pnDiemCauHoiTracNghiem = new JPanel();
		
		JLabel lblSCuHi_1 = new JLabel("Số câu hỏi tự luận:");
		
		JComboBox<Object> cbSoChuongTL = new JComboBox<Object>();
		
		JLabel label_1 = new JLabel("Số câu dễ:     ");
		
		JComboBox<Object> cbSoCauDeTL = new JComboBox<Object>();
		
		JLabel lblSCuTb = new JLabel("Số câu TB:");
		
		JComboBox<Object> cbSoCauTBTL = new JComboBox<Object>();
		
		JLabel lblSCuKh = new JLabel("Số câu khó:");
		
		JPanel pnSoCauHoiTuLuan = new JPanel();
		
		JLabel lblimCuHi_1 = new JLabel("Điểm câu hỏi tư luận:        ");
		
		JComboBox<Object> cbDiemChuongTL = new JComboBox<Object>();
		
		JLabel label_5 = new JLabel("Điểm câu dễ: ");
		
		JComboBox<Object> cbDiemDeTL = new JComboBox<Object>();
		
		JLabel label_6 = new JLabel("Điểm câu TB: ");
		
		JComboBox<Object> cbDiemTBTL = new JComboBox<Object>();
		
		JLabel label_7 = new JLabel("Điểm câu khó: ");
		
		JPanel panel = new JPanel();
		
		JComboBox<Object> cbSoCauKhoTN = new JComboBox<Object>();
		
		JComboBox<Object> cbDiemKhoTN = new JComboBox<Object>();
		
		JComboBox<Object> cbSoCauKhoTL = new JComboBox<Object>();
		
		JComboBox<Object> cbDiemKhoTL = new JComboBox<Object>();
		
		JButton btnQuayLi = new JButton("Quay Lại");
		btnQuayLi.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLi.setForeground(Color.BLACK);
		
		
		JLabel lblTngim = new JLabel("Tổng điểm: 0");
		lblTngim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnTaoDe = new JButton("Tạo Đề");
		btnTaoDe.setBackground(SystemColor.activeCaptionBorder);
		
		JButton btnXacNhan = new JButton("Xác Nhận");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(389)
					.addComponent(lblChnSLng))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addComponent(lblSCuHi, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbSoChuongTN, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbCauDe, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbSoCauDeTN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbCauTrungBinh, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbSoCauTBTN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lbCauKho, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbSoCauKhoTN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(pnSoCauHoiTracNghiem, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addComponent(lblimCuHi, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbDienChuongTN, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(diemCauDe, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbDiemDeTN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(diemCauTB, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbDiemTBTN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblimCuKh, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbDiemKhoTN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(pnDiemCauHoiTracNghiem, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addComponent(lblSCuHi_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbSoChuongTL, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbSoCauDeTL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblSCuTb, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbSoCauTBTL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblSCuKh, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbSoCauKhoTL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(pnSoCauHoiTuLuan, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addComponent(lblimCuHi_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbDiemChuongTL, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbDiemDeTL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbDiemTBTL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cbDiemKhoTL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(647)
					.addComponent(lblTngim, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addComponent(btnQuayLi))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(704)
					.addComponent(btnXacNhan, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(703)
					.addComponent(btnTaoDe, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblChnSLng, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblSCuHi))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbSoChuongTN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lbCauDe))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbSoCauDeTN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lbCauTrungBinh))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lbSoCauTBTN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lbCauKho))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbSoCauKhoTN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(pnSoCauHoiTracNghiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblimCuHi))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbDienChuongTN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(diemCauDe))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbDiemDeTN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(diemCauTB))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbDiemTBTN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblimCuKh))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbDiemKhoTN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(pnDiemCauHoiTracNghiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblSCuHi_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbSoChuongTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(label_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbSoCauDeTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblSCuTb))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbSoCauTBTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblSCuKh))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbSoCauKhoTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(pnSoCauHoiTuLuan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblimCuHi_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbDiemChuongTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(label_5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbDiemDeTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(label_6))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbDiemTBTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(label_7))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(cbDiemKhoTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addComponent(btnXacNhan)
					.addGap(125)
					.addComponent(lblTngim)
					.addGap(11)
					.addComponent(btnTaoDe)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnQuayLi))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
