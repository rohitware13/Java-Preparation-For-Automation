
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredCall {
	
	public static void main(String[] args) {
		
		
		Response response = given().
								param("page","2").
							when().
								get("https://reqres.in/api/user");
		
		
		String response_string = response.jsonPath().getString("data[1].name");	
		System.out.println(response_string);
		
		JsonPath json = new JsonPath(response_string);
		
		System.out.println(json.getString("data[1].name"));
		
		
					
		RequestSpecification reqspec =RestAssured.given().baseUri("https://reqres.in/").basePath("api/user");
		
		reqspec.given().param("page", "2").when().then();
		
		List<Object> sections = new ArrayList <Object>();
		
		sections.add(1);
		sections.add("test");

		System.out.println(sections);
	}

}
