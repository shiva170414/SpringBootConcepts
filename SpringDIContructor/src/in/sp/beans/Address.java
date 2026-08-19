package in.sp.beans;

public class Address {
	
	private int housenp;
	private String city;
	private int pincode;
	
	
	
	public Address(int housenp, String city, int pincode) {
		
		this.housenp = housenp;
		this.city = city;
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "#"+ housenp+" "+city+" "+pincode;
	}
}
