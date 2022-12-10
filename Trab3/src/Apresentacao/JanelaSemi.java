package Apresentacao;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import Memoria.MemoriaQuartas;

public class JanelaSemi extends JFrame{
	
	public MemoriaQuartas memoria;
	public JanelaSemi(MemoriaQuartas memoria) {
		
		super("Semi Finais");
		
		this.memoria = memoria;
		
		
		setLayout(new BorderLayout());
		
		Semi semi = new Semi(memoria);
		add(semi,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(180,130); 
		setVisible(true);
	}
}
