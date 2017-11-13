package com.ncc.group.test.pageobject;

import com.ncc.group.test.util.BrowserConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BrowserConfig
{
  private static WebElement ele = null;

  public static WebElement signin()
  {
    ele = driver.findElement(By.className("header_user_info"));
    return ele;
  }

  public static WebElement emailAddress()
  {
  ele = driver.findElement(By.id("email"));
    return ele;
  }

  public static WebElement password()
  {
    ele = driver.findElement(By.id("passwd"));
    return ele;
  }

  public static WebElement signinButton()
  {
    ele = driver.findElement(By.id("SubmitLogin"));
    return ele;
  }

  public static WebElement pageHeader()
  {
    ele = driver.findElement(By.className("page-subheading"));
    return ele;
  }
  public static WebElement infoAccount()
  {
   ele =  driver.findElement(By.className("info-account"));
    return ele;
  }

  public static WebElement orderPersonalInformationButton()
  {
   ele =  driver.findElement(By.className("icon-user"));
    return ele;
  }

  public static WebElement firstName()
  {
    ele = driver.findElement(By.id("firstname"));
    return ele;
  }

  public static WebElement getFirstNameValue()
  {
    ele = driver.findElement(By.id("firstname"));
    Assert.assertTrue(firstName().getAttribute("value").contains("Naren"));
    return ele;
  }

  public static WebElement saveButton()
  {
    ele = driver.findElement(By.name("submitIdentity"));
    return ele ;
  }

  public static WebElement currentPassword()
  {
    ele = driver.findElement(By.id("old_passwd"));
    return ele;
  }

  public static WebElement successfulMessage()
  {
   ele = driver.findElement(By.cssSelector(".alert"));
    return ele;
  }

  public static WebElement backToYourAccountButton()
  {
    ele = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a"));
    return ele;
  }

  public static WebElement orderHistory()
  {
    ele = driver.findElement(By.className("icon-list-ol"));
    return ele;
  }

  public static WebElement xy()
  {
    ele = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[1]"));
    return ele;
  }

}

