import com.assignment.config.AppConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class OrderStoresTest extends AppConfig {
    ClassLoader classLoader = getClass().getClassLoader();
    File storesOrderFile = new File(classLoader.getResource("storeOrder.json").getFile());

    static String storeOrderEndpoint = baseURL + "/store/order";
    static String inventoryEndpoint = baseURL + "/store/inventory";


    @AfterAll
    public static void deleteStores() {
        given()
                .when()
                .delete(storeOrderEndpoint + "/10")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void createAndGetOrderFromStore() {
//Create Order
        given()
                .contentType("application/json")
                .body(storesOrderFile)
                .when()
                .post(storeOrderEndpoint)
                .then()
                .assertThat()
                .statusCode(200);
//Get Order By Id
        given()
                .when()
                .get(storeOrderEndpoint + "/10")
                .then()
                .assertThat()
                .statusCode(200)
                .body("id", is(10))
                .body("petId", is(198772))
                .body("quantity", is(7))
                .body("status", is("approved"))
                .body("complete", is(true));

        //Get Inventory
        given()
                .when()
                .get(inventoryEndpoint)
                .then()
                .assertThat()
                .statusCode(200);
    }
}
