import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Human i = new Human();
        Human wife = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human kidNikolay = new Human();
        Human kidMariya = new Human();

        i.setId(0);
        i.setName("Иванов Сергей Петрович");
        i.setGender(Gender.Male);
        i.setBirthDate(LocalDate.of(1983,11,15),null);
        i.setFather(father);
        i.setMother(mother);
        i.setSpouse(wife);
        i.setChildren(kidNikolay);
        i.setChildren(kidMariya);

        father.setId(0);
        father.setName("Иванов Петр Николаевич");
        father.setGender(Gender.Male);
        father.setBirthDate(LocalDate.of(1962,7,13),null);
        father.setChildren(i);

        mother.setId(0);
        mother.setName("Иванова Светлана Николаевна");
        mother.setGender(Gender.Female);
        mother.setBirthDate(LocalDate.of(1963,7,19),null);
        mother.setChildren(i);

        wife.setId(0);
        wife.setName("Иванова Надежда Сергеевна");
        wife.setGender(Gender.Female);
        wife.setBirthDate(LocalDate.of(1988,9,16),null);
        wife.setSpouse(i);
        wife.setChildren(kidNikolay);
        wife.setChildren(kidMariya);

        kidNikolay.setId(0);
        kidNikolay.setName("Иванов Андрей Сергеевич");
        kidNikolay.setGender(Gender.Male);
        kidNikolay.setBirthDate(LocalDate.of(2020,1,23),null);
        kidNikolay.setFather(i);
        kidNikolay.setMother(wife);

        kidMariya.setId(0);
        kidMariya.setName("Иванова Ольга Сергеевна");
        kidMariya.setGender(Gender.Female);
        kidMariya.setBirthDate(LocalDate.of(2023,4,25),null);
        kidMariya.setFather(i);
        kidMariya.setMother(wife);

        familyTree.setHuman(i);
        familyTree.setHuman(father);
        familyTree.setHuman(mother);
        familyTree.setHuman(wife);
        familyTree.setHuman(kidNikolay);
        familyTree.setHuman(kidMariya);

        System.out.println(i);
        System.out.println(familyTree);








    }
}