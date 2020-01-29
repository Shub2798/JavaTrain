package com.shubham.demo1;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class UserDaoService {

static int userscount=3;
private static ArrayList<User> users=new ArrayList<User>();
static
{ 
users.add(new User(1,"Adam","2701"));
users.add(new User(2,"Eve","2701"));
users.add(new User(3,"Jack","2701"));

}



public ArrayList<User> findAll(ArrayList<User> arr){

return arr;

}

public ArrayList<User> save(User user) {
users.add(user);
return users;

}

public User save_user(User user) {
if(user.getId()==0) {
user.setId(++userscount);
}
users.add(user);
return user;

}

public User findOne(int id) {
for(int i=0; i<userscount; i++) {

if(users.get(i).id==id) {
return users.get(i);

}



}
return null;




}
}

