package com.blacknwhite.ecommerce.service.impl;

import com.blacknwhite.ecommerce.dto.request.PaginationRequestDto;
import com.blacknwhite.ecommerce.repository.ProductRepository;
import com.blacknwhite.ecommerce.service.PaginationService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaginationServiceImpl implements PaginationService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void getProducts(PaginationRequestDto paginationRequestDto, HttpServletResponse response) {

    }
}
