/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal1;

/**
 *
 * @author User
 */
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String j, p;
        int t;
        
        System.out.print("Judul: ");
        j = input.nextLine();
        
        System.out.print("Penulis: ");
        p = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        t = input.nextInt();
        
        buku bukuu = new buku(j, p, t);
        
        bukuu.display();
        
    }

}
