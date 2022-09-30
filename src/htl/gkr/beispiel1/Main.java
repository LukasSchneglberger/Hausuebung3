package htl.gkr.beispiel1;

import java.nio.file.Watchable;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        FileHandler fh = new FileHandler();
        List<Weapon> weaponList = fh.readFile();
        m.sortDamage(weaponList);
    }

    public List<Weapon> sortDamage(List<Weapon> weaponList){

        weaponList.sort((n, m) -> m.getDamage() - n.getDamage());
        return weaponList;
    }
}
