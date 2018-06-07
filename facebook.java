package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

    public static void main(String[] args){
        method();
    }

    public static void  method(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("Your email");
        driver.findElement(By.id("pass")).sendKeys("Your password");
        driver.findElement(By.id("loginbutton")).click();

        System.out.println("You have " + driver.findElement(By.id ("notificationsCountValue")).getText() + "new notifications on your account");
    }
}
