class Ncr{
	
	public static int findNcr(int n, int r) {
        int numerator = Factorial.toGetFact(n);
        int denominator = Factorial.toGetFact(r) * Factorial.toGetFact(n - r);
        int result= numerator / denominator;
		return result;
	}	

	
	
}