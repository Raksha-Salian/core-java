class RcbookDetails{
public static void main(String info[]){

boolean rcCard=Rcbook.detailsofRccard("20/03/2015","ME4KC09CC8441950",9094,
"Raksha Salian","Black","KC09E86441950");
if(rcCard==true){
	 Rcbook.registorBikeDetails();
}else{
	System.out.println("details not found");
}

}


}