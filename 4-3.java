import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] num = new int[1000000];
        
        for(int i=0; i<n; i++) {
        	num[i] = sc.nextInt();
        }
        
        int max=-1000001, min=1000001;
        
        for(int i=0; i<n; i++) {
        	if(num[i]>max) max=num[i];
        	if(num[i]<min) min=num[i];
        }
        
        System.out.print(min + " " + max);
        sc.close();
    }
}