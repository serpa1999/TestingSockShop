package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Форма регистрации на главной странице
 */
public class RegisterForm {
	private final static String username = "serpa99";
	private final static String firstname = "Sergey";
	private final static String lastname = "Panin";
	private final static String email = "panin.al96.sp@gmal.com";
	private final static String password = "admin";

	private final SelenideElement registerButton = $x("//button[@onclick='return register()']");
	public RegisterForm () {
		$(By.id("register-username-modal")).setValue(username);
		$(By.id("register-first-modal")).setValue(firstname);
		$(By.id("register-last-modal")).setValue(lastname);
		$(By.id("register-email-modal")).setValue(email);
		$(By.id("register-password-modal")).setValue(password);
		$(By.id("register-password-modal")).sendKeys(Keys.ENTER);
	}
}
