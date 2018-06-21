package com.techprimers.testing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzStepdefs {



    FizzBuzz fizzBuzz;
    String result;

    @Given("^Create a FizzBuzz game play$")
    public void createFizzBuzzGamePlay() throws Throwable{
       fizzBuzz = new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPalyWithNumber(int number) throws Throwable{
       result= fizzBuzz.play(number);
    }


    @Given("^The result is \"([^\"]*)\"$")
    public void theResultIsFizz(String resultString) throws Throwable{
        Assertions.assertEquals(result,resultString);
    }
}
