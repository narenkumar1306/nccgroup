package com.ncc.group.test.pageobject;

import com.ncc.group.test.util.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder extends BrowserConfig
{
  private static WebElement ele = null;

  public static WebElement tShirtTab()
  {
    ele = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
    return ele;
  }

  public static WebElement catalogBlock()
  {
    ele = driver.findElement(By.className("title_block"));
    return ele;
  }

  public static WebElement moreButton()
  {
    JavascriptExecutor jsx = (JavascriptExecutor) driver;
    jsx.executeScript("window.scrollBy(0,450)", "");
    WebElement imagehover = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div"));
    WebElement morebutton = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]/span"));
    Actions action = new Actions(driver);
    action.moveToElement(imagehover).moveToElement(morebutton).click().build().perform();
    return ele;
  }

  public static WebElement plusButton() throws InterruptedException
  {
    Thread.sleep(2000l);
    ele = driver.findElement(By.className("icon-plus"));
    return ele;
  }

  public static WebElement addToCartButton()
  {
    ele = driver.findElement(By.id("add_to_cart"));
    return ele;
  }

  public static WebElement proceedToCheckoutButton()
  {
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")));
    ele = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
    return ele;
  }

  public static WebElement shoppingCartSummaryPage()
  {
    ele = driver.findElement(By.id("cart_title"));
    return ele;
  }

  public static WebElement shoppingCartProceedToCheckout()
  {
    ele = driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span"));
    return ele;
  }
}
