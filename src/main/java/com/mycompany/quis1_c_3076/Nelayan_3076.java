/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_c_3076;

/**
 *
 * @author Feisya Kartika 21103076S
 */
public class Nelayan_3076 extends Penduduk_3076 {
    int jmlBeratIkan;
    int jmlSolar;
    double totalPendapatNelayan;

    public Nelayan_3076(){
        this.jmlBeratIkan = jmlBeratIkan;
        this.jmlSolar = jmlSolar;
    }
    
    public double totalPendapatan() {
        totalPendapatNelayan = (jmlBeratIkan * 8000) - (jmlSolar * 10000);
        return totalPendapatNelayan;
    }
    
    public void DataNelayan(){
        super.tampilDataPenduduk();
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar);
        System.out.println("Total pendapatan nelayan : Rp " + totalPendapatan());
    }
}
