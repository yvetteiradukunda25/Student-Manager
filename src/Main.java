import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        try {
            StudentManager.addStudent(31, "John");
            StudentManager.addStudent(35, "Bella");
            StudentManager.addStudent(32, "Louise");
            StudentManager.addStudent(34, "Anaclet");
            StudentManager.addStudent(33, "Remy");

            System.out.println("\nSorted Students: " + manager.sortStudentsByID());
            System.out.println("Search ID 32: " + manager.searchStudentByID(32));
            System.out.println("Search ID 34: " + manager.searchStudentByID(34));

            manager.removeStudentByID(33);
            System.out.println();
            System.out.println("After removal: " + manager.sortStudentsByID());
            System.out.println("Highest ID student: " + manager.studentWithHighestID());
            System.out.println("Lowest ID student: " + manager.studentWithLowestId());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation logged successfully.");
        }

        // Invalid input tests
        System.out.println("\nInvalid Inputs:");
        try {
            StudentManager.addStudent(-1, "");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            manager.searchStudentByID(-12);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            manager.removeStudentByID(-12);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            manager.removeStudentByID(40);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            StudentManager emptyManager = new StudentManager();
            emptyManager.studentWithHighestID();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}