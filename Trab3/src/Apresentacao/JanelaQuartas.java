package Apresentacao;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class JanelaQuartas extends JFrame{
public JanelaQuartas( ) {
		
		super("Quartas de Final");
		
		setLayout(new BorderLayout());
		
		Quartas quartas = new Quartas();
		
		add(quartas,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(600,200); 
		setVisible(true);
	}
}
