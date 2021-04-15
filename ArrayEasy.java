package dene1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEasy {


    public static void main(String[] args) {


        metot();


    }

    public static int[] metot(){
          int a=0;


        System.out.println("array uzunlugunu girin=");
        Scanner scan =new Scanner(System.in);
        a=scan.nextInt();
        int[] arraySon = new int[a];
        int[] arraySon2 = new int[a];
        for(int i=0; i<a;i++){
            System.out.println("degerleri girin ==");
            int b=scan.nextInt();
            arraySon[i]=b;
        }

        arraySon2[a-1]=arraySon[0];

        for(int i=0; i<arraySon.length-1;i++){
            arraySon2[i]=arraySon[i+1];
        }
        System.out.println(Arrays.toString(arraySon2));
        return arraySon2;
    }

    @Override
    public String toString() {
        return "sgasg{}";
    }
}
