package com.shubham.demo1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;


@RestController
public class UserResource {

@Autowired
UserDaoService obj=new UserDaoService();

@GetMapping("/Users")
public ArrayList<User> retreiveAllUser(ArrayList<User> arr){
return obj.findAll(arr);

}

@GetMapping("/Users/{id}")
public User retrieveUser(@PathVariable int id) {
return obj.findOne(id);

}


}
