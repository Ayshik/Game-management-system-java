import java.lang.*;




public class GameSto implements interfaceGame
{
    DatabaseConnection dbc;
    

    public GameSto()
    {
        dbc = new DatabaseConnection();
    }

    public Game getGame(String name)
    {

        Game game = null;
        String query = "SELECT * FROM gameinfo WHERE name='"+name+"';";
        try
        {
            System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
        
            while(dbc.result.next())
            {
                game = new Game();
                game.setName(dbc.result.getString("name"));
                game.setAgeRating(dbc.result.getInt("ageRating"));
                game.setDeveloper(dbc.result.getString("developer"));
                game.setGenre(dbc.result.getString("genre"));
                game.setPlatform(dbc.result.getString("platform"));
                game.setReleaseDate(dbc.result.getString("releasedate"));
                game.setSynopsis(dbc.result.getString("synopsis"));
                game.setPrice(dbc.result.getInt("price"));
            }
        }
            catch(Exception e)
            {
                System.out.println("Exception is : " +e.getMessage());
            }
            dbc.closeConnection();
            return game;
        
    }

    public void insertGame(Game gm)
    {
        String query = "INSERT INTO gameinfo VALUES ( '"+gm.getName()+"', '"+gm.getGenre()+"', '"+gm.getAgeRating()+"', '"+gm.getPlatform()+"', '"+gm.getSynopsis()+"', '"+gm.getDeveloper()+"', '"+gm.getReleaseDate()+"');";

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