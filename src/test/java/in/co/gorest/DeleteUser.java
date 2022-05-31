package in.co.gorest;

import io.restassured.response.Response;
import model.GorestPojo;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteUser extends TestBase {
@Test
    public void deleteUser(){
    GorestPojo gorestPojo =new GorestPojo();

    Response response = given()
            .pathParam("id",11213)
            .when()
            .header("Content-Type", "application/json")
            .header("Authorization","Bearer 4e5353d5bc214f629cd5338c069b9d9c0feffc16a023ae6f19554a35dd64b25d")
            .body(gorestPojo)
            .delete("/users/{id}");
    response.then().statusCode(204);
}

}
