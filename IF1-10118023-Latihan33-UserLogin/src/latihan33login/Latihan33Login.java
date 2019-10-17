/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan33login;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : (Object Oriented) User Login
 */

public class Latihan33Login {
    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Username = ");
        usName = input.nextLine();
        
        System.out.print("Masukkan Password = ");
        passWord = input.nextLine();
        System.out.println("");
        
        User user = new User();
        user.pengecekkanLogin(usName, passWord);
      
    }
    
}
