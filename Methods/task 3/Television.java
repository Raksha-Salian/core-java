class Television{
static boolean isConnected= false;
 
 public static void onOrOff(){
 
 System.out.println("onOff started here");
 if(isConnected == false){
 
 isConnected = true;
 System.out.println("the Television is on");
 }
 else if(isConnected == true) {
 isConnected = false;
 System.out.println("the television is off");
 
 }
}else{
System.out.println("onOff ended here");

}
 

 
 
 
 }










}