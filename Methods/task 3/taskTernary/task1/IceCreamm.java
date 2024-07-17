class IceCreamm{

static String parlourName = "Polar Bear";
static String iceCreamList[] = {null , null , null , null , null , null};
static double priceList[]= {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
static int index;
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
public static boolean upadateIceCreamName(String oldIceCreamName,String newIceCreamName){
		System.out.println("updation started");

boolean  isUpdateIceCreamName=false;

for(int index=0; index<iceCreamList.length;index++){
	
	
if(oldIceCreamName==iceCreamList[index]){
	iceCreamList[index]=newIceCreamName;
	isUpdateIceCreamName=true;	
}
}
if( isUpdateIceCreamName=false){
	
	System.out.println(oldIceCreamName+"Not found");
}
	System.out.println("updation eneded");
	return isUpdateIceCreamName;

}
	
	
	
	}

