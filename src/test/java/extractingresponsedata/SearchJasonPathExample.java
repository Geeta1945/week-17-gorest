package extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SearchJasonPathExample {
    static ValidatableResponse response;

    @BeforeClass
    public static void loadIt() {
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2";
        response = given()
                .when()
                .get("/users")
                .then().statusCode(200);
    }
    //1.Total records are 20
    @Test
    public void test1(){
       ArrayList total_Ids = response.extract().path("id");
       int i=0;
       do {
           i++;
       }while (i< total_Ids.size());

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The total records are: "+i);
        System.out.println("------------------End of Test---------------------------");

    }
   /*

    List<String> idemail=response.extract().path("findAll{it.id==2353}.email");
        System.out.println("id has email : "+idemail);
-----------------------------
    Lalit Gorasiya9:18 PM
    List<HashMap<String,?>> status = response.extract().path("findAll{it.status == 'active'}.id");
        System.out.println("All ID has status : "+status);

    List<String> gender=response.extract().path("findAll{it.id==2353}.gender");
        System.out.println("id  has gender : "+gender);

    List<String> gender1=response.extract().path("findAll{it.id==2348}.gender");
        System.out.println("id  has gender : "+gender1);
        System.out.println("------------------End of Test----*/

    @Test
    public void test2(){
       ArrayList name=response.extract().path("findAll{it.id==2353}.name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The name of person with id 2353 is : "+name);
        System.out.println("------------------End of Test---------------------------");

    }
    @Test
    public void test3(){
        ArrayList email =response.extract().path("findAll{it.id==2341}.email");


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The email of person with id 2341 is: "+email);
        System.out.println("------------------End of Test---------------------------");

    }
    @Test
    public void test4(){
        ArrayList status = response.extract().path("findAll{it.status=='active'}.id");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("All Ids with active status are: "+status);
        System.out.println("------------------End of Test---------------------------");

    }
    @Test
    public void test5(){
        ArrayList gender = response.extract().path("findAll{it.id==2332}.gender");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The gender of id 2332 is : "+gender);
        System.out.println("------------------End of Test---------------------------");

    }
    @Test
    public void test6(){
        ArrayList gender = response.extract().path("findAll{it.id==2337}.gender");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The gender of id 2337 is: "+gender);
        System.out.println("------------------End of Test---------------------------");

    }



}
