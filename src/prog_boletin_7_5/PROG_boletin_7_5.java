package prog_boletin_7_5;

import java.util.Scanner;

public class PROG_boletin_7_5 {

    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Introduce número 1:");
        float num1=scanner1.nextFloat();
        System.out.println("Introduce número 2:");
        float num2=scanner1.nextFloat();
        System.out.println("Introduce número 3:");
        float num3=scanner1.nextFloat();
        
    Comparador comparo=new Comparador();
    comparo.setNumero1(num1);
    comparo.setNumero2(num2);
    comparo.setNumero3(num3);
    comparo.numeroMayor();
    
    }
    
}
