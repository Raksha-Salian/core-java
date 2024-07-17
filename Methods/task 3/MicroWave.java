class MicroWave{
	static boolean ispowered = false;
	static int currentTemperature = 0;
	static int maxTemperature =50;
	static int minTemperature =0;
	
 public static boolean onOrOff(){
		System.out.println(" OnorOff Started ");
	 if (ispowered == false ) {
		 ispowered = true;
		 System.out.println("The Microwave Turned On "); 
	 }
	 else{
		 if (ispowered == true ){
		  ispowered = false;
		  System.out.println("The Microwave Turned Off ");	
		 }
	 }
	 return ispowered;
 }

  public static void increaseTemperature(){
	  System.out.println(" The Increased  Temperature Started ");
	      if(ispowered == true){
		  if (currentTemperature<=maxTemperature){
			  currentTemperature= currentTemperature+20;
			  System.out.println(" Increasing Temperature " + currentTemperature );
		  }else{
			  System.out.println(" Reached Max Temperature  ");
		  }
		  System.out.println(" The Increase Temperature Ended ");
	  }
	  return;
  }
    public static void  decreasedTemperature(){
		System.out.println(" The Decreased Temperature Started ");
		if(ispowered ==true) {
			if (currentTemperature>minTemperature){
				currentTemperature= currentTemperature-20;
				System.out.println("Decreased Temperature" + currentTemperature  );
			
			}else{
				System.out.println(" Reached Min Temperature");
			}
			System.out.println(" The Decreased Temperature Ended");
		}
		return;
	}
	public static void getinfo(){
		String brandname = "phlipse";
		int price = 4500;
		String colour = " Metal Grey";
		
		
		System.out.println("Brand Name "+ brandname);
		System.out.println("Price " + price );
		System.out.println("Colour "+ colour);
	}

}