package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
	private final SelenideElement registerButton = $x("//a");

	public MainPage(String url) {
		Selenide.open(url);
	}
	public void clickOnRegister() {
		registerButton.click();
	}
}
