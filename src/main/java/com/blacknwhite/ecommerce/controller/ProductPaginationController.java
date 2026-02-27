package com.blacknwhite.ecommerce.controller;


import com.blacknwhite.ecommerce.dto.request.PaginationRequestDto;
import com.blacknwhite.ecommerce.service.PaginationService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-table")
public class ProductPaginationController {

    @Autowired
    PaginationService paginationService;

    @PostMapping("/paginated")
    public void getProducts(@RequestParam PaginationRequestDto paginationRequestDto, HttpServletResponse response){
        paginationService.getProducts(paginationRequestDto, response);
    }
}
