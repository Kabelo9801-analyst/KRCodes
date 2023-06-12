
package testphones;
public class Tablet extends Phones {
		private String WaterResistant = "IPS68";
		private String resolution= "1080";
	
		public Tablet(){
this(10.1,"Gold",4,"Samsung","IPS69","720",11299);
       
		}
		
public SmartPhone(double screenSize,int ramSize, String brand,int price,String color,int ramSize,String waterResistant, String resolution){
     super(screenSize,color,price,brand,ramSize);
        this.resolution =  ;
			setWaterResistant(waterResistant);
			setResolution(resolution);
		}

		public String getWaterResistant(){
			return WaterResistant; 
		 }

		/**Setter/Mutator method for water resistance */ 
		public void setWaterResistant(String waterResistant){
			this.WaterResistant = waterResistant; 
		 } 
		 
		 
		 /**Getter/Accessor method for cardSlot */ 
		public String getResolution(){
			return resolution; 
		 }

		/**Setter/Mutator method for cardSlot */ 
		public void setResolution (String resolution){
			this.resolution = resolution; 
		 } 
	
		 public double Depreciation(){
			return (getPrice() * 0.25);
		 }
	
		 public String toString(){
		return ("Tablet with a ram size of " + this.ramSize + " has a screen size of " + this.screenSize);
	


    
}
