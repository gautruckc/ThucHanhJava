/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author KIMCHUNG
 */
public class Character {
    Scanner keyboard = new Scanner(System.in);
    
    public String Name; /*ten nhan vat*/
    public int HP; //chi so mau
    public int ATK; // chi so tan cong
    public int DEF; // chi so phong thu
    public int ATKspeed; // toc do tan cong
    public int Level; // cap do
    public int ClassId; // id lop nhan vat
    public int WeaponId; // id vu khi
    
    Character nextCharacter;
    
    Character(){
    }
    
    // input a character
    public void InputCharacter(){
        
    Scanner inp = new Scanner(System.in); //tao doi tuong inp thuoc lop Scanner
    System.out.print("Insert name : "); //Lenh in ra man hinh
    Name = inp.nextLine(); //nhap chuoi
    System.out.print("Insert your age: ");
    HP = inp.nextInt(); //nhap so nguyen
    System.out.println("Insert your Math: ");
    ATK = inp.nextInt();
    System.out.printf("My name is %s , I %d yaers old and I am %.2f math scoren", Name, HP, ATK);
        
        
        
//    System.out.println("Input character: ");
//    
//    System.out.println("Name: ");
//    Name = keyboard.nextLine();
//    
//    System.out.println("HP: (HP ≥ 0)");
//    HP = Integer.parseInt(keyboard.nextLine());
//    
//    System.out.println("ATK: (ATK ≥ 0)");
//    ATK = Integer.parseInt(keyboard.nextLine());
//    
//    System.out.println("DEF: ((DEF ≥ 0)");
//    DEF = Integer.parseInt(keyboard.nextLine());
//    
//    System.out.println("ATKspeed: (speed ≥ 0)");
//    ATKspeed = Integer.parseInt(keyboard.nextLine());
//    
//    System.out.println("Level:  (1 ≤ level ≤ 60)");
//    Level = Integer.parseInt(keyboard.nextLine());
//    
//    System.out.println("ClassId: ");
//    ClassId = Integer.parseInt(keyboard.nextLine());
//    
//    System.out.println("WeaponId: ");
//    WeaponId = Integer.parseInt(keyboard.nextLine());
    }
    
    // output a character
    public void OutputCharacter(){
    System.out.println(" --- Character ---");
    System.out.println("Name: " + Name);
    System.out.println("HP: " + HP);
    System.out.println("ATK: " + ATK);
    System.out.println("DEF: " + DEF);
    System.out.println("ATKspeed: " + ATKspeed);
    System.out.println("Level: " + Level);
//    System.out.println("ClassId: " + ClassId);
//    System.out.println("WeaponId: " + WeaponId);
    }
}
