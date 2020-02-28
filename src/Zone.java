import java.util.ArrayList;

public class Zone {

    private String zoneName;
    private ArrayList<Animal> animal;
    private String zoneCode;
    private String safetyRating;

    /**
     *
     * @param zoneName
     * @param zoneCode
     * @param safetyRating
     */
    Zone(String zoneName, String safetyRating, String zoneCode){
        this.zoneName = zoneName;
        this.zoneCode = zoneCode;
        this.safetyRating = safetyRating;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return String.format(zoneCode+" : "+zoneName+" ("+safetyRating+"):\n ----------------------------\n"+animal);
    }

    /**
     *
     * @param animal
     */
    public void addAnimal(Animal animal) {
        this.animal.add(animal);
        }

    /**
     *
     * @param animal
     */
    public void removeAnimal(Animal animal){
        this.animal.remove(animal);
    }

    //Getters and Setters
    public String getZoneName(){
        return this.zoneName;
    }
    public ArrayList<Animal> getAnimal(){
        return this.animal;
    }
    public String getZoneCode() {
        return this.zoneCode;
    }
    public String getSafetyRating(){
        return this.safetyRating;
    }

    public void setZoneName(String name){
        this.zoneName = name;
    }
    public void setAnimal(ArrayList<Animal> animal){
        this.animal = animal;
    }
    public void setZoneCode(String zoneCode){
        this.zoneCode = zoneCode;
    }
    public void setSafetyRating(String safetyRating){
        this.safetyRating = safetyRating;
    }
}
