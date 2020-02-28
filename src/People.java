import java.util.List;
import java.util.ArrayList;

public class People {

    private List<Person> people = new ArrayList<Person>();

    public List<Person> getPeople(){
        return people;
    }

    public Person aPerson(){
        Person aPerson = people.get(1);
        return aPerson;
    }

}
