import java.util.Scanner;
public class MovieDriver {
	private String title;
	private String rating;
	private int soldTickets;
	private static Scanner keyboard;
			
 

	public  MovieDriver ()
	{
		title = "";
		rating = "";
		soldTickets = 0;	
	
	}
	public  MovieDriver (MovieDriver m)
	{
		title = m.title;
		rating = m.rating;
		soldTickets = m.soldTickets;	
	}
	
	
	
	
	public MovieDriver(String title, String rating, int soldTickets) {
		 
		this.title = title;
		this.rating = rating;
		this.soldTickets = soldTickets;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getRating() 
	{
		return rating;
	}
	
	public void setRating(String rating) 
	{
		this.rating = rating;
	}
	
	public int getSoldTickets() 
	{
		return soldTickets;
	}
	
	public void setSoldTickets(int soldTickets)
	{
		this.soldTickets = soldTickets;
	}
	
	
	
	
	
	public String toString() 
	{
		return (this.title+ " ("+this.rating+"): Tickets sold: " +this.soldTickets);
	}

	
	public static void main (String[]args){
		char ans = ' ';
		

		
		// Create a new object of type Scanner that reads from the keyboard
		keyboard = new Scanner (System.in);
		
		// Create a new movie object
		MovieDriver movie = new MovieDriver();
		
		do {
		
		// Prompt the user to enter the title of a movie 
			System.out.println("Enter the title of a movie: ");
		
	//	keyboard.nextLine();

		//Read in the line that the user types
		String title = keyboard.next() + keyboard.nextLine();

		// Set the title in the movie object
		movie.setTitle(title);		
		
		// Prompt the user to enter the movie’s rating
		System.out.println("Enter the movie's rating: ");
		

		// Read in the line that the user types
		String rating = keyboard.nextLine(); 

		// Set the rating in the movie object
		movie.setRating(rating);
		
		// Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Enter the number of tickets sold for this movie: ");
		
		// Read in the integer that the user types
		int soldTickets = keyboard.nextInt();
		
		// Set the number of tickets sold in the movie object
		movie.setSoldTickets(soldTickets);
		
		// Print out the information using the movie’s toString method
		System.out.println(movie);
		System.out.print("Do you want to enter another? (y or n) ");

	try
	{ans = (char)System.in.read();}
	catch(Exception e) { }
		}
		while (ans == 'y');
	System.out.println("\nGoodbye");

	}
}


