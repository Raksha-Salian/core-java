class IceCream{

static String parlourName = "Polar Bear";
static String iceCreamList[] = {null , null , null , null , null , null};
static double priceList[]= {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
static int index;
static int indexxx;
public static boolean createIceCreamList(String iceCreamNames){

		System.out.println("ice cream names started here");
		boolean isIceCream = false;
		if(iceCreamNames != null){
		
		 iceCreamList[index] = iceCreamNames;
		 index++;
		 isIceCream = true;
		
		}else	System.out.println("the value cannot be null");
		return isIceCream;
		
}
		
    public static void getIceCreamNames(){
		for(String iceCreamNames:iceCreamList){
			
			System.out.println(iceCreamNames);
		}		
		
}

}

