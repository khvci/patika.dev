public class Main {
    public static void main(String[] args) {
        Fighter karl = new Fighter("Karl", 15, 10, 93,91);
        Fighter hegel = new Fighter("Hegel", 17,8,92,90);
        Ring r = new Ring(karl, hegel);
        r.run();
    }
}
