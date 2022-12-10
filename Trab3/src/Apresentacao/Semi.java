package Apresentacao;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Memoria.MemoriaQuartas;
import Memoria.MemoriaSemi;


public class Semi extends JPanel implements ActionListener{
	private JLabel SX;
	private JLabel SX2;
	
	private JTextField sp1;
	private JTextField sp2;
	private JTextField sp3;
	private JTextField sp4;
	
	private JLabel ss1;
	private JLabel ss2;
	private JLabel ss3;
	private JLabel ss4;
	
	public Semi(MemoriaQuartas memoria) {
		
		setLayout(new FlowLayout());
		
		
		SX = new JLabel();
		SX2 = new JLabel();
	
		SX.setText("X");
		SX2.setText("X");
		
		Botao b3 = new Botao("Enviar");
		b3.addActionListener(this);
		
		sp1 = new JTextField(3);
		sp2 = new JTextField(3);
		sp3 = new JTextField(3);
		sp4 = new JTextField(3);
		
		ss1 = new JLabel();
		ss2 = new JLabel();
		ss3 = new JLabel();
		ss4 = new JLabel();
		
		ss1.setText(memoria.getClas1());
		ss2.setText(memoria.getClas2());
		ss3.setText(memoria.getClas3());
		ss4.setText(memoria.getClas4());
		
		
		add(ss1);
		add(sp1);
		add(SX);
		add(ss2);
		add(sp2);
		
		
		add(ss3);
		add(sp3);
		add(SX2);
		add(ss4);
		add(sp4);
		
		add(b3);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		
		int i = Integer.parseInt(sp1.getText());
		int i2 = Integer.parseInt(sp2.getText());
		int i3 = Integer.parseInt(sp3.getText());
		int i4 = Integer.parseInt(sp4.getText());
		
		MemoriaSemi memosemi = new MemoriaSemi();
		
		memosemi.setMsp1(i);
		memosemi.setMsp2(i2);
		memosemi.setMsp3(i3);
		memosemi.setMsp4(i4);
		
		if(memosemi.getMsp1()>memosemi.getMsp2()) {
			
			memosemi.setClasf1(ss1.getText());
		}else if(memosemi.getMsp1()<memosemi.getMsp2()) {
			
			memosemi.setClasf1(ss2.getText());
		}
		
		
		if(memosemi.getMsp3()>memosemi.getMsp4()) {
			
			memosemi.setClasf2(ss3.getText());
		}else if(memosemi.getMsp3()<memosemi.getMsp4()) {
			
			memosemi.setClasf2(ss4.getText());
		}
		
		new JanelaFinal(memosemi);
	}
}
