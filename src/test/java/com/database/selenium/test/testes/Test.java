package com.database.selenium.test.testes;

import java.sql.SQLException;

public class Test extends BaseTest {


	@org.junit.Test
	public void test() throws SQLException {
		gamesPage.abrirPagina("https://www.amazon.com.br/b/?node=7791985011&pf_rd_r=KN1VA5PKW5BX4RM6DMZT&pf_rd_p=9cf3d1f3-5526-4b66-80a1-77d9050d3759&pd_rd_r=0493c03e-dbb9-4a6b-ac8f-5787a5f713f3&pd_rd_w=g2eGO&pd_rd_wg=o0UT0&ref_=pd_gw_unk");
		gamesPage.digitarNomeProduto(jdbc.result.getString("Nome"));
		gamesPage.acionarBtnBuscar();
	}

}
