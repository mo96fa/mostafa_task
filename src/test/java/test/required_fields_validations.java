package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Regesteration;

import java.util.concurrent.TimeUnit;

public class required_fields_validations extends TestBase {


    Regesteration regesterationObject;

    //Validate that the user can't register without filling the required fields
    @Test(priority = 0)
    public void user_can_not_register_without_filling_the_required_fields()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.click_register();
        Assert.assertEquals(regesterationObject.f_name_error.getText(), "This is a required field.");
        Assert.assertEquals(regesterationObject.l_name_error.getText(),"This is a required field.");
        Assert.assertEquals(regesterationObject.email_error.getText(),"This is a required field.");
        Assert.assertEquals(regesterationObject.radio_error.getText(),"This is a required field.");
        driver.navigate().to(driver.getCurrentUrl());
    }

    //Validate that the user can enter his first name

    @Test(priority = 1)
    public void user_can_enter_his_first_name() {
        regesterationObject = new Regesteration(driver);
        regesterationObject.enter_first_name("Mostafa");
    }

    //Validate that the user can enter his last name
    @Test(priority = 2)
    public void user_can_enter_his_last_name()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.enter_last_name("Ashraf");
    }

    //Validate that the user can view a validation error message if he entered an invalid email address
    @Test(priority = 3)
    public void user_cannot_register_using_invalid_email()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.enter_invalid_email("test");
        Assert.assertEquals(regesterationObject.email_validation_error.getText(),"Please enter a valid email address!");
        regesterationObject.mail.clear();
    }

    //Validate that the user can enter his valid email address
    @Test(priority = 4)
    public void user_can_enter_his_email()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.enter_email("test@test.com");
    }

    //Validate that the user can enter his phone number
    @Test(priority = 5)
    public void user_can_enter_his_phone()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.enter_phone("01097012942");
    }

    //Validate that the user can select the course he would like to book
    @Test(priority = 6)
    public void user_can_select_course()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.select_course();
    }

    //Validate that the user can select the month he would like to attend the course

    @Test(priority = 7)
    public  void user_can_select_the_month()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.select_month();
    }

    //Validate that the user can select how did he know us
    @Test(priority = 8)
    public  void user_can_select_the_social_media()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.check_radio();
    }

    //Validate that the user can register using a valid data
    @Test(priority = 9)
    public void user_can_click_register()
    {
        regesterationObject = new Regesteration(driver);
        regesterationObject.click_register();
    }

    //Validate that the registration is completed successfully
    @Test(priority = 10)
    public void user_can_register_successfully()
    {
        regesterationObject = new Regesteration(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(regesterationObject.confirmation.getText(), "Your registration is completed. We will contact with you soon. Thank you !");
    }
}
