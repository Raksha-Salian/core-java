import java.util.*;
class ChatShop{
	//static String name="kadala kinara";
	//static String ownerName="ss";
	static String chatNames[] = {null,  null, null, null, null, null};
	static double chatPrices[] = {0.0, 0.0, 0.0 , 0.0, 0.0, 0.0 };
	static int  index;
	static int chatPriceIndex;
	//add chatname in chatNames index position(ref)ref
public static boolean createChatName(String chatName){
    boolean isChatCreated = false;

	//System.out.println("createChatName started");
	if(index < chatNames.length){
	if(chatName != null){
		chatNames[index] = chatName;
		index++;
		isChatCreated = true;
	}
	else 
	System.out.println("The chat name entered null is not acceptable..");
	}else{
	System.out.println("chat name already full");
	
	}
	//System.out.println("createChatName ended");
	return isChatCreated;
}
public static void getChats(){
 System.out.println("chats avilable are");
	for(String chatNa : chatNames)
		System.out.println(chatNa);
}

public  static boolean addChatPrice(double chatPrice){
	//System.out.println("getChatPrice started");
	boolean isPriceAdded = false;
	if(chatPrice > 0.0){
		chatPrices[chatPriceIndex] = chatPrice;
		chatPriceIndex++;
		isPriceAdded = true;
	}
	//System.out.println("getChatPrice ended");
	return isPriceAdded;
	
}
public static void getChatPrice(){
	for(double price: chatPrices)
		System.out.println(price);
}


public static boolean upadateChatName(String oldChatName,String newChatName){
		//System.out.println("update started");

boolean  isUpdateChatName=false;

for(int index=0; index<chatNames.length;index++){
	
	
if(oldChatName==chatNames[index]){
	chatNames[index]=newChatName;
	isUpdateChatName=true;	
}
}
if( isUpdateChatName==false){
	
	System.out.println(oldChatName+"Not found");
}
	//System.out.println("update eneded");
	return isUpdateChatName;

}

public static boolean deleteChatName(String deleteChatName){
	
	boolean isDeleteChatName=false;
	int newIndex,oldIndex;
	for(newIndex=0, oldIndex=0; oldIndex<chatNames.length;oldIndex++){
		if(deleteChatName != chatNames[oldIndex]){
			
			chatNames[newIndex]=chatNames[oldIndex];
			newIndex++;		
		}	
	}
	chatNames=Arrays.copyOf(chatNames,newIndex);
	if(isDeleteChatName==true)
		System.out.println(deleteChatName+" deleted chat ");
		if(isDeleteChatName==false)
		System.out.println(deleteChatName+" not deleted chat ");
return isDeleteChatName;
}
}