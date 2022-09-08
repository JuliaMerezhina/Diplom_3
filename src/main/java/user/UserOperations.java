package user;

import endpoints.Endpoints;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class UserOperations {


    public Map<String, String> registration() {

        User user = User.getRandomUser();

        Map<String, String> inputDataUser = new HashMap<>();
        inputDataUser.put("email", user.getEmail());
        inputDataUser.put("password", user.getPassword());
        inputDataUser.put("name", user.getName());

        UserRegistrationProfile userResponse = given()
                .spec(Endpoints.getBaseSpec())
                .and()
                .body(inputDataUser)
                .when()
                .post("auth/register")
                .body()
                .as(UserRegistrationProfile.class);

        Map<String, String> responseDataUser = new HashMap<>();
        if (userResponse != null) {
            responseDataUser.put("email", userResponse.getUser().getEmail());
            responseDataUser.put("name", userResponse.getUser().getName());
            responseDataUser.put("password", user.getPassword());
            responseDataUser.put("accessToken", userResponse.getAccessToken().substring(7));
            responseDataUser.put("refreshToken", userResponse.getRefreshToken());
        }
        return responseDataUser;
    }

    public void remove() {
        given()
                .spec(Endpoints.getBaseSpec())
                .when()
                .delete("auth/user");
    }

    public void login(UserAuthorization userAuthorization) {
        UserRegistrationProfile userResponse = given()
                .spec(Endpoints.getBaseSpec())
                .body(userAuthorization.getUserAuthorization(User.getCorrect()))
                .when()
                .post("/auth/login")
                .then()
                .extract()
                .as(UserRegistrationProfile.class);
        userResponse.setAccessToken(userResponse.getAccessToken().substring(7));
    }
}