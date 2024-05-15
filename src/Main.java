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

        i.setName("Жуков Александр Евгеньевич");
        i.setGender(Gender.Male);
        i.setBirthDate(LocalDate.of(1973,12,22),null);
        i.setFather(father);
        i.setMother(mother);
        i.setSpouse(wife);
        i.setChildren(kidNikolay);
        i.setChildren(kidMariya);

        father.setName("Жуков Евгений Николаевич");
        father.setGender(Gender.Male);
        father.setBirthDate(LocalDate.of(1951,6,3),null);
        father.setChildren(i);

        mother.setName("Жукова Любовь Николаевна");
        mother.setGender(Gender.Female);
        mother.setBirthDate(LocalDate.of(1950,4,11),null);
        mother.setChildren(i);

        wife.setName("Жукова Виктория Владимировна");
        wife.setGender(Gender.Female);
        wife.setBirthDate(LocalDate.of(1977,5,6),null);
        wife.setSpouse(i);
        wife.setChildren(kidNikolay);
        wife.setChildren(kidMariya);

        kidNikolay.setName("Жуков Николай Александрович");
        kidNikolay.setGender(Gender.Male);
        kidNikolay.setBirthDate(LocalDate.of(2013,4,13),null);
        kidNikolay.setFather(i);
        kidNikolay.setMother(wife);

        kidMariya.setName("Жукова Мария Александровна");
        kidMariya.setGender(Gender.Female);
        kidMariya.setBirthDate(LocalDate.of(2016,6,16),null);
        kidMariya.setFather(i);
        kidMariya.setMother(wife);

        System.out.println(i);
        System.out.println(father.getChildren());








    }
}