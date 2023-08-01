package LogicalPrograms;

import java.util.Scanner;

public class palindromenumber1 {

	public static void main(String[] args) {
		
		int Originalnumber,sum,rem;
		
		//Example -- 12345 ; 35412
		//1221 -1221 -
		
		System.out.println("Enter an number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		Originalnumber=num;
		
		//121
		
		  //0  ; 121>0  --True
		  // 121/10 -- 12
		  // 12>0  -- True
		  //12/10 --1
		  //1/10 - 0
		  //0>0 - false
		for(sum=0 ; num>0 ; num=num/10) {
			
			rem = num%10; //121%10 1 12%10 -->  1%10 -- 1
			sum = sum*10+rem; //0=0*10+1 == 1
			//1                 1=1*10+2 == 12
			                   //12 = 12*10+1 =121
			
		}
		//121==121
		if(sum==Originalnumber) {
			
			System.out.println(Originalnumber +"-->is a palindromenumber");
		}
		else {
			System.out.println(Originalnumber +"-->is not a palindromenumber");
		}
		

	}

}
