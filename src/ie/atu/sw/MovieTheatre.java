package ie.atu.sw;

import java.util.List;

//Makes it Cloneable
public class MovieTheatre implements Cloneable{
	private BoxOffice bo;
	private List<Movie> movies;
	
	//Constructor
	public MovieTheatre() {
		bo = new BoxOffice();
		movies = new ArrayList<>();
	}

	//Delegate Methods
	//Amount of Movies
	public int number() {
		return movies.size();
	}
	//Add
	public boolean addMovie(Movie e) {
		return movies.add(e);
	}
	//Remove
	public boolean removeMovie(Object o) {
		return movies.remove(o);
	}
	//Clear
	public void clearTheatre() {
		movies.clear();
	}
	
	//
	public BoxOffice getBoxOffice() {
		return this.bo;
	}
}