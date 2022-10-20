package ie.atu.sw;

//Enum is for multiple constants

public enum Genre {
	THRILLER (1, "TH"),
	HORROR (2, "HO"),
	ACTION (3, "AC"),
	COMEDY(4, "CO");
	
	//Variables
	private int id;
	private String code;

	Genre(int i, String c) {
		//Assign Variables
		this.id = i;
		this.code = c;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
