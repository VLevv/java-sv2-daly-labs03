package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();
        for (boolean b : prison.getCells()) {
            System.out.println(b);
        }
        prison.openFreeCells();
        System.out.println("Szabad rabok:");
        for (boolean b : prison.getCells()) {
            System.out.println(b);
        }
    }
}
