package com.fravega.Tests;


import com.fravega.Pages.BasePage;
import com.fravega.Pages.busquedaPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BusquedaTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        iniciarBrowser();

    }
    @Test
    public void heladeraTest() throws InterruptedException {
        busquedaPage busquedaPage = new busquedaPage(driver);
        busquedaPage.heladera();
    }

    @AfterMethod
    public void close() throws InterruptedException {
        cerrarBrowser();
    }



}
