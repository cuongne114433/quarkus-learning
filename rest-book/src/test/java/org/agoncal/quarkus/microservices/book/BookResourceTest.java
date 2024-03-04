package org.agoncal.quarkus.microservices.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class BookResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/C:/devtools/git-2.43.0/api/books")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}