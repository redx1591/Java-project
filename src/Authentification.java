

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;



import javax.swing.JButton;

import java.awt.Font;
import javax.swing.JRadioButton;

public class Authentification {

	private JFrame frame;
	private JTextField login;
	private JTextField pwd;
	private JLabel icone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification window = new Authentification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Authentification() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setBounds(0,0,1450, 823);
		frame.setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 2560, 1600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JRadioButton rdbtnResponsableFiliere = new JRadioButton("Responsable Filiere");
		rdbtnResponsableFiliere.setFont(new Font("Avenir Next", Font.PLAIN, 17));
		rdbtnResponsableFiliere.setForeground(new Color(255, 255, 255));
		rdbtnResponsableFiliere.setBounds(766, 541, 173, 23);
		panel.add(rdbtnResponsableFiliere);
		
		JRadioButton rdbtnFormateur = new JRadioButton("Formateur");
		rdbtnFormateur.setFont(new Font("Avenir Next", Font.PLAIN, 17));
		rdbtnFormateur.setForeground(Color.WHITE);
		rdbtnFormateur.setBounds(635, 541, 103, 23);
		panel.add(rdbtnFormateur);
		
		
		JRadioButton rdbtnAdministrateur = new JRadioButton("Administrateur");
		rdbtnAdministrateur.setFont(new Font("Avenir Next", Font.PLAIN, 17));
		rdbtnAdministrateur.setForeground(new Color(255, 255, 255));
		rdbtnAdministrateur.setBounds(458, 541, 147, 23);
		
		panel.add(rdbtnAdministrateur);
		
		
		JLabel lblAnel = new JLabel("ANEL");
		lblAnel.setForeground(new Color(248, 248, 255));
		lblAnel.setFont(new Font("Big Caslon", Font.PLAIN, 37));
		lblAnel.setBounds(660, 331, 119, 44);
		panel.add(lblAnel);
		
		login = new JTextField();
		login.setBounds(530, 400, 368, 39);
		panel.add(login);
		login.setColumns(10);
		
		icone = new JLabel("");
		icone.setIcon(new ImageIcon("C:\\Users\\ba196\\eclipse-workspace\\JavaProject\\images\\team_icon_3.png"));
		icone.setBounds(580, 109, 250, 241);
		panel.add(icone);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(647, 606, 132, 39);
		panel.add(btnNewButton);
		
		pwd = new JPasswordField();
		pwd.setColumns(10);
		pwd.setBounds(530, 462, 368, 39);
		panel.add(pwd);
		
		JLabel Image = new JLabel("");
		Image.setIcon(new ImageIcon("C:\\Users\\ba196\\eclipse-workspace\\JavaProject\\images\\background.png"));
		Image.setBounds(0, 0, 1434, 790);
		panel.add(Image);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnResponsableFiliere);
		group1.add(rdbtnFormateur);
		group1.add(rdbtnAdministrateur);
		
		
	}

	}
}

