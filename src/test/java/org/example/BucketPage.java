package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Страница с корзиной
 */
public class BucketPage {
	private final ElementsCollection productLists = $$x("//tbody//tr[@class='item']");

	public long getTotalCost() {
		int count = Integer.parseInt($x("//tbody//tr//td[3]//input").getAttribute("value"));
		int cost = Integer.parseInt($x("//tbody//tr//td[4]").getText().substring(1, 3));
		return count * cost;
	}
	public long getCartTotal() {
		return Integer.parseInt($(By.id("cartTotal")).getText().substring(1, 3));
	}
}
