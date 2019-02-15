import java.util.Comparator;

/**
 * Student
 */
public class Student {

  String firstName;
  String lastName;
  String dateOfBirth; // Format: YYYY/MM/DD
  int rank;

  public Student(String firstName, String lastName, String dateOfBirth, int rank) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.rank = rank;
  }

    
  public static class compareByRank implements Comparator<Student> {

    @Override
    public int compare(Student first, Student second) {
      // Compare by Date of Birth rank is similar
      if(first.getRank() == second.getRank()) return first.getDateOfBirth().compareTo(second.getDateOfBirth());
      return (first.getRank() > second.getRank()) ? 1 : -1;
    }
    
  }

  public static class compareByDateOfBirth implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
      // Compare by rank if Date of Birth is similar
      if(o1.getDateOfBirth() == o2.getDateOfBirth()) return o1.getRank()-o2.getRank();
      return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }

  }

  public static class compareByLastName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
      return o1.getLastName().compareTo(o2.getLastName());
    }

  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getRank() {
    return this.rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  @Override
  public String toString() {
    return getRank() + "\t" + getFirstName()  + "\t" +  getLastName() + "\t" +  getDateOfBirth();
  }

}