package com.database.selenium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GamesPage {
	protected WebDriver driver;
	//JdbcConn jdbc = new JdbcConn();
	
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
	
}
