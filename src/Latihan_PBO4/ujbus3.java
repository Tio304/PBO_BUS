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
public class ujbus3 {
    public static void main(String[] abc) {
        Main_dulu Bus = new Main_dulu(5);
        Bus.getpenumpang(10);
         Bus.getpenumpang(45);
         Bus.cetakpenumpang();
        
         //Penabahan Penumpang
         Bus.addpenumpang(5);//Tambah 2 penumpang
         Bus.cetakpenumpang();
         
         //penambahan penumpang 
         Bus.addpenumpang (3);
         Bus.cetakpenumpang();
         
         Bus.addpenumpang(6);
         Bus.cetakpenumpang();
         
         Bus.addpenumpang(6);
         Bus.cetakpenumpang();
    }
}
