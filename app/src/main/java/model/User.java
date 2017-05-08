package model;

/**
 * Created by Vishal on 4/28/2017.
 */

public class User {

    private String userName;
    private String emailId;
    private String password;
    private String permitZone;
    private String userType;

    public User(){

    }

    public User(String userName, String emailId, String password, String permitZone, String userType){
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.permitZone = permitZone;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermitZone() {
        return permitZone;
    }

    public void setPermitZone(String permitZone) {
        this.permitZone = permitZone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!emailId.equals(user.emailId)) return false;
        return permitZone.equals(user.permitZone);

    }

    @Override
    public int hashCode() {
        int result = emailId.hashCode();
        result = 31 * result + permitZone.hashCode();
        return result;
    }

}
