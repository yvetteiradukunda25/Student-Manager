import java.util.*;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        try {
            manager.addStudent(31, "John");
            manager.addStudent(35, "Bella");
            manager.addStudent(32, "Louise");
            manager.addStudent(34, "Anaclet");
            manager.addStudent(33, "Remy");

            System.out.println("Sorted Students: " + manager.sortStudentsByID());
            System.out.println("\nSearch student with Id 32: " + manager.searchStudentByID(32));
            System.out.println("\nSearch student with Id 34: " + manager.searchStudentByID(34));

            manager.removeStudentByID(31);
            System.out.println("Sorted students after removal:" + manager.sortStudentsByID());
            System.out.println("Highest ID student" + manager.studentWithHighestID());
            System.out.println("Lowest ID student:" + manager.studentWithLowestId());

            }catch (IllegalArgumentException e){
            System.err.println("Illegal message displayed:" + e.getMessage());
        }catch (NullPointerException e){
            System.err.println("Null message displayed:" + e.getMessage());
        }catch (NoSuchElementException e){
            System.err.println("No student with ID 32 found");

        }




        //sort by value

    }
}