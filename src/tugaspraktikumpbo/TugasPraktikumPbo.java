/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo;

import java.util.Scanner;
import tugaspraktikumpbo.ruang.Balok;
import tugaspraktikumpbo.ruang.Tabung;

/**
 *
 * @author ASUS
 */
public class TugasPraktikumPbo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner pilih = new Scanner(System.in);
        int menu;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            menu = pilih.nextInt();
        
            switch (menu){
                case 1:
                    System.out.print("Panjang = "); int panjang = pilih.nextInt();
                    System.out.print("Lebar = "); int lebar = pilih.nextInt();
                    System.out.print("Tinggi = "); int tinggi = pilih.nextInt();
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    
                    System.out.println("Luas Persegi Panjang : " + balok.Luas());
                    System.out.println("Keliling Persegi Panjang : " + balok.Keliling());
                    System.out.println("Volume Balok : " + balok.Volume());
                    System.out.println("Luas Permukaan Balok : " + balok.LuasPermukaan());
                    
                    break;
                    
                case 2 :
                    System.out.print("Tinggi = "); int Tinggi = pilih.nextInt();
                    System.out.print("Jari-jari = "); double jari = pilih.nextDouble();
                    
                    Tabung tabung = new Tabung(jari, Tinggi);
                    
                    System.out.println("Luas Lingkaran : " + tabung.Luas());
                    System.out.println("Keliling Lingkaran : " + tabung.Keliling());
                    System.out.println("Volume Tabung : " + tabung.Volume());
                    System.out.println("Luas Permukaan Tabung : " + tabung.LuasPermukaan());
                    
                    break;
                    
                case 3 :
                    System.out.println("Keluar..");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (menu != 3);
    } 
    
}
