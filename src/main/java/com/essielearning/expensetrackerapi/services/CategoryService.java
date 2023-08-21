package com.essielearning.expensetrackerapi.services;

import com.essielearning.expensetrackerapi.exception.EtBadRequestException;
import com.essielearning.expensetrackerapi.exception.EtResourceNotFoundException;
import jdk.jfr.Category;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);
    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
