package ru.safonovill.models;


import lombok.Data;

@Data
public class DataResponseModel {
    public Integer id;
    public String email, first_name, last_name, avatar;
}