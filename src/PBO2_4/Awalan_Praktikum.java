/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2_4;

/**
 *
 * @author H4NS
 */
public class Awalan_Praktikum {
    public double penumpang;
    public double maxpenumpang;
    public int counter = 0;
    public double penumpangbaru;
    public double ratarata;
    public Awalan_Praktikum(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addpenumpang(double penumpang){
      double temp;
    
    temp = this.penumpang+penumpang;
    if(temp > maxpenumpang){
        System.out.println("Berat Badan Penumpang Melebihi Kuota");
    } else{
        this.penumpang=temp;
    } 
    counter++;
    }
    public void getpenumpang(int password){
        if (password==24){
            System.out.println("Password Benar");
        }else{System.out.println("Password Salah");
            
        }
    }
    public void getAverage(){
        ratarata = this.penumpang/counter;
    }
    public void cetakpenumpang(){
        System.out.println("Berat Penumpang Bus Sekarang = "+penumpang);
        System.out.println("Berat Maksimum Penumpang Seharusnya Adalah = "+maxpenumpang);
        System.out.println("Rata-Rata Berat Badan Penumpang = "+ratarata);
    }
}
