import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time t1 = new Time();
		t1.h = sc.nextInt();
		t1.m = sc.nextInt();
		
		if(t1.m-45<0) {
			t1.m+=60-45;
			if(t1.h==0) t1.h=24;
			t1.h--;
		}
		else t1.m-=45;
		System.out.println(t1.h+" "+t1.m);
		
	}
}

class Time {
	int h;
	int m;
}