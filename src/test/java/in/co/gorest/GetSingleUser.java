package in.co.gorest;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetSingleUser extends TestBase {

    @Test
    public void getSingleUserInfo(){

        Response response = given()
                .when()
                .get("/users/2362");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
