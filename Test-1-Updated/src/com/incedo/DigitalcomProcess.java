package com.incedo;
import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User us=new User();
		GameService gs=new GameService();
		boolean loop=true;
		String uid;
		String pass;
		while(loop==true)
		{
			String choice;
			System.out.println("Enter the choice");
			Scanner sc=new Scanner(System.in);
			choice=sc.next();
			switch (choice) {
			case "RegisterUser": {
				System.out.println("Enter the userid and password");

				uid=sc.next();
				pass=sc.next();
				us.addUser(uid, pass);
				System.out.println("User created!");
				break;
			}
			case "ViewGames" :
			{
				System.out.println("Enter the userid and password");

				uid=sc.next();
				pass=sc.next();
				
				if(us.IsAuthenticated(uid, pass))
				{
					List<Game> list=gs.viewAll();
					 list.stream().forEach(x->System.out.println(x));
				}
				else {
					System.out.println("Invalid userid or password");
				}
				 
				break;
			}
			case "Searchbyname" :
			{
				System.out.println("Enter the userid and password");

				uid=sc.next();
				pass=sc.next();
				
				if(us.IsAuthenticated(uid, pass))
				{
				System.out.println("Enter the author name:");
				String author=sc.next();
				String game=gs.authorSearch(author);
				System.out.println("Result you're searching for:"+game);
				}
				else {
					System.out.println("Invalid userid or password");
				}
				break;
			}
			case "Exit":
				{loop=false;
				System.out.println("Exited! Thank you");
				break;
				}
				
			default:
				System.out.println("Invalid input");
			}
		}
		
	}

}
