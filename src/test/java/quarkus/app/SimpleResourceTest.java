package quarkus.app;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class SimpleResourceTest {
    @Test
    public void sayHello() {
        given().when().get("/hello").then().contentType(ContentType.JSON);
    }
}
