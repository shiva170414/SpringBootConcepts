package in.sp.beans;

public class Address {
	
	private int housenp;
	private String city;
	private int pincode;
	
	public void setHousenp(int housenp) {
		this.housenp = housenp;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "#"+ housenp+" "+city+" "+pincode;
	}
}
