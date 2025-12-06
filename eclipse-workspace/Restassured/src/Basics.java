import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class Basics {

	public static void main(String[] args) {
		String response = 	given()
				.formParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.formParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
				.formParams("grant_type","client_credentials")
				.formParams("scope","trust")
				.when().log().all()
				.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
			
			System.out.println(response);
	}

}
