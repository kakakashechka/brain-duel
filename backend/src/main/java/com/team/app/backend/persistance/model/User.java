package com.team.app.backend.persistance.model;



import java.util.Date;

public class User {

    private Long id;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private byte[] image;

    private Date registr_date;

    private String activate_link;

    private UserStatus status;

    private Role role;

    public User() {
    }

    public User(Long id, String firstname, String lastname, String username, String password, String email, byte[] image, Date registr_date, String activate_link, UserStatus status, Role role) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.image = image;
        this.registr_date = registr_date;
        this.activate_link = activate_link;
        this.status = status;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getRegistr_date() {
        return registr_date;
    }

    public void setRegistr_date(Date registr_date) {
        this.registr_date = registr_date;
    }

    public String getActivate_link() {
        return activate_link;
    }

    public void setActivate_link(String activate_link) {
        this.activate_link = activate_link;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
