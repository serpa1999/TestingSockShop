package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

abstract class SockStoreTest {

	public void setup() {
		WebDriverManager.chromedriver().setup();
		Configuration.browser = "chrome";
		Configuration.driverManagerEnabled = true;
		Configuration.browserSize = "1920x1080";
		//Будет ли видно окно браузера
		Configuration.headless = false;
	}

	@Before
	public void init() {
		setup();
	}

	@After
	public void shotDown() {
		Selenide.closeWebDriver();
	}
}