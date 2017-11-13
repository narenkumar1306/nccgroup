package com.ncc.group.test.pageobject;

import com.ncc.group.test.util.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShippingPage extends BrowserConfig
{
  private static WebElement ele = null;


  public static WebElement shippingPageTitle()
  {
    ele = driver.findElement(By.id("carrier_area"));
    return ele;
  }

  public static WebElement shippingProceedToCheckoutButton()
  {
    ele = driver.findElement(By.name("processCarrier"));
    return ele;
  }

  public static WebElement termsOfServicesCheckout()
  {
    ele = driver.findElement(By.id("cgv"));
    return ele;
  }
}
