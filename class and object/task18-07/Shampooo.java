class Shampooo{


	String brandName;
	int    id;
	String quantity;
	String type;
	double price;
	String mgfDate;
	String expDate;

public boolean createShampoo(String brandName,int id,String quantity, String type,double price,String mgfDate,String expDate){

System.out.println("shampoo is created");
boolean isShampooCreated = false;
if(brandName != null && id > 0 && quantity != null  && type!= null && price >0 && mgfDate != null && expDate != null){
	this.brandName= brandName;
	this.id = id;
	this.quantity = quantity;
	this.type = type;
	this.price = price;
	this.mgfDate = mgfDate;
	this.expDate = expDate;
}
return isShampooCreated;
}

public void getinfo(){
System.out.println("the name of the shampoo is:" +brandName);
System.out.println("the id of the shampoo is:" +id);
System.out.println("the quantity of the shampoo is:" +quantity);
System.out.println("the price of the shampoo is:" +price);
System.out.println("the mgf date of the shampoo is:" +mgfDate);
System.out.println("the exp date of the shampoo is:" +expDate);

}



}