class Passport{
	   static String cprLoc ;
	   static int dcdrLoc;
	   static String surNm ;
	   static String gvnNm ;
	   static String birth ;
	   static String mail ;
	   static boolean isMail ;
	   static String idNm ;
	   static String pwd ;
	   static String cnfpwd ;
	   static String hintQuestion ;
	   static String hintAnswer;
	   static String cap;
public static boolean createPassport(String cprLocation,int dcdrLocation, String givenName,String surname,
 String dob, String email, boolean isloginSameEmail,String Id, String password, String confpassword, 
 String hintsQue, String hintAns, String captcha)
 {
     if(dcdrLocation != null && dcdrLocation>0 && surname != null && givenName != null && dob != null && email != null
	 isloginSameEmail != false && Id != null && password != null && confpassword != null 
	 && hintsQue != null && hintAns != null && captcha != null )
	 { 
       cprLoc = cprLocation;
	   dcdrLoc = dcdrLocation;
	   surNm = surname;
	   gvnNm = givenName;
	   birth = dob;
	   mail = email;
	   isMail = isloginSameEmail;
	   idNm = Id;
	   pwd = password;
	   cnfpwd = confpassword;
	   hintQuestion = hintsQue;
	   hintAnswer = hintAns;
	   cap = captcha;
	   boolean isPassportDataCreated=true;
	 }else{
		 System.out.println("all the values should be given mandatorily");
	 } 

return isPassportDataCreated;
 }
 
 public static void getPassportDetails(){
 
 System.out.println("The cprLocation is :"+cprLoc);
System.out.println("The dcdrLocationis :"+dcdrLoc);
System.out.println("The sur name is :"+surNm);
System.out.println("The GivenName is :"+gvnNm);
System.out.println("The DOB is :"+birth);
System.out.println("The Email is :"+mail);
System.out.println("is loginsame email :"+isMail);
System.out.println("The login id is :"+idNm);
System.out.println("The Password is :"+pwd);
System.out.println("The ConformPassword :"+cnfpwd);
System.out.println("The hintQuestion:"+hintQuestion);
System.out.println("The QuestionAnswer :"+hintAnswer);
System.out.println("The Captcha :"+cap);
}
}