/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Scanner;
/**
 *
 * @author KIMCHUNG
 */
public class CharacterClass {
    Scanner keyboard = new Scanner(System.in);
    
    int ID;
    String Name;
    
    CharacterClass nextCharacterClass;
    
    // inout character class
    public void InputCharacterClass(){
    System.out.println("Input Class Character: ");
    
    System.out.println("ID: ");
    ID = Integer.parseInt(keyboard.nextLine());
    
    System.out.println("Name: ");
    Name = keyboard.nextLine();
    }
    
    // output character class
    public void OutputCharacterClass(){
    System.out.println(" - - CharacterClass ");
    System.out.println(" - - ID: " + ID);
    System.out.println(" - - Name: " + Name);
    }
    
}
