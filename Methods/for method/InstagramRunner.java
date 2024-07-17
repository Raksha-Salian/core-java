class InstagramRunner{
	
	
	
	
public static void main (String[] info){

 boolean isaccountcreated=Instagram.createaccount("Raksha","rakshasalian05@gmail.com",9019957462L,"raksha123","raksha123");
 if(isaccountcreated == true){
 Instagram.getinfo();
 }else {
	 System.out.println("Please Provide Correct Details");
 }



}


}