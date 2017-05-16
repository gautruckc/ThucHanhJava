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

import java.io.*;

/**
 *
 * @author KIMCHUNG
 */
public class ListCharacter {
    Scanner keyboard = new Scanner(System.in);
    public int n;
    
    Character pHead;
    Character pTail;

    // insert at Tail
    public static void insertatTail(Character character, ListCharacter listCharacter){
        if(listCharacter.pHead == null){
            listCharacter.pHead = new Character();
            listCharacter.pHead.InputCharacter();
            listCharacter.pHead.nextCharacter = null;

            listCharacter.pTail = listCharacter.pHead;
        }
        else {
            Character newCharacter = new Character();
            newCharacter.InputCharacter();
            newCharacter.nextCharacter = null;
            
            listCharacter.pTail.nextCharacter = newCharacter;
            listCharacter.pTail = newCharacter;
        }
    }
    
    // count node
    public static void countNodes(ListCharacter listCharacter) {
        int i = 0;
            for(Character temp = listCharacter.pHead; temp != null; temp = temp.nextCharacter, i++);
        System.out.println(i);
        //return i;
    }
    
    public int count(){
          int i = 0;
            for(Character temp = this.pHead; temp != null; temp = temp.nextCharacter, i++);
        return i;
    }
    
    // delete at head
    public static void deleteAtHead(ListCharacter list) {
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            Character temp = list.pHead;
            list.pHead = list.pHead.nextCharacter;
            
            temp = null;
        }
    }
    
    // delete at tail
    public static void deleteAtTail(ListCharacter list){
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            for(Character chrt = list.pHead; chrt != null; chrt = chrt.nextCharacter){
                if(chrt.nextCharacter.nextCharacter == null){
                    chrt.nextCharacter = null;
                    list.pTail = chrt;
                    list.pTail.nextCharacter = null;
                } 
            }
            
        }
    }
    // delete node
    public static void deleteNode(ListCharacter list, Character node) {
        Character temp;
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            if(list.pHead == node)
                list.deleteAtHead(list);
            else if(list.pTail == node)
                list.deleteAtTail(list);
            else{
                for(Character chrt = list.pHead; chrt != list.pTail; chrt = chrt.nextCharacter){
                    if(chrt.nextCharacter == node){
                        temp = chrt.nextCharacter;
                        chrt.nextCharacter = temp.nextCharacter;
                        temp = null;
                    }
                        
                }
            }
        }
    }
    
    public int indexOf(Character item){
        
        int i=0;
        for(Character temp = this.pHead; temp != null; temp = temp.nextCharacter, i++){
            if(temp==item)
                return i;
        }
        return -1;
    }        
    
    public Character get(int index){
        int i=0;
        for(Character temp = this.pHead; temp != null; temp = temp.nextCharacter, i++){
            if(i==index)
                return temp;
        }
        return null;
    }
    
    public void set(int index, Character item){
        int i=2;
        Character previous = this.pHead;
        for(Character temp = previous.nextCharacter; temp != null; temp = temp.nextCharacter, i++){
            if(i==index){
                item.nextCharacter = temp.nextCharacter;
                previous.nextCharacter = item;
                return;
            }
            previous = temp;
        }
    }
            
    
    // delete Name
    public static void deleteName(ListCharacter list, String name) {
        Character temp;
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
    
    // search name
    public static Character searchName(ListCharacter list, String name) {
        for(Character chrt = list.pHead; chrt != null; chrt = chrt.nextCharacter){
            if(chrt.Name.compareTo(name) == 0){
                return chrt;
            }
        }
        return null;
    }
    
    // sap xep theo level
    public static void sortWithLevel(ListCharacter list) {
        Character temp = null;
        for(Character chrt = list.pHead; chrt != list.pTail; chrt = chrt.nextCharacter){
            if(chrt == null) break;
           for(Character chr = chrt.nextCharacter; chr != null; chr = chr.nextCharacter){
               if(chr == null) break;
               if(chr.Level < chrt.Level){
                   SwapNodes(list, chrt, chr);
                   temp = chrt;
                   chrt = chr;
                   chr = temp;
               }
            } 
        }
    }
    
    // finding a node in the list
    public static boolean FindANodeinList(ListCharacter list, Character node) {
        for(Character pre = list.pHead; pre != list.pTail; pre = pre.nextCharacter){
            if(Compare2Nodes(pre, node))
                
                return true;
        }
        return false;
   
    }
   
    // swap 2 nodes
    public static void SwapNodes(ListCharacter list, Character node1, Character node2) {

        Character pre1 = list.pHead, pre2 = list.pHead, temp = null;
        
        for ( ; pre1 != null; pre1 = pre1.nextCharacter){
            if(pre1.nextCharacter == node1) break;
        }
        
        for ( ; pre2 != null; pre2 = pre2.nextCharacter){
            if(pre2.nextCharacter == node2) break;
        }
        
        // Check whether both nodes are null...
        if(pre1 == null && pre2 == null){
            return;
        }
        // ... or if they are equal
        else if (node1 == node2){
            return;
        }else{
            // === START SWAP NODES
            // Swap nodes' position in linked list
            if(pre1 == null && node1 == list.pHead){
                pre2.nextCharacter = node1;
                temp = node1.nextCharacter;
                node1.nextCharacter = node2.nextCharacter;
                node2.nextCharacter = temp;
                list.pHead = node2;
            }else if(pre2 == null && node2 == list.pHead){
                pre1.nextCharacter = node2;
                temp = node1.nextCharacter;
                node1.nextCharacter = node2.nextCharacter;
                node2.nextCharacter = temp;
                list.pHead = node1;
            }else if(pre1 != null && pre2 != null){
                temp = pre1.nextCharacter;
                pre1.nextCharacter = pre2.nextCharacter;
                pre2.nextCharacter = temp;
                temp = node1.nextCharacter;
                node1.nextCharacter = node2.nextCharacter;
                node2.nextCharacter = temp;
            }else{
                return;
            }
            if(list.pTail == node1) list.pTail = node2;
            else if(list.pTail == node2) list.pTail = node1;
        }
        
        return; 
    }
    
    // compare 2 nodes
    public static boolean Compare2Nodes(Character node1, Character node2) {
        if(node1.ATK == node2.ATK && 
            node1.ATKspeed == node2.ATKspeed &&
            node1.ClassId == node2.ClassId &&
            node1.DEF == node2.DEF &&
            node1.HP == node2.HP &&
            node1.Level == node2.Level &&
           (node1.Name.compareTo(node2.Name) == 0) &&
            node1.WeaponId == node2.WeaponId)
            return true;
        else
            return false;
    }
    
    // swap infor
//    public static void SwapInfor(Character node1, Character node2) {
//        node1.ATK = node2.ATK; 
//        node1.ATKspeed = node2.ATKspeed; 
//        node1.ClassId = node2.ClassId;
//        node1.DEF = node2.DEF; 
//        node1.HP = node2.HP;
//        node1.Level = node2.Level;
//        node1.Name = node2.Name;
//        node1.WeaponId = node2.WeaponId;
//    }
    
    
    public ListCharacterClass listCharacterClass = new ListCharacterClass();
    public ListWeapon listWeapon = new ListWeapon();
    public CharacterClass characterClass = new CharacterClass();
    public Weapon weapon = new Weapon();
    
    // print list
    public void PrintList(ListCharacter listCharacter, 
            ListCharacterClass listCharacterClass, 
            ListWeapon listWeapon) {
        for(Character temp = listCharacter.pHead; temp != null; temp = temp.nextCharacter){
            temp.OutputCharacter();
            weapon = listWeapon.searchID(listWeapon, temp.WeaponId);
            weapon.OutputWeapon();

            characterClass = listCharacterClass.searchID(listCharacterClass, temp.ClassId);
            characterClass.OutputCharacterClass();
        }
    }
    
    // print node
    public void PrintNode(ListCharacter listCharacter, 
            ListCharacterClass listCharacterClass, 
            ListWeapon listWeapon, String name) {
            Character temp = searchName(listCharacter, name);
            temp.OutputCharacter();
            weapon = listWeapon.searchID(listWeapon, temp.WeaponId);
            weapon.OutputWeapon();

            characterClass = listCharacterClass.searchID(listCharacterClass, temp.ClassId);
            characterClass.OutputCharacterClass();
    }
    
    // create list
    public void CreateList(ListCharacter list){
        
        System.out.println("How many character do you want to create?");
        n = Integer.parseInt(keyboard.nextLine());
        
        Character character = new Character();
        
        
        for(int i = 0; i <n; i++){
            list.insertatTail(character, list);
        }
    }
    
    public void readFile(String fileName) {
        BufferedReader reader = null;
        try {
            String line;
            File file = new File(fileName);
            reader = new BufferedReader (new FileReader(file));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } 
        finally {
            try {
                //dont forget call funtion close of BufferReader
                if (reader != null)
                    reader.close();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    
    public void writeFile(String fileName){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            //String content = "Nội dung mình muốn viết vào file\n";
            //bw.write(content);
            
            // không cần đóng BufferedWriter (nó đã tự động đóng)
            // bw.close();
            System.out.println("complete");
            } catch (IOException e) {
            e.printStackTrace();
            }
    }
}
