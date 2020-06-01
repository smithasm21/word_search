package com.example.demo;

import io.restassured.RestAssured;
import org.springframework.http.HttpStatus;

public class WordSearchTests {

    public static void main(String[] args) {
        String userName = "optus";
        String password = "candidate";


        RestAssured.given().request().auth().basic(userName, password).when()
                .get("http://localhost:8080/counter-api/paragraph").then()
                .assertThat().statusCode(HttpStatus.OK.value());


    }
}

