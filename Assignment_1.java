package Encapsulation;
class Movie
{
	private String movieName;
	private String movieStartTime,movieEndTime;
	private int movieTicketPrice;
	
	public int getMovieTicketPrice() {
		return movieTicketPrice;
	}
	public void setMovieTicketPrice(int movieTicketPrice) {
		this.movieTicketPrice = movieTicketPrice;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(String movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	public String getMovieEndTime() {
		return movieEndTime;
	}
	public void setMovieEndTime(String movieEndTime) {
		this.movieEndTime = movieEndTime;
	}
	
	}
	
public class Assignment_1 
{
	public static void main(String[] args) 
	{
		Movie m = new Movie();
		m.setMovieName("M.S. Dhoni: The Untold Story");
		m.setMovieTicketPrice(120);
		m.setMovieStartTime("6:30 pm");
		m.setMovieEndTime("10:00 pm");
		System.out.println("Movie Name: "+m.getMovieName()+"\nTicket Price: "+m.getMovieTicketPrice()+"\nStart Time: "+m.getMovieStartTime()+"\nEnd Time: "+m.getMovieEndTime());
		
	}

}
