package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.When;
import transformer.ExcelDataToDataTable;

public class ExcelStepDefinition {
	@When("^user login with data from excel at \"(.*?)\"$")
	public void user_login_with_username_and_password_from_excel_at(@Transform(ExcelDataToDataTable.class)DataTable table) throws Throwable {
	
	  //  System.out.println(table.toString());
	   List<Map<String, String>> list = table.asMaps(String.class, String.class);
	   System.out.println(list.get(0).get("roll"));
	   System.out.println(list.get(1).get("roll"));
	}
	
	

}
