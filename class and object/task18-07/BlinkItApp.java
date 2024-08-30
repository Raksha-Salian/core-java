class BlinkItApp{

static String items[]={null,null,null,null,null,null,null};
static int index;

public static boolean createItemList(String item){
	
	isCreateItemList = false;
	if(index < items.length)
		if(item!=null){
			Item[index]= item;
			index++;
			isCreateItemList = true;
		}else{
			System.out.println("the list cannot be null");
		}
		else{
			System.out.println("the index is full");
		}
	return isCreateItemList;	
	
	
public static void getCarList(){
	for(String itemList:items)
		System.out.println("the list if items are: +itemList");
	
}

	
public static boolean updateItemList(String oItem , String nItem){
	boolean isUpdated=false;
	for(index=0; index<items.length; index++){
		if(oItem==items[index]){
			items[index]==nItem;
		}
		if(isUpdated==true){
			System.out.println("the car"+oItem+ "does not exist");
		}
	} return isUpdated;
}	
	
}
}