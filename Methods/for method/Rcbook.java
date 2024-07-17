class Rcbook {
 static String datee;
 static String chassisnoo;
 static int bikenoo;
 static String namee;
 static	String colourr;
 static String eniginenoo;
	public static boolean detailsofRccard (String date,String chassisno,int bikeNo,String name ,String colour,String enigineno){
	         boolean isBikeRcbook = false; 
			 boolean isDateValid = false; 
			 boolean isChassisnoValid = false; 
			 boolean isBikeNoValid = false; 
			 boolean isNameValid = false;
             boolean isColourValid = false; 
             boolean isEnginenoValid = false; 			 
	         if(date != null ){
             datee  =  date ;
			 isDateValid = true;
				}else{
				System.out.println("Please provide valid date");
				}
			 if(chassisno != null){
		     chassisnoo = chassisno;
			 isChassisnoValid = true;
				}else{
					System.out.println("please provide the proper chassisno");
					 }
			if( bikeNo > 0){
			 bikenoo =bikeNo;
			isBikeNoValid = true;
				}else{
				System.out.println("please provide the bike number");
				}
			if(name != null){
		           namee = name;
				   isNameValid = true;
			}else{
				System.out.println("please provide the Name");
			}
			if( colour != null){
		    colourr = colour;
		    isColourValid = true;
				}else{
				System.out.println("please provide colour of the bike");
				} 
			if(enigineno != null){
		    eniginenoo = enigineno;
			isEnginenoValid = true;
				}else{
				System.out.println("please provide the proper Engine number");
				}
			if(isDateValid&& isChassisnoValid && isBikeNoValid && isNameValid && isColourValid && isEnginenoValid){
			    isBikeRcbook = true;
			}
	
			return isBikeRcbook;
	}
		public static void registorBikeDetails(){
		
		System.out.println("Date :" + datee);	
		System.out.println("ChassisNo : " + chassisnoo);
		System.out.println("Bike No : " + bikenoo );
		System.out.println("Name Of Owner : " + namee );	
		System.out.println("Colour : " + colourr);
		System.out.println("Enigine No " + eniginenoo);
	}
 }