package com.blacknwhite.ecommerce.dto.request;

import lombok.Data;

import java.util.Map;

@Data
public class PaginationRequestDto {

    public int pageSize;
    public int pageNumber;
    public Map<String,String> searchCriteria;

}
