import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to draw pattern : ");
		int n = sc.nextInt();

		System.out.print("Enter a number to draw pattern : ");
		int m = sc.nextInt();

		for(int i = 1 ; i <= n ; i++){
			for(int j = 1 ; j <= m ; j++){
				if(i == j || i + j == n + 1){
					System.out.print(" * ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

/*

OUTPUT :

Enter a number to draw pattern : 7
Enter a number to draw pattern : 7
 *            *
   *        *
     *    *
       *
     *    *
   *        *
 *            *

*/