import java.util.*;

public class StudentManager {
 private static Map<Integer, String> students;

    public StudentManager() {
        students = new HashMap<>();
    }
    //Adding student records by student ID as key, student name as value
    // with exception handling to handle invalid inputs:

    public static void addStudent(int studentId, String studentName) {
  // Handle invalid inputs
  if (studentId <= 0 || studentName == null || studentName.isEmpty()) {
   throw new IllegalArgumentException( "Invalid Inputs! Please enter positive ID and Enter the name"); // Indicate failure
  }
  if (students.containsKey(studentId)) {
   throw new IllegalArgumentException("Student with this ID already exists.");
  }

  students.put(studentId, studentName);
  System.out.println("Student added successfully with ID: " + studentId + ", Name: " + studentName);
 }
 //Sorting student records by student ID:

Map<Integer, String> sortStudentsByID() {
    if (students == null) {

        throw new IllegalArgumentException("Map is Null!");
    }
    if (students.isEmpty()) {
        System.out.println("Map is empty to be sorted");
        return new TreeMap<>();
    }
    return new TreeMap<>(students);
}
       //Search for a student by ID with exception handling to handle invalid inputs.
    public String searchStudentByID(int studentId) {
        if (students == null) {
            throw new IllegalArgumentException("Map is Null!");
        }
        if (studentId<= 0) {
            throw new IllegalArgumentException( "Invalid Inputs! Please enter positive ID");
        }
        return students.get(studentId);
    }
    // Removing a student record by ID:
    public String removeStudentByID(int studentId) {
        /*if (students == null) {
            throw new IllegalArgumentException("Map is Null!");
        }
        if (studentId <= 0) {
            throw new IllegalArgumentException( "Invalid Inputs! Please enter positive ID");
        }*/
        String removedStudentName = students.remove(studentId);
        if (removedStudentName == null) {
            throw new IllegalArgumentException("Student with this ID does not exist." + studentId);
        } else {
            System.out.println("Student with this ID:  " + studentId + " removed successfully.");
        }
        return removedStudentName;
    }
    // Finding the student with the highest ID.
    public String studentWithHighestID(){
        if (students == null) {
            throw new NullPointerException("Map is Null!");
        }
        if (students.isEmpty()) {
           throw new NoSuchElementException("Map is Empty!");
        }
        int maxId = Integer.MIN_VALUE;
        String StudentName = null;
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            int maxId1 = maxId;
            if (entry.getKey() >maxId){
    maxId = entry.getKey();
        StudentName = entry.getValue();
            }
        }
        return StudentName;
    }
    // Finding the student with the lowest ID.
    public String studentWithLowestId() {
        if (students == null) {
            throw new NullPointerException("Map is Null!");
        }
        if (students.isEmpty()) {
            throw new NoSuchElementException("Map is Empty!");
        }
        int minId = Integer.MIN_VALUE;
        String StudentName = null;
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            if (entry.getKey() < minId){
            minId = entry.getKey();
            StudentName = entry.getValue();
            }
        }
        return StudentName;
    }
}
