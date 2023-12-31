package ru.safonovill.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.safonovill.models.*;
import java.util.List;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static ru.safonovill.specs.Specifications.*;


@Feature("API тесты для сайта Reqres.in")
@Owner("SafonovIll")
@DisplayName("Проверка данных пользователя")
public class UserApiTests {

    @Test
    @DisplayName("Получение списка пользователей")
    void checkUsersListTest() {
        CheckUsersListResponseModel checkUsersListResponse = step("Сделать запрос на получение списка пользователей", () ->
                given(requestSpec)
                        .get("/users?page=2")
                        .then()
                        .spec(statusCodeIs200ResponseSpec)
                        .extract().as(CheckUsersListResponseModel.class));

        List<DataResponseModel> dataListResponse = checkUsersListResponse.getData();
        SupportResponseModel supportResponse = checkUsersListResponse.getSupport();
        step("Проверить номер страницы в ответе", () ->
                assertThat(checkUsersListResponse.getPage()).isEqualTo(2));
        step("Проверить id первого пользователя в списке", () ->
                assertThat(dataListResponse.get(0).getId()).isEqualTo(7));
        step("Проверить email первого пользователя в списке", () ->
                assertThat(dataListResponse.get(0).getEmail()).isEqualTo("michael.lawson@reqres.in"));
        step("Проверить first_name первого пользователя в списке", () ->
                assertThat(dataListResponse.get(0).getFirstName()).isEqualTo("Michael"));
        step("Проверить last_name первого пользователя в списке", () ->
                assertThat(dataListResponse.get(0).getLastName()).isEqualTo("Lawson"));
        step("Проверить аватар первого пользователя в списке", () ->
                assertThat(dataListResponse.get(0).getAvatar()).isEqualTo("https://reqres.in/img/faces/7-image.jpg"));
        step("Проверить адрес support url", () ->
                assertThat(supportResponse.getUrl()).isEqualTo("https://reqres.in/#support-heading"));
    }

    @Test
    @DisplayName("Создание пользователя")
    void createUserTest() {
        String userName = "morpheus",
                userJob = "leader";

        CreateUserBodyModel createUserBody = new CreateUserBodyModel();
        createUserBody.setName(userName);
        createUserBody.setJob(userJob);
        CreateUserResponseModel createUserResponse = step("Отправить запрос на создание пользователя", () ->
                given(requestSpec)
                        .body(createUserBody)
                        .when()
                        .post("/users")
                        .then()
                        .spec(createUser201ResponseSpec)
                        .extract().as(CreateUserResponseModel.class));

        step("Проверить имя пользователя в теле ответа", () ->
                assertThat(createUserResponse.getName()).isEqualTo(userName));
        step("Проверить работу пользователя в теле ответа", () ->
                assertThat(createUserResponse.getJob()).isEqualTo(userJob));
    }

    @Test
    @DisplayName("Обновление данных пользователя")
    void updateUserTest() {
        String userJob = "zion resident";

        UpdateUserBodyModel updateUserBody = new UpdateUserBodyModel();
        updateUserBody.setJob(userJob);
        UpdateUserResponseModel updateUserResponse = step("Отправить запрос на обновление пользователя", () ->
                given(requestSpec)
                        .body(updateUserBody)
                        .when()
                        .patch("/users/2")
                        .then()
                        .spec(updateUser200ResponseSpec)
                        .extract().as(UpdateUserResponseModel.class));

        step("Проверить работу пользователя в теле ответа", () ->
                assertThat(updateUserResponse.getJob()).isEqualTo(userJob));
    }

    @Test
    @DisplayName("Удаление пользователя")
    void deleteUserTest() {
        step("Сделать запрос на удаление пользователя и проверить статус-код ответа", () ->
                given(requestSpec)
                        .when()
                        .delete("/users/2")
                        .then()
                        .spec(statusCodeIs204ResponseSpec));
    }
}
