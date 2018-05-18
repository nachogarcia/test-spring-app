package com.Nacho.springapp.acceptance;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.Test;

public class HelloWorldFeature extends IntegrationTest {
    @Test
    public void shouldSayHelloWorld() {
        RestAssured.given()
                .when()
                .get("helloWorld")
                .then()
                .statusCode(200)
                .body(Matchers.equalTo("Hello Nacho!"));
    }
}
