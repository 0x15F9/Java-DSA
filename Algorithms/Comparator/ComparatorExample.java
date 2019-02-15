import java.util.ArrayList;
import java.util.Collections;
/**
 * ComparatorExample
 */
public class ComparatorExample {
  public static void main(String[] args) {
    Student S001 = new Student("John", "Doe", "1997/10/06", 1);
    Student S002 = new Student("Jane", "Smith", "1999/02/25", 5);
    Student S003 = new Student("Gary", "Bean", "1998/01/31", 7);
    Student S009 = new Student("Harry", "Potter", "1992/02/01", 1);
    Student S004 = new Student("John", "Wick", "1995/05/05", 1);
    Student S007 = new Student("Peter", "Parker", "1995/05/05", 5);

    ArrayList<Student> studentsList = new ArrayList<Student>();
    studentsList.add(S001);
    studentsList.add(S002);
    studentsList.add(S003);
    studentsList.add(S004);
    studentsList.add(S009);
    studentsList.add(S007);

    // Display Unsorted
    System.out.println("Unsorted: ");
    for (Student s : studentsList) {
      System.out.println(s.toString());
    }
    System.out.println();

    // Display Sorted by Rank
    studentsList.sort(new Student.compareByRank());
    System.out.println("Sorted by Rank: ");
    for (Student s : studentsList) {
      System.out.println(s.toString());
    }
    System.out.println();

    // Display Sorted by Date of Birth
    studentsList.sort(new Student.compareByDateOfBirth());
    System.out.println("Sorted by Date of Birth: ");
    for (Student s : studentsList) {
      System.out.println(s.toString());
    }
    System.out.println();

    // Display Sorted by Last Name
    studentsList.sort(new Student.compareByLastName());
    System.out.println("Sorted by Last Name: ");
    for (Student s : studentsList) {
      System.out.println(s.toString());
    }
    System.out.println();
  }
}