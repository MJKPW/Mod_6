package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        forum.createForumData(100);
        System.out.println(forum);


        Map<Integer, ForumUser> map = forum.getUserList().stream()
                .filter(user->user.getSex() == 'M')
                .filter(user->user.getBirthDate().isAfter(LocalDate.parse("2001-11-28")))
                .filter(user->user.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user->user));

        System.out.println("\n\n");

        for(int id : map.keySet()){
            System.out.println("id: " + map.get(id).getId());
            System.out.println("Name: " + map.get(id).getName());
            System.out.println("Sex: " + map.get(id).getSex());
            System.out.println("Birth Date: " + map.get(id).getBirthDate());
            System.out.println("Post Count: " + map.get(id).getPostCount());
            System.out.println("===================");
        }
    }
}