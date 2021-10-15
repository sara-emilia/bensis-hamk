import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class BensaMaara extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_bensamaara;
	private JRadioButton Button;
	private JRadioButton Button_1;
	private JRadioButton Button_diesel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BensaMaara frame = new BensaMaara();
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
	public BensaMaara() {
		
		String litramaara = "";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "1";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_1.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(255, 250, 250));
		btnNewButton_1.setBounds(94, 126, 87, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "2";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_2.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(255, 250, 250));
		btnNewButton_2.setBounds(191, 126, 87, 53);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "3";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_3.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_3.setBackground(new Color(255, 250, 250));
		btnNewButton_3.setBounds(285, 126, 87, 53);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "4";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_4.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_4.setBackground(new Color(255, 250, 250));
		btnNewButton_4.setBounds(94, 190, 87, 53);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "5";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_5.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_5.setBackground(new Color(255, 250, 250));
		btnNewButton_5.setBounds(191, 190, 87, 53);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "6";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_6.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_6.setBackground(new Color(255, 250, 250));
		btnNewButton_6.setBounds(285, 190, 87, 53);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "7";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_7.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_7.setBackground(new Color(255, 250, 250));
		btnNewButton_7.setBounds(94, 254, 87, 53);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "8";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_8.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_8.setBackground(new Color(255, 250, 250));
		btnNewButton_8.setBounds(191, 254, 87, 53);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "9";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_9.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_9.setBackground(new Color(255, 250, 250));
		btnNewButton_9.setBounds(285, 254, 87, 53);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = textField_bensamaara.getText() + "0";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_0.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		btnNewButton_0.setBackground(new Color(255, 250, 250));
		btnNewButton_0.setBounds(191, 318, 87, 53);
		contentPane.add(btnNewButton_0);
		
		JButton btnNewButton_CLR = new JButton("CLR");
		btnNewButton_CLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String litrat = " ";
				textField_bensamaara.setText(litrat);
			}
		});
		btnNewButton_CLR.setFont(new Font("Gill Sans Nova", Font.BOLD, 16));
		btnNewButton_CLR.setBackground(new Color(255, 250, 250));
		btnNewButton_CLR.setBounds(94, 318, 87, 53);
		contentPane.add(btnNewButton_CLR);
		
		JButton btnNewButton_enter = new JButton("OK");
		btnNewButton_enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //Tulosta m‰‰r‰&laatu tiedostoon ja avaa PIN-ikkunan
				
				String litrat = textField_bensamaara.getText();
				try {
					if (Button.isSelected()) {
						String laatu = "95E";
						tulostaOsto(litrat, laatu);
					}
					else if (Button_1.isSelected()) {
						String laatu = "98E";
						tulostaOsto(litrat, laatu);
					}
					else if (Button_diesel.isSelected()) {
						String laatu = "Diesel";
						tulostaOsto(litrat, laatu);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, " ");
					textField_bensamaara.setText("");
				}
				PinKoodi frame = new PinKoodi();
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton_enter.setFont(new Font("Gill Sans Nova", Font.BOLD, 16));
		btnNewButton_enter.setBackground(new Color(255, 250, 250));
		btnNewButton_enter.setBounds(285, 318, 87, 53);
		contentPane.add(btnNewButton_enter);
		
		Button = new JRadioButton("95E");
		Button.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		Button.setBounds(432, 126, 87, 53);
		contentPane.add(Button);
		
		Button_1 = new JRadioButton("98E");
		Button_1.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		Button_1.setBounds(432, 190, 87, 53);
		contentPane.add(Button_1);
		
		Button_diesel = new JRadioButton("Diesel");
		Button_diesel.setFont(new Font("Gill Sans Nova", Font.BOLD, 20));
		Button_diesel.setBounds(432, 254, 87, 53);
		contentPane.add(Button_diesel);
		
		textField_bensamaara = new JTextField();
		textField_bensamaara.setFont(new Font("Gill Sans Nova", Font.BOLD, 36));
		textField_bensamaara.setBounds(94, 56, 158, 59);
		contentPane.add(textField_bensamaara);
		textField_bensamaara.setColumns(10);
		
		JLabel lblNewLabel_litra = new JLabel("litraa");
		lblNewLabel_litra.setFont(new Font("Gill Sans Nova", Font.BOLD, 26));
		lblNewLabel_litra.setBounds(269, 80, 103, 35);
		contentPane.add(lblNewLabel_litra);
	}
	
	public void tulostaOsto(String litrat, String laatu){
		
		String filename = "C:\\Users\\emili\\eclipse-workspace\\Bensis\\src\\ostot\\polttoaineOstot.txt";
	
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename, true);
			fwriter.write(date.toString() + " : ");
			fwriter.write(laatu + ": " + litrat + " litraa tankattu." + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}