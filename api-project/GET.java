package Project;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GET {
    // Set base URL
    final static String ROOT_URI = "https://api.github.com";

    @Test(priority=1)
    public void addSSH()
    {
        // Create JSON request
    	String reqBody = "{"+ "\"title\": TestAPIKey,"
                + "\"key\": \"AAAAB3NzaC1yc2EAAAADAQABAAABAQCS33IRT2R8Pt+/AeDn1ByDTZjYZtSdPjTkaT7bSkevF65"
                + "nrHyBwjwLoU43NDweBzuAX2JJpwRP1Wcn0K9UzMZy6tXam8b8fnGaFFigkx7k9m0Yyb1iJAqZvTYM0RnwojJ4UmpYcR6"
                + "A9Ezvbl6SBe+3P3ZVTsiJksCdZdwell84VKFVxugkaI6K+XigYzXA7IiG/YkyQpLqXQYeG/mA5YmS3eYrIjWx50ZiKsk0r7cpwx9+Y055Jhu"
                + "KghRoXa0ogYUVAPSZHnUew44bw3E5El3c4jT6TZgSoMASpvwzIT82Kr1nIWpMqwGKudNURMJgyMMCyqbMulOneg/bbzDbz8cl \"}";
}
    
   
    @Test(priority=2)
    public void postInfo() throws InterruptedException {
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .when().pathParam("addURL", "/user/keys") // Set path parameter
            .get(ROOT_URI + "/{addURL}"); // Send post request
        
      /*  
       // response.then().body("title", equalTo(TestAPIKey));
        response.then().body("key", equalTo("\\\"AAAAB3NzaC1yc2EAAAADAQABAAABAQCS33IRT2R8Pt+/AeDn1ByDTZjYZtSdPjTkaT7bSkevF65\"\r\n" + 
        		"                + \"nrHyBwjwLoU43NDweBzuAX2JJpwRP1Wcn0K9UzMZy6tXam8b8fnGaFFigkx7k9m0Yyb1iJAqZvTYM0RnwojJ4UmpYcR6\"\r\n" + 
        		"                + \"A9Ezvbl6SBe+3P3ZVTsiJksCdZdwell84VKFVxugkaI6K+XigYzXA7IiG/YkyQpLqXQYeG/mA5YmS3eYrIjWx50ZiKsk0r7cpwx9+Y055Jhu\"\r\n" + 
        		"                + \"KghRoXa0ogYUVAPSZHnUew44bw3E5El3c4jT6TZgSoMASpvwzIT82Kr1nIWpMqwGKudNURMJgyMMCyqbMulOneg/bbzDbz8cl \\"));
        */
        
        Thread.sleep(5000);
        
        response.then().body("code", equalTo(200));

       
        
}
}