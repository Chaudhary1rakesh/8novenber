package first_java_programe;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Numbers :" +x+" "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("Swapped :"+x+" "+y);
		System.out.println(" ");
		
	}

}
