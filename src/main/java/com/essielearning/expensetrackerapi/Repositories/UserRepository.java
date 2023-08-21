package com.essielearning.expensetrackerapi.Repositories;

import com.essielearning.expensetrackerapi.domain.User;
import com.essielearning.expensetrackerapi.exception.EtAuthException;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    Integer Create(String firstName, String lastName, String email,String password) throws EtAuthException;
    User findbyEmailAndPassword(String email, String password) throws EtAuthException;
    Integer getCountByEmail(String email);
    User findById(Integer userId);

}
