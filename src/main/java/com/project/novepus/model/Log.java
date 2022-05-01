package com.project.novepus.model;

import java.sql.Date;

public class Log {
    private final int id;
    private final int user_id;
    private final Date do_time;
    private final String do_what;
    private int is_delete;


    public Log(int id, int user_id, Date do_time, String do_what, boolean is_delete) {
        this.id = id;
        this.user_id = user_id;
        this.do_time = do_time;
        this.do_what = do_what;
        this.is_delete =  is_delete?1:0;
    }
    public Log(int id, int user_id, Date do_time, String do_what, int is_delete) {
        this.id = id;
        this.user_id = user_id;
        this.do_time = do_time;
        this.do_what = do_what;
        this.is_delete =  is_delete;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public Date getDo_time() {
        return do_time;
    }

    public String getDo_what() {
        return do_what;
    }

    public Boolean getIs_delete() {
        return is_delete==1;
    }

    public void setIs_delete(boolean is_delete){
        this.is_delete = is_delete?1:0;
    }



}
