package com.ncc.group.test.pageobject;

import com.ncc.group.test.util.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentMethod extends BrowserConfig
{
  private static WebElement ele = null;


  public static WebElement paymentMethodPageTitle()
  {
    ele = driver.findElement(By.className("page-heading"));
    return ele;
  }

  public static WebElement payByBankWire()
  {
    ele = driver.findElement(By.className("bankwire"));
    return ele;
  }

}
