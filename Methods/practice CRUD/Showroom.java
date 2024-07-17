class Showroom{

static String cars[]={null,null,null,null,null,null,null};
static int index;

public static boolean createCarList(String car){
	
	isCreateCarList = false;
	if(index < cars.length)
		if(car!=null){
			Car[index]= car;
			index++;
			isCreateCarList = true;
		}else{
			System.out.println("the list cannot be null");
		}
		else{
			System.out.println("the index is full");
		}
	return isCreateCarList;	
	
	
public static void getCarList(){
	for(String carList:Cars)
		System.out.println("the list if cars are: +carList");
	
}

	
public static boolean updateCarList(String oldCar , String newCar){
	boolean isUpdated=false;
	for(index=0; index<cars.length; index++){
		if(oldCar==cars[index]){
			cars[index]==newCar;
		}
		if(isUpdated==true){
			System.out.println("the car"+oldCar+ "does not exist");
		}
	} return isUpdated;
}	
	
	
	
	
	
	
}








}