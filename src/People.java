import java.util.List;
import java.util.ArrayList;

public class People {

    private List<Human> people = new ArrayList<Human>();

    public List<Human> getPeople(){
        return people;
    }

    public Human aPerson(){
        Human aHuman = people.get(1);
        return aHuman;
    }

}
