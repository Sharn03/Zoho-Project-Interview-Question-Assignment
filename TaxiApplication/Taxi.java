package TaxiApplication;

public class Taxi implements Cloneable {
	
	private String currentLocation = "A";
	private int taxiId;

	private int customerId;
	

	private char pickupoint;
	private char dropPoint;
	private char currentPoint;
	
	public char getCurrentPoint() {
		return currentPoint;
	}
	public void setCurrentPoint(char currentPoint) {
		this.currentPoint = currentPoint;
	}
	private int  pickupTime;
	private int dropTime;
	private long earning;
	
	
	public int getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(int pickupTime) {
		this.pickupTime = pickupTime;
	}
	public int getDropTime() {
		return dropTime;
	}
	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public int getTaxiId() {
		return taxiId;
	}
	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public char getPickupoint() {
		return pickupoint;
	}
	public void setPickupoint(char pickupoint) {
		this.pickupoint = pickupoint;
	}
	public char getDropPoint() {
		return dropPoint;
	}
	public void setDropPoint(char dropPoint) {
		this.dropPoint = dropPoint;
	}
	public long getEarning() {
		return earning;
	}
	public void setEarning(long earning) {
		this.earning = earning;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Taxi [currentLocation=" + currentLocation + ", taxiId=" + taxiId + ", customerId=" + customerId
				+ ", pickupoint=" + pickupoint + ", dropPoint=" + dropPoint + ", currentPoint=" + currentPoint
				+ ", pickupTime=" + pickupTime + ", dropTime=" + dropTime + ", earning=" + earning + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
