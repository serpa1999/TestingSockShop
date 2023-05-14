package org.example;

import org.junit.Test;

public class OpenSite extends SockStoreTest{

	private final static String BASE_URL = "http://localhost:80";
	private final static String Name = "Sergey";
	private final static String Password = "admin";

	@Test
	public void checkHref() {
		MainPage mainPage = new MainPage(BASE_URL);
	}
}
