package MyFirst;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import files.Payload;

public class Try {
	
	public static void main(String[] args)
	{
		given().baseUri("https://rahulshettyacademy.com").log().all().body(Payload.payload()).
		when().post("maps/api/place/add/json").
		then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"));
	}

}
