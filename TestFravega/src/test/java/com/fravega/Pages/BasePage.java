package com.fravega.Pages;

import com.fravega.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public WebDriver driver;

    public void iniciarBrowser(){
        System.setProperty("webdriver.chrome.driver", Constants.chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.fravega.com/");

    }

    public void cerrarBrowser() throws InterruptedException {
        Thread.sleep(8000);
        driver.close();

    }





}
