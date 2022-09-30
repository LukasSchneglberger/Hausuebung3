package htl.gkr.beispiel1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {



    public List<Weapon> readFile(){
        List<Weapon> weaponList = new ArrayList<>();
        try {
            Scanner in = new Scanner(new File("weapons.csv"));
            in.nextLine();
            while (in.hasNextLine()){

                 weaponList.add(deseralize(in.nextLine()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return weaponList;
    }


    public Weapon deseralize(String line){
        String[] parts = line.split(";");
        return new Weapon(
                parts[0],
                CombatType.valueOf(parts[1]),
                DamageType.valueOf(parts[2]),
                Integer.parseInt(parts[3]),
                Integer.parseInt(parts[4]),
                Integer.parseInt(parts[5]),
                Integer.parseInt(parts[6])
        );

    }


}
