import com.assignment.config.AppConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class PetTest extends AppConfig {
    ClassLoader classLoader = getClass().getClassLoader();
    File createPetRequestJson = new File(classLoader.getResource("pets.json").getFile());
    File UpdatePetRequestJson = new File(classLoader.getResource("pet_put_update.json").getFile());
    static String petsEndPoint = baseURL + "/pet";


    @AfterAll
    public static void deletePet() {
        given()
                .when()
                .delete(petsEndPoint + "/10")
                .then()
                .and()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void verifyCreateAndGet() {
//Create
        given()
                .contentType("application/json")
                .body(createPetRequestJson)
                .when()
                .post(petsEndPoint)
                .then()
                .statusCode(is(200))
                .body("id", is(10));
//getById
        given()
                .when()
                .get(petsEndPoint + "/10")
                .then()
                .statusCode(200)
                .and()
                .body("id", is(10))
                .body("name", is("doggie"))
                .body("category.id", is(1))
                .body("category.name", is("Dogs"))
                .body("photoUrls[0]", is("string"))
                .body("tags[0].id", is(0))
                .body("tags[0].name", is("string"))
                .body("status", is("available"));
//findByStatus
        given()
                .when()
                .param("status", "available")
                .get(petsEndPoint + "/findByStatus")
                .then()
                .statusCode(200)
                .and()
                .body("id[6]", is(10))
                .body("name[6]", is("doggie"))
                .body("category[6].id", is(1))
                .body("category[6].name", is("Dogs"))
                .body("photoUrls[6][0]", is("string"))
                .body("tags[6][0].id", is(0))
                .body("tags[6][0].name", is("string"))
                .body("status[6]", is("available"));
        //findByStatus
        given()
                .when()
                .param("tags", "string")
                .get(petsEndPoint + "/findByTags")
                .then()
                .statusCode(200)
                .and()
                .body("name[0]", is("doggie"));

//update name
        given()
                .contentType("application/json")
                .body(UpdatePetRequestJson)
                .when()
                .put(petsEndPoint)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("name", equalTo("CAT"));

    }
}
