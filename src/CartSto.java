
import java.lang.*;
import javax.swing.JOptionPane;




public class CartSto{
    DatabaseConnection dbc;
    
    
    

    public CartSto()
    {
        dbc = new DatabaseConnection();
    }

    

    public void insertCart(User user, Game game)
    {
        String query = "INSERT INTO cart VALUES ( '"+user.getUserName()+"', '"+user.getUserId()+"', '"+game.getName()+"', '"+game.getPrice()+"','NULL','NULL','NULL');";

        try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
                        
		}
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            
        
        }
        

    }
}
