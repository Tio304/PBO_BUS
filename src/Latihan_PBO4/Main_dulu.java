/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_PBO4;

/**
 *
 * @author H4NS
 */
public class Main_dulu {
    public int penumpang;
    public int maxpenumpang;
    
    public Main_dulu(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        
    }
    //Method mutator
    public  void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("Penumpang Melebihi Kuota");
        }else{
            this.penumpang=temp;
        }
        
    }
    public  void getpenumpang(int password ) {
        if(password==24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimum Penumpang yang Seharusnya = "+maxpenumpang);
    }
}
