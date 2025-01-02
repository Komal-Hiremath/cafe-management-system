/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.user;
import java.sql.*;
import java.util.*;

/**
 *
 * @author komal
 */
public class userdao {

    public static void save(user user) {
        String query = "insert into user(name,email,mobno,address,password,securityQuestion,answer,status)values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobno() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully!Wait for Admin Approval!");
    }

    public static user login(String email, String password) {
        user user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new user();
                user.setStatus(rs.getString("status"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static user getSecurityQuestion(String email) {
        user user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "'");
            while (rs.next()) {
                user = new user();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password='" + newPassword + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Password Changed Successfully");
    }

    public static ArrayList<user> getAllRecords(String email) {
        ArrayList<user> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from user where email like '%" + email + "%'");
            while (rs.next()) {
                user user = new user();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobno(rs.getString("mobno"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status='" + status + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Status Changed Successfully");
    }

    public static void changePassword(String email, String oldPassword, String newPassword) {
        try {
            ResultSet rs = DbOperations.getData("select * from user where email ='" + email + "'and password='" + oldPassword + "'");
            if (rs.next()) {
                update(email, newPassword);
            } else {
                JOptionPane.showMessageDialog(null, "Old Password is wrong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void changeSecurityQuestion(String email, String password, String securityQuestion, String answer) {
        try {
            ResultSet rs = DbOperations.getData("select * from user where email ='" + email + "'and password='" + password + "'");
            if (rs.next()) {
                update(email, securityQuestion, answer);
            } else {
                JOptionPane.showMessageDialog(null, "Password is wrong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void update(String email, String securityQuestion, String answer) {
        String query = "update user set securityQuestion='" + securityQuestion + "',answer='" + answer + "' where email ='" + email + "'";
        DbOperations.setDataOrDelete(query, "Security Question Changed Successfully");
    }
}
