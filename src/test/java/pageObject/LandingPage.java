package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	private String menuItem;
	private String subMenuItem;
	private String subMenuTeflItem;
	private String subMenuTcItem;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		menuItem = "//ul[@class='tb-megamenu-nav nav level-0 items-5']/li[@data-label='";
		subMenuItem = "//ul[@class='tb-megamenu-subnav mega-nav level-1 items-6']/li[@data-label='";
		subMenuTeflItem = "//ul[@class='tb-megamenu-subnav mega-nav level-1 items-3']/li[@data-label='";
		subMenuTcItem = "//ul[@class='tb-megamenu-subnav mega-nav level-1 items-2']/li[@data-label='";
	}

	public WebElement getMainMenuItem(String mainMenuItemValue) {
		menuItem += mainMenuItemValue + "']";
		System.out.println("Final Menu Item XPATH: " + menuItem);
		return driver.findElement(By.xpath(menuItem));

	}
	
	public WebElement getSubMenuItem(String mainMenuItem,String subMenuItemValue) {
		if (mainMenuItem.contains("Tefl"))
		{
			subMenuTeflItem += subMenuItemValue + "']";
			System.out.println("Final Menu Item XPATH: " + subMenuTeflItem);
			return driver.findElement(By.xpath(subMenuTeflItem));
		}
		else if (mainMenuItem.contains("Teacher Certification"))
		{
			subMenuTcItem += subMenuItemValue + "']";
			System.out.println("Final Menu Item XPATH: " + subMenuTcItem);
			return driver.findElement(By.xpath(subMenuTcItem));
		}
		else
		{
		subMenuItem += subMenuItemValue + "']";
		System.out.println("Final Menu Item XPATH: " + subMenuItem);
		return driver.findElement(By.xpath(subMenuItem));
		}
		
	}
}
