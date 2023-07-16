package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

public class Regesteration extends PageBase{
    public Regesteration(WebDriver driver){
        super(driver);
    }


    @FindBy(id = "nf-field-15")
    public WebElement register_btn;

    @FindBy(xpath = "//*[@id=\"nf-error-17\"]/div")
    public WebElement f_name_error;

    @FindBy(xpath = "//*[@id=\"nf-error-18\"]/div")
    public WebElement l_name_error;

    @FindBy(xpath = "//*[@id=\"nf-error-19\"]/div")
    public WebElement email_error;

    @FindBy(xpath = "//*[@id=\"nf-error-23\"]/div")
    public WebElement radio_error;

    @FindBy(id = "nf-field-18")
    public WebElement l_name;

    @FindBy(id = "nf-field-17")
    public WebElement f_name;

    @FindBy(id = "nf-field-19")
    public WebElement mail;

    @FindBy(xpath = "//*[@id=\"nf-error-19\"]/div")
    public WebElement email_validation_error;

    @FindBy(id = "nf-field-20")
    public WebElement phone;

    @FindBy(id = "nf-field-22")
    public WebElement courses;

    @FindBy(id = "nf-field-24")
    public WebElement month;

    @FindBy(id = "nf-label-class-field-23-5")
    public WebElement radio_btn;

    @FindBy(xpath = "//*[@id=\"nf-form-3-cont\"]/div/div[1]/p")
    public WebElement confirmation;

    public void click_register()
    {
        register_btn.click();
    }
    public void enter_first_name(String firstname)
    {
        f_name.sendKeys(firstname);
    }
    public void enter_last_name(String lastname)
    {
        l_name.sendKeys(lastname);
    }
    public void enter_invalid_email(String email)
    {
        mail.sendKeys(email);
        mail.sendKeys(Keys.ENTER);
    }

    public void enter_email(String email)
    {
        mail.sendKeys(email);
    }

    public void enter_phone(String phone_number)
    {
        phone.sendKeys(phone_number);
    }

    public void select_course()
    {
        Select course_name = new Select(courses);
        course_name.selectByValue("selenium-automation");
    }

    public void select_month()
    {
        Select joining_month = new Select(month);
        joining_month.selectByValue("august");
    }

    public void check_radio()
    {
        radio_btn.click();
    }


}
