package Apresentacao;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class JanelaLogin extends JFrame{
	public JanelaLogin() {
		super("Login");
		
		organizar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,100); 
		setVisible(true);
	}
	
	public void organizar() {
		
		setLayout(new BorderLayout());
		
		Login logim = new Login();
		
		add(logim,BorderLayout.CENTER);
		
		
		
	}

}
