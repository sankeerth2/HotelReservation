package details;

public class Hotel {

	private int price;
	private int rating;
	private String name;
	
	Customer customer ;

	public enum hotelTypes {
		Lakewood(3), Bridgewood(4), Ridgewood(5);
		private int value;
		private hotelTypes(int value) {
			this.value = value;
		}
	}

	public Hotel(int price, int rating, String name) {
		super();
		this.price = price;
		this.rating = rating;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		
		if(){
			
		}
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
