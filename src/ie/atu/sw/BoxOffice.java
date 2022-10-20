package ie.atu.sw;

public class BoxOffice {
	//Variables
	private Ticket t; //Full Composition => Full Encapsulation
	private int counter = 0;
	
	public void bookTicket(Movie m, double price) {
		new Ticket(m, price);
		counter++;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	//Inner Class
	private class Ticket{
		Movie mov;
		double price;
		
		//Constructor
		public Ticket(Movie mov, double price) {
			super();
			this.mov = mov;
			this.price = price;
		}

		//Getters
		public Movie getMov() {
			return mov;
		}

		public double getPrice() {
			return price;
		}

		//Destructor, only called once
		@Override
		protected void finalize() throws Throwable {
			System.out.println(this.getClass().getName() + 
					" is available for GC " + counter);
		}
	}
	
	//Destructor, only called once
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.getClass().getName() + 
				" is available for GC " + counter);
	}
}