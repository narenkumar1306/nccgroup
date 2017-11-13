package com.ncc.group.test.util;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.Before;

public class BrowserConfig
{
  public static WebDriver driver;

  @Before
  public static void openBrowser(String browserType)
  {
    if(browserType.equalsIgnoreCase("firefox"))
    {
      System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
      //System.setProperty("webdriver.gecko.driver", "/home/naren/bin/geckodriver");
      driver = new FirefoxDriver();
    }
    else if(browserType.equalsIgnoreCase("phamtomjs"))
    {
      //Headless browser
      driver = new PhantomJSDriver();
    }
    else
    {
      throw new IllegalArgumentException("Unknown Browser Driver" + browserType);
    }
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }

  public static void browserstack(String browserstack) throws MalformedURLException
  {
    if (browserstack.equalsIgnoreCase("browserstack"))
    {
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setPlatform(Platform.WIN8);
      cap.setBrowserName("chrome");
      String bsurl = "https://naren103:s2E6LMwvTWXSJGp5twWQ@hub-cloud.browserstack.com/wd/hub";
      URL browserstackUrl = new URL(bsurl);
      driver = new RemoteWebDriver(browserstackUrl, cap);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
  }

  public static String getUrl()
  {
    return "http://automationpractice.com";
  }
}