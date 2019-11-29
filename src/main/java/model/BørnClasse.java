package model;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;

public class BørnClasse {
    String opretok = "1";

    public boolean filinfo() {
        boolean kanikkelæses = true;

        File myObj = new File("regbørn1.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
            kanikkelæses = false;
        } else {
            System.out.println("The file does not exist.  regbørn");
            kanikkelæses = true;

        }
        if (kanikkelæses)
            try {
                File myopObj = new File("regbørn1.txt");
                if (myopObj.createNewFile()) {
                    System.out.println("File created: " + myopObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred. Filen regbørn eksistere allerede");
                e.printStackTrace();
            }
        return kanikkelæses;
    }

                            //barnNavn, fødselsdag, forældresNavn, forældresTlf,barnetsAlergiSyg
    public boolean opretBørn(String barnNavn, String fødselsdag, String forældresNavn,
                             String forældresTlf, String barnetsAlergiSyg) {
        boolean kanlæses = true;
        String data;


        try {
            FileWriter myWriter = new FileWriter("regbørn1.txt");
            myWriter.write( barnNavn + "\n");
            myWriter.write( fødselsdag + "\n");
            myWriter.write( forældresNavn + "\n");
            myWriter.write( forældresTlf + "\n");
            myWriter.write( barnetsAlergiSyg);
            myWriter.close();
            System.out.println("Successfully wrote to the file. ");
            System.out.println("Følgende er skrevet : " + barnNavn + " " + fødselsdag + " " + forældresNavn + " " +
                    forældresTlf + " " + barnetsAlergiSyg);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return kanlæses;
    }

    public boolean læsbørn() {
        System.out.println("Vi er i classen BørnClasse og i metoden læsbørn " );
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
            opretok = "2";
            }

        return kanlæses;


        }

    }
