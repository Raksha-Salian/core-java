class GymRunner{

	public static void main(String[] build){
	
	boolean isAdded = Gym.gymEquiptment("tread mill");
	System.out.println("the equipment is added" +isAdded);
    isAdded = Gym.gymEquiptment("dumbells");
	System.out.println("the equipment is added" +isAdded);
	isAdded = Gym.gymEquiptment("bench press");
	System.out.println("the equipment is added" +isAdded);
	isAdded = Gym.gymEquiptment("barbell rod");
	System.out.println("the equipment is added" +isAdded);
	isAdded = Gym.gymEquiptment("stepper");
	System.out.println("the equipment is added" +isAdded);
	isAdded = Gym.gymEquiptment("Stretch bands");
	System.out.println("the equipment is added" +isAdded);
	isAdded = Gym.gymEquiptment("boxing Bag");
	System.out.println("the equipment is added" +isAdded);
	isAdded =Gym.gymEquiptment("plates");
	System.out.println("the equipment is added" +isAdded);
	
	
	Gym.getEquipmentNames();	
	
}




}