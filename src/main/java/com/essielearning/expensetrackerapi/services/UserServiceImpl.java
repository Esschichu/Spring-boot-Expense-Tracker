package com.essielearning.expensetrackerapi.services;

import com.essielearning.expensetrackerapi.Repositories.UserRepository;
import com.essielearning.expensetrackerapi.domain.User;
import com.essielearning.expensetrackerapi.exception.EtAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public User validateuser(String email, String password) throws EtAuthException {
       if (email !=null) email= email.toLowerCase();
       return userRepository.findbyEmailAndPassword(email, password);
    }

    @Override
    public User registeruser(String firstName, String lastName, String email, String password) throws EtAuthException {
//        create pattern to modify email format

        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if (email !=null) {
            email = email.toLowerCase();
            if (!pattern.matcher(email).matches()) {
                throw new RuntimeException("Invalid email format");
            }
        }else {
              throw new RuntimeException("Email cant be null");}

//        check if email is in use
        Integer count = userRepository.getCountByEmail(email);
        if (count > 0) {
            throw new EtAuthException("Email in Use");
        }
//        create user and return user
        Integer userId = userRepository.Create(firstName, lastName,email,password);
        return userRepository.findById(userId);




    }
}
