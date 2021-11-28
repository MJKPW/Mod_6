package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forum {
    private final List<ForumUser> userList;

    public Forum(){
        userList = new ArrayList<>();
    }

    private void id(int i){
        Random rnd = new Random();
        while(true){
            boolean flag = true;
            int rndId = rnd.nextInt(10000);
            for(ForumUser user : userList){
                if(user.getId() == rndId){
                    flag = false;
                    break;
                }
            }
            if(flag){
                userList.get(i).setId(rndId);
                break;
            }
        }
    }

    private void posts(int i){
        Random rnd = new Random();
        userList.get(i).setPostCount(rnd.nextInt(500));
    }

    private void names(int i){
        Random rnd = new Random();
        StringBuilder name = new StringBuilder();
        final int nameLength = 5 + rnd.nextInt(10);
        final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
        for(int j = 0; j != nameLength; ++j)
            name.append(lexicon.charAt(rnd.nextInt(lexicon.length())));
        userList.get(i).setName(name.toString());
    }

    private void sex(int i){
        Random rnd = new Random();
        double number = rnd.nextDouble();
        char result = (number>0.5)? 'M': 'F';
        userList.get(i).setSex(result);
    }

    private void birthDate(int i){
        Random rnd = new Random();
        int year = 1950 + rnd.nextInt(60);
        int month = 1 + rnd.nextInt(12);
        int day;
        if(month == 2)
            day = 1 + rnd.nextInt(27);
        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            day = 1 + rnd.nextInt(30);
        else
            day = 1 + rnd.nextInt(29);
        LocalDate date = LocalDate.of(year, month, day);
        userList.get(i).setBirthDate(date);
    }

    public void createForumData(int userCount){
        for(int i = 0; i < userCount; ++i){
            userList.add(new ForumUser());
            id(i);
            posts(i);
            names(i);
            sex(i);
            birthDate(i);
        }
    }

    @Override
    public String toString(){
        StringBuilder content = new StringBuilder();
        for(int i = 0; i != userList.size(); ++i){
            String current = "id " + userList.get(i).getId() + "\n";
            content.append(current);
            current = "Name " + userList.get(i).getName() + "\n";
            content.append(current);
            current = "Sex " + userList.get(i).getSex() + "\n";
            content.append(current);
            current = "Birth Date " + userList.get(i).getBirthDate().toString() + "\n";
            content.append(current);
            current = "Post Count " + userList.get(i).getPostCount() + "\n";
            content.append(current);
            content.append("===================== \n");
        }
        return content.toString();
    }

    public List<ForumUser> getUserList(){
        return userList;
    }
}
