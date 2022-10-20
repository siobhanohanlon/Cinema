package ie.atu.sw;

public class Movie {
	//Variables
	private String name;
	private int duration;
	private byte[] data;
	private Genre genre;
	
	//Constructor
	public Movie(String name, int duration, byte[] data, Genre genre) {
		super();
		
		//Assign Variables
		this.name = name;
		this.duration = duration;
		this.data = data;
		this.genre = genre;
	}

	//Play Movie
	public void play() {
		for (int i = 0; i < data.length; i++) {
			byte b = data[i];
			
			//Try and Catch
			try {
				//Sleep for a millisecond
				Thread.sleep(1);
			} 
			catch (InterruptedException e) {
				// Catch block
				e.printStackTrace();
			}
		}
	}
}
