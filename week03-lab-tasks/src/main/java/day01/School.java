package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();
        students.addHeight(170);
        students.addHeight(175);
        students.addHeight(177);
        students.addHeight(179);
        System.out.println(students.isHeightIncreasing());
        students.addHeight(160);
        System.out.println(students.isHeightIncreasing());
    }
}
