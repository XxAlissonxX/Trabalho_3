package Apresentacao;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Memoria.MemoriaFinal;
import Memoria.MemoriaSemi;
import Persistencia.CategoriaDAO;

public class Final extends JPanel implements ActionListener{
private JLabel FX;
	
	private JTextField fp1;
	private JTextField fp2;
	
	private JLabel fs1;
	private JLabel fs2;
	
	
	public Final(MemoriaSemi memosemi) {
		
		setLayout(new FlowLayout());
		
		FX = new JLabel();
		
		FX.setText("X");
		
		fp1 = new JTextField(3);
		fp2 = new JTextField(3);
		
		fs1 = new JLabel();
		fs2 = new JLabel();
		
		fs1.setText(memosemi.getClasf1());
		fs2.setText(memosemi.getClasf2());
		
		Botao b4 = new Botao("Enviar");
		b4.addActionListener(this);
		
		add(fs1);
		add(fp1);
		add(FX);
		add(fs2);
		add(fp2);
		
		add(b4);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		
		MemoriaFinal memofinal = new MemoriaFinal();
		
		memofinal.setId(0);
		memofinal.setMfp1(Integer.parseInt(fp1.getText()));
		memofinal.setMfp2(Integer.parseInt(fp2.getText()));
		
		if(memofinal.getMfp1()>memofinal.getMfp2()) {
			
			memofinal.setChamp(fs1.getText());
		
		}else if(memofinal.getMfp1()<memofinal.getMfp2()) {
			
			memofinal.setChamp(fs2.getText());
		}
		JOptionPane.showMessageDialog(null,"Campeão: \t" +memofinal.getChamp());
		
		CategoriaDAO.inserir(memofinal);
	}
}
