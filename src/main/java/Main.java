public class Main {

    public static void main(String[] args) {
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout());

        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout());
        System.out.println(den);
    }
}