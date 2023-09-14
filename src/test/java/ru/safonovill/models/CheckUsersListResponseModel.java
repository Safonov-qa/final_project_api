package ru.safonovill.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class CheckUsersListResponseModel {
    @JsonProperty("total_pages")
    private Integer totalPages;
    @JsonProperty("per_page")
    private Integer perPage;
    private Integer page;
    private Integer total;
    private List<DataResponseModel> data;
    private SupportResponseModel support;
}

