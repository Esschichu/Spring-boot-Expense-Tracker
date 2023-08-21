package com.essielearning.expensetrackerapi.resources;

import com.essielearning.expensetrackerapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryResource {

    @Autowired
    CategoryService categoryService;


}
