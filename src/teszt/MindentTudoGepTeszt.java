
package teszt;

import modell.MindentTudoGep;

public class MindentTudoGepTeszt {
    public static void main(String[] args) {
        new MindentTudoGepTeszt().tesztesetek();
    }

    private void tesztesetek() {
        teszt5Szam();
        tesztUres();
        tesztIntervallum();
        tesztAzonos();
        tesztRendezett();
        
    }
    
    private void teszt5Szam(){
        MindentTudoGep gep = tesztUres();
        
//        System.out.println("teszt: 5 számot tartalamz");
//        String szelveny = gep.getSzelvenySzoveg();
//        String[] sz = szelveny.split(",");
//        boolean mindSzamjegy = false;
//        for (int i = 0; i < sz.length; i++) {
//            for (int j = 0; j < sz[i].length(); j++) {
//                 mindSzamjegy = Character.isDigit(j); 
//                 assert sz.length == 5: "5 számot tartalmaz";
//            }
//            
//        }
        

        System.out.println("teszt: 5 számot tartalamz");
        String szelveny = gep.getSzelvenySzoveg();
        String[] szelvenyTomb = szelveny.split(",");
        assert szelvenyTomb.length == 5 : "nem 5 elemű";
        for (String szoveg : szelvenyTomb) {
            int hossz = szoveg.length();
            szoveg = szoveg.trim();
            for (int i = 0; i < szoveg.length(); i++) {
                 char c = szoveg.charAt(i);
                 assert Character.isDigit(c) : "5 számot tartalmaz";
            }
            
        }
        
        
    }

    private MindentTudoGep tesztUres() {
        MindentTudoGep gep = new MindentTudoGep();
        String szelveny = gep.getSzelvenySzoveg();
        System.out.println("teszt: nem üres a szelvény");
        assert !szelveny.isBlank() : "üres a szelvény";
        return gep;
    }

    private void tesztIntervallum() {
        System.out.println("teszt: minden szűm [1:90]");
        MindentTudoGep gep = new MindentTudoGep();
        String szelveny = gep.getSzelvenySzoveg();
        String[] sz = szelveny.split(",");
        for (String s : sz) {
            int szam = Integer.parseInt(s.trim());
            boolean jo = szam >= 1 && szam <= 90;
            assert jo : "hibás intervallum";
            }
            
        }

    private void tesztAzonos() {
        System.out.println("teszt: nincs azonos elem");
        assert false : "van azonnos elem";
    }

    private void tesztRendezett() {
        System.out.println("teszt: rendezett");
        assert false : "nem rendezett";
    }
}
