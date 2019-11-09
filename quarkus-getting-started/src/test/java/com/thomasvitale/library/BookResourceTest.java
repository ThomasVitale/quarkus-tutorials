package com.thomasvitale.library;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BookResourceTest {

    @Test
    void testGetBooks() {
        given()
            .when().get("/books")
            .then()
                .statusCode(200)
                .body("id", hasItems(1, 2, 3));
    }

    @Test
    void testGetBookById() {
        given()
          .pathParam("id", 1)
          .when().get("/books/{id}")
          .then()
             .statusCode(200)
             .body("id", is(1));
    }
}