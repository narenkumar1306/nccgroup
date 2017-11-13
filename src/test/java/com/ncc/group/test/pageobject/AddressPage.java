package com.ncc.group.test.pageobject;

import com.ncc.group.test.util.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddressPage extends BrowserConfig
{
  private static WebElement ele = null;

  public static WebElement addressPageTitle()
  {
    ele = driver.findElement(By.className("page-heading"));
    return ele;
  }

  public static WebElement addressPageProceedToCheckoutButton()
  {
    ele = driver.findElement(By.name("processAddress"));
    return ele;
  }
}
