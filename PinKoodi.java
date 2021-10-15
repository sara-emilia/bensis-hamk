import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import bensat.tilaus;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PinKoodi extends JFrame {

	private JPanel contentPane;
	private JTextField textField_PIN;
	private String yritys = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PinKoodi frame = new PinKoodi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PinKoodi() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sy\u00F6t\u00E4 PIN-koodi");
		lblNewLabel.setFont(new Font("Gill Sans Nova", Font.BOLD, 24));
		lblNewLabel.setBounds(141, 0, 190, 61);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "0";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_0.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_0.setBackground(new Color(255, 250, 250));
		btnNewButton_0.setBounds(191, 367, 87, 53);
		contentPane.add(btnNewButton_0);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "1";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_1.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(255, 250, 250));
		btnNewButton_1.setBounds(94, 173, 87, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "2";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_2.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(255, 250, 250));
		btnNewButton_2.setBounds(191, 173, 87, 53);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "3";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_3.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_3.setBackground(new Color(255, 250, 250));
		btnNewButton_3.setBounds(288, 173, 87, 53);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "4";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_4.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_4.setBackground(new Color(255, 250, 250));
		btnNewButton_4.setBounds(94, 237, 87, 53);
		contentPane.add(btnNewButton_4);
		
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "5";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_5.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_5.setBackground(new Color(255, 250, 250));
		btnNewButton_5.setBounds(191, 237, 87, 53);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "6";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_6.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_6.setBackground(new Color(255, 250, 250));
		btnNewButton_6.setBounds(288, 237, 87, 53);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "7";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_7.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_7.setBackground(new Color(255, 250, 250));
		btnNewButton_7.setBounds(94, 301, 87, 53);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "8";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_8.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_8.setBackground(new Color(255, 250, 250));
		btnNewButton_8.setBounds(191, 301, 87, 53);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = yritys + "9";
				String slsn = textField_PIN.getText() + "*";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_9.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_9.setBackground(new Color(255, 250, 250));
		btnNewButton_9.setBounds(288, 301, 87, 53);
		contentPane.add(btnNewButton_9);
			
		JButton btnNewButton_enter = new JButton("OK");
		btnNewButton_enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pinCheck(yritys) == true) {
					tilaus frame = new tilaus();
					frame.setVisible(true);
					dispose();
				}
				else {
					textField_PIN.setText("V‰‰r‰ PIN, paina CLR");
				}
			}
		});
		btnNewButton_enter.setFont(new Font("Gill Sans Nova", Font.BOLD, 16));
		btnNewButton_enter.setBackground(new Color(255, 250, 250));
		btnNewButton_enter.setBounds(288, 367, 87, 53);
		contentPane.add(btnNewButton_enter);
		
		JButton btnNewButton_CLR = new JButton("CLR");
		btnNewButton_CLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yritys = "";
				String slsn = "";
				textField_PIN.setText(slsn);
			}
		});
		btnNewButton_CLR.setFont(new Font("Gill Sans Nova", Font.BOLD, 16));
		btnNewButton_CLR.setBackground(new Color(255, 250, 250));
		btnNewButton_CLR.setBounds(94, 367, 87, 53);
		contentPane.add(btnNewButton_CLR);
		
		textField_PIN = new JTextField();
		textField_PIN.setHorizontalAlignment(SwingConstants.CENTER);
		textField_PIN.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		textField_PIN.setBounds(94, 78, 281, 53);
		contentPane.add(textField_PIN);
		textField_PIN.setColumns(10);
	}
	
		public Boolean pinCheck(String yritys) {
			String pin = "2468";
			
			if (pin.equals(yritys)) {
				return true;
			}
			else {
				return false;
			}
		}
}
