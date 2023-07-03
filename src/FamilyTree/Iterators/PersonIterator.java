package FamilyTree.Iterators;

import java.util.Iterator;
import java.util.List;

import FamilyTree.Person;

public class PersonIterator implements Iterator<Person> {
    private int index;
    private List<Person> persons;

    public PersonIterator(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public boolean hasNext() {
        return persons.size() > index;
    }

    @Override
    public Person next() {
        return persons.get(index++);
    }

}
