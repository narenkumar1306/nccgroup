package com.ncc.group.test.pageobject;

import com.ncc.group.test.util.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderSummaryPage extends BrowserConfig
{
  private static WebElement ele = null;

  public static WebElement orderSummary()
  {
    ele = driver.findElement(By.className("page-heading"));
    return ele;
  }

  public static WebElement confirmOrder()
  {
   ele =  driver.findElement(By.xpath(".//*[@id='cart_navigation']/button"));
    return ele;
  }

  public static WebElement orderConfirmation()
  {
    ele = driver.findElement(By.cssSelector(".page-heading"));
    return ele;
  }

  public static WebElement orderInformation()
  {
    ele = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div"));
    return ele;
  }

  public static WebElement backToOrder()
  {
    ele = driver.findElement(By.cssSelector(".button-exclusive"));
    return ele;
  }

}
