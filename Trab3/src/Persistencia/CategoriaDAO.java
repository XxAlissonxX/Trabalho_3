package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Memoria.MemoriaFinal;

public class CategoriaDAO {
public static void inserir(MemoriaFinal memofinal) {
		
		try {
			
			Conexao c = new Conexao();
			Connection connection = c.getConexao();
			
			String comando = "insert into testebolao (id,nome,qs1,qp1,qs2,qp2,qs3,qp3,qs4,qp4,qs5,qp5,qs6,qp6,qs7,qp7,"
					+ "qs8,qp8,ss1,sp1,ss2,sp2,ss3,sp3,ss4,sp4,fs1,fp1,fs2,fp2,camp) "
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement result = connection.prepareStatement(comando);
			
			result.setInt(1,memofinal.getId());
			
			result.setString(2,memofinal.getNomel());
			result.setString(3,memofinal.getMqs1());
			result.setInt(4,memofinal.getMqp1());
			result.setString(5,memofinal.getMqs2());
			result.setInt(6,memofinal.getMqp2());
			result.setString(7,memofinal.getMqs3());
			result.setInt(8,memofinal.getMqp3());
			result.setString(9,memofinal.getMqs4());
			result.setInt(10,memofinal.getMqp4());
			result.setString(11,memofinal.getMqs5());
			result.setInt(12,memofinal.getMqp5());
			result.setString(13,memofinal.getMqs6());
			result.setInt(14,memofinal.getMqp6());
			result.setString(15,memofinal.getMqs7());
			result.setInt(16,memofinal.getMqp7());
			result.setString(17,memofinal.getMqs8());
			result.setInt(18,memofinal.getMqp8());
			
			result.setString(19,memofinal.getMss1());
			result.setInt(20,memofinal.getMsp1());
			result.setString(21,memofinal.getMss2());
			result.setInt(22,memofinal.getMsp2());
			result.setString(23,memofinal.getMss3());
			result.setInt(24,memofinal.getMsp3());
			result.setString(25,memofinal.getMss4());
			result.setInt(26,memofinal.getMsp4());
			
			result.setString(27,memofinal.getClasf1());
			result.setInt(28,memofinal.getMfp1());
			result.setString(29,memofinal.getClasf2());
			result.setInt(30,memofinal.getMfp2());
			
			result.setString(31,memofinal.getChamp());
			
			
			
			result.executeUpdate();
		
		}catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	}
}
