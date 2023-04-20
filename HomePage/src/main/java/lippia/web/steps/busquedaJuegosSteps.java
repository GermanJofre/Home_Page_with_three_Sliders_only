package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ProyectoBasicoServices;

public class ProyectoBasicoSteps extends PageSteps {

    @Given("The client is in the main page")
    public void mainpage() {
        ProyectoBasicoServices.navegadorWeb();
    }

    @When("The client do want click on shop menu")
    public void shopmenu() {
        ProyectoBasicoServices.busqueda();
    }

    @And("The client want back so he click on home menu button")
    public void homemenu() {
        ProyectoBasicoServices.busqueda();
    }

    @Then("The client must watch only three sliders")
    public void result() {
        ProyectoBasicoServices.resultados();
    }

}
