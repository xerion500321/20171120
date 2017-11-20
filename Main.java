import java.util.Scanner;
public class Main {

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    float max = Float.MIN_VALUE;
    float min = Float.MAX_VALUE;
    for(int i=0 ; i<=10 ; i++){
       float v1 = scn.nextFloat();
        if(max<v1){
            max=v1;
        }
        if(min>v1){
            min=v1;
        }
    }System.out.println("Max:"+max+"\nmax="+min);

}
    }
