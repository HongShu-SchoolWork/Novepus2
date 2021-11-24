package model;

import java.sql.Date;

public class Log {
    private int id;
    private int user_id;
    private Date do_time;
    private String do_what;
    private boolean is_delete;

    public Log(int id, int user_id, Date do_time, String do_what, boolean is_delete) {
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

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setDo_time(Date do_time) {
        this.do_time = do_time;
    }

    public void setDo_what(String do_what) {
        this.do_what = do_what;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public boolean getIs_delete() {
        return is_delete;
    }



}
