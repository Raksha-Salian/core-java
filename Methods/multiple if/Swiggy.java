class Swiggy{
	
public static double khanaOrder(String Khana){

System.out.println("the food list");

if(Khana == "Oreo Milkshake"){
       return 269.00;
}else if(Khana == "Nutella"){
       return 320.00;
}else if(Khana == "Fruit Box"){
       return 109.00;
}else if(Khana == "Aloo Paratha"){
       return 235.00;  
}else if(Khana == "Puri Bhaji"){
       return 200.00;
}else if(Khana == "Poha"){
       return 79.00;
}else if(Khana == "Chiken Mappan"){
       return 250.00;
}else if(Khana == "Coke"){
       return 105.00;
}else if(Khana == "FrenchFries"){
       return 95.00;
}else if(Khana == "Nuggets"){
       return 423.00;
}else if(Khana == "PeriPeriMix"){
       return 20.00;
}else if(Khana == "LotusBiscoff"){
       return 291.43;
}else if(Khana == "CuppuccinoCoffee"){
       return 201.90;
}else if(Khana == "FushionShawarma"){
       return 85.00;
}else if(Khana == "Platter"){
       return 110.00;
}else{
System.out.println("the food not found");
return 0.00;
}

}

}