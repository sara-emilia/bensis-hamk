
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;

public class P‰‰ikkuna extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_d;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P‰‰ikkuna frame = new P‰‰ikkuna();
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
	public P‰‰ikkuna() { // Bensa-aseman ikkuna, jossa n‰kyy hinnat
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 556);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Aloita tankkaus");
		btnNewButton.setFont(new Font("Gill Sans Nova", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //siirtyminen bensamaara-ikkunaan
				BensaMaara frame = new BensaMaara();
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton.setBounds(154, 446, 144, 37);
		contentPane.add(btnNewButton);
		
		JLabel bensa_asema = new JLabel("Bensa-asema");
		bensa_asema.setFont(new Font("Gill Sans Nova", Font.BOLD, 30));
		bensa_asema.setBounds(112, 23, 202, 70);
		contentPane.add(bensa_asema);
		
		textField = new JTextField();
		textField.setFont(new Font("Gill Sans Nova", Font.BOLD, 40));
		textField.setBackground(new Color(240, 230, 140));
		textField.setBounds(68, 104, 282, 82);
		contentPane.add(textField);
		textField.setColumns(10);
		String luku1 = haeLuku("C:\\Users\\emili\\eclipse-workspace\\Bensis\\src\\bensat\\95e.txt");
		textField.setText(luku1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Gill Sans Nova", Font.BOLD, 40));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(240, 230, 140));
		textField_1.setBounds(68, 199, 282, 82);
		contentPane.add(textField_1);
		String luku2 = haeLuku("C:\\Users\\emili\\eclipse-workspace\\Bensis\\src\\bensat\\98e.txt");
		textField_1.setText(luku2);
		
		textField_d = new JTextField();
		textField_d.setFont(new Font("Gill Sans Nova", Font.BOLD, 40));
		textField_d.setColumns(10);
		textField_d.setBackground(new Color(240, 230, 140));
		textField_d.setBounds(68, 292, 282, 82);
		contentPane.add(textField_d);
		String luku3 = haeLuku("C:\\Users\\emili\\eclipse-workspace\\Bensis\\src\\bensat\\diesel.txt");
		textField_d.setText(luku3);
	}
	
	private static String haeLuku(String filePath) {
	    String content = "";
	    try {
	        content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	        content = "x";
	    }
	    return removeLastChars(content,1);
	}
	
	public static String removeLastChars(String str, int chars) { 

	    return str.substring(0, str.length());
	}
}
