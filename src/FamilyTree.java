import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> familyTree = new ArrayList<>();

    public void setRelative(Human relative){
        this.familyTree.add(relative);
    }

    public Human getRelative(String name){
        for (Human tmp: familyTree){
            if (tmp.name == name){
                return tmp;
            }
        }
        return null;
    }


}
