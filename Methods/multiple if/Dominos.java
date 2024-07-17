class Dominos{
	
public static double fried(String tindi){

System.out.println("the ordered food in dominos");

if(tindi == "Gralic Breadsticks"){
       return 99.00;
}else if(tindi == "Cheese n corn"){
       return 250.00;
}else if(tindi == "Mirinda"){
       return 60.00;
}else if(tindi == "Bailley"){
       return 20.00;  
}else if(tindi == "Ice tea"){
       return 60.00;
}else if(tindi == "Rolls"){
       return 70.43;
}else if(tindi == "Spices "){
      
	   return 61.90;
	   
       
}else if(tindi == "Nachos"){
       return 85.00;
}else if(tindi == "Chicken Pizza"){
        return 120.00;
}else{
System.out.println("the dish not found");
}
return 0.00;


}

}