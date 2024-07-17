class RelianceMart{

public static double mart(String item){

System.out.println("the item price");

    if(item == "soap"){
	   return 50.00;
	}
	if(item == "book"){
	    return 25.00;
	}
    if(item == "Biscuits"){
	    return 70.00;
	}
	if(item == "Perfume"){
	    return 100.00;
	}
	if(item == "Shampoo"){
	    return 495.20;
	}
	if(item == "Paste"){
	    return 89.00;
	}else{
		System.out.println("the product not found");
	}return 0.00;
	
}


}