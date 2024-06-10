/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Luh Kartika Sari 
 * NIM : 2201010094
 * 10 Juni 2024
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arraydim AD = new arraydim();
        Scanner dIN = new Scanner(System.in);
        String bubar = "TIDAK";

        do {
                System.out.println("Aplikasi Catatan Data Mahasiswa");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("1. Isi Data");
                System.out.println("2. Tampil Data");
                System.out.println("3. Ubah Data");
                System.out.println("4. Hapus Data");
                System.out.println("5. Selesai");
                System.out.print("Pilih menu: ");

                String ch = dIN.nextLine();
                switch (ch) {
                    case "1":
                        AD.storedata();
                        break;

                    case "2":
                        AD.viewdata();
                        break;

                    case "3":
                        AD.editdata();
                        break;

                    case "4":
                        AD.destroydata();
                        break;

                    case "5":
                        bubar = "YA";
                        break;

                    default:
                        System.out.println("Menu Pilihan Tidak Terdefinisi");
                        break;
                }
            }while (bubar.equals("TIDAK"));
    }
    
}
    
