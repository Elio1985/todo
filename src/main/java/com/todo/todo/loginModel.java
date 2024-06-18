package com.todo.todo;

public class loginModel {
    protected String email;
    protected String username;
    protected String password;

    // Constructors
    public loginModel() {
        super();
    }

    public loginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public loginModel(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // getter & setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString
    @Override
    public String toString() {
        return "email =" + email + "username = " + username + "password = " + password;
    }
}
