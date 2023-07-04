import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time t1 = new Time();
		t1.h = sc.nextInt();
		t1.m = sc.nextInt();
		t1.add_m = sc.nextInt();
		
		t1.m+=t1.add_m;
		if(t1.m+t1.add_m>=60) {
			while(t1.m>=60) {
				t1.m-=60;
				t1.h++;
				if(t1.h==24) t1.h=0;
			}
		}
		else t1.m+=t1.add_m;
		System.out.println(t1.h+" "+t1.m);
	}
}

class Time {
	int h;
	int m;
	int add_m;
}