class IceCreamParlourr{

	public static void main(String[] yummy){
	
	boolean isAdded = IceCreamm.createIceCreamList("DeathByChocolate");
	System.out.println("the ice cream is added" +isAdded);
    isAdded = IceCreamm.createIceCreamList("Brownie fudge");
	System.out.println("the ice cream is added" +isAdded);
	isAdded = IceCreamm.createIceCreamList("fruit zest");
	System.out.println("the ice cream is added" +isAdded);
	isAdded = IceCreamm.createIceCreamList("Strawberry punch");
	System.out.println("the ice cream is added" +isAdded);
	isAdded = IceCreamm.createIceCreamList("Tender Coconut");
	System.out.println("the ice cream is added" +isAdded);
	isAdded = IceCreamm.createIceCreamList("Senorita");
	System.out.println("the ice cream is added" +isAdded);
	
	
	IceCreamm.getIceCreamNames();	
	boolean cold = IceCreamm.upadateIceCreamName("Tender Coconut" , "Chocolate scoop");
	System.out.println("the updateed ice cream is"+cold);
}




}