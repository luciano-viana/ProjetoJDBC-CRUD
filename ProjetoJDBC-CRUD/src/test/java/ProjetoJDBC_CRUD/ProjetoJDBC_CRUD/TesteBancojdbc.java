package ProjetoJDBC_CRUD.ProjetoJDBC_CRUD;

import org.junit.Test;

import conexaojdbc.ConexaoBD;

public class TesteBancojdbc {

	@Test
	public void initBanco() {
		ConexaoBD.getConnection();
	}
}
