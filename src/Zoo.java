import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    private String zooName;
    private ArrayList<Zone> zone;

    /**
     *
     * @param zooName
     */
    Zoo(String zooName){
        this.zooName = zooName;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return String.format("Welcome to the " +zooName+ "!\n =============================\n\n"+zone);
    }

    /**
     *
     */
    public Zone loadZones(String zoneFile) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("animalData/zones.csv"));

        while(scan.hasNextLine()){
            String currentLine = scan.nextLine();
            String zoneInfo[] = (currentLine.split(","));
            Zone zone = new Zone(zoneInfo[0], zoneInfo[1], zoneInfo[2]);
            return zone;
        }
        scan.close();
        return null;
    }

    /**
     *
     */
    public Animal loadAnimals(String animalFile) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("animalData/animals.csv"));

        while(scan.hasNextLine()){
            String currentLine = scan.nextLine();
            String animalinfo[] = (currentLine.split(","));
            Animal animal = new Animal(animalinfo[0], animalinfo[1], animalinfo[2], animalinfo[3]);
            return animal;
        }
        scan.close();
        return null;
    }

    /**
     *
     * @param relocateAnimalName
     * @param relocateZoneCode
     *
     * take the zone you want to move to then access its collection and add what you need to it
     * then remove the object from its first collection (zone)
     */
    public void relocate(String relocateAnimalName, String relocateZoneCode) throws FileNotFoundException {
        ArrayList<Zone> tempZone = new ArrayList<Zone>();
        ArrayList<Animal> tempAnimal = new ArrayList<Animal>();
        loadZones("animalData/zones.csv");
        loadAnimals("animalData/animals.csv");
        for(int i=0; i<tempZone.size(); i++){
            for(int j=0; j<tempAnimal.size(); j++){

            }

        }
    }

    /**
     *iterate through the collection of objects and
     * then print them to the file with the correct format
     * can erase what was there before the save
     */
    public void save(){
        for(int i=0; i<zone.size(); i++){

        }

    }

    public void setZone(ArrayList<Zone> zone) {
        this.zone = zone;
    }
    public void setZooName(String zooName){
        this.zooName = zooName;
    }

    public String getZooName() {
        return zooName;
    }
    public ArrayList<Zone> getZone() {
        return zone;
    }
}
