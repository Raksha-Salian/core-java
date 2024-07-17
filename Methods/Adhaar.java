class Adhaar{
        static String urName;
		static String fName;
		static String mName;
		static String birth;
		static String gen;
		static long adharNo;
		static String adrs;

public static boolean createAdhaar(String name, String fatherName, String motherName, 
String dob, String gender, long adhaarNumber, String address){
boolean isAdhaarCreated = false;
		urName = name;
		fName = fatherName;
		mName = motherName;
		birth = dob;
		gen = gender;
		adharNo = adhaarNumber;
		adrs = address;
		
		return isAdhaarCreated;

}

public static void getAdhaarDetails(){

        System.out.println("the name is :" +urName);
        System.out.println("the father name:" +fName);
		System.out.println("the mother name:" +mName);
		System.out.println("date of birth:" +birth);
		System.out.println("the gender is :" +gen);
		System.out.println("the adhaar number is :" +adharNo);
		System.out.println("the address is :" +adrs);	
		
	
}

}
