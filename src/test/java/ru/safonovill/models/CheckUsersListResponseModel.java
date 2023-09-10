package ru.safonovill.models;

import lombok.Data;

import java.util.List;

@Data
public class CheckUsersListResponseModel {
    Integer page, per_page, total, total_pages;

    public List<DataResponseModel> data;

    public SupportResponseModel support;
}

