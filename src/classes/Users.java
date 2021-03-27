package classes;

import java.util.ArrayList;

public class Users {
	public static ArrayList<User> mylist=new ArrayList<User>(); //initialisation
	public void adduser(User u) //ajout
	{
		
		mylist.add(u);
		
	}
	public User exists(String usernom,String userprenom)
	{
		
		for(User u:mylist)
		{
			if((u.getNom().equals(usernom))&&(u.getPrenom().equals(userprenom)))
				return u;
		}
		
		
		return null;
		
		
		
	}

	
	
	
}
