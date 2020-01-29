package com.shubham.demo1;
import java.util.ArrayList;

public class User {
int id;
String name;
String birthdate;

User(int id, String name,String birthdate){
this.id=id;
this.name=name;
this.birthdate=birthdate;
}

public ArrayList add_Id(ArrayList<User> arr,int index,int id) {
User temp=arr.get(index);
temp.id=1;
arr.add(index,temp);

return arr;

}

public ArrayList add_name(ArrayList<User> arr,int index, String name) {
User temp=arr.get(index);
temp.name=name;
arr.add(index,temp);

return arr;

}

public ArrayList add_date(ArrayList<User> arr,int index, String date) {
User temp=arr.get(index);
temp.birthdate=date;
arr.add(index,temp);

return arr;
}

public ArrayList add_user(ArrayList<User> arr,int index,int id, String name,String date) {
User temp=arr.get(index);
temp.id=id;
temp.name=name;
temp.birthdate=date;

return arr;

}

public int getId() {
   return id;
 }

public void setId(int id_num) {
   this.id = id_num;
 }

}

