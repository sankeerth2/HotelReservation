package details;

public class Customer implements CustomerInterface{

	private boolean type;

	public Customer(boolean type) {
		super();
		this.type = type;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	@Override
	public boolean isRegular(String customer) {
		
		if(customer.equalsIgnoreCase("regular")){
			return true;
		}
		return false;
	}
	
}
