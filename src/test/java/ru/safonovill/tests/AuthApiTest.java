package ru.safonovill.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.safonovill.models.UnsuccessfulRegisterBodyModel;
import ru.safonovill.models.UnsuccessfulRegisterResponseModel;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static ru.safonovill.specs.Specifications.*;

@Feature("API тесты для сайта Reqres.in")
@Owner("SafonovIll")
@DisplayName("Проверка авторизации")
public class AuthApiTest {

    @Test
    @DisplayName("Неуспешная регистрация")
    void unsuccessfulRegisterTest() {
        String userEmail = "sydney@fife";

        UnsuccessfulRegisterBodyModel unsuccessfulRegisterBody = new UnsuccessfulRegisterBodyModel();
        unsuccessfulRegisterBody.setEmail(userEmail);
        UnsuccessfulRegisterResponseModel unsuccessfulRegisterResponse = step("Сделать запрос на регистрацию без указания пароля", () ->
                given(requestSpec)
                        .body(unsuccessfulRegisterBody)
                        .when()
                        .post("/register")
                        .then()
                        .spec(unsuccessfulRegister400ResponseSpec)
                        .extract().as(UnsuccessfulRegisterResponseModel.class));

        step("Проверить, что в ответе текст ошибки 'Missing password'", () ->
                assertThat(unsuccessfulRegisterResponse.getError()).isEqualTo("Missing password"));
    }
}
