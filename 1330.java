import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();

        scn.close();

        if(A < B){
            System.out.println("<");
        } else if(A > B){
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}