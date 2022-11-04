package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByIdSteps {

	Response res;
	ValidatableResponse validate;
	
	@When("User want to fetch the data from database by using id {string}")
	public void user_want_to_fetch_the_data_from_database_by_using_id(String url) {
	   res = RestAssured.get(url);
	}

	@Then("User want to verify the statusline {string}")
	public void user_want_to_verify_the_statusline(String string) {
		 validate = res.then();
	}

	@Then("User want to verify the status-code {int}")
	public void user_want_to_verify_the_status_code(Integer code) {
	    validate.assertThat().statusCode(code)
	    .log().all();
	}

	
}
