package ro.tefacprogramator.m4.examen.serverapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewToy {
    
    static WebDriver driver;

    @BeforeAll
    public static void setup(){
        driver = new ChromeDriver();
    }

    @Test
    public void shouldAddNewToy(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.manage().window().setPosition(new Point(2000, 100));
        driver.manage().window().setSize(new Dimension(1000, 1000));
        
        driver.get("http://localhost:3000/");
        
        driver.findElement(By.cssSelector("#description")).sendKeys("selenium test");
        driver.findElement(By.cssSelector("#price")).sendKeys("10");

        Select drpIdCategory = new Select(driver.findElement(By.cssSelector("#categoryID")));
        drpIdCategory.selectByValue("1");
        Select drpIdType = new Select(driver.findElement(By.cssSelector("#typeId")));
        drpIdType.selectByValue("1");

        driver.findElement(By.cssSelector("#addButton")).click();

        String status =  driver.findElement(By.cssSelector("#formStatus")).getText();

        assertEquals(true, status.contains("Toy was saved sucesfully!"));

    }

    @AfterAll
    public static void afterAll(){
        driver.quit();
    }
}
