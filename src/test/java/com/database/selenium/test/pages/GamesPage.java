package com.database.selenium.test.pages;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.database.selenium.test.jdbc.JdbcConn;

public class GamesPage {
	JdbcConn jdbc = new JdbcConn();
	
	
	protected WebDriver driver;
	
	public GamesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void abrirPagina(String pag) {
		driver.get(pag);
	}

	public void digitarNomeProduto(String produto) {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(produto);
	}
	
	public void acionarBtnBuscar() {
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	
	public void validarResultado(String matcher) {
		assertEquals(matcher, driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2")).getText());
	}
	
}
