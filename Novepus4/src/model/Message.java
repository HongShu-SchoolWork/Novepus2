package model;

import java.sql.Date;

public class Message {
    private  int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setForm_user_id(int form_user_id) {
        this.form_user_id = form_user_id;
    }

    public void setTo_user_id(int to_user_id) {
        this.to_user_id = to_user_id;
    }

    public void setSent_time(Date sent_time) {
        this.sent_time = sent_time;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIsdelete(boolean isdelete) {
        this.isdelete = isdelete;
    }

    private  int form_user_id;
    private  int to_user_id;
    private  Date sent_time;
    private  String content;
    private  boolean isdelete;

    public Message(int id, int form_user_id, int to_user_id, Date sent_time, String content, boolean isdelete) {
        this.id = id;
        this.form_user_id = form_user_id;
        this.to_user_id =to_user_id;
        this.sent_time =sent_time;
        this.content = content;
        this.isdelete = isdelete;
    }

    public boolean isIsdelete() {
        return isdelete;
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


    public boolean getIsdelete() {
        return isdelete;
    }

}
