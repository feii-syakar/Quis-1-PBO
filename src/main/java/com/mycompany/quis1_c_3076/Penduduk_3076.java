/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_c_3076;

/**
 *
 * @author Feisya Kartika 21103076S
 */
public class Penduduk_3076 {
    protected String nik;
    protected String nama;
    protected int umur;
    protected String alamat;
    
    public Penduduk_3076(){
        this.nik = nik;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public double totalPendapatan(){
        return 0;
    }
    
    public void tampilDataPenduduk(){
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Umur : "+ umur);
        System.out.println("Alamat : "+ alamat);
    }
}
