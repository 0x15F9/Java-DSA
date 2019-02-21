import java.util.LinkedList;
public class LinkedListy {
  public static LinkedList MLL, LL;
  public static void insert(int data) {
    LL  = new LinkedList<Integer>();
    if(MLL.isEmpty()) {                   // MLL does not exist
      LL.addFirst(data);
      MLL.addFirst(LL);
    } else {                              // MLL exists
      int rIndex = 0, dIndex = 0;
      while(dIndex<MLL.size()){
        int first = (int)((LinkedList) MLL.get(dIndex)).getFirst();
        if( (first-(first%1))/10 == ((data-(data%10))/10) ) {     // LL exists
          LL = (LinkedList) MLL.get(dIndex);
          while (rIndex<LL.size() && (int)LL.get(rIndex)<data) { rIndex++; } 
          LL.add(rIndex, data);
          return;
        }
        if( (first-(first%1))/10 > ((data-(data%10))/10) ) break;
        dIndex++;
      }
      LL.addFirst(data);
      MLL.add(dIndex, LL);
    } 
  }

  public static void display() {
    for (int i = 0; i < MLL.size(); i++) {
      for (int j = 0; j < ((LinkedList)MLL.get(i)).size(); j++) {
        System.out.print(((LinkedList)MLL.get(i)).get(j)+" → ");
      } 
      System.out.println("Ø");
      System.out.println("↓");
    }
    System.out.println("Ø");
  }

  public static void main(String[] args) {

    MLL = new LinkedList<LinkedList>();

    int arr[] = {17, 21, 19, 12, 59, 53, 57, 26, 22, 22};
    for (int i : arr) { insert(i); }

    display();
    
  }
}
