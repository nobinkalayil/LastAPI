package com.MyAPI;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RegressionTestSuits {
@Test
    public void getUserlist(){
    given().when().get("http://localhost:3000/posts/1").then().body("author", is("Nibin")).statusCode(200);

   /* Response response = given().when().get("http://localhost:3000/posts/2");
  //List<Integer> ids = response.then().extract().path("id");
 // List<String> names= response.then().extract().path("author");
   // System.out.println(names);
    response.prettyPrint();
    response.then().body("id",is(2)).body("author", is("Bibin")).statusCode(200);*/
    }

    public static void getMethod(String postnumber){
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/posts/%s",postnumber)).then().body("author", is("Nibin"));}

    public static void postMethod(){

    Response response = null;
    JsonObject payload = new JsonObject();
    payload.addProperty("id", "6");
    payload.addProperty("body", "music profile");
    payload.addProperty("postId", "6");
    given().contentType(ContentType.JSON).body(payload).when().post("http://localhost:3000/comments");


    }



}
