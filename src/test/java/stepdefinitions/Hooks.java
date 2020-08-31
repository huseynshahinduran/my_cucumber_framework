package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //@Before TestNg'deki @BeforeMethod gibi calisir.
    //Her scenario'dan once calisir
    @Before(order = 1)
    public void setUp(){
        System.out.println("Hooks Class- Setup Method");
    }
    //Her ozel(spesific) scenario'dan once calisir
    @Before(value = "@iphone",order = 2)
    public void searchIphone(){
        System.out.println("Hooks Class- Iphone method");
    }

    //Her scenario'dan sonra calisir
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks Class - tearDown Method");

        //screenshot almak icin
        final byte[] screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        //Scenario fail olursa image ekleyin
        if (scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();
    }




}
