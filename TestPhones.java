
package testphones;

public class TestPhones 
{

SmartPhone SP1 = new Phones(5.6,"Red",128,4,"Apple",14000);
SmartPhone SP2 = new Phones(4.8,"Rose Gold",256,4,"LG",14999);
SmartPhone SP3 = new Phones(5.1,"Black",64,4,"Samsung",19000);
	 
Tablet T1 = new Phones("7","White",16,2,"Hauwei",6000);
Tablet T2 = new Phones("10.1","Blue",32,3,"Mobicel",3000);
Tablet T3 = new Phones("9.6","Silver",64,4,"iPad",10000);


		
		 
		PhoneObject phones[] = new PhoneObject[5];
		phones[0] = SP1;
		phones[1] = T1;
		phones[2] = SP2;
		phones[3] = T2;
		phones[4] = SP3;
		
		
		for (int i =0 ; i< phones.length;i++) {
System.out.println("Phone " + i + " is a " + phones[i] + " has a future resale value of  " + phones[i].Depreciation());
		}
		
		
	}
}

