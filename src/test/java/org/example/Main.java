package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

abstract class SockStoreTest {

	public void setup() {
		WebDriverManager.chromedriver().setup();
		Configuration.browser = "chrome";
		Configuration.driverManagerEnabled = true;
		Configuration.browserSize = "1920x1080";
		//Будет ли видно окно браузера
		Configuration.headless = false;
	}

	@BeforeAll
	public void init() {
		setup();
	}

	@AfterAll
	public void shotDown() {
		Selenide.closeWebDriver();
	}
}