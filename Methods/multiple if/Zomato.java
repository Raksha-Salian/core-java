class Zomato{
	
public static double zfood(String foodName){

System.out.println("the price of death by chocolate is");

if(foodName == "Pizza"){
       return 99.00;
}else if(foodName == "DeathByChocolate"){
       return 230.00;
}else if(foodName == "ChillyPaneer"){
       return 275.00;
}else if(foodName == "ChickenBiryani"){
       return 295.00;  
}else if(foodName == "PrawnsFry"){
       return 350.00;
}else if(foodName == "SheekKabab"){
       return 260.00;
}else if(foodName == "ChickenPopCorn"){
       return 180.00;
}else if(foodName == "Coke"){
       return 105.00;
}else if(foodName == "FrenchFries"){
       return 95.00;
}else if(foodName == "Nuggets"){
       return 423.00;
}else if(foodName == "PeriPeriMix"){
       return 20.00;
}else if(foodName == "LotusBiscoff"){
       return 291.43;
}else if(foodName == "CuppuccinoCoffee"){
       return 201.90;
}else if(foodName == "FushionShawarma"){
       return 85.00;
}else if(foodName == "Platter"){
       return 110.00;
}else{
System.out.println("the food not found");
return 0.00;
}

}

}