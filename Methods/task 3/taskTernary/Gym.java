class Gym{

static String GymName = "Apple Fitness";
static String gymEquiptment[] = {null, null, null, null, null, null, null, null};
static int index;
	public static boolean gymEquiptment(String equipmentsName){

		System.out.println("equipment names started here");
		boolean isEquipment = false;
		if(equipmentsName != null){
		
		 gymEquiptment[index] = equipmentsName;
		 index++;
		 isEquipment = true;
		
		}else	System.out.println("the value cannot be null");
		return isEquipment;
		
}
		
    public static void getEquipmentNames(){
		for(String equipmentsName:gymEquiptment){
			
			System.out.println(equipmentsName);
		}		
		
}

}
