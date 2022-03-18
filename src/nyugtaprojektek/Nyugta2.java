package nyugtaprojektek;

/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
 */
public class Nyugta2 {

    public static void main(String[] args) {
        /* Stringek */
        String csillagok = "*******************";
        String duplaVonal = "===================";
        String szaggatottVonal = "-------------------";
        String rovidVonalak = "_______     _______";

        String huf = "Ft";

        /* Intek/doubleok */
        int tet1 = 350, tet2 = 90, tet3 = 1320;
        int ossz = tet1 + tet2 + tet3;
        int kedvezmeny = 10;
        int kedvErtek = ossz / kedvezmeny;
        int fizetendo = ossz - kedvErtek;
        double euro = fizetendo / 350.0;

        System.out.println(csillagok);
        System.out.println("     Nyugta 2");
        System.out.println(csillagok);

        //System.out.println("Tétel 1:     350 Ft");
        System.out.printf("Tétel 1:     %d %s\n", tet1, huf);
        //System.out.println("Tétel 2:      90 Ft");
        System.out.printf("Tétel 1:      %d %s\n", tet2, huf);
        //System.out.println("Tétel 3:    1320 Ft");
        System.out.printf("Tétel 3:    %d %s\n", tet3, huf);

        //System.out.println("==================");
        System.out.println(duplaVonal);

        //System.out.println("Összesen:   1090 Ft");
        System.out.printf("Összesen:   %d %s\n", ossz, huf);

        //System.out.println("------------------");
        System.out.println(szaggatottVonal);

        //System.out.println("Kedvezmény:  109 Ft");
        System.out.printf("Kedvezmény:  %d %s\n", kedvErtek, huf);
        //System.out.println("(10%)");
        System.out.printf("(%d%%)\n", kedvezmeny);

        //System.out.println("==================");
        System.out.println(duplaVonal);

        //System.out.println("Fizetendő:   981 Ft");
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);

        huf = "\u20ac";//EZ NEM JÓ!!!!
        System.out.printf("            %f %s\n", euro, huf);

        //System.out.println("------------------");
        System.out.print(szaggatottVonal + "\n");
        //System.out.print("_______");
        //System.out.print("   ");
        //System.out.println("_______");

        System.out.println(rovidVonalak);
        System.out.println(" Dátum        Név");

        //System.out.println("******************");
        System.out.println(csillagok);
        System.out.println("        CÉG");
        //System.out.println("******************");
        System.out.println(csillagok);
    }

}
