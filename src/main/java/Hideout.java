import java.util.ArrayList;
import java.util.Iterator;

public class Hideout<T> {

    private ArrayList<T> elements;

    public Hideout() {
        this.elements = new ArrayList<>();
    }

    // puts an object with a type => type parameter given to class
    public void putIntoHideout(T toHide) {
        if (!(this.elements.contains(toHide))) {
            this.elements.add(toHide);
        }
    }

    // if nothing in hideout, return null
    // returns object in hideout and removes object from hideout
    public T takeFromHideout() {

        Iterator<T> iterator = elements.iterator();

        while (iterator.hasNext()) {
            // next() points to the next element
            T next = iterator.next();
            // remove next
            iterator.remove();

        }
        return null;


        // return iterator.next() --- prints out the object in hideout

        // alternative:
//        T value = elements.get(0);
//        elements.clear();
//        return value;


    }

    // returns true if there is an object in hideout
    // if no object, return false
    public boolean isInHideout() {
        if (this.elements.size() > 0) {
            return true;
        }
        return false;
    }

    public void printAll() {
        for (T e : elements) {
            System.out.println(e);
        }
    }
}
