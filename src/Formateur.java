
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.LineBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JScrollPane;


public class Formateur {

	private JFrame frame;

	private JTextField texteId;
	private JTextField textAname ;
	private JTextField textBname;
	private JTextField textCname;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formateur window = new Formateur();
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
	public Formateur() {
		initialize();
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}finally {
			
		
		frame.setResizable(false);
		frame.setBounds(0, 0,1450, 823);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 2560, 52);
		panel.setBackground(new Color(40, 65, 95));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1170, 0, 281, 52);
		panel.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/adjaratoukhadyndiaye/Desktop/Java project/icons8-male-user-filled-50.png"));
		label.setBounds(6, 6, 50, 46);
		panel_1.add(label);
		
		JLabel nomPersonneEnLigne = new JLabel("NDIAYE Adjaratou Khady");
		nomPersonneEnLigne.setFont(new Font("Avenir Next", Font.PLAIN, 16));
		nomPersonneEnLigne.setBounds(56, 12, 197, 35);
		panel_1.add(nomPersonneEnLigne);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 52, 249, 693);
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_3.setBackground(new Color(228, 228, 228));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblListeDesFilires = new JLabel("Liste des filiéres");
		lblListeDesFilires.setBackground(new Color(228, 228, 228));
		lblListeDesFilires.setFont(new Font("Avenir Next", Font.PLAIN, 17));
		lblListeDesFilires.setBounds(28, 47, 188, 16);
		panel_3.add(lblListeDesFilires);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(40, 65, 95));
		panel_4.setBounds(28, 90, 188, 27);
		panel_3.add(panel_4);
		
		JLabel lblLpti = new JLabel("LPTI1");
		lblLpti.setFont(new Font("American Typewriter", Font.PLAIN, 14));
		lblLpti.setForeground(Color.WHITE);
		lblLpti.setBackground(Color.WHITE);
		panel_4.add(lblLpti);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(40, 65, 95));
		panel_5.setBounds(28, 149, 188, 27);
		panel_3.add(panel_5);
		
		JLabel lblIgtt = new JLabel("IGTT");
		lblIgtt.setFont(new Font("American Typewriter", Font.PLAIN, 14));
		lblIgtt.setForeground(Color.WHITE);
		panel_5.add(lblIgtt);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(40, 65, 95));
		panel_6.setBounds(28, 210, 188, 27);
		panel_3.add(panel_6);
		
		JLabel lblMaster = new JLabel("Master");
		lblMaster.setFont(new Font("American Typewriter", Font.PLAIN, 14));
		lblMaster.setForeground(Color.WHITE);
		panel_6.add(lblMaster);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(249, 52, 1196, 30);
		panel_7.setBorder(new LineBorder(Color.GRAY));
		panel_7.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblLptiListe = new JLabel("LPTI1 > Liste des évaluations");
		lblLptiListe.setFont(new Font("Avenir Next", Font.PLAIN, 15));
		lblLptiListe.setBounds(36, 6, 265, 16);
		panel_7.add(lblLptiListe);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(249, 81, 1196, 664);
		panel_8.setBackground(new Color(228, 228, 228));
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		
		//-------------------------------------------------------------------------------------------
		
		JTable table = new JTable();
		
		Object[] columns = {"Intitulé", "Date", "Type", "Coef. de pondération" };
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		
		table.setBackground(new Color(40, 65, 95));
		table.setForeground(Color.WHITE);
		Font font = new Font("Avenir Next", Font.PLAIN, 15);
		table.setFont(font);
		table.setRowHeight(30);
		
		texteId = new JTextField();
		textAname = new JTextField();
		 textBname = new JTextField();
		 textCname = new JTextField();
		
		JButton btnAdd = new JButton("Ajouter");
		btnAdd.setFont(new Font("Avenir Next", Font.PLAIN, 14));
		JButton btnDelete = new JButton("Supprimer");
		btnDelete.setFont(new Font("Avenir Next", Font.PLAIN, 14));
		JButton btnUpdate = new JButton("Modifier");
		btnUpdate.setFont(new Font("Avenir Next", Font.PLAIN, 14));
		
		texteId.setBounds(103, 539, 193, 35);
		textAname.setBounds(352, 540, 193, 35);
		textBname.setBounds(640, 540, 193, 35);
		textCname.setBounds(974, 540, 193, 35);
		
		btnAdd.setBounds(541, 595, 100, 40);
		btnUpdate.setBounds(945, 39, 100, 40);
		btnDelete.setBounds(1067, 39, 100, 40);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(0, 108, 1190, 373);
		
		
		panel_8.setLayout(null);
		
		JLabel lblIntitul = new JLabel("Intitulé");
		lblIntitul.setBounds(26, 546, 85, 20);
		panel_8.add(lblIntitul);
		lblIntitul.setFont(new Font("American Typewriter", Font.PLAIN, 14));
		
		panel_8.add(pane);
		
		panel_8.add(texteId);
		panel_8.add(textAname);
		panel_8.add(textBname);
		panel_8.add(textCname);
		
		panel_8.add(btnAdd);
		panel_8.add(btnDelete);
		panel_8.add(btnUpdate);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("American Typewriter", Font.PLAIN, 14));
		lblDate.setBounds(307, 550, 61, 16);
		panel_8.add(lblDate);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("American Typewriter", Font.PLAIN, 14));
		lblType.setBounds(598, 548, 61, 16);
		panel_8.add(lblType);
		
		JLabel lblCoefficient = new JLabel("Coefficient");
		lblCoefficient.setFont(new Font("American Typewriter", Font.PLAIN, 14));
		lblCoefficient.setBounds(879, 550, 105, 16);
		panel_8.add(lblCoefficient);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 220, 220));
		panel_2.setBorder(new LineBorder(new Color(153, 50, 204), 0));
		panel_2.setBounds(0, 493, 1190, 153);
		panel_8.add(panel_2);
		
		JLabel lblCrervaluation = new JLabel("Créer évaluation");
		lblCrervaluation.setFont(new Font("Avenir Next", Font.PLAIN, 16));
		panel_2.add(lblCrervaluation);
		
		JButton btnOuvrir = new JButton("Ouvrir");
		btnOuvrir.setFont(new Font("Avenir Next", Font.PLAIN, 14));
		btnOuvrir.setBounds(824, 39, 100, 40);
		btnOuvrir.setVisible(false);
		panel_8.add(btnOuvrir);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(40, 65, 95));
		panel_9.setBounds(0, 744, 1445, 52);
		frame.getContentPane().add(panel_9);
		
		Object[] row = new Object[4];
		
		
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				row[0] = texteId.getText();
				row[1] = textAname.getText();
				row[2] = textBname.getText();
				row[3] = textCname.getText();
				
				model.addRow(row);
				
				//Clean All fields once we add a row
				clearFields();
			}
		});
		
		
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				int i = table.getSelectedRow();
				if (i >= 0 ) {
					model.removeRow(i);
				}
				else {
					System.out.println("Rectifier l'erreur");
				}
					
			}
		});
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				texteId.setText(model.getValueAt(i, 0).toString());
				textAname.setText(model.getValueAt(i, 1).toString());
				textBname.setText(model.getValueAt(i, 2).toString());
				textCname.setText(model.getValueAt(i, 3).toString());
				//Show button when one row is clicked
				btnOuvrir.setVisible(true);
				
			}
		});
		
		
		
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				int i = table.getSelectedRow();
				
				if(i>=0)
			    {	
				  model.setValueAt(texteId.getText(), i, 0);
				  model.setValueAt(textAname.getText(), i, 1);
				  model.setValueAt(textBname.getText(), i, 2);
				  model.setValueAt(textCname.getText(), i, 3);
			    }
				else {
					System.out.println("Erreur lors de la mise à jour");
				}
			  }
		});
		

		
		
	}
 }
	
	
	
	/**
	 * Function for the frame.
	 */
	public void clearFields()
	{
		texteId.setText("");
		textAname.setText("");
		textBname.setText("");
		textCname.setText("");
		
	}
}
