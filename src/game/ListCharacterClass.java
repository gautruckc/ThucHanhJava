/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import com.sun.org.apache.xalan.internal.xsltc.compiler.NodeTest;
import javax.print.attribute.standard.Compression;
import jdk.nashorn.internal.ir.BreakNode;
import java.util.*;

/**
 *
 * @author KIMCHUNG
 */
public class ListCharacterClass {
    
    Scanner keyboard = new Scanner(System.in);
    public int n;
    
    CharacterClass pHead;
    CharacterClass pTail;

    // insert at Tail
    public static void insertatTail(CharacterClass characterClass, ListCharacterClass listCharacterClass){
        if(listCharacterClass.pHead == null){
            listCharacterClass.pHead = new CharacterClass();
            listCharacterClass.pHead.InputCharacterClass();
            listCharacterClass.pHead.nextCharacterClass = null;

            listCharacterClass.pTail = listCharacterClass.pHead;
        }
        else {
            CharacterClass newCharacterClass = new CharacterClass();
            newCharacterClass.InputCharacterClass();
            newCharacterClass.nextCharacterClass = null;
            
            listCharacterClass.pTail.nextCharacterClass = newCharacterClass;
            listCharacterClass.pTail = newCharacterClass;
        }
    }
    
    // count node
    public static void countNodes(ListCharacterClass listCharacterClass) {
        int i = 0;
            for(CharacterClass temp = listCharacterClass.pHead; temp != null; temp = temp.nextCharacterClass, i++);
        System.out.println(i);
        //return i;
    }
    
    public int count(){
          int i = 0;
            for(CharacterClass temp = this.pHead; temp != null; temp = temp.nextCharacterClass, i++);
        return i;
    }
    
    // delete at head
    public static void deleteAtHead(ListCharacterClass list) {
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            CharacterClass temp = list.pHead;
            list.pHead = list.pHead.nextCharacterClass;
            
            temp = null;
        }
    }
    
    // delete at tail
    public static void deleteAtTail(ListCharacterClass list){
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            for(CharacterClass chrt = list.pHead; chrt != null; chrt = chrt.nextCharacterClass){
                if(chrt.nextCharacterClass.nextCharacterClass == null){
                    chrt.nextCharacterClass = null;
                    list.pTail = chrt;
                    list.pTail.nextCharacterClass = null;
                } 
            }
            
        }
    }
    // delete node
    public static void deleteNode(ListCharacterClass list, CharacterClass node) {
        CharacterClass temp;
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            if(list.pHead == node)
                list.deleteAtHead(list);
            else if(list.pTail == node)
                list.deleteAtTail(list);
            else{
                for(CharacterClass chrt = list.pHead; chrt != list.pTail; chrt = chrt.nextCharacterClass){
                    if(chrt.nextCharacterClass == node){
                        temp = chrt.nextCharacterClass;
                        chrt.nextCharacterClass = temp.nextCharacterClass;
                        temp = null;
                    }
                        
                }
            }
        }
    }
    
    // delete Name
    public static void deleteName(ListCharacterClass list, String name) {
        CharacterClass temp;
        if(list.pHead == null){
            System.out.println("List empty");
        }
        else{
            temp = list.searchName(list, name);
            if(temp != null)
                list.deleteNode(list, temp);
            else
                System.out.println("Can not find the name in list");
        }            
    }
    
    // compare 2 nodes
    public static boolean Compare2Nodes(CharacterClass node1, CharacterClass node2) {
        if(node1.ID == node2.ID && 
            (node1.Name.compareTo(node2.Name) == 0))
            return true;
        else
            return false;
    }
    
    // search name
    public static CharacterClass searchName(ListCharacterClass list, String name) {
        for(CharacterClass chrt = list.pHead; chrt != null; chrt = chrt.nextCharacterClass){
            if(chrt.Name.compareTo(name) != 0){
                return chrt;
            }
        }
        return null;
    }
    
    // search ID
    public static CharacterClass searchID(ListCharacterClass list, int ID) {
        for(CharacterClass chrt = list.pHead; chrt != null; chrt = chrt.nextCharacterClass){
            if(chrt.ID == ID){
                return chrt;
            }
        }
        return list.pHead;
    }
    
    
    // print list
    public static void PrintList(ListCharacterClass list) {
        for(CharacterClass temp = list.pHead; temp != null; temp = temp.nextCharacterClass){
            temp.OutputCharacterClass();
        }
    }
    
    // create list
    public void CreateList(ListCharacterClass list){
        
        System.out.println("How many character class do you want to create?");
        n = Integer.parseInt(keyboard.nextLine());
        
        CharacterClass characterClass = new CharacterClass();
        
        
        for(int i = 0; i <n; i++){
            list.insertatTail(characterClass, list);
        }
    }
}