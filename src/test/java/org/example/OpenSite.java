package org.example;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class OpenSite extends SockStoreTest{

	private final static String BASE_URL = "http://localhost:80";

	/**
	 * Открваем вкладка браузера
	 * Заходим на сайт
	 * Нажимаем кнопку Register
	 * Регистрируемся
	 */
	@Test
	public void mainTest() {
		MainPage mainPage = new MainPage(BASE_URL);
		mainPage.clickOnRegister();
		register();
		sleep(5000);
	}
	@Test
	public void register() {
		RegisterForm registerForm = new RegisterForm();
	}
}
