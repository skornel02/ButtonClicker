package me.studio.main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import me.studio.manager.vasarlas;

public class gui extends JFrame {

	private JPanel contentPane;
	
	public JLabel label; 
	public JButton katapult;
	public JTextField katapultF;
	public JTextField Csig�kF;
	public JButton Csig�k;
	
	/**
	 * Create the frame.
	 */
	public gui() {
		setResizable(false);
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
		
		label = new JLabel("Gombok: 0");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(524, 11, 309, 14);
		contentPane.add(label);
		
		katapult = new JButton("Katapult");
		katapult.setToolTipText("�ra: 10kuki, Bev�tel: 1k/c");
		katapult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vasarlas.vasarlas(vasarlas.arak.Nagyi);
			}
		});
		katapult.setBounds(524, 46, 89, 23);
		contentPane.add(katapult);
		
		katapultF = new JTextField();
		katapultF.setEditable(false);
		katapultF.setToolTipText("Ennyi van neked a n�nib�l :O ");
		katapultF.setBounds(623, 47, 146, 20);
		contentPane.add(katapultF);
		katapultF.setColumns(10);
		
		Csig�k = new JButton("Csig\u00E1k");
		Csig�k.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vasarlas.vasarlas(vasarlas.arak.Csig�k);
			}
		});
		Csig�k.setToolTipText("\u00C1ra: 200kuki, Bev\u00E9tel: 5k/c");
		Csig�k.setBounds(524, 80, 89, 23);
		contentPane.add(Csig�k);
		
		Csig�kF = new JTextField();
		Csig�kF.setToolTipText("Ennyi van neked a n\u00E9nib\u0151l :O ");
		Csig�kF.setEditable(false);
		Csig�kF.setColumns(10);
		Csig�kF.setBounds(623, 81, 146, 20);
		contentPane.add(Csig�kF);
	}
}
