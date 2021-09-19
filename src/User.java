

import java.lang.*;

public class User
{

    public String userId;
    public String password;
    public int userStatus;
    public String userName;

   

    public User(){};

    public User(String userId, String password)
    {
        this.userId=userId;
        this.password=password;
    }


    public void setUserId(String userId)
    {
        this.userId=userId;
    }

    public void setPassword(String password)
    {
     this.password=password;
    }

    public void setUserStatus(int userStatus)
    {
        this.userStatus= userStatus;
    }

    public String getUserId()
    {
        return userId;
    }

    public String getPassword()
    {
        return password;
    }
    public int getUserStatus()
    {
        return userStatus;
    }
     public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    

}