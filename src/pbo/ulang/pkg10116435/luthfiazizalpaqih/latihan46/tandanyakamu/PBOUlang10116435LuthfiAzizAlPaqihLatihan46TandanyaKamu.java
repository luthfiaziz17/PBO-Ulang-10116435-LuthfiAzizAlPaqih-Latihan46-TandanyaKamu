/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.luthfiazizalpaqih.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Luthfi
 * NIM  : Luthfi Aziz Al Paqih
 * NAMA : 10116435
 */
public class PBOUlang10116435LuthfiAzizAlPaqihLatihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        int thnlahir = sc.nextInt();
        
        System.out.println();
        Age age1 = new Age(2018);
        age1.setYearBirth(thnlahir);
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age1.getYearBirth());
        System.out.println("Hari ini tahun : " + age1.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age1.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + ANSI_RED+age1.tandanyaKamu(age1.hitungUmur())+ANSI_RESET);
    }
    
}
