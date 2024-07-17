class Speakers {

  static boolean ispowered = true; 
  static int currentvolume = 10;
  static int maxVolume = 80;
  static int minVolume = 0;

    public static void OnorOff (){ 
	  System.out.println("OnorOff Started ");
	   if (ispowered == true ){
		   ispowered = false ;
		   System.out.println(" The Speakers is Turned off ");
		}
		else if (ispowered == false){
			ispowered = true;
			System.out.println(" The Speakers is Turned on ");
			
		}
			System.out.println(" OnorOff Ended ");
	
			return;
    }

		public static void increaseVolume (){
			System.out.println(" The increased volume Started ");
			if (ispowered == true){
			   if ( currentvolume <= maxVolume){
				   currentvolume = currentvolume+40;
				   System.out.println(" The Current volume is " + currentvolume );   
			   }
			   else {
				   System.out.println(" Max Volume Reached ");
			   }
			   System.out.println(" The Increased Volume Ended ");
			return;	
			}
		}
        public static void decreaseVolume(){
			System.out.println(" The Decreased Volume ");
			    if (ispowered == true){
				if (currentvolume>= minVolume){
					currentvolume = currentvolume-20;
					System.out.println(" The Current volume is " + currentvolume );	
			}else{
				System.out.println(" Reached The Min Limit  ");
			}
				System.out.println(" The Decreased Volume Ended ");
				return;
			}
		}
				public static void getInformation (){
					String brand  = " boAt ";
					int price = 6000;
					String colour = "Green";
				System.out.println("Brand Name " + brand );	
				System.out.println("Price " + price );	
				System.out.println("Colour " + colour );	
				}



}