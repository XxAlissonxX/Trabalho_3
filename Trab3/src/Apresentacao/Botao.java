package Apresentacao;

import javax.swing.JButton;

public class Botao extends JButton{
	
	public Botao(String login) {
		
		setText(login);
		setOpaque(true);	
	}
}
