import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{


     By registerButton = By.cssSelector("a[class='ico-register']");

     By firstName = By.id("input[id='FirstName']");

    By lastName = By.id("input[id='LastName']");
    By eMail = By.id("input[id='Email']");
    By password = By.id("input[id='Password']");
    By confirmPassword = By.id("input[id='ConfirmPassword']");

    By confirmRegisterButton = By.id("input[id='register-button']");

    By genderPick = By.id("input[id='gender-male']");






    @Test
    public void registerUser() throws InterruptedException {
        clickOnElement(registerButton);
//        String color = getColorFromElement(registerButton, "color");
//        System.out.println(color);

        //  driver.quit();

//        String currentUrl = driver.getCurrentUrl();
//        driver.get(currentUrl);
//        typeIn(firstName, "Pera");
//        typeIn(lastName, "Peric");
//        typeIn(eMail, "PeraPeric90@gmail.com");
//        typeIn(password, "lozinka123!");
//        typeIn(confirmPassword, "lozinka123!");
//        // clickOnElement(genderPick);
//        clickOnElement(confirmRegisterButton);


    }




    @Test
    public void fillTheRegistration() throws InterruptedException{

        clickOnElement(registerButton);
        Thread.sleep(3000);
       // getElement(firstName);


        typeIn(firstName, "Pera");
        typeIn(lastName, "Peric");
        typeIn(eMail, "PeraPeric90@gmail.com");
        typeIn(password, "lozinka123!");
        typeIn(confirmPassword, "lozinka123!");
       // clickOnElement(genderPick);
       // clickOnElement(confirmRegisterButton);
    }


}
