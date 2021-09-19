

import java.lang.*;


public interface interfaceUser
{
    User getUser(String userId, String password); //check later//because we are returning multiple attributes, onnly possible by reference variable. reference varialbe possible only by user class. class only possible by presence in interface
    void insertUser(User u);
    void updateUser(User u);
    
}