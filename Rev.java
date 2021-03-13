/**
* Name : Mahima
* Description : sum of number
* Date : 12/3/21
*/

class Rev{
	public static void main(String[] args) {
	int n=5823, rev=0,digit=0;
	while(n!=0){
	digit=n%10;
	rev=rev*10+digit;
	n=n/10;
	}
	System.out.println("Reversed Number" +rev);
	}
	}