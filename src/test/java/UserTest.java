import com.assignment.config.AppConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

public class UserTest extends AppConfig {
    ClassLoader classLoader = getClass().getClassLoader();
    File userFile = new File(classLoader.getResource("user.json").getFile());
    File updateUserFile = new File(classLoader.getResource("user_update.json").getFile());

    static String usersEndpoint = baseURL + "/user";


    @AfterAll
    public static void deleteUser() {
        given()
                .when()
                .delete(usersEndpoint + "/theUser")
                .then()
                .assertThat()
                .statusCode(200);
    }


    @Test
    public void createAndGetUser() {
//create User
        given()
                .contentType("application/json")
                .body(userFile)
                .when()
                .post(usersEndpoint)
                .then()
                .assertThat()
                .statusCode(200);

// Get USer By Username
        given()
                .when()
                .get(usersEndpoint + "/theUser")
                .then()
                .assertThat()
                .statusCode(200)
                .body("firstName", is("John"))
                .body("lastName", is("James"))
                .body("email", is("john@email.com"))
                .body("password", is("12345"))
                .body("phone", is("12345"))
                .body("userStatus", is(1));

        //update User
        given()
                .contentType("application/json")
                .body(updateUserFile)
                .when()
                .post(usersEndpoint)
                .then()
                .assertThat()
                .statusCode(200);

        given()
                .when()
                .get(usersEndpoint + "/theUser")
                .then()
                .assertThat()
                .statusCode(200)
                .body("firstName", is("UpdatedJohn"));


    }

    @Test
    public void loginAndLogoutUser() {
        given()
                .when()
                .param("username", "theUser")
                .param("password", "12345")
                .get(usersEndpoint + "/login")
                .then()
                .statusCode(200)
                .body(containsString("Logged in user session"));

        given()
                .when()
                .get(usersEndpoint + "/logout")
                .then()
                .statusCode(200)
                .body(containsString("User logged out"));
    }

}
