package aut.testcreation.testcases.grupo1;

import aut.testcreation.base.TestBase;
import org.junit.jupiter.api.Test;
import aut.testcreation.pages.grupo1.HomePage;
import aut.testcreation.pages.grupo1.HotelesPage;

public class TestsHoteles extends TestBase {
    HomePage homePage;
    HotelesPage hotelespage;

    @Test
    public void CP001_BusquedaHotelesOK() throws InterruptedException {
        homePage=new HomePage(super.driver);
        hotelespage=new HotelesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickHoteles();

        hotelespage.busquedaHotelPorDestinoYFechaPorCalendario("Córdoba, España");

    }

    @Test
    public void CP001_BusquedaHotelesCualquierDestinoOK() throws InterruptedException {
        homePage=new HomePage(super.driver);
        hotelespage=new HotelesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickHoteles();
        hotelespage.busquedaHotelPorCualquierDestinoYFechaFlexible();

    }



}
