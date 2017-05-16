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
public class ListWeapon {
    
    Scanner keyboard = new Scanner(System.in);
    public int n;
    
    Weapon pHead;
    Weapon pTail;

    // insert at Tail
    public static void insertatTail(Weapon Weapon, ListWeapon listWeapon){
        if(listWeapon.pHead == null){
            listWeapon.pHead = new Weapon();
            listWeapon.pHead.InputWeapon();
            listWeapon.pHead.nextWeapon = null;

            listWeapon.pTail = listWeapon.pHead;
        }
        else {
            Weapon newWeapon = new Weapon();
            newWeapon.InputWeapon();
            newWeapon.nextWeapon = null;
            
            listWeapon.pTail.nextWeapon = newWeapon;
            listWeapon.pTail = newWeapon;
        }
    }
    
    // count node
    public static void countNodes(ListWeapon listWeapon) {
        int i = 0;
            for(Weapon temp = listWeapon.pHead; temp != null; temp = temp.nextWeapon, i++);
        System.out.println(i);
        //return i;
    }
    
    public int count(){
          int i = 0;
            for(Weapon temp = this.pHead; temp != null; temp = temp.nextWeapon, i++);
        return i;
    }
    
    // delete at head
    public static void deleteAtHead(ListWeapon list) {
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            Weapon temp = list.pHead;
            list.pHead = list.pHead.nextWeapon;
            
            temp = null;
        }
    }
    
    // delete at tail
    public static void deleteAtTail(ListWeapon list){
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            for(Weapon chrt = list.pHead; chrt != null; chrt = chrt.nextWeapon){
                if(chrt.nextWeapon.nextWeapon == null){
                    chrt.nextWeapon = null;
                    list.pTail = chrt;
                    list.pTail.nextWeapon = null;
                } 
            }
            
        }
    }
    // delete node
    public static void deleteNode(ListWeapon list, Weapon node) {
        Weapon temp;
        if(list.pHead == null){
            System.out.println("list empty");
        }
        else{
            if(list.pHead == node)
                list.deleteAtHead(list);
            else if(list.pTail == node)
                list.deleteAtTail(list);
            else{
                for(Weapon chrt = list.pHead; chrt != list.pTail; chrt = chrt.nextWeapon){
                    if(chrt.nextWeapon == node){
                        temp = chrt.nextWeapon;
                        chrt.nextWeapon = temp.nextWeapon;
                        temp = null;
                    }
                        
                }
            }
        }
    }
    
    // delete Name
    public static void deleteName(ListWeapon list, String name) {
        Weapon temp;
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
    public static boolean Compare2Nodes(Weapon node1, Weapon node2) {
        if(node1.ID == node2.ID && 
            (node1.Name.compareTo(node2.Name) == 0) &&
            node1.Level == node2.Level &&
            node1.OptionATKUp == node2.OptionATKUp &&
            node1.OptionATKspeedUp == node2.OptionATKspeedUp)
            return true;
        else
            return false;
    }
    
    // search name
    public static Weapon searchName(ListWeapon list, String name) {
        for(Weapon chrt = list.pHead; chrt != null; chrt = chrt.nextWeapon){
            if(chrt.Name.compareTo(name) != 0){
                return chrt;
            }
        }
        return null;
    }
    
     // search ID
    public static Weapon searchID(ListWeapon list, int ID) {
        for(Weapon weapon = list.pHead; weapon != null; weapon = weapon.nextWeapon){
            if(weapon.ID == ID){
                return weapon;
            }
        }
        return list.pHead;
    }
    
    // print list
    public static void PrintList(ListWeapon list) {
        for(Weapon temp = list.pHead; temp != null; temp = temp.nextWeapon){
            temp.OutputWeapon();
        }
    }
    
    // create list
    public void CreateList(ListWeapon list){
        
        System.out.println("How many weapon do you want to create?");
        n = Integer.parseInt(keyboard.nextLine());
        
        Weapon weapon = new Weapon();
        
        
        for(int i = 0; i <n; i++){
            list.insertatTail(weapon, list);
        }
    }
}