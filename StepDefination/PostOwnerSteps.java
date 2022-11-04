package StepDefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostOwnerSteps {

	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("User want to pass the data of other into database")
	public void user_want_to_pass_the_data_of_other_into_database() {
		JSONObject obj = new JSONObject();
		   
		   obj.put("address", "Jalgaon");
			obj.put("comapnyName", "CapG");
			obj.put("department", "IT");
			obj.put("email", "prajakta232gmail.com");
			obj.put("name", "Prajakta");
			obj.put("password", "Prajakta@23");
			obj.put("phone", "7825047185");
			
			 req = RestAssured.given()
					 .body(obj)
					 .contentType(ContentType.JSON);
	}

	@When("User want to pass the data of others by using URI {string}")
	public void user_want_to_pass_the_data_of_others_by_using_uri(String url) {
		  res = req.post(url);
	}

	@Then("User want to validate data by  status line {string}")
	public void user_want_to_validate_data_by_status_line(String string) {
		 validate = res.then();
	}

	@Then("User want to validate status code  {int}")
	public void user_want_to_validate_status_code(Integer int1) {
	    
	}
	
}
