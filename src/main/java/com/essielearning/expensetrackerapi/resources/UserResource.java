package com.essielearning.expensetrackerapi.resources;

import com.essielearning.expensetrackerapi.domain.User;
import com.essielearning.expensetrackerapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> loginUser(@RequestBody Map<String,Object>userMap){
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        User user = userService.validateuser(email,password);
        HashMap<String, String> map = new HashMap<>();
        map.put("message:","Successful LOgin");
        return new ResponseEntity<>(map,HttpStatus.OK);

    }

    @PostMapping("/register")
    public ResponseEntity<Map<String,String>> registerUser(@RequestBody Map<String,Object> userMap){
        String firstName = (String) userMap.get("firstName");
        String lastName = (String) userMap.get("lastName");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        User user = userService.registeruser(firstName,lastName,email,password);
        HashMap<String, String> map = new HashMap<>();
        map.put("message:","Registration is a success");
        return new ResponseEntity<>(map, HttpStatus.OK);
//        return firstName +" , " + lastName + " ," + email + "," + password +",";

    }
}
