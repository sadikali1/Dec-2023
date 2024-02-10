package com.steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDef {

	int a;
	int b;
	int result;

	@Given("I have two integer number {int} and {int}")
	public void i_have_two_integer_number_and(int int1, int int2) {
		a = int1;
		b = int2;
	}

	@When("I add both numbers")
	public void i_add_both_numbers() {
		result = a + b;
	}

	@Then("I verify result is {int}")
	public void i_verify_result_is(int int1) {
		Assert.assertEquals(result, int1);
	}

}
