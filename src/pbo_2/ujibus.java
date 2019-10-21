/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_2;

/**
 *
 * @author H4NS
 */
public class ujibus {
    public static void main(String[]args){
        PBO_2 busmini = new PBO_2();
        busmini.penumpang= 5;
        busmini.maxpenumpang= 15;
        busmini.cetak();
        
        busmini.penumpang = busmini.penumpang+5;
        busmini.penumpang=busmini.penumpang-2;
        
        busmini.penumpang=busmini.penumpang+ 5;
        busmini.cetak();
    }
    
}
