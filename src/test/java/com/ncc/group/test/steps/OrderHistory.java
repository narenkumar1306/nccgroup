package com.ncc.group.test.steps;

import com.ncc.group.test.pageobject.AddressPage;
import com.ncc.group.test.pageobject.LoginPage;
import com.ncc.group.test.pageobject.OrderSummaryPage;
import com.ncc.group.test.pageobject.PaymentMethod;
import com.ncc.group.test.pageobject.PlaceOrder;
import com.ncc.group.test.pageobject.ShippingPage;
import com.ncc.group.test.util.BrowserConfig;
import org.junit.Assert;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.ncc.group.test.util.BrowserConfig.driver;
import static com.ncc.group.test.util.BrowserConfig.getUrl;

public class OrderHistory
{
  @Given("^I log into website as \"([^\"]*)\" and \"([^\"]*)\"$")
  public void iLogIntoWebsiteAsAnd(String username, String password) throws Throwable
  {
    BrowserConfig.openBrowser("firefox");
    driver.get(getUrl());
    LoginPage.signin().click();
    Assert.assertTrue(LoginPage.pageHeader().isDisplayed());
    LoginPage.emailAddress().sendKeys(username);
    LoginPage.password().sendKeys(password);
    LoginPage.signinButton().click();
    Assert.assertTrue(LoginPage.infoAccount().isDisplayed());
  }

  @And("^I click on the t-shirts button$")
  public void iClickOnTheTShirtsButton() throws Throwable
  {
    PlaceOrder.tShirtTab().click();
    Assert.assertTrue(PlaceOrder.catalogBlock().isDisplayed());
  }

  @And("^I click on more button$")
  public void iClickOnMoreButton() throws Throwable
  {
    PlaceOrder.moreButton();
  }

  @And("^I added the quantity to two by clicking on the quantity plus button$")
  public void iAddedTheQuantityToTwoByClickingOnTheQuantityPlusButton() throws Throwable
  {
    PlaceOrder.plusButton().click();
  }

  @And("^I click on add to cart to continue the process$")
  public void iClickOnAddToCartToContinueTheProcess() throws Throwable
  {
    PlaceOrder.addToCartButton().click();
  }

  @And("^I click on proceed to checkout button to continue process$")
  public void iClickOnProceedToCheckoutButtonToContinueProcess() throws Throwable
  {
    PlaceOrder.proceedToCheckoutButton().click();
    Assert.assertTrue(PlaceOrder.shoppingCartSummaryPage().isDisplayed());
  }

  @And("^I continue to proceed to checkout from shopping page to address$")
  public void iContinueToProceedToCheckoutFromShoppingPageToAddress() throws Throwable
  {
    Assert.assertTrue(PlaceOrder.shoppingCartSummaryPage().isDisplayed());
    PlaceOrder.shoppingCartProceedToCheckout().click();
  }

  @And("^I continue to proceed to checkout from address  to shipping$")
  public void iContinueToProceedToCheckoutFromAddressToShipping() throws Throwable
  {
    Assert.assertTrue(AddressPage.addressPageTitle().isDisplayed());
    AddressPage.addressPageProceedToCheckoutButton().click();

  }

  @And("^I tick terms of service to proceed to checkout from shipping to payment$")
  public void iTickTermsOfServiceToProceedToCheckoutFromShippingToPayment() throws Throwable
  {
    Assert.assertTrue(ShippingPage.shippingPageTitle().isDisplayed());
    ShippingPage.termsOfServicesCheckout().click();
    ShippingPage.shippingProceedToCheckoutButton().click();
  }

  @And("^I select payment type as pay by bank wire$")
  public void iSelectPaymentTypeAsPayByBankWire() throws Throwable
  {
    Assert.assertTrue(PaymentMethod.paymentMethodPageTitle().isDisplayed());
    PaymentMethod.payByBankWire().click();
  }

  @When("^I click on confirm order button to confirm the order$")
  public void iClickOnConfirmOrderButtonToConfirmTheOrder() throws Throwable
  {
    Assert.assertTrue(OrderSummaryPage.orderSummary().isDisplayed());
    OrderSummaryPage.confirmOrder().click();
  }

  @Then("^I should see order is placed$")
  public void iShouldSeeOrderIsPlaced() throws Throwable
  {
    Assert.assertTrue(OrderSummaryPage.orderConfirmation().isDisplayed());
    Assert.assertTrue(OrderSummaryPage.orderInformation().isDisplayed());
  }

  @And("^I click on my personal inforamtion$")
  public void iClickOnMyPersonalInforamtion() throws Throwable
  {
    LoginPage.orderPersonalInformationButton().click();
  }

  @And("^I changed firstname as \"([^\"]*)\" from N$")
  public void iChangedFirstnameAsFromN(String firstname) throws Throwable
  {
    LoginPage.firstName().clear();
    LoginPage.firstName().sendKeys(firstname);
    LoginPage.currentPassword().sendKeys("test123");
    LoginPage.saveButton().click();
  }

  @When("^I go back to my personal information$")
  public void iGoBackToMyPersonalInformation() throws Throwable
  {
    Assert.assertTrue(LoginPage.successfulMessage().isDisplayed());
  }

  @Then("^I should see first name is updated with naren$")
  public void iShouldSeeFirstNameIsUpdatedWithNaren() throws Throwable
  {
    LoginPage.backToYourAccountButton().click();
    LoginPage.orderPersonalInformationButton().click();
    LoginPage.getFirstNameValue();
  }

  @After
  public void tearDown()
  {
    if(driver != null)
    {
      driver.quit();
    }
  }
}


