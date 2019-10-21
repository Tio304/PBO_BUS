/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_2.bus;

/**
 *
 * @author H4NS
 */
public class Ujibuss_main {
    public static void main(String[] args) {
        ujibuss  busbesar= new ujibuss(40);
        busbesar.cetak();
        
        busbesar.addpenumpang(15);
        busbesar.cetak();
        
        busbesar.addpenumpang(5);
        busbesar.cetak();
        
        busbesar.addpenumpang(26);
        busbesar.cetak();
    }
    
}
