package in.co.gorest;

import io.restassured.response.Response;
import model.GorestPojo;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class CreateNewUser extends TestBase {

//11199-tenali,11213 -geetha,17030
    @Test
    public void createNewUser(){
        GorestPojo gorestPojo = new GorestPojo();
        gorestPojo.setName("Geetha Ramakrishna");
        gorestPojo.setGender("female");
        gorestPojo.setEmail("geetha.krishn@15c.com");
        gorestPojo.setStatus("active");

        Response response =given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer 4e5353d5bc214f629cd5338c069b9d9c0feffc16a023ae6f19554a35dd64b25d")
                .body(gorestPojo)
                .post("/users");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}
