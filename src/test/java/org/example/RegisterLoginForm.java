package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

/**
 * Форма регистрации на главной странице
 */
public class RegisterLoginForm {
	private final static String username = "serpa99";
	private final static String firstname = "Sergey";
	private final static String lastname = "Panin";
	private final static String email = "panin.al96.sp@gmal.com";
	private final static String password = "admin";

	public void register() {
		$(By.id("register-username-modal")).setValue(username);
		$(By.id("register-first-modal")).setValue(firstname);
		$(By.id("register-last-modal")).setValue(lastname);
		$(By.id("register-email-modal")).setValue(email);
		$(By.id("register-password-modal")).setValue(password);
		$(By.id("register-password-modal")).sendKeys(Keys.ENTER);
	}

	public void login() {
		$(By.id("username-modal")).setValue(username);
		$(By.id("password-modal")).setValue(password);
		$(By.id("password-modal")).sendKeys(Keys.ENTER);
	}
}
