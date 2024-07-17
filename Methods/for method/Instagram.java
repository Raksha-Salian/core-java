class Instagram  {

static String nameis;
static String emailis;
static long cellnois;
static String  passwordis;
static String  conformpasswordis;

		public static boolean createaccount(String name, String email,long cellno,String password,String conformpassword){
				boolean isaccountcreated = false;
				boolean isnamevaild=false;
				boolean isemailvaild=false;
				boolean iscellnois= false;
				boolean ispassword = false;
				boolean isconformpassword = false;
				if (name!=null){
				nameis = name;
				isnamevaild= true;
				}else {
					System.out.println("Provide correct Details");
				}
				
				if (email!=null){
				emailis = email;
				isemailvaild = true;
				}else{
					System.out.println("Provide correct Details");
				}
				
				if (cellno>0){
				cellnois = cellno;
				iscellnois = true;
				}else{
					System.out.println("Provide correct cell NO");
				}
				
				if (password!=null){
				passwordis = password;
				ispassword = true;	
				}else{
					System.out.println("Provid correct Details");
				}
				if (conformpassword!=null){
				conformpasswordis = conformpassword;
				isconformpassword = true;
				}else{
					System.out.println("Provid Correct Password");
				}
				
				if(isnamevaild&&isemailvaild&&iscellnois&&ispassword&&isconformpassword){
				isaccountcreated = true;	
				}
	
		return isaccountcreated;
		}
		
		public static void getinfo(){
			System.out.println("Name is = "+ nameis);
			System.out.println("Email is ="+ emailis);
			System.out.println("Cell No ="+ cellnois);
			System.out.println("Password ="+ passwordis );
			System.out.println("Conform Password"+ conformpasswordis );
		}

}