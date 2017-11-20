import java.util.Scanner;
public class Main4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int tmp = 0;
        String str = "";
        if(v1<0){
            tmp = 128+v1;
        }
        else{
            tmp = v1;
        }
        while(tmp>1){
            str = Integer.toString(tmp%2)+str;
            tmp = tmp/2;
        }
        str = Integer.toString(tmp);
        System.out.println(str);
    }
}