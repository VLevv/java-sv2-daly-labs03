package day05;

public class JournalMain {
    public static void main(String[] args) {
        Journal journal = new Journal();
        System.out.println(journal.addStudent("Jani"));
        System.out.println(journal.addStudent("Kiss Jani"));
        System.out.println(journal.addStudent("Mariska"));
        System.out.println(journal.addStudent("Kovács Laci"));
        System.out.println(journal.addStudent("Erős Peti"));
        System.out.println(journal.getNames());
    }
}
