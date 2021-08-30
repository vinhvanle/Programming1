import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class datareader {
    public static void main(String[] args) throws IOException {
//        readData();


    }
    public static void readData() throws IOException {
        Scanner sc = new Scanner( new File("src/covid-data.csv"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] tokens = line.split(",");
            CoDa coDa = new CoDa(
                    tokens[0], tokens[1],
                    tokens[2], tokens[3],
                    tokens[4], tokens[5],
                    tokens[6], tokens[7]);
            coDa.display();
            coDa.createArray();
        }
    }
}

class CoDa {
    public String isoCode;
    public String continent;
    public String nation;
    public String date;
    public String newCase;
    public String deathCase;
    public String ppVac;
    public String population;

    public CoDa() {
    }
    public CoDa (String i, String c, String n, String d, String nC, String dC, String pV, String p){
        isoCode = i;
        continent = c;
        nation = n;
        date = d;
        newCase = nC;
        deathCase = dC;
        ppVac = pV;
        population = p;
    }
    
    public List createArray() {
        ArrayList<String> dataArray = new ArrayList<>();
        dataArray.add(isoCode);
        dataArray.add(continent);
        dataArray.add(nation);
        dataArray.add(date);
        dataArray.add(newCase);
        dataArray.add(deathCase);
        dataArray.add(ppVac);
        dataArray.add(population);
        return dataArray;
    }

    public void display() {
        System.out.printf("\nIsocode: %s, Continent: %s, " +
                "Nation: %s, Date: %s, New case: %s, Death case: %s, Vaccinate: %s, Population: %s",
                isoCode, continent, nation, date,newCase, deathCase, ppVac, population);
    }
}

