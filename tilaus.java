package bensat;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tilaus extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tilaus frame = new tilaus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public tilaus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kiitos tilauksestasi!");
		lblNewLabel.setFont(new Font("Gill Sans Nova", Font.BOLD, 24));
		lblNewLabel.setBounds(117, 187, 228, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblMaksuHyvksytty = new JLabel("Maksu hyv\u00E4ksytty");
		lblMaksuHyvksytty.setFont(new Font("Gill Sans Nova", Font.BOLD, 24));
		lblMaksuHyvksytty.setBounds(116, 0, 209, 65);
		contentPane.add(lblMaksuHyvksytty);
		
		JButton btnNewButton = new JButton("Aloita tankkaus");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setFont(new Font("Gill Sans Nova", Font.BOLD, 16));
		btnNewButton.setBounds(135, 97, 174, 61);
		contentPane.add(btnNewButton);
	}
}
