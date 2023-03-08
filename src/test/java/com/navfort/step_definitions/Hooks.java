package com.navfort.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to each scenario each step
 */

import com.navfort.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io.cucumber.java not from junit
   // @Before(order = 1)
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }
   // @Before(value = "@Login",order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenario with @login tag");
    }
    //@Before(value = "@db",order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenario with @db tag");
    }


    @After
    public void teardownScenario(Scenario scenario){
        // scenario.isFailed()---> if scenario fails this method will return TRUE boolean value
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        //BrowserUtils.sleep(3);
        Driver.closeDriver();

       // System.out.println("====Closing browser after using cucumber @After");
      //  System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    //@BeforeStep
    public void setupStep(){
        System.out.println("---------------------applying setup using @BeforeStep");

    }
   // @AfterStep
    public void afterStep(){
        System.out.println("----------------------->applying tearDown using @AfterStep");
    }






}
