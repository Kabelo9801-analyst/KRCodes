
package testphones;


public abstract class PhoneObject {
	
	private double screenSize = 4.8; 
	private String color = "White";
        private String brand = "Apple";
	private int phonePrice = 14999;
	private int ramSize = 4;
	protected PhoneObject() { }
		
protected PhoneObject(double screenSize, String color,String brand,int price,int ramSize) { 
		setScreenSize(screenSize);
		setPhonePrice(phonePrice);
		setRamSize(ramSize);
		setBrand(brand);
		setColor(color);
	
	}
	  
	public double getScreenSize(){
		return screenSize; 
	 }
	 

	/**Setter/Mutator method for screenSize */ 
	public void setScreenSize (int screenSize){
		this.screenSize = screenSize;
	 } 
	 /**Getter/Accessor method for phonePrice */ 
	 public int getphonePrice (){
		return phonePrice; 
	 }
	 
	/**Setter/Mutator method for phonePrice */ 
	public void setphonePrice (int phonePrice){
		this.phonePrice = phonePrice;
	 } 
	 
	 /**Getter/Accessor method for ramSize*/ 
	 public int getSize(){
		return ramSize; 
	 }
	 
	/**Setter/Mutator method for ramSize*/ 
	public void setSize(int ramSize){
		this.ramSize = ramSize;
	 } 
	 
	  /**Getter/Accessor method for brand*/ 
	public String getBrand(){
		return brand; 
	 }
	 
	/**Setter/Mutator method for Brand*/ 
	public void setBrand(String brand){
		this.brand = brand ;
	 } 

	 /**Getter/Accessor method for color*/ 
	public String getColor(){
		return color; 
	 }
	 
	/**Setter/Mutator method for color*/ 
	public void setColor(String color){
		this.color = color ;
	 }
	 
	/**Abstract method Depreciation*/ 
	public abstract double Depreciation(); 
}

    
    
}
