/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_c_3076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Feisya Kartika 21103076S
 */
public class Quis1_C_3076 {

    public static void main(String[] args) {
        //Menambahkan object
        Nelayan_3076 n1 = new Nelayan_3076();
        Nelayan_3076 n2 = new Nelayan_3076();
        Dokter_3076 d1 = new Dokter_3076();
        Dokter_3076 d2 = new Dokter_3076();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
          System.out.println("NIK : ");
            n1.nik = br.readLine();
            System.out.println("Nama : ");
            n1.nama = br.readLine();
            System.out.println("Umur : ");
            n1.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n1.alamat = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n1.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n1.jmlSolar = Integer.parseInt(br.readLine());
          
            System.out.println();

            System.out.println("NIK : ");
            n2.nik = br.readLine();
            System.out.println("Nama : ");
            n2.nama = br.readLine();
            System.out.println("Umur : ");
            n2.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n2.alamat = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n2.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n2.jmlSolar = Integer.parseInt(br.readLine());
            
            System.out.println("=========== DATA NELAYAN ===========");
            n1.DataNelayan();
            System.out.println();
            
            n2.DataNelayan();
            System.out.println("");
            
            System.out.println("");

            System.out.println("NIK : ");
            d1.nik = br.readLine();
            System.out.println("Nama : ");
            d1.nama = br.readLine();
            System.out.println("Umur : ");
            d1.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d1.alamat = br.readLine();
            System.out.println("Jml Pasien : ");
            d1.jmlPasien = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d1.jmlObat = Integer.parseInt(br.readLine());
            

            System.out.println();

            System.out.println("NIK : ");
            d2.nik = br.readLine();
            System.out.println("Nama : ");
            d2.nama = br.readLine();
            System.out.println("Umur : ");
            d2.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d2.alamat = br.readLine();
            System.out.println("Jml Pasien : ");
            d2.jmlPasien = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d2.jmlObat = Integer.parseInt(br.readLine());
       
            
            System.out.println("=========== DATA DOKTER ===========");
            d1.DataDokter();
            System.out.println();
            
            d2.DataDokter();
            System.out.println("");

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}
