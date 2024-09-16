
package main;

import java.util.ArrayList;
import modell.MindentTudoGep;
import java.util.Arrays;
import java.util.List;

public class MindentTudoGep2Program {

    public static void main(String[] args){
        new MindentTudoGep2Program().szelvenyBemutato();
    }
    
    private void szelvenyBemutato() {
        MindentTudoGep gep = new MindentTudoGep();
        // hibás, ha ezt nem hívjuk
        // gep.booleSzelvenytGeneral();
        
        System.out.println("1. boole eredmény: ");
        boolean[] szelvenyBool = gep.getSzelvenyBoole();
        booleSzelvenytMutat(szelvenyBool);
        
        System.out.println("2. boole eredmény: ");
        int[] szelvenyInt = gep.getSzelvenyInt();
        szelvenyInt[0] = 1000;
        szelvenyInt = gep.getSzelvenyInt();
        intSzelvenytMutat(szelvenyInt);
        
        //már nem látjuk a tényleges adatszerkezetet
        
        System.out.println("5. (típusa?) szelvény: ");
        String szelveny = gep.getSzelvenySzoveg();
        System.out.println(szelveny);
        
//        System.out.println("6. (típusa?) szelvény: ");
//        szelveny = gep.getSzelvenySzoveg();
//        List<Integer> lista = gep.getSzelvenyLista();
//        lista.add(Integer.SIZE);
        
        System.out.println("6. (típusa?) szelvény: ");
        szelveny = gep.getSzelvenySzoveg();
//        lista.add(Integer.SIZE);
        
        System.out.println(szelveny);
    }
    
    


    private void booleSzelvenytMutat(boolean[] szelveny) {
        for (int i = 0; i < szelveny.length; i++) {
            if(szelveny[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    private void intSzelvenytMutat(int[] szelvenyInt) {
        

    }
    
    
    
}
