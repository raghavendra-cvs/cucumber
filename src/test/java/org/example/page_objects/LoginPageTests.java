package org.example.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTests {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/login-form.html");
    }

    @Test
    public void loginWithNormalApproach(){
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("user");
        driver.findElement(By.xpath("//button")).click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
