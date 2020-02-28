import java.util.List;
import java.util.ArrayList;

public class People {

    private List<Human> people = new ArrayList<Human>();

    public List<Human> getPeople(){
        return people;
    }

    public void aPerson(){
        Human aHuman = people.get(1);
        Person human = new Person();
        System.out.println(human);
        human = new Person();
        System.out.println(human);
    }

}
