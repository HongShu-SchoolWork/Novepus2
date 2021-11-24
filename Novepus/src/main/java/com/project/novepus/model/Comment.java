package com.project.novepus.model;

import java.sql.Date;

public class Comment {
    private final int id;
    private final int post_id;
    private final int create_id;
    private final Date create_time;
    private final String content;
    private final int isdelete;

    public Comment(int id, int post_id, int create_id, Date create_time, String content, int isdelete) {
        this.id = id;
        this.post_id = post_id;
        this.create_id = create_id;
        this.create_time = create_time;
        this.content = content;
        this.isdelete = isdelete;
    }
    public Comment(int id, int post_id, int create_id, Date create_time, String content, boolean isdelete) {
        this.id = id;
        this.post_id = post_id;
        this.create_id = create_id;
        this.create_time = create_time;
        this.content = content;
        this.isdelete = isdelete?1:0;
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

    public Boolean getIsdelete() {
        return isdelete==1;
    }

}
