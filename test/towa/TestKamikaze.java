/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Ejeul
 */
public class TestKamikaze {
    
    @Test
    public void testNbPionsARetirerKamikaze() {
        Case[][] plateau2 = Utils.plateauDepuisTexte(PLATEAU_NIVEAU2);
        //Chaton kamikaze depuis le nord tuant les N
        assertEquals(14, 
                Kamikaze.nbPionsARetirerKamikaze(plateau2, true, 'N', true));
        //Chaton kamikaze depuis le nord tuant les B
        assertEquals(13, 
                Kamikaze.nbPionsARetirerKamikaze(plateau2, true, 'N', false));
        //Chaton kamikaze depuis le sud tuant les N
        assertEquals(10, 
                Kamikaze.nbPionsARetirerKamikaze(plateau2, true, 'S', true));
        //Chaton kamikaze depuis le sud tuant les B
        assertEquals(5, 
                Kamikaze.nbPionsARetirerKamikaze(plateau2, true, 'S', false));
        //Chaton kamikaze depuis l'est tuant les N
        assertEquals(10, 
                Kamikaze.nbPionsARetirerKamikaze(plateau2, true, 'O', true));
        //Chaton kamikaze depuis l'est tuant les B
        assertEquals(13, 
                Kamikaze.nbPionsARetirerKamikaze(plateau2, true, 'O', false));
        //Chaton kamikaze depuis l'ouest tuant les N
        assertEquals(8, 
                Kamikaze.nbPionsARetirerKamikaze(plateau2, true, 'E', true));
        //Chaton kamikaze depuis l'ouest tuant les B
        assertEquals(9, 
                Kamikaze.nbPionsARetirerKamikaze(plateau2, true, 'E', false));
    }
    
    
    final String PLATEAU_NIVEAU1
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N   O   P \n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "a|   |  1|  2|  2|  2|  2|  2|  3|  3|  3|  4|  4|  4|  3|  2|N22|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "b|  1|  2|  2|  2|  2|  2|  2|  3|  3|  3|  3|  4|  3|  2|  2|  2|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "c|  1|  2|  2|  2|  2|  2|  2|  2|  2|  3|  3|  3|  2|  3|  2|  2|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "d|  2|  3|  2|  2|  3|  2|  3|  2|  2|  2|N22|B12|  3|  3|  3|  3|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "e|  3|  3|  3|  3|  3|  3|  2|  2|  2|  2|  3|  3|  4|  4|  4|  4|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "f|  4|  3|  3|  2|  2|  2|  2|  2|  2|  2|  2|  3|  3|  4|  4|  4|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "g|  4|  4|  3|  2|  2|  1|   |B21|  1|  1|  1|B12|  3|  4|  4|  4|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "h|  4|  4|  3|  2|  2|N11|   |   |  1|N21|  1|  1|  3|  3|  4|  4|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "i|  4|  4|  4|  3|  2|  1|   |   |   |  1|  1|  1|  2|  3|  4|  4|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "j|  4|  4|  4|  3|  2|  1|   |B1 |   |   |   |  1|  1|  2|  3|  3|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "k|  4|  4|  4|  3|  2|N21|B1 |   |   |   |   |  1|  1|  2|  3|  3|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "l|  3|  3|  4|  3|  2|  1|B2 |   |   |   |   |   |  1|  2|  3|  3|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "m|  3|  3|  3|  3|  2|  1|   |   |   |   |   |   |  1|  1|  2|  3|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "n|  3|  3|  2|  2|  1|  1|   |   |   |   |   |  1|  1|  1|  2|  2|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "o|  3|  2|  1|  1|  1|  1|  1|   |   |   |  1|  1|  2|  2|  2|  2|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "p|  3|  2|  2|  2|  2|  1|  1|  1|  1|  2|  2|  2|  3|  2|  2|  2|\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+";

    final String PLATEAU_NIVEAU2
            = "   A   B   C   D   E   F   G   H   I   J   K   L   M   N   O   P \n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "a|   |   |   |   |   |   |B1 |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "b|N1 |   |N4 |   |   |   |   |B1 |   |   |   |B1 |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "c|   |   |B1 |   |B1 |   |   |   |   |   |N5 |B1 |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "d|   |   |B4 |   |   |   |   |   |B1 |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "e|B1 |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "f|   |   |   |   |   |   |   |   |   |   |   |   |B3 |   |   |N2 |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "g|   |   |B1 |   |   |   |   |   |B1 |N1 |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "h|   |   |   |   |   |   |   |   |   |   |N1 |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "i|   |N1 |N1 |   |   |   |   |   |   |   |   |   |N1 |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "j|   |   |   |   |   |   |   |N1 |   |   |   |B1 |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "k|   |   |   |   |N1 |   |   |   |   |N2 |   |   |   |   |B1 |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "l|   |   |   |   |N3 |B4 |B1 |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "m|   |   |   |   |B1 |B2 |N1 |   |   |N1 |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "n|   |   |   |   |N1 |N1 |N3 |   |   |N1 |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "o|   |N1 |   |   |   |   |   |N1 |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n"
            + "p|   |   |   |   |   |   |B1 |   |   |   |   |   |   |   |   |   |\n"
            + " +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n";
}


