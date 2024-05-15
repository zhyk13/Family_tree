import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    LocalDate birthDate, deathDate;
    List<Human> children = new ArrayList<>();
    Human father, mother;
    Gender gender;
    Human spouse;

    public void setName(String name){
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate, LocalDate deathDate){
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    public void setChildren(Human kid){
        this.children.add(kid);
    }

    public void setFather(Human father){
        this.father = father;
    }

    public void setMother(Human mother){
        this.mother = mother;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public void setSpouse(Human spouse){
        this.spouse = spouse;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getBirthDate(){
        return this.birthDate;
    }

    public LocalDate getDeathDate(){
        return this.deathDate;
    }

    public String getFather(){
        return this.father.name;
    }

    public String getMother(){
        return this.mother.name;
    }

    public String getSpouse(){
        return this.spouse.name;
    }

    public List<String> getChildren(){
        List<String> listchildren = new ArrayList<>();
        for (Human tmp: children) {
            listchildren.add(tmp.name);
        }
        return listchildren;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.mm.dd");
        stringBuilder.append("Имя: "+ this.name + "\n" + "Дата рождения: " + this.birthDate + "\n");
        stringBuilder.append("Дата смерти: " + this.deathDate + "\n" + "Отец: " + this.father.name + "\n");
        stringBuilder.append("мать: " + mother.name + "\n");
        for (Human tmp: children) {
            stringBuilder.append("Дети: " + tmp.name + "\n");
        }
        return  stringBuilder.toString();
    }
}
