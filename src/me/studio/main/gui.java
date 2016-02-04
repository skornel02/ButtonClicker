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
import javax.swing.LookAndFeel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import me.studio.manager.vasarlas;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class gui extends JFrame {

	private JPanel contentPane;
	
	public JLabel label; 
	public JButton katapult;
	public JTextField katapultF;
	public JTextField CsigákF;
	public JButton Csigák;
	public JButton Gyar;
	public JLabel APM;
	public JTextField HidraulikaF;
	public JButton Hidraulika;
	
	/**
	 * Create the frame.
	 */
	public gui() {
		setResizable(false);
		setTitle("Button Klikker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 545);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Thats bullshit");
			e.printStackTrace();
		}
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFontosDolgok = new JMenu("Fontos dolgok");
		menuBar.add(mnFontosDolgok);
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
		btnNewButton.setIcon(new ImageIcon("resources\\icon.png"));
		btnNewButton.setSelectedIcon(null);
		btnNewButton.setBounds(0, 0, 514, 496);
		contentPane.add(btnNewButton);
		
		label = new JLabel("Gombok: 0");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(524, 11, 309, 14);
		contentPane.add(label);
		
		katapult = new JButton("Katapult");
		katapult.setToolTipText("Ára: 10kuki, Bevétel: 1k/c");
		katapult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vasarlas.vasarlas(vasarlas.arak.Nagyi);
			}
		});
		katapult.setBounds(524, 46, 89, 23);
		contentPane.add(katapult);
		
		katapultF = new JTextField();
		katapultF.setEditable(false);
		katapultF.setBounds(623, 47, 146, 20);
		contentPane.add(katapultF);
		katapultF.setColumns(10);
		
		Csigák = new JButton("Csig\u00E1k");
		Csigák.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vasarlas.vasarlas(vasarlas.arak.Csigák);
			}
		});
		Csigák.setToolTipText("\u00C1ra: 200kuki, Bev\u00E9tel: 5k/c");
		Csigák.setBounds(524, 80, 89, 23);
		contentPane.add(Csigák);
		
		CsigákF = new JTextField();
		CsigákF.setToolTipText("Ennyi van neked a n\u00E9nib\u0151l :O ");
		CsigákF.setEditable(false);
		CsigákF.setColumns(10);
		CsigákF.setBounds(623, 81, 146, 20);
		contentPane.add(CsigákF);
		
		Gyar = new JButton("Gyár");
		Gyar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				me.studio.manager.Gyar.fejlesztes();
			}
		});
		Gyar.setFont(new Font("Arial", Font.PLAIN, 13));
		Gyar.setBounds(524, 443, 298, 43);
		contentPane.add(Gyar);
		
		APM = new JLabel("APM: error");
		APM.setBounds(524, 432, 57, 14);
		contentPane.add(APM);
		
		Hidraulika = new JButton("Hidraulika");
		Hidraulika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				vasarlas.vasarlas(vasarlas.arak.Hidraulika); 
			}
		});
		Hidraulika.setToolTipText("\u00C1ra: 10000kuki, Bev\u00E9tel: 20k/c");
		Hidraulika.setBounds(524, 114, 89, 23);
		contentPane.add(Hidraulika);
		
		HidraulikaF = new JTextField();
		HidraulikaF.setToolTipText("Ennyi van neked a n\u00E9nib\u0151l :O ");
		HidraulikaF.setEditable(false);
		HidraulikaF.setColumns(10);
		HidraulikaF.setBounds(623, 115, 146, 20);
		contentPane.add(HidraulikaF);
	}
}
