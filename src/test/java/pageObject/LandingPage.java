package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	private String menuItem;
	private String subMenuItem;
	private String itemList;
	private String featureItem;
	private String jobopeningItem;
	private String teachInUSItem;
	private String communityItem;
	private String subMenuTeflItem;
	private String subMenuTcItem;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		menuItem = "//ul[@class='tb-megamenu-nav nav level-0 items-5']/li[@data-label='";
		subMenuItem = "//ul[@class='tb-megamenu-subnav mega-nav level-1 items-6']/li[@data-label='";
		subMenuTeflItem = "//ul[@class='tb-megamenu-subnav mega-nav level-1 items-3']/li[@data-label='";
		subMenuTcItem = "//ul[@class='tb-megamenu-subnav mega-nav level-1 items-3']/li[@data-label='";
		itemList = "//nav[@id='block-menu-blockcountries']/ul/li/a[@title='Abu Dhabi']";
		featureItem = "//nav[@id='block-menu-blockfeatured-programs']/ul/li/a[@title='Abu Dhabi Public Schools']";
		jobopeningItem = "//div[@class='list-group']/ul/li/a[@title='Licensed Teachers']";
		teachInUSItem = "//nav[@id='block-menu-blocktop-cities']/ul/li/a[@title='New York City']";
		communityItem = "//nav[@id='block-menu-blockcommunity']/ul/li/a[@title='Blog']";

	}

	public WebElement getMainMenuItem(String mainMenuItemValue) {
		menuItem += mainMenuItemValue + "']";
		System.out.println("Final Menu Item XPATH: " + menuItem);
		return driver.findElement(By.xpath(menuItem));

	}

	public WebElement getSubMenuItem(String subMenuItemValue) {
		subMenuItem += subMenuItemValue + "']";
		System.out.println("Final Menu Item XPATH: " + subMenuItem);
		return driver.findElement(By.xpath(subMenuItem));
	}

	public WebElement getTeflSubMenuItem(String subMenuTeflItemValue) {
		subMenuTeflItem += subMenuTeflItemValue + "']";
		System.out.println("Final Menu Item XPATH: " + subMenuTeflItem);
		return driver.findElement(By.xpath(subMenuTeflItem));
	}

	public WebElement getTcSubMenuItem(String subMenuTcItemValue) {
		subMenuTcItem += subMenuTcItemValue + "']";
		System.out.println("Final Menu Item XPATH: " + subMenuTcItem);
		return driver.findElement(By.xpath(subMenuTcItem));
	}

	public WebElement getDestItemCount() {
		return driver.findElement(By.xpath(itemList));
	}

	public WebElement getFeatureItem() {
		return driver.findElement(By.xpath(featureItem));
	}

	public WebElement getJobOpeningItem() {
		return driver.findElement(By.xpath(jobopeningItem));
	}

	public WebElement getTeachInUSItem() {
		return driver.findElement(By.xpath(teachInUSItem));
	}

	public WebElement getCommunityItem() {
		return driver.findElement(By.xpath(communityItem));
	}
	
	public String getVerificationString() {
		return driver.findElement(By.cssSelector("div.page-title")).getText();
	}
}
