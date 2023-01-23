public class Main {

    public static void main(String[] args) {
        // first den
        Hideout<String> den1 = new Hideout<>();
        System.out.println(den1.isInHideout());     // false

        den1.putIntoHideout("peekaboo");
        System.out.println(den1.isInHideout());     // true
        System.out.println(den1.takeFromHideout()); // peekaboo
        System.out.println(den1.isInHideout());     // false

        System.out.println("----");

        den1.putIntoHideout("toodaloo");
        den1.putIntoHideout("heelloo");
        System.out.println(den1.isInHideout());     // true
        System.out.println();
        System.out.println(den1.takeFromHideout()); // heelloo
        System.out.println();
        System.out.println(den1.isInHideout());     // false

        System.out.println("-----");
        den1.printAll();

//        // second den
//        Hideout<Integer> den2 = new Hideout<>();
//        System.out.println(den2.isInHideout());
//        den2.putIntoHideout(1);
//        System.out.println(den2.isInHideout());
//        System.out.println(den2.isInHideout());
//        System.out.println(den2.takeFromHideout());
//        System.out.println(den2.isInHideout());
    }
}