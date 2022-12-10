package Apresentacao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login extends JPanel implements ActionListener{
	private JLabel nome;
	private JTextField login;
	public static String loginNome;
	
	public Login() {
		
		setLayout(new FlowLayout());
		
		nome = new JLabel();
		login = new JTextField(20);
		login.setBackground(Color.LIGHT_GRAY);
		
		Botao b = new Botao("Enviar");
		b.addActionListener(this);
		
		nome.setText("Nome:");
		loginNome = login.getText();
		add(nome);
		add(login);
		add(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		
		
		loginNome = login.getText();
		
		System.out.println(loginNome);
	
		new JanelaQuartas();
	}
	public String getLoginNome() {
		return loginNome;
	}
	public void setLoginNome(String loginNome) {
		this.loginNome = loginNome;
	}
	
}
