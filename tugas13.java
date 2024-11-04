/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author NITRO V 15
 */
public class tugas13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("\nMERAH\nHIJAU\nBIRU\nUNGU");
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        String warnaFavorit = scanner.nextLine().toUpperCase();
        System.out.print("NAMA ANDA : ");
        String nama = scanner.nextLine();

        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "====");
        System.out.println("Warna favoritmu adalah " + warnaFavorit);

        switch (warnaFavorit) {
            case "MERAH" -> System.out.println("1. Enerjik,\n2. Percaya diri,\n3. Berani,\n4. Dinamis,\n5. Penuh semangat");
            case "HIJAU" -> System.out.println("1. Tenang,\n2. Seimbang,\n3. Harmonis,\n4. Ramah,\n5. Penuh kasih sayang");
            case "BIRU" -> System.out.println("1. Menyenangkan,\n2. Bijaksana,\n3. Pahamkan diri tenang saat menghadapi masalah,\n4. Dinamis,\n5. Senang berbagi,\n6. Bersahabat,\n7. Tidak terlalu suka menjadi sorotan banyak orang,\n8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
            case "UNGU" -> System.out.println("1. Misterius,\n2. Kreatif,\n3. Sensitif,\n4. Penuh imajinasi,\n5. Artistik");
            default -> System.out.println("Warna yang kamu pilih tidak terdaftar di tes ini.");
        }
    }
}


