package ru.safonovill.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.RestAssured.with;


import static org.hamcrest.Matchers.notNullValue;
import static ru.safonovill.helpers.CustomAllureListener.withCustomTemplates;

    public class Specifications {
        public static RequestSpecification requestSpec = with()
                .filter(withCustomTemplates())
                .log().all()
                .contentType(JSON)
                .baseUri("https://reqres.in")
                .basePath("/api");

        public static ResponseSpecification statusCodeIs200ResponseSpec = new ResponseSpecBuilder()
                .log(STATUS)
                .log(BODY)
                .expectStatusCode(200)
                .build();

        public static ResponseSpecification createUserResponseSpec = new ResponseSpecBuilder()
                .log(STATUS)
                .log(BODY)
                .expectStatusCode(201)
                .expectBody("id", notNullValue())
                .expectBody("createdAt", notNullValue())
                .build();

        public static ResponseSpecification updateUserResponseSpec = new ResponseSpecBuilder()
                .log(STATUS)
                .log(BODY)
                .expectStatusCode(200)
                .expectBody("updatedAt", notNullValue())
                .build();

        public static ResponseSpecification unsuccessfulRegisterResponseSpec = new ResponseSpecBuilder()
                .log(STATUS)
                .log(BODY)
                .expectStatusCode(400)
                .expectBody("error", notNullValue())
                .build();

        public static ResponseSpecification statusCodeIs204ResponseSpec = new ResponseSpecBuilder()
                .log(STATUS)
                .expectStatusCode(204)
                .build();
    }

