class IceCreamParlour{

	public static void main(String[] yummy){
	
	boolean isAdded = IceCream.createIceCreamList("DeathByChocolate");
	System.out.println("the ice cream is added" +isAdded);
    isAdded = IceCream.createIceCreamList("Brownie fudge");
	System.out.println("the ice cream is added" +isAdded);
	isAdded = IceCream.createIceCreamList("fruit zest");
	System.out.println("the ice cream is added" +isAdded);
	isAdded = IceCream.createIceCreamList("Strawberry punch");
	System.out.println("the ice cream is added" +isAdded);
	isAdded = IceCream.createIceCreamList("Tender Coconut");
	System.out.println("the ice cream is added" +isAdded);
	isAdded = IceCream.createIceCreamList("Senorita");
	System.out.println("the ice cream is added" +isAdded);
	
	
	IceCream.getIceCreamNames();	
	
}




}