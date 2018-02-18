
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ekam
 */
public class DrinksData {
    static ArrayList<String> ar=new ArrayList();;
    public static ArrayList drinkName(String str)
    {
        ar.clear();
        switch (str) {
            case "Black":
                ar.add("Coke");
                ar.add("Pepsi");
                ar.add("Thumbs UP");
                break;
                
            case "Green":
                ar.add("Dew");
                ar.add("BrahmiBadam");
                ar.add("Khas-Khas");
                break;
                
            case "Red":
                ar.add("Roohawfza");
                ar.add("Blood");
                ar.add("Raspberry Juice");
                break;
            case "Orange":
                ar.add("Marinda");
                ar.add("Fanta");
                break;
            case "Clear":
                ar.add("7 Up");
                ar.add("Sprite");
                break;
            default:
                ar.clear();
                break;
        }
        return ar;
    }
    
}
