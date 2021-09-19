

import java.lang.*;
import javax.swing.JOptionPane;
import javax.swing.*;




public class UserSto implements interfaceUser
{
   JFrame f;
    DatabaseConnection dbc;

    public UserSto()
    {
        dbc= new DatabaseConnection();
    }

    public User getUser(String userId, String password)
	{
		User user = null;
		String query = "SELECT userId, password, userStatus,userName FROM login WHERE userId='"+userId+"' AND password='"+password+"';";
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query); //an object is stored
		
			while(dbc.result.next()) //moves pointer from current row to next row i.e shows info when you select row
			{
				user = new User();
				user.setUserId(dbc.result.getString("userId"));
				user.setPassword(dbc.result.getString("password"));
				user.setUserStatus(dbc.result.getInt("userStatus"));
                                user.setUserName(dbc.result.getString("userName"));
				
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
                        
        }
		dbc.closeConnection();
		return user;
    }
    
    public void insertUser(User u)
	{
            
		String query = "INSERT INTO login VALUES ('"+u.getUserId()+"','"+u.getPassword()+"','"+1+"','"+u.getUserName()+"');";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
                        JOptionPane.showMessageDialog(f, "YOu have been registered");
		}
		catch(Exception ex){
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(f, "User already exists");
                }
	}
	public void updateUser(User u)
        {
            
            String query = "UPDATE login SET password='"+u.getPassword()+"' WHERE userId='"+u.getUserId()+"';";
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
                        JOptionPane.showMessageDialog(f, "Password Changed");
		}
		catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                    
                }
        }
        
        public void insertEmployee(User u)
	{
            
		String query = "INSERT INTO login VALUES ('"+u.getUserId()+"','"+u.getPassword()+"','"+2+"','"+u.getUserName()+"');";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
                        JOptionPane.showMessageDialog(f, "YOu have been registered");
		}
		catch(Exception ex){
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(f, "User already exists");
                }
	}
	
}

