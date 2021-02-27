package br.com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import br.com.conexao.Conexao;
import br.com.entidades.Usuarios;
import br.com.interfaces.PadraoDaoInterface;

public class LoginAcessoPaginaPrincipalDao implements PadraoDaoInterface {

	String sql;
	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	
	
	public void salvar(Usuarios usuarios) throws SQLException {
		
		sql = "insert into usuarios(nome,sobrenome,cpf,rg,nascimento)"
				+ "values(?,?,?,?,curdate())";
	
		con =  Conexao.conectar();
		ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setString(1, usuarios.getNome());
		ps.setString(2, usuarios.getSobrenome());
		ps.setString(3, usuarios.getCpf());
		ps.setString(4, usuarios.getRg());
		ps.setDate(5, usuarios.getNascimento());
		ps.execute();
		
		System.out.print("Inserido ao banco");
      
		
	}
	@Override
	public void alterar(Object ob) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
