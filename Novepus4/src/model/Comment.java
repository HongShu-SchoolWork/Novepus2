package model;

import java.sql.Date;

public class Comment {
    private  int id;
    private int post_id;
    private int create_id;
    private Date create_time;
    private String content;
    private boolean isdelete;

    public Comment(int id, int post_id, int create_id, Date create_time, String content, boolean isdelete) {
        this.id = id;
        this.post_id = post_id;
        this.create_id = create_id;
        this.create_time = create_time;
        this.content = content;
        this.isdelete = isdelete;
    }

    public int getId() {
        return id;
    }

    public int getPost_id() {
        return post_id;
    }

    public int getCreate_id() {
        return create_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public String getContent() {
        return content;
    }

    public boolean getIsdelete() {
        return isdelete;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIsdelete() {
        return isdelete;
    }

    public void setIsdelete(boolean isdelete) {
        this.isdelete = isdelete;
    }
}
