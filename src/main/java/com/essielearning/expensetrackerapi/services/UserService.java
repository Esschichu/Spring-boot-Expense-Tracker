package com.essielearning.expensetrackerapi.services;

import com.essielearning.expensetrackerapi.domain.User;
import com.essielearning.expensetrackerapi.exception.EtAuthException;

public interface UserService {

    User validateuser(String email,String password) throws EtAuthException;

    User registeruser(String firstName, String LastName, String email, String password) throws EtAuthException;




}
