package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ortalama,toplam=0,sayac=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        if (mat >= 0 && mat <= 100){
            toplam += mat;
            sayac++;
        }else{
        System.out.println("Girdiginiz notun 0 ile 100 arasında olmasına dikkat ediniz!");
    }


        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100){
            toplam += fizik;
            sayac++;
        }else{
            System.out.println("Girdiginiz notun 0 ile 100 arasında olmasına dikkat ediniz!");
        }

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100){
            toplam += turkce;
            sayac++;
        }else{
            System.out.println("Girdiginiz notun 0 ile 100 arasında olmasına dikkat ediniz!");
        }

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100){
            toplam += kimya;
            sayac++;
        }else{
            System.out.println("Girdiginiz notun 0 ile 100 arasında olmasına dikkat ediniz!");
        }

        System.out.println("Müzik notunuz : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100){
            toplam += muzik;
            sayac++;
        }else{
            System.out.println("Girdiginiz notun 0 ile 100 arasında olmasına dikkat ediniz!");
        }

        ortalama = toplam / sayac;
        if (ortalama>=55){
            System.out.println("Tebrikler! Sinifi gectiniz..");
        }
        else {
            System.out.println("Sinifi gecemediniz! ");
        }
        System.out.println("Ortalamaniz:" + ortalama);






    }
}
