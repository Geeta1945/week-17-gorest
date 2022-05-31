package in.co.gorest;

import io.restassured.response.Response;
import model.GorestPojo;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PatchUserDetails extends TestBase {

      @Test
    public void patchUserDetails() {
        GorestPojo gorestPojo = new GorestPojo();
        gorestPojo.setName("David");
        gorestPojo.setEmail("david.parmar@gmail.com");
        gorestPojo.setStatus("active");
        gorestPojo.setGender("male");
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer 4e5353d5bc214f629cd5338c069b9d9c0feffc16a023ae6f19554a35dd64b25d")
                .pathParam("id",17030)
                .body(gorestPojo)
                .when()
                .patch("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
