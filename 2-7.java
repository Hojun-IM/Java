import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int P;
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A==B && B==C) P=10000+(A*1000);
		else if(A==B && B!=C) P=1000+(A*100);
		else if(B==C && A!=B) P=1000+(B*100);
		else if(A==C && C!=B) P=1000+(C*100);
		else {
			if(A>B && A>C) P=A*100;
			else if(B>A && B>C) P=B*100;
			else P=C*100;
		}
		System.out.println(P);
	}
}