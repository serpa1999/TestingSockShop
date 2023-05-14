package org.example;

import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class OpenSiteTest extends SockStoreTest{

	private final static String BASE_URL = "http://localhost:80";

	/**
	 * Открваем вкладка браузера
	 * Заходим на сайт
	 * Нажимаем кнопку Register / Login
	 * Регистрируемся / Логинимся
	 * Добавляем товар в корзину
	 * Переходим в корзину
	 * Сравниваем цены
	 */
	@Test
	public void mainTest() {
		MainPage mainPage = new MainPage(BASE_URL);
		RegisterLoginForm registerLoginForm = new RegisterLoginForm();
		/*mainPage.clickOnRegister();
		registerLoginForm.register();*/
		mainPage.clickOnLogin();
		registerLoginForm.login();
		mainPage.clickOnCatalogue();
		mainPage.addToCart();
		mainPage.clickOnBasket();
		Assert.assertEquals(new BucketPage().getCartTotal(), new BucketPage().getTotalCost());
		sleep(5000);
	}
}
