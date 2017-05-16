/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author KIMCHUNG
 */
public class Game {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String nameCharacter;
        String nameCharacterDl;
        
        ListWeapon listWeapon = new ListWeapon();
        ListCharacterClass listCharacterClass  = new ListCharacterClass();
        ListCharacter listCharacter = new ListCharacter();

        
        
        // BAI THUC HANH 1
//        System.out.println("Input list weapon: ");
//        listWeapon.CreateList(listWeapon);
//        
//        System.out.println("Input list character class: ");
//        listCharacterClass.CreateList(listCharacterClass);
//        
//        System.out.println("Input list character: ");
//        listCharacter.CreateList(listCharacter);
//        
//        System.out.println("Input name character you want to search: ");
//        nameCharacter = keyboard.nextLine();
//        System.out.println("Character you want to search: ");
//        listCharacter.PrintNode(listCharacter, listCharacterClass, listWeapon, nameCharacter);
//
//        //
//        // sort with level of character
//        System.out.println("Output character sort with level: ");
//        listCharacter.sortWithLevel(listCharacter);
//        
//        listCharacter.PrintList(listCharacter, listCharacterClass, listWeapon);
//        
//        // character 
//        // delete at head
//        System.out.println("Delete at head: ");
//        listCharacter.deleteAtHead(listCharacter);
//        
//        listCharacter.PrintList(listCharacter, listCharacterClass, listWeapon);
//        
//        // delete at tail
//        System.out.println("Delete at tail: ");
//        listCharacter.deleteAtTail(listCharacter);
//        
//        listCharacter.PrintList(listCharacter, listCharacterClass, listWeapon);
//        
//        //delete with name
//        
//        System.out.println("Input name of character you want to delete: ");
//        nameCharacterDl = keyboard.nextLine();
//        ListCharacter.deleteName(listCharacter, nameCharacterDl);
//
//        listCharacter.PrintList(listCharacter, listCharacterClass, listWeapon);
//        
        //ListCharacterClass 
        //delete at head
        //ListCharacterClass.deleteAtHead(listCharacterClass);
        
        // delete at tail
        //ListCharacterClass.deleteAtTail(listCharacterClass);
        
        //delete with name
        //String nameCharacterClass;
        //System.out.println("Input name of character class you want to delete: ");
        //nameCharacterClass = keyboard.nextLine();
        //ListCharacterClass.deleteName(listCharacterClass, nameCharacterClass);
        
        //ListWeapon
        //delete at head
        //ListWeapon.deleteAtHead(listWeapon);
        
        //delete at tail
        //ListWeapon.deleteAtTail(listWeapon);
        
        //delete with name
        //String nameWeapon;
        //System.out.println("Input name of weapon you want to delete: ");
        //nameWeapon = keyboard.nextLine();
        //ListWeapon.deleteName(listWeapon, nameWeapon);
        
        // BAI THUC HANH 2
        listCharacter.CreateList(listCharacter);
        //listCharacter.writeFile("InputListCharacter.txt");
        listCharacter.readFile("OutputListCharacter.txt");
        
        // BAI THUC HANH 3
        
        // BAI THUC HANH 4
        
        // BAI THUC HANH 5
    }
    
}
