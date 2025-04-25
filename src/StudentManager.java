import java.util.*;

public class StudentManager {
    private static Map<Integer, String> students = new HashMap<>();
          //Adding a student record to the map with handling invalid inputs.

    public static void addStudent(int studentId, String studentName) {
        if (studentId <= 0 || studentName == null || studentName.isEmpty()) {
            throw new IllegalArgumentException("Error: Invalid student ID or name.");
        }
        if (students.containsKey(studentId)) {
            throw new IllegalArgumentException("Student with this ID already exists.");
        }
        students.put(studentId, studentName);
        System.out.println("Student added: ID = " + studentId + ", Name = " + studentName);
    }
        //TreeMap will help to sort these students IDs

    public Map<Integer, String> sortStudentsByID() {
        if (students == null || students.isEmpty()) {
            throw new IllegalArgumentException("No student data available to sort.");
        }
        return new TreeMap<>(students);
    }
     //Searching for a student by ID and throwing exception handling.

    public String searchStudentByID(int studentId) {
        if (studentId <= 0) {
            throw new IllegalArgumentException("Invalid student ID.");
        }
        return students.getOrDefault(studentId, "Student not found.");
    }

    //Removing a student by ID and throwing exception handling.
    public void removeStudentByID(int studentId) {
        if (students == null) {
            throw new NullPointerException("Student map is null.");
        }
        if (studentId <= 0) {
            throw new IllegalArgumentException("Student ID must be a positive integer.");
        }
        if (!students.containsKey(studentId)) {
            throw new NoSuchElementException("Student with ID " + studentId + " not found.");
        }
        String removedStudent = students.remove(studentId);

        System.out.println("Student removed successfully with ID: " + studentId);

    }

        //Returning the student with the highest ID and throwing exception handling.

    public String studentWithHighestID() {
        if (students.isEmpty()) {
            throw new NoSuchElementException("No students available.");
        }
        return students.get(Collections.max(students.keySet()));
    }

    //Returning the student with the Lowest ID and throwing exception handling.

    public String studentWithLowestId() {
        if (students.isEmpty()) {
            throw new NoSuchElementException("No students available.");
        }
        return students.get(Collections.min(students.keySet()));
    }
}