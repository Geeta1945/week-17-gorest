package in.co.gorest;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetListOfAllUsers extends TestBase {

    @Test
    public void getListOfUsers(){
        Response response = given()
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}
