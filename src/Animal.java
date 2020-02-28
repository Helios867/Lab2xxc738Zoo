public class Animal {

    private String animalName;
    private String animalType;
    private String carnivore;
    private String animalZoneCode;

    /**
     *
     * @param animalName
     * @param animalType
     * @param carnivore
     * @param animalZoneCode
     */
    Animal(String animalName, String animalType, String carnivore, String animalZoneCode){
        this.animalName = animalName;
        this.animalType = animalType;
        this.carnivore = carnivore;
        this.animalZoneCode = animalZoneCode;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return String.format(">> "+animalName+" - "+animalType+" ("+carnivore+" )");
    }

    public String getAnimalName(){
        return this.animalName;
    }
    public String getAnimalType(){
        return this.animalType;
    }
    public String getCarnivore(){
        return this.carnivore;
    }
    public String getanimalZoneCode(){return this.animalZoneCode;}

    public void setAnimalName(String animalName){
        this.animalName=animalName;
    }
    public void setAnimalType(String animalType){
        this.animalType=animalType;
    }
    public void setCarnivore(String carnivore){
        this.carnivore = carnivore;
    }
    public void setAnimalZoneCode(String animalZoneCode){this.animalZoneCode = animalZoneCode;}
}
