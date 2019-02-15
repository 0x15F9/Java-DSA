/**
 * Student
 */
public class Student implements Comparable<Student> {

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
  
  @Override
  public int compareTo(Student student) {
    if (this.getRank() == student.rank) return 0;
    return (this.getRank() > student.getRank()) ? 1 : -1;
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