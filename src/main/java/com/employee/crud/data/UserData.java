
package com.employee.crud.data;





import com.employee.crud.entity.User;



import java.util.ArrayList;

import java.util.List;



public class UserData {

    public static List<User> userData() {

        List<User> userList = new ArrayList<>();

        User user0 = new User(0, "Ð¡Ã÷", 20, "ÄÐ");

        User user1 = new User(1, "Ð¡ºì", 19, "Å®");

        User user2 = new User(2, "Ð¡ÖÇ", 15, "ÄÐ");

        User user3 = new User(3, "Ð¡¸Ö", 16, "Å®");

        User user4 = new User(4, "Ð¡ÏÄ", 15, "Å®");



        userList.add(user0);

        userList.add(user1);

        userList.add(user2);

        userList.add(user3);

        userList.add(user4);



        return userList;



    }



}
