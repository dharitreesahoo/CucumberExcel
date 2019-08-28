package stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import transformer.TransformData;

public class StepDefinition {
	@Given("^user should be logged in username and password$")
	public void user_should_be_logged_in_username_and_password(DataTable users) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    List<List<String>> user = users.raw();
	    for(List<String> str:user)
	    {
	    	for(String str1:str)
	    	{
	    		System.out.println("Data is ===="+str1);
	    	}
	    }
	}
	@Given("^should be present in wall as \"(.*?)\"$")
	public void should_be_present_in_wall_as(@Transform(TransformData.class)String user) throws Throwable {
	 System.out.println(user);
	}

}
