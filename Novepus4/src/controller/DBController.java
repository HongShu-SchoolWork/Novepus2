package controller;

import model.*;

import java.io.*;
import java.io.Console;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import model.Comment;
import model.Log;
import model.Post;
import model.User;
import oracle.jdbc.driver.*;
import oracle.sql.*;

public class DBController {

    // for user
    public static void createUser(User user) {

    }

    public static User retrieveUser(int id){

        return null;
    }

    public static void updateUser(User user){
        // according id
    }

    public static int[] updateUserMem(int user_id){
        // 1. update in DB
        // 2. put in int[3] at least 0!

        return null;
    }

    public static void setFollowUser(int user_id,int user_befollowed_id){
    }

    public static void setNotFollowUser(int user_id,int user_befollowed_id){
        // 真正删除
    }

    public static void addUserInterest(int user_id,String label){
        getLabelId(label);
    }

    public static int[] getUserInterest(int user_id){
        return null;
    }


    // for post
    public static void createPost(Post post){
    }

    public static Post retrievePost(int post_id){
        return null;
    }

    public static ArrayList<Post> retrievePostList(int num){
        // 如果超了，取最多
        return null;
    }

    public static ArrayList<Post> searchPost(String keyword){
        return null;
    }

    // interest
    public static ArrayList<Post> retrieveInterestPostList(int interest_id){
        return null;
    }

    public static void deletePost(int post_id){

    }

    public static ArrayList<Integer> getPostInterest(int post_id){
        return null;
    }

    public static void setPostInterest(int post_id,int[] interest_id){}

    // mention
    public static void addPostMentionPost(int post_id, int[] mention_post){
    }

    public static ArrayList<Post> get_mention_post(int post_id){
        // if related information delete, not do!
        return null;
    }

    // for like
    public static void addLikePost(int post_id,int user_id){
        // if related information delete, not do!
    }

    public static void deleteLikePost(int post_id,int user_id){
        // 真正的删除
    }

    // for comment
    public static void createComment(Comment comment){}

    public static void deleteComment(int comment_id){}

    public static void setLikeComment(int comment_id,int user_id){
        // if related information delete, not do!
    }

    public static void setNotLikeComment(int comment_id,int user_id){
        // 真正删除
    }

    // for interest label
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

    public static ArrayList<Message> getMessage(int to_user_id,int num){
        return null;
    }

    public static void deleteMessage(int message_id){
    }

    // for log
    public static void createLog(Log log){
    }

    public static ArrayList<Log> getLog(int user_id,int num){
        return null;
    }

    public static void main(String[] args) {
        String username = "20075519d";
        String password = "viukiyec";

        try {
            OracleConnection connect = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@studora.comp.polyu.edu.hk:1521:dbms",username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }



}
