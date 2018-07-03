package br.netshoes.steps;

import br.netshoes.Service.ApiService;
import br.netshoes.Service.UrlService;
import br.netshoes.Service.ValidaRetornoApi;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    UrlService obj = new UrlService();
    ApiService obj2 = new ApiService();
    ValidaRetornoApi obj3 = new ValidaRetornoApi();

    @Given("I have valid URL endpoint")
    public void preCondition (){           //Relaciona a frase Given com o método validaURL
        obj.validaURL();
    }

    @When("I request data by API")
    public void executionTest(){
        obj2.consultaCepApi();
    }

    @Then("the returned data is validated")
    public void validTest (){
        obj3.validaRetornoApiCep();
    }
}
