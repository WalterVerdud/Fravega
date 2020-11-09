package com.fravega.Pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class busquedaPage {
    WebDriver driver;

    public busquedaPage(WebDriver driver){
        this.driver = driver;
    }

    public void heladera() throws InterruptedException {
        Helpers helpers = new Helpers();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div/header/div[2]/div/div[2]/form/input")).sendKeys("Heladeras");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div/header/div[2]/div/div[2]/form/button")).click();
        helpers.sleepSeconds(5);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[1]/ul/li[2]/ul/li[1]/ul/li[2]/a/h4")).click();
        helpers.sleepSeconds(5);
        driver.findElement(By.linkText("Ver todas")).click();
        helpers.sleepSeconds(5);
        driver.findElement(By.linkText("Samsung")).click();
        helpers.sleepSeconds(3);
        driver.findElement(By.id("apply")).click();
        helpers.sleepSeconds(5);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[1]/ul/li[3]/ul/li[2]/ul/li[2]/a/label")).click();
        helpers.sleepSeconds(5);

        List<WebElement>listadoHeladeras = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[2]/section/ul[1]"));
        for (WebElement objHeladeras : listadoHeladeras) {

           String strText = objHeladeras.getText();

           System.out.println(strText);


        }
        
    }



}
