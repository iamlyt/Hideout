import java.util.ArrayList;

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

//    // takes out the object with a type
//    public T takeFromHideout() {
//
//        if (this.elements.isEmpty()) {
//            return null;
//        } else {
//
//        }
//    }

    // returns true if there is an object in hideout
    // if no object, return false
    public boolean isInHideout() {
        if (this.elements.size() > 0) {
            return true;
        }
        return false;
    }
}
