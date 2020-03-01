import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    private String zooName;
    private ArrayList<Zone> zone = new ArrayList<Zone>();

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
    public void loadZones(String zoneFile) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(zoneFile));

        while(scan.hasNextLine()){
            String currentLine = scan.nextLine();
            //System.out.print(currentLine);
            String zoneInfo[] = (currentLine.split(","));
            Zone zoneInfoArr = new Zone(zoneInfo[0], zoneInfo[1], zoneInfo[2]);
            this.getZone().add(zoneInfoArr);
        }
        scan.close();
    }

    /**
     *
     */
    public void loadAnimals(String animalFile) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(animalFile));

        while(scan.hasNextLine()) {
            //System.out.print("test2");
            String currentLine = scan.nextLine();
            //System.out.println(currentLine);
            String animalInfo[] = (currentLine.split(","));
            Animal animalInfoArr = new Animal(animalInfo[0], animalInfo[1], animalInfo[2], animalInfo[3]);
            //System.out.print(this.getZone().size());
            for (int i = 0; i < this.getZone().size(); i++) {
                System.out.print(i);
                if(animalInfoArr.getanimalZoneCode().equalsIgnoreCase(this.getZone().get(i).getZoneCode())) {
                    this.zone.get(i).addAnimal(animalInfoArr);
                    break;
                }
            }
        }
        scan.close();
    }

    /**
     *
     * @param animalName
     * @param zoneCode
     *
     * take the zone you want to move to then access its collection and add what you need to it
     * then remove the object from its first collection (zone)
     */
    public void relocate(String animalName, String zoneCode){
        Animal found = null;
        int aniZone = 0;
        int newZone = 0;
        for(int i = 0; i < this.zone.size(); i++){
            Zone temp = this.zone.get(i);
            if(temp.getZoneCode() == zoneCode){
                newZone = i;
            }
            for(int j = 0; j < temp.getAnimal().size(); j++){
                Animal ani = temp.getAnimal().get(j);
                if(ani.getAnimalName() == animalName){
                    found = ani;
                    aniZone = i;
                    break;
                }
            }
        }
        if(found != null){
            this.zone.get(aniZone).removeAnimal(found);
            this.zone.get(newZone).addAnimal(found);
        }
    }

    /**
     *iterate through the collection of objects and
     * then print them to the file with the correct format
     * can erase what was there before the save
     */
    public void save() throws IOException {
        File saveZoneFile = new File("animalData/zones.csv");
        File saveAnimalFile = new File("animalData/animals.csv");
        for(int i=0; i<zone.size(); i++){
            FileWriter fwz = new FileWriter(saveZoneFile, false);

            for(int j=0; j<zone.get(i).getAnimal().size(); j++){
                FileWriter fwa = new FileWriter(saveAnimalFile, false);
            }
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
