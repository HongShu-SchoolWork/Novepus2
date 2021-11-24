package com.project.novepus.model;

import java.sql.Date;

public class Message {
    private final int id;
    private final int form_user_id;
    private final int to_user_id;
    private final Date sent_time;
    private final String content;
    private final int isdelete;

    public Message(int id, int form_user_id, int to_user_id, Date sent_time, String content, int isdelete) {
        this.id = id;
        this.form_user_id = form_user_id;
        this.to_user_id =to_user_id;
        this.sent_time =sent_time;
        this.content = content;
        this.isdelete = isdelete;
    }
    public Message(int id, int form_user_id, int to_user_id, Date sent_time, String content, boolean isdelete) {
        this.id = id;
        this.form_user_id = form_user_id;
        this.to_user_id =to_user_id;
        this.sent_time =sent_time;
        this.content = content;
        this.isdelete = isdelete?1:0;
    }

    public int getId() {
        return id;
    }


    public int getForm_user_id() {
        return form_user_id;
    }


    public int getTo_user_id() {
        return to_user_id;
    }


    public Date getSent_time() {
        return sent_time;
    }


    public String getContent() {
        return content;
    }


    public int getIsdelete() {
        return isdelete;
    }

}
