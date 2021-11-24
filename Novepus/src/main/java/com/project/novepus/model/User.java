package com.project.novepus.model;

import com.project.novepus.controller.DBController;

import java.sql.Date;
import java.util.ArrayList;

public class User {
    private final int id;
    private final String username;
    private final Date create_time;
    private Date last_exit_time;
    private final boolean isOnline;
    private final String email;

    private final int follow_user_number;
    private final int befollowed_user_num;
    private final int post_num;
    private final int be_liked_num;
    private final ArrayList<Integer> label_id = new ArrayList<>();

    public User(int id, String username, Date create_time, Date last_exit_time, boolean isOnline, String email) {
        this.id = id;
        this.username = username;
        this.create_time = create_time;
        this.last_exit_time = last_exit_time;
        this.isOnline = isOnline;
        this.email = email;

        int[] arr = DBController.updateUserMem(id);
        follow_user_number = arr[0];
        befollowed_user_num = arr[1];
        post_num = arr[2];
        be_liked_num = arr[3];

        int[] label = DBController.getInterest(id);
        for (int j : label) {
            this.label_id.add(j);
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public Date getLast_exit_time() {
        return last_exit_time;
    }

    public void setLast_exit_time(Date last_exit_time) {
        this.last_exit_time = last_exit_time;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public String getEmail() {
        return email;
    }

    public int getFollow_user_number() {
        return follow_user_number;
    }

    public int getBefollowed_user_num() {
        return befollowed_user_num;
    }

    public int getPost_num() {
        return post_num;
    }

    public int getBe_liked_num() {
        return be_liked_num;
    }

    public ArrayList<Integer> getLabel_id(){
        return label_id;
    }

}
