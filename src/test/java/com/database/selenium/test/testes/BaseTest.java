package com.database.selenium.test.testes;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.database.selenium.test.jdbc.JdbcConn;
import com.database.selenium.test.pages.GamesPage;

public class BaseTest {
//	public Connection conn = null;
//	public String url = "jdbc:postgresql://localhost:5432/";
//	public String dataBaseNome = "iLAB";
//	public String username = "postgres";
//	public String password = "admin";
	JdbcConn jdbc = new JdbcConn();
	WebDriver driver;
	GamesPage gamesPage;
	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\webdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		gamesPage = new GamesPage(driver);
		jdbc.configuracao();
	
	}

	@After
	public void tearDown() throws Exception {
		if(jdbc.conn != null) {
			jdbc.conn = null;
		}
		//driver.quit();
	}


}
