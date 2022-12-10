package Apresentacao;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import Memoria.MemoriaSemi;


public class JanelaFinal extends JFrame {
	
	public MemoriaSemi memofinal;
	
	public JanelaFinal(MemoriaSemi memofinal) {
		
		super("Finais");
		
		this.memofinal = memofinal;
		
		
		setLayout(new BorderLayout());
		
		Final fi = new Final(memofinal);
		add(fi,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(180,100); 
		setVisible(true);
	}
}
