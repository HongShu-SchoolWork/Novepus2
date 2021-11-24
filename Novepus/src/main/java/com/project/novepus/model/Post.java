package com.project.novepus.model;


import com.project.novepus.controller.DBController;

import java.sql.Date;
import java.util.ArrayList;

public class Post {
    private final int id;
    private final int create_user_id;
    private final Date create_time;
    private final String content;
    private final int isdelete;
    private final ArrayList<Integer> lable_id = new ArrayList<>();

    public Post(int id, int create_user_id, Date create_time, String content, boolean isdelete) {
        this.id = id;
        this.create_user_id = create_user_id;
        this.create_time = create_time;
        this.content = content;
        this.isdelete = isdelete?1:0;

        int[] label_id = DBController.getPostInterest(id);
        for (int j : label_id) {
            this.lable_id.add(j);
        }
        
    }
    public Post(int id, int create_user_id, Date create_time, String content, int isdelete) {
        this.id = id;
        this.create_user_id = create_user_id;
        this.create_time = create_time;
        this.content = content;
        this.isdelete = isdelete;

        int[] label_id = DBController.getPostInterest(id);
        for (int j : label_id) {
            this.lable_id.add(j);
        }
    }


    public int getId() {
        return id;
    }

    public int getCreate_user_id() {
        return create_user_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public String getContent() {
        return content;
    }

    public boolean isIsdelete() {
        return isdelete==1;
    }

    public ArrayList<Integer> getLable_id(){
        return lable_id;
    }
    
}
