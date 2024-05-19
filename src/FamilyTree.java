import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    Integer humansId = 1;
    List<Human> familyTree = new ArrayList<>();

    public void setHuman(Human human){
        if (human.id == 0){
            human.id = humansId++;
            familyTree.add(human);
            if (human.father != null && !human.father.getChildren().contains(human)){
                human.father.setChildren(human);
            }
            if (human.mother != null && !human.mother.getChildren().contains(human)){
                human.mother.setChildren(human);
            }
            for (Human kid: human.getChildren()){
                if (human.getGender() == Gender.Male){
                    kid.setFather(human);
                }
                else{
                    kid.setMother(human);
                }
            }
            if (human.spouse != null){
                human.getSpouse().setSpouse(human);
            }
        }
        else{
            System.out.println(human.name + " уже добавлен!");
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("В дереве " + this.familyTree.size() + " человек" + "\n");
        for (Human human: this.familyTree){
            stringBuilder.append("Имя: "+ human.name + ". Дата рождения: " + human.birthDate);
            stringBuilder.append(". Дата смерти: " + human.deathDate);
            stringBuilder.append(". Возраст: " + human.getAge() + " лет");
            if (human.father != null){
                stringBuilder.append(". Отец: " + human.father.name);
            }
            if (human.mother != null){
                stringBuilder.append(". Мать: " + human.mother.name);
            }
            if (human.spouse != null){
                stringBuilder.append(". Супруг(а): " + human.spouse.name);
            }
            for (Human tmp: human.children) {
                stringBuilder.append(". Дети: " + tmp.name);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
