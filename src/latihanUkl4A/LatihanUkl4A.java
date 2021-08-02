/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanUkl4A;

public class LatihanUkl4A {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        int n, a, b, sukuPertama, selisih, nilaiSaatIni;
        n = 4;
        sukuPertama = 5;
        selisih = 5;
        for (a=0; a<=n; a++){
            for (b=0; b<a; b++){
                nilaiSaatIni = sukuPertama;
                sukuPertama += selisih;
                System.out.print(nilaiSaatIni + " ");
                
            }
            System.out.println();
        }
        
    }
    
}
