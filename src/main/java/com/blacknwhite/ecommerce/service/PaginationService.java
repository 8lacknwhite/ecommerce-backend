package com.blacknwhite.ecommerce.service;

import com.blacknwhite.ecommerce.dto.request.PaginationRequestDto;
import jakarta.servlet.http.HttpServletResponse;

public interface PaginationService {

    void getProducts(PaginationRequestDto paginationRequestDto, HttpServletResponse response);
}
