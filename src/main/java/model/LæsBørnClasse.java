package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LæsBørnClasse
{

    public boolean læsbørn1() {
        System.out.println("Vi er i classen LæsBørnClasse og i metoden læsbørn1 ");
        boolean kanlæses = true;
        String data;
        try {
            File myObj = new File("regbørn1.txt");

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println("følgende børn læst = " + data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.  Vi har forsøgt at læse regbørn1.txt");
            e.printStackTrace();
            kanlæses = false;
            //opretok = "2";
        }

        return kanlæses;

    }

}
