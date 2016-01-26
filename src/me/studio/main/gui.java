package me.studio.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import me.studio.manager.Vasarlas;

import java.awt.Font;
import javax.swing.JTextField;

public class gui extends JFrame {

	private JPanel contentPane;
	
	public JLabel label; 
	private JButton btnNni;
	public JTextField neniField;

	/**
	 * Create the frame.
	 */
	public gui() {
		setTitle("Button Klikker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.click();
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Eclipsento'Projecto\\ButtonClicker\\resources\\icon.png"));
		btnNewButton.setSelectedIcon(null);
		btnNewButton.setBounds(0, 0, 514, 496);
		contentPane.add(btnNewButton);
		
		label = new JLabel("Sütik: 0");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(524, 11, 309, 14);
		contentPane.add(label);
		
		btnNni = new JButton("N\u00E9ni");
		btnNni.setToolTipText("Ára: 10kuki, Bevétel: 1k/c");
		btnNni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNni.setBounds(524, 46, 89, 23);
		contentPane.add(btnNni);
		
		neniField = new JTextField();
		neniField.setEditable(false);
		neniField.setToolTipText("Ennyi van neked a nénibõl :O ");
		neniField.setBounds(623, 47, 146, 20);
		contentPane.add(neniField);
		neniField.setColumns(10);
	}
}
