package com.incedo;
import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User us=null;
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
				us=new User(uid,pass);
				System.out.println("User created");
				break;
			}
			case "ViewGames" :
			{
				
				 List<Game> list=gs.viewAll();
				 list.stream().forEach(x->System.out.println(x));
				break;
			}
			case "Searchbyname" :
			{
				System.out.println("Enter the author name:");
				String author=sc.next();
				String game=gs.authorSearch(author);
				System.out.println("Result you're searching for"+game);
				break;
			}
			case "Exit":
				{loop=false;
				break;
				}
				
			default:
				System.out.println("Invalid input");
			}
		}
		
	}

}
