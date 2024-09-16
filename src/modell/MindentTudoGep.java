
package modell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;



public class MindentTudoGep {
        private boolean[] szelvenyBoole;
        private int[] szelvenyInt;
        private ArrayList<Integer> szelvenyLista;
        private HashSet<Integer> szelvenyHalmazRendezetlen;
        private TreeSet<Integer> szelvenyHalmaz;
        
    public MindentTudoGep() {
        szelvenyBoole = new boolean[91];
        booleSzelvenytGeneral();
        
        szelvenyInt = new int[5];
        intSzelvenytGeneral();
        
        szelvenyLista = new ArrayList<>();
        //szelvenyGeneral();
        
        szelvenyHalmazRendezetlen = new HashSet<>();
        szelvenyHalmaz = new TreeSet<>();
        szelvenyGeneral();
    }
    
    
    // már nem függ a ténylegesen használt adatszerkezettől
    public void szelvenyGeneral(){
//        szelvenyLista.clear();
//         while(szelvenyLista.size() < 5){
//              int v = (int)(Math.random()*90)+1;
//              if(szelvenyLista.contains(v)){
//                  szelvenyLista.add(v);
//              }
//         }
//         Collections.sort(szelvenyLista);

          // HashSet
          while(szelvenyHalmaz.size() < 5){
              int v = (int)(Math.random()*90)+1;
              szelvenyHalmaz.add(v);
          }
    }
    
   // függ a ténylegesen használt adatszerkezettől
    public void booleSzelvenytGeneral(){
        szelvenyBoole[12] = true;
        szelvenyBoole[23] = true;
        szelvenyBoole[47] = true;
        szelvenyBoole[68] = true;
        szelvenyBoole[77] = true;
          Arrays.fill(szelvenyBoole, false);
          int db = 0;
          while(db < 5){
              int v = (int)(Math.random()*90)+1;
              if(!szelvenyBoole[v]){
                  szelvenyBoole[v] = true;
                  db++;
              }
          }
        
    }
    
             // Problémák: //
    // - getter referenciát ad ---> setter
    // - FÜGG  a belső adatszerkezet típusától
    //
    
    public boolean[] getSzelvenyBoole(){
        return szelvenyBoole;
    }

    private void intSzelvenytGeneral() {
        int db = 0;
          while(db < 5){
              int v = (int)(Math.random()*90)+1;
              if(!benneVan(v, db)){
                szelvenyInt[db++] = v;
              }
          }

    }
    
    private boolean benneVan(int szam, int db){
        int i = 0;
        while(i < db && !(szelvenyInt[i] == szam)){
            i++;
        }
        return i < db;
        
    }

    public List<Integer> getSzelvenyLista() {
        // ez referenciát ad a rejtett adattagra: 
        //return szelvenyLista;
        //return new ArrayList<>(szelvenyLista);
        
        return Collections.unmodifiableList(szelvenyLista);
    }

    
        // Problémák: //
    // - getter referenciát ad ---> setter
    // - FÜGG  a belső adatszerkezet típusától
    public int[] getSzelvenyInt() {
        //return szelvenyInt;
        
        int[] ujTomb = Arrays.copyOf(szelvenyInt, szelvenyInt.length);
        return ujTomb;
    }
    
    
    public String getSzelvenySzoveg(){
        // int tombot ad vissza
//        String s = Arrays.toString(szelvenyInt);
//        s = s.substring(1, s.length()-1);
//        return "1, 2, 3, 4, 5";
//        
        // arraylist
//        String s = Arrays.toString(szelvenyInt);
//        s = s.substring(1, s.length()-1);
//        return szelvenyLista.toString();
//          String s = szelvenyHalmazRendezetlen.toString();
//          s = s.substring(1, s.length()-1);
//          return szelvenyHalmazRendezetlen.toString();
           String s = szelvenyHalmaz.toString();
          s = s.substring(1, s.length()-1);
          return szelvenyHalmaz.toString();
        
    }
    
    
    
}
