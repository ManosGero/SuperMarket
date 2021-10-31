public class User {

    private int userId;
    private String userName;
    private String userLastName;
    private String passWord;
    private String email;
    private int userManagerID;
    private String jobTitle;


    int getUserId() {
        return userId;
    }

    String getUserName() {
        return userName;
    }

    String getUserLastName() {
        return userLastName;
    }

    String getPassWord() {
        return passWord;
    }

    String getEmail() {
        return email;
    }

    int getUserManagerID() {
        return userManagerID;
    }

    String getJobTitle() {
        return jobTitle;
    }

   void setUserId(int userId) {
        this.userId = userId;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

   void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    void setEmail(String email) {
        this.email = email;
    }

     void setUserManagerID(int userManagerID) {
        this.userManagerID = userManagerID;
    }

    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "User [id=" + userId + ", Name=" + userName + ", LastName=" + userLastName + ", email=" + email
                + ", password=" + passWord + ", role=" + jobTitle + ", ManagerID=" + userManagerID +
                "]";

    }
}
