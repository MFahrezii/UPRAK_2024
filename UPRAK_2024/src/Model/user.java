/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Client
 */
public class user{
    static int id_user = 0;
    static String nama_user ="", role ="";

    public static int getId_admin() {
        return id_user;
    }

    public static void setId_user(int id_admin) {
        user.id_user = id_admin;
    }

    public static String getUsername() {
        return nama_user;
    }

    public static void setUsername(String username) {
        user.nama_user = username;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        user.role = role;
    }
}
