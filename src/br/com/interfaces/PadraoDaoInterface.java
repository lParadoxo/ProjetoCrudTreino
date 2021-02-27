package br.com.interfaces;

import java.sql.SQLException;

import br.com.entidades.Usuarios;

public interface PadraoDaoInterface {

	public void salvar(Usuarios usuarios) throws SQLException;
	
	public void alterar(Object ob) throws SQLException;
	
}
