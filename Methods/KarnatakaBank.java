class KarnatakaBank{

static double balance;
   
     public static void debit(double amount){
     System.out.println("debit started");
	 if(amount <= balance)
     balance = balance -  amount;
 else{
     System.out.println("insufficient balance");
 }
	 System.out.println("the balance is:" +balance);
     System.out.println("debit eneded");
     return;
   
   }


    public static void credit(double amount){
	System.out.println("credit started");
	if(amount > 0)
	balance = balance + amount;
else{
	System.out.println("cannot be credited");
}
	System.out.println("credit ended");
	return;
	}

    public static double getBalance(){
	
	  return balance;
	
	
	
	}








}