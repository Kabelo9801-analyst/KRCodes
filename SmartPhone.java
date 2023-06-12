
package testphones;

public class SmartPhone extends PhoneObject {
private String software = "iOS 14.1";
private string cardSlot = “No”;
	
public SmartPhone(){
 this(4.7,"Gold",4,"Apple","iOS 13.9","1 Card slot",7999);
		}
		
public SmartPhone(double screenSize,int ramSize, String brand,int price,String color,String serialNumber ,int ramSize,String software, String CardSlot){
			super(screenSize,color,price,brand,ramSize);
			setSoftware(software);
			setCardSlot(cardSlot);
		}

		 /**Getter/Accessor method for software*/ 
		public String getSoftware(){
			return software; 
		 }

		/**Setter/Mutator method for software */ 
		public void setSoftware(String software){
			this.software = software; 
		 } 
		 
		public int getCardSlot(){
			return cardSlot; 
		 }

		public void setCardSlot (int cardSlot){
			this.cardSlot = cardSlot; 
		 } 
	
		 public double Depreciation(){
			return (getPrice() * 0.40);
		 }
	
		 public String toString(){
		return ("SmartPhone with a value of " + this.price + " is only available in the color " + this.color);
                 }
	


