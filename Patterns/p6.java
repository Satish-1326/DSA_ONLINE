import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number to print pattern : ");
		int n = sc.nextInt();

		System.out.print("Enter a number to print pattern : ");
		int m = sc.nextInt();

		int a = 1 ;

		for(int i = 1 ; i <= n ; i++){
			for(int j = 1 ; j <= m ; j++){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}

/*

OUTPUT :

Enter a number to print pattern : 3
Enter a number to print pattern : 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15

*/