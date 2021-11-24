package model;

import java.sql.Date;
import java.util.ArrayList;

public class Post {
    private int id;
    private int create_user_id;
    private Date create_time;
    private String content;
    private boolean isdelete;
    private ArrayList<Integer> lable_id = new ArrayList<>();

    public Post(int id, int create_user_id, Date create_time, String content, boolean isdelete, ArrayList<Integer> lable_id) {
        this.id = id;
        this.create_user_id = create_user_id;
        this.create_time = create_time;
        this.content = content;
        this.isdelete = isdelete;
        this.lable_id = lable_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(int create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(boolean isdelete) {
        this.isdelete = isdelete;
    }

    public ArrayList<Integer> getLable_id() {
        return lable_id;
    }

    public void setLable_id(ArrayList<Integer> lable_id) {
        this.lable_id = lable_id;
    }
}
