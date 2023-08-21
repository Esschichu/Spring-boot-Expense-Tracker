package com.essielearning.expensetrackerapi.Repositories;

import com.essielearning.expensetrackerapi.domain.category;
import com.essielearning.expensetrackerapi.exception.EtBadRequestException;
import jdk.jfr.Category;

import java.util.List;
import java.util.ListIterator;

public interface CategoryRepository {
    List<Category> findAll(Integer userId) ;

    Category findById(Integer userId,Integer categoryId) ;

    Integer create(Integer userId,String title,String description) throws EtBadRequestException;
    void update(Integer userId, Integer categoryId, category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
