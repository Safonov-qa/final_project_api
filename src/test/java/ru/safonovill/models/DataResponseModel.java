package ru.safonovill.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataResponseModel {
    private Integer id;
    private String email;
    private String avatar;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
}