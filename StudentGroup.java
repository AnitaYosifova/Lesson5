import java.util.Scanner;

public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;

    Scanner sc = new Scanner(System.in);
    int  amountOfGroupPlaces = 5;


        StudentGroup() {
        this.freePlaces=5;


    StudentGroup(String groupSubject) {
        this();
        System.out.println("There is a new student group - " + groupSubject + "!");
        this.groupSubject = groupSubject;
    }
    public void emptyGroup() {
        students = new Student[amountOfGroupPlaces];
        freePlaces = amountOfGroupPlaces;
    }

    }