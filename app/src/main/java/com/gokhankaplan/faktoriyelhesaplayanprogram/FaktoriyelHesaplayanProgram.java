package com.gokhankaplan.faktoriyelhesaplayanprogram;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    
        public static void main(String[] args) {

            int n;
            int r, total = 1, total2 = 1, total3= 1;

            Scanner input = new Scanner(System.in);
            System.out.println("Hadi bir sayı gir!");
            n = input.nextInt();
            System.out.println("Hadi bir sayı daha gir!");
            r = input.nextInt();

            if(n-r>0){

                for (int i = 1; i <= n; i++)
                {
                    total = total * i;
                }

                for (int k = 1; k <= r; k++)
                {
                    total2 = total2 * k;
                }

                for (int t = 1; t <= (n-r); t++)
                {
                    total3 = total3 * t;
                }

                double C = total/(total2 * total3);

                System.out.println("ilk Kombinasyon: " + total);
                System.out.println("ikinci Kombinasyon: " + total2);
                System.out.println("üçüncü Kombinasyon: " + total3);
                System.out.println("cnin değeri " + C);
            }
            else {
                System.out.println("Hatalı sayı girdiniz!");
            }
        }


}
