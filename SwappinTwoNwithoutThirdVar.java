package LogicalPrograms;

public class SwappinTwoNwithoutThirdVar {

	public static void main(String[] args) {
		
		int a=10, b=20 ;  //Exp - a=20,b=10
				
				System.out.println("Before Swapping Values :"+a+" "+b);
		
		a=a+b;  //30
		b=a-b;  //30-20 --10
		a=a-b;  //30-10 -- 20
		
		System.out.println("Before Swapping Values :"+a+" "+b);

	}

}
