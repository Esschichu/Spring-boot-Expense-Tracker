package com.essielearning.expensetrackerapi.Repositories;

import com.essielearning.expensetrackerapi.domain.category;
import com.essielearning.expensetrackerapi.exception.EtBadRequestException;
import jdk.jfr.Category;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository{
    @Override
    public List<Category> findAll(Integer userId) {
        return null;
    }

    @Override
    public Category findById(Integer userId, Integer categoryId) {
        return null;
    }

    @Override
    public Integer create(Integer userId, String title, String description) throws EtBadRequestException {
        return null;
    }

    @Override
    public void update(Integer userId, Integer categoryId, category category) throws EtBadRequestException {

    }

    @Override
    public void removeById(Integer userId, Integer categoryId) {

    }
}
