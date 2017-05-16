package game;
import java.util.Scanner;

/**
 *
 * @author KIMCHUNG
 */
public class Weapon {
    Scanner keyboard = new Scanner(System.in);
    
    int ID;
    String Name;
    int Level;
    int OptionATKUp; // chi so them suc tan cong
    int OptionATKspeedUp; // chi so them toc do tan cong
    
    Weapon nextWeapon;
    
    // inout weapon
    public void InputWeapon(){
        System.out.println("Input Weapon: ");
        
        System.out.println("ID: ");
        ID = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("Name: ");
        Name = keyboard.nextLine();
        
        System.out.println("Level: (1 ≤ level ≤ 40)");
        Level = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("OptionATKUp: ́(0% ≤ ATK up ≤ 100%)");
        OptionATKUp = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("OptionATKspeedUp: (0% ≤ ATK speed up ≤ 100%)");
        OptionATKspeedUp = Integer.parseInt(keyboard.nextLine());
    }
    
    // output Weapon
    public void OutputWeapon(){
        System.out.println(" - Weapon ");
        System.out.println(" - ID: " + ID);
        System.out.println(" - Name: " + Name);
        System.out.println(" - Level: " + Level);
        System.out.println(" - OptionATKUp: " + OptionATKUp);
        System.out.println(" - OptionATKspeedUp: " + OptionATKspeedUp);
        
    }
}
