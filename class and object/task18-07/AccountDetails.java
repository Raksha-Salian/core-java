class AccountDetails{

        String accountHolderName;
		int customerId;
		String bankname;
		String branchName;
		String ifscCode;
		long accountNumber;
		String address;
		String accountType;
		
		
public boolean createAccount(String accountHolderName,int customerId,String bankname,String branchName,String ifscCode,
long accountNumber,String address,String accountType){
boolean isAccountCreated = false;
if(accountHolderName != null && customerId > 0 && bankname != null && branchName != null && ifscCode != null && accountNumber > 0 && 
 address != null && accountType != null){
 
		this.accountHolderName = accountHolderName;
		this.customerId =customerId;
		this.bankname =bankname;
		this.branchName =branchName;
		this.ifscCode =ifscCode;
		this.accountNumber =accountNumber;
		this.address =address;
		this.accountType =accountType;

 
 
 }
return isAccountCreated; 

}
public void getDetails(){
		System.out.println("the accountHolderName" +accountHolderName);
		System.out.println("the customer id" +customerId);
		System.out.println("the bank name" +bankname);
		System.out.println("the branch name"+branchName);
		System.out.println("the ifsc code" +ifscCode);
		System.out.println("the account number" +accountNumber);
		System.out.println("the address" +address);
		System.out.println("the account type" +accountType);



}
	




}