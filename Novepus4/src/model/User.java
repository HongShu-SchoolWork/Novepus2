package model;


import java.sql.Date;
import java.util.ArrayList;

/**
 * The type User.
 */
public class User {
    private int id;
    private String username;
    private Date create_time;
    private Date last_exit_time;
    private boolean isOnline;
    private String email;

    private int follow_user_number;
    private int befollowed_user_num;
    private int post_num;
    private int be_liked_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFollow_user_number() {
        return follow_user_number;
    }

    public void setFollow_user_number(int follow_user_number) {
        this.follow_user_number = follow_user_number;
    }

    public int getBefollowed_user_num() {
        return befollowed_user_num;
    }

    public void setBefollowed_user_num(int befollowed_user_num) {
        this.befollowed_user_num = befollowed_user_num;
    }

    public int getPost_num() {
        return post_num;
    }

    public void setPost_num(int post_num) {
        this.post_num = post_num;
    }

    public int getBe_liked_num() {
        return be_liked_num;
    }

    public void setBe_liked_num(int be_liked_num) {
        this.be_liked_num = be_liked_num;
    }

    public ArrayList<Integer> getLabel_id() {
        return label_id;
    }


    private final ArrayList<Integer> label_id = new ArrayList<>();

    public User(int id, String username, Date create_time, Date last_exit_time, boolean isOnline, String email, int follow_user_number, int befollowed_user_num, int post_num, int be_liked_num) {
        this.id = id;
        this.username = username;
        this.create_time = create_time;
        this.last_exit_time = last_exit_time;
        this.isOnline = isOnline;
        this.email = email;

        this.follow_user_number = follow_user_number;
        this.befollowed_user_num = befollowed_user_num;
        this.post_num = post_num;
        this.be_liked_num = be_liked_num;
    }

    public void update(int... arr){
        this.follow_user_number = arr[0];
        this.befollowed_user_num = arr[1];
        this.post_num = arr[2];
        this.be_liked_num = arr[3];
    }




}
