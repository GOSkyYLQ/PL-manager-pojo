package LightningProtection.pojo;

import java.util.Date;


public class ta_auth_user {

    private int user_id;
    private String password;
    private Date last_login;
    private Integer superadmined;
    private String user_name;
    private String email;
    private Integer enable_status;
    private Date create_time;
    private Date last_edit_time;
    //private String real_name;
    //private String mobile;

//    public String getReal_name() {
//        return real_name;
//    }

//    public void setReal_name(String real_name) {
//        this.real_name = real_name ==null ? null : real_name.trim();
//    }

//    public String getMobile() {
//        return mobile;
//    }

//    public void setMobile(String mobile) {
//        this.mobile = mobile = mobile == null ? null : mobile.trim();
//    }



    public int getUser_id(){
        return user_id;
    }
    public void setUser_id(int user_id){
        this.user_id = user_id;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public Integer getSuperadmined() {
        return superadmined;
    }

    public void setSuperadmined(Integer superadmined) {
        this.superadmined = superadmined;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email ==null ? null : email.trim();
    }

    public Integer getEnable_status() {
        return enable_status;
    }

    public void setEnable_status(Integer enable_status) {
        this.enable_status = enable_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getLast_edit_time() {
        return last_edit_time;
    }

    public void setLast_edit_time(Date last_edit_time) {
        this.last_edit_time = last_edit_time;
    }
}
