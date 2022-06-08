import java.util.Arrays;
import java.util.Scanner;

public class ArrayEasy {


    public static void main(String[] args) {
        new Gui();
        
        
    }

    public static int[] metot(int[] dizi1){
        
        int[] arraySon = dizi1;
        int[] arraySon2 = new int[dizi1.length];

        for(int i=0; i<dizi1.length;i++){
            
            arraySon[i] = dizi1[i];
        }

        arraySon2[dizi1.length-1] = arraySon[0];

        for(int i=0; i<arraySon.length-1;i++){
            arraySon2[i]=arraySon[i+1];
        }
        

        
        return arraySon2;

    }

    @Override
    public String toString() {
        return "sgasg{}";
    }

    

}
