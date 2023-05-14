package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница SockShop
 */
public class MainPage {
	public MainPage(String url) {
		Selenide.open(url);
	}
	public void clickOnRegister() {
		$x("//a[@data-target='#register-modal']").click();
	}
	public void clickOnLogin() {
		$x("//a[@data-target='#login-modal']").click();
	}
	public void clickOnCatalogue() {
		$(By.className("dropdown-toggle")).click();
	}
	public void addToCart() {
		$x("//*[@id=\"products\"]/div[2]/div/div[2]/p[2]/a[2]").click();
	}
	public void clickOnBasket() {
		$x("//*[@id=\"basket-overview\"]/a").click();
	}
}
