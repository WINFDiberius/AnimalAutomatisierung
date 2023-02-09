public class Animal {

    private String name;

    private int age;

    private String species;

    private String animalLoud;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String giveAnimalLoud(){
        switch (species){
            case "cat":
                return "Miau";
            case "dog":
                return "Wuff";
            case "lion":
                return "Roarr";
            default:
                return "Murrrgl, no speak Loud";
        }
    }

    public String getNameAndAge(){
        return name + " | " + age;
    }

    public String ageCategory(){
        if(age <= 2){
            return "Baby Animal";
        }
        else if(age <= 4){
            return "Young Animal";
        }
        else
        {
            return "Old Animal";
        }
    }

    public boolean isBabyAnimal(){
        if(age <= 2)
        {
            return true;
        }
        return false;

    }
}
