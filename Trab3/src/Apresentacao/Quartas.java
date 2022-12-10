package Apresentacao;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Memoria.MemoriaQuartas;


public class Quartas extends JPanel implements ActionListener{
	private JLabel X;
	private JLabel selecao;
	private JLabel placar;
	private JLabel selecao2;
	private JLabel placar2;
	
	private JLabel X2;
	private JLabel selecao3;
	private JLabel placar3;
	private JLabel selecao4;
	private JLabel placar4;
	
	private JLabel X3;
	private JLabel selecao5;
	private JLabel placar5;
	private JLabel selecao6;
	private JLabel placar6;
	
	private JLabel X4;
	private JLabel selecao7;
	private JLabel placar7;
	private JLabel selecao8;
	private JLabel placar8;
	
	private JTextField s1;
	private JTextField s2;
	private JTextField p1;
	private JTextField p2;
	
	private JTextField s3;
	private JTextField s4;
	private JTextField p3;
	private JTextField p4;
	
	private JTextField s5;
	private JTextField s6;
	private JTextField p5;
	private JTextField p6;
	
	private JTextField s7;
	private JTextField s8;
	private JTextField p7;
	private JTextField p8;
	
	private int ip1;
	private int ip2;
	private int ip3;
	private int ip4;
	private int ip5;
	private int ip6;
	private int ip7;
	private int ip8;
	
	private String qs1;
	private String qs2;
	private String qs3;
	private String qs4;
	
	public Quartas() {
		
		setLayout(new FlowLayout());
		
		
		X = new JLabel();
		selecao = new JLabel();
		placar = new JLabel();
		selecao2 = new JLabel();
		placar2 = new JLabel();
		
		X2 = new JLabel();
		selecao3 = new JLabel();
		placar3 = new JLabel();
		selecao4 = new JLabel();
		placar4 = new JLabel();
		
		X3 = new JLabel();
		selecao5 = new JLabel();
		placar5 = new JLabel();
		selecao6 = new JLabel();
		placar6 = new JLabel();
		
		X4 = new JLabel();
		selecao7 = new JLabel();
		placar7 = new JLabel();
		selecao8 = new JLabel();
		placar8 = new JLabel();
		
		selecao.setText("Seleção:");
		placar.setText("Placar:");
		selecao2.setText("Seleção:");
		placar2.setText("Placar:");
		X.setText("X");
		
		selecao3.setText("Seleção:");
		placar3.setText("Placar:");
		selecao4.setText("Seleção:");
		placar4.setText("Placar:");
		X2.setText("X");
		
		selecao5.setText("Seleção:");
		placar5.setText("Placar:");
		selecao6.setText("Seleção:");
		placar6.setText("Placar:");
		X3.setText("X");
		
		selecao7.setText("Seleção:");
		placar7.setText("Placar:");
		selecao8.setText("Seleção:");
		placar8.setText("Placar:");
		X4.setText("X");
		
		Botao b2 = new Botao("Enviar");
		b2.addActionListener(this);
		
		s1 = new JTextField(10);
		s2 = new JTextField(10);
		p1 = new JTextField(3);
		p2 = new JTextField(3);
		
		s3 = new JTextField(10);
		s4 = new JTextField(10);
		p3 = new JTextField(3);
		p4 = new JTextField(3);
		
		s5 = new JTextField(10);
		s6 = new JTextField(10);
		p5 = new JTextField(3);
		p6 = new JTextField(3);
		
		s7 = new JTextField(10);
		s8 = new JTextField(10);
		p7 = new JTextField(3);
		p8 = new JTextField(3);
		
		add(selecao);
		add(s1);
		add(placar);
		add(p1);
		add(X);
		add(selecao2);
		add(s2);
		add(placar2);
		add(p2);
		
		add(selecao3);
		add(s3);
		add(placar3);
		add(p3);
		add(X2);
		add(selecao4);
		add(s4);
		add(placar4);
		add(p4);
		
		add(selecao5);
		add(s5);
		add(placar5);
		add(p5);
		add(X3);
		add(selecao6);
		add(s6);
		add(placar6);
		add(p6);
		
		add(selecao7);
		add(s7);
		add(placar7);
		add(p7);
		add(X4);
		add(selecao8);
		add(s8);
		add(placar8);
		add(p8);
		
		add(b2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		
		ip1 = Integer.parseInt(p1.getText());
		ip2 = Integer.parseInt(p2.getText());
		ip3 = Integer.parseInt(p3.getText());
		ip4 = Integer.parseInt(p4.getText());
		ip5 = Integer.parseInt(p5.getText());
		ip6 = Integer.parseInt(p6.getText());
		ip7 = Integer.parseInt(p7.getText());
		ip8 = Integer.parseInt(p8.getText());
		
		if(ip1 > ip2) {
			
			qs1 = s1.getText();
		}else if(ip1<ip2) {
			qs1 = s2.getText();
		}
		
		if(ip3 > ip4) {
			
			qs2 = s3.getText();
		}else if(ip3<ip4) {
			
			qs2 = s4.getText();	
		}
		
		if(ip5 > ip6) {
			
			qs3 = s5.getText();
		}else if(ip5<ip6) {
			
			qs3 = s6.getText();
		}
		
		if(ip7 > ip8) {
			
			qs4 = s7.getText();
		}else if(ip7<ip8) {
			
			qs4 = s8.getText();
		}
			System.out.println(Login.loginNome);	
		MemoriaQuartas memoria = new MemoriaQuartas();
		
		memoria.setNomel(Login.loginNome);	
		memoria.setMqs1(s1.getText());
		memoria.setMqs2(s2.getText());
		memoria.setMqs3(s3.getText());
		memoria.setMqs4(s4.getText());
		memoria.setMqs5(s5.getText());
		memoria.setMqs6(s6.getText());
		memoria.setMqs7(s7.getText());
		memoria.setMqs8(s8.getText());
		
		memoria.setMqp1(ip1);
		memoria.setMqp2(ip2);
		memoria.setMqp3(ip3);
		memoria.setMqp4(ip4);
		memoria.setMqp5(ip5);
		memoria.setMqp6(ip6);
		memoria.setMqp7(ip7);
		memoria.setMqp8(ip8);
		
		memoria.setClas1(qs1);
		memoria.setClas2(qs2);
		memoria.setClas3(qs3);
		memoria.setClas4(qs4);
		
		new JanelaSemi(memoria);
		
		System.out.println(memoria.getClas1());
		System.out.println(memoria.getClas2());
		System.out.println(memoria.getClas3());
		System.out.println(memoria.getClas4());
	}

	public String getQs1() {
		return qs1;
	}

	public void setQs1(String qs1) {
		this.qs1 = qs1;
	}

	public String getQs2() {
		return qs2;
	}

	public void setQs2(String qs2) {
		this.qs2 = qs2;
	}

	public String getQs3() {
		return qs3;
	}

	public void setQs3(String qs3) {
		this.qs3 = qs3;
	}

	public String getQs4() {
		return qs4;
	}

	public void setQs4(String qs4) {
		this.qs4 = qs4;
	}
	
	
}
