import java.util.HashMap;
import java.util.Map;

public class StudentManager {
 int studentId;
 String name;
 public static boolean addStudent(Map<Integer, String> students, int studentId, String name) {
  // Handle invalid inputs
  if (studentId <= 0 || name == null || name.trim().isEmpty()) {
   return false; // Indicate failure
  }

  // Check if the student ID already exists
  if (students.containsKey(studentId)) {
   return false; // Student ID already exists, cannot add.
  }

  // Add the student to the map
  students.put(studentId, name);
  return true; // Indicate success
 }


}
