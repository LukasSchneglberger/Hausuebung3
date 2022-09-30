package htl.gkr.beispiel1;

import javax.crypto.AEADBadTagException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sortDamage() {
        Main m = new Main();

        List<Weapon> unsorted  = new ArrayList<>();
        List<Weapon> expected = new ArrayList<>();
        List<Weapon> result = new ArrayList<>();


        unsorted.add(new Weapon("Test 1", CombatType.MELEE, DamageType.BLUNT, 100, 50, 1200, 1000));
        unsorted.add(new Weapon("Test 2", CombatType.MELEE, DamageType.BLUNT, 52, 50, 1200, 1000));
        unsorted.add(new Weapon("Test 3", CombatType.MELEE, DamageType.BLUNT, 4, 50, 1200, 1000));
        unsorted.add(new Weapon("Test 4", CombatType.MELEE, DamageType.BLUNT, 400, 50, 1200, 1000));


        expected.add(new Weapon("Test 4", CombatType.MELEE, DamageType.BLUNT, 400, 50, 1200, 1000));
        expected.add(new Weapon("Test 1", CombatType.MELEE, DamageType.BLUNT, 100, 50, 1200, 1000));
        expected.add(new Weapon("Test 2", CombatType.MELEE, DamageType.BLUNT, 52, 50, 1200, 1000));
        expected.add(new Weapon("Test 3", CombatType.MELEE, DamageType.BLUNT, 4, 50, 1200, 1000));



        assertEquals(expected.toString(), m.sortDamage(unsorted).toString());



    }
}