/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Luh Kartika Sari 
 * NIM : 2201010094
 * 10 Juni 2024
 */
public class arraydim {
    int jdata = 3;
    String[] dmahasiswa = new String[jdata];
    Scanner dtIN = new Scanner(System.in);
    
   public void storedata(){
       
       System.out.println("Isikan Data Mahasiswa");
       System.out.println("~~~~~~~");
       
       int num=0;
       for(int i=0; i<jdata;i++){
            num++;
            
       System.out.print("Data ke-"+num+": ");
       dmahasiswa[i] = dtIN.nextLine(); 
      
       
       }
  
   }
   
   public void viewdata(){
       System.out.println("Daftar Mahasiswa");
       System.out.println("~~~~");
       
       int no=0;
       for(int i=0; i<jdata; i++){
           no++;
           
           System.out.println(no+". "+dmahasiswa[i]);
       }
   }
   public void editdata(){
       System.out.println("Ubah Data Mahasiswa");
       System.out.println("~~~~~");
       System.out.print("Index Data yang di Ubah: ");
       
       String id = dtIN.nextLine();
       int idx = Integer.parseInt(id);
       
       System.out.println("Data yang di Ubah: "+dmahasiswa[idx]);
       System.out.print("Di ubah menjadi: ");
       String newdt = dtIN.nextLine();
       dmahasiswa[idx] = newdt;
       System.out.println("data index ke-"+idx+" telah diubah");

   }
   
   public void destroydata(){
       System.out.println("Hapus Data Mahasiswa");
       System.out.println("~~~~~~");
       System.out.print("Data Mahasiswa telah dihapus ");
       
       String id = dtIN.nextLine();
       int idx = Integer.parseInt(id);  
       dmahasiswa[idx]="";
       
       System.out.println("Data index ke-"+idx+" telah di hapus");
   }
}
