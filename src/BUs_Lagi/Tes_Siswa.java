/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUs_Lagi;

/**
 *
 * @author H4NS
 */
public class Tes_Siswa {
    public static void main(String[] args) {
        
        Encapsiswa siswa = new Encapsiswa();
        siswa.setName("Tio");
        siswa.setAge(15);
        siswa.setAddress("Malang");
        
        
        System.out.println("Nama : "+siswa.getName());
        System.out.println("Age : "+siswa.getAge());
        System.out.println("Addres : "+siswa.getAddress());
    }
}
