package ru.safonovill.models;

import lombok.Data;

@Data
public class UpdateUserResponseModel {
    String name, job, updatedAt;
}