package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница SockShop
 */
public class MainPage {
	private final SelenideElement registerButton = $x("//a[@data-target='#register-modal']");

	public MainPage(String url) {
		Selenide.open(url);
	}
	public void clickOnRegister() {
		registerButton.click();
	}
}
