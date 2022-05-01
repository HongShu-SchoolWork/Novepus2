package com.project.novepus.controller;

import com.project.novepus.model.*;

import java.sql.Date;
import java.util.ArrayList;

public class DBController {

    // for user
    public static void writeNewUser(User user){
    }

    public static boolean ifUserExist(String email){
        return false;
        // check by email!
    }

    public static User getUser(String email){
        return null;
        // check by email,only one!
    }

    public static User getUser(int user_id){
        return null;
    }

    public static User getUserByName(String name){
        return null;
    }

    public static void setSignature(int user_id,String signature){}

    public static void postMentionPost(int post, int[] mention_post){
        // if related information delete, not do!

    }

    public static int[] updateUserMem(int user_id){
        // 1. update in DB
        // 2. put in int[] at least 0!

        // if related information delete, not do!
        return null;
    }

    public static void setFollowUser(int user_id,int user_befollowed_id){
        // if related information delete, not do!
    }

    public static void setNotFollowUser(int user_id,int user_befollowed_id){}

    public static void setUserInterest(int user_id,String label){
        getLabelId(label);
    }

    public static int[] getInterest(int user_id){
        return null;
    }

    public static void setLast_exit_time(Date date){
    }


    // for post
    public static void createPost(Post post){
    }

    public static Post getPost(int post_id){
        return null;
    }

    public static ArrayList<Post> getPostList(int num){
        // if related information delete, not do!

        return null;
    }

    public static ArrayList<Post> getLabelPostList(int[] label,int num){
        return null;
        // has all labels in []
    }

    public static void setLikePost(int post_id,int user_id){
        // if related information delete, not do!
    }

    public static void setNotLikePost(int post_id,int user_id){}

    public static ArrayList<Post> get_mention_post(Post post){
        // if related information delete, not do!
        return null;
    }

    public static void deletePost(int post){
    }

    public static int[] getPostInterest(int post_id){
        return null;
    }

    public static void setPostInterest(int post_id,int[] label_id){}

    public static ArrayList<Post> searchPost(String keyword){
        return null;
    }

    // for comment
    public static void createComment(Comment comment){}

    public static void deleteComment(int comment_id){}

    public static void setLikeComment(int comment_id,int user_id){
        // if related information delete, not do!
    }

    public static void setNotLikeComment(int comment_id,int user_id){}

    // for label
    public static void createLable(String lablename){

    }

    public static int getLabelId(String label) {
        // if null add it and getLabelId
        return 0;
    }

    public static String getLabelName(int label_id){
        return null;
    }


    // for message
    public static void createMessage(Message message){

    }

    public static ArrayList<Message> getMessage(int user_id,int num){
        return null;
    }

    public static void deleteMessage(int message_id){
        // if related information delete, not do!
    }

    // for log
    public static void createLog(Log log){
    }

    public static ArrayList<Log> getLog(int user_id,int num){
        return null;
    }

}
