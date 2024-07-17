class Girijas{

static String ApplianceName = "Prisha";
static String homeAppliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
static int index;
	public static boolean createhomeAppliance(String appliancesName){

		System.out.println("Appliances names started here");
		boolean isAppliance = false;
		if(equipmentsName != null){
		
		 homeAppliances[index] = appliancesName;
		 index++;
		 isAppliance = true;
		
		}else	System.out.println("the value cannot be null");
		return isAppliance;
		
}
		
    public static void gethomeAppliance(){
		for(String appliancesName:homeAppliances){
			
			System.out.println(appliancesName);
		}		
		
}

}
