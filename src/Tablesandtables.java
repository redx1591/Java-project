
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



 

public class Tablesandtables {

	public static void main (String[] args) {
		
		JFrame frame = new JFrame();
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
		
		JTextField texteId = new JTextField();
		JTextField textAname = new JTextField();
		JTextField textBname = new JTextField();
		JTextField textCname = new JTextField();
		
		JButton btnAdd = new JButton("Ajouter");
		JButton btnDelete = new JButton("Supprimer");
		JButton btnUpdate = new JButton("Mettre à jour");
		
		texteId.setBounds(20, 220, 100, 35);
		textAname.setBounds(20, 250, 100, 35);
		textBname.setBounds(20, 280, 100, 35);
		textCname.setBounds(20, 310, 100, 35);
		
		btnAdd.setBounds(150, 220, 100, 40);
		btnUpdate.setBounds(150, 265, 100, 40);
		btnDelete.setBounds(150, 310, 100, 40);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(0, 0, 880, 200);
		
		
		frame.setLayout(null);
		
		frame.add(pane);
		
		frame.add(texteId);
		frame.add(textAname);
		frame.add(textBname);
		frame.add(textCname);
		
		frame.add(btnAdd);
		frame.add(btnDelete);
		frame.add(btnUpdate);
		
		Object[] row = new Object[4];
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				row[0] = texteId.getText();
				row[1] = textAname.getText();
				row[2] = textBname.getText();
				row[3] = textCname.getText();
				
				model.addRow(row);
				
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
				// TODO Auto-generated method stub
				int i = table.getSelectedRow();
				texteId.setText(model.getValueAt(i, 0).toString());
				textAname.setText(model.getValueAt(i, 1).toString());
				textBname.setText(model.getValueAt(i, 2).toString());
				textCname.setText(model.getValueAt(i, 3).toString());
				
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
		
		
		
		frame.setSize(900, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
	}
	
}
