public class Assignment2Q1{
  public static void main(String [] args) {
    LinkListClass ageList = new LinkListClass();
    ageList.add(12,0);
    ageList.add(50,1);
    ageList.add(60,2);
    ageList.add(80,3);
    ageList.add(10,4);
    ageList.add(34,5);
    ageList.traverse(ageList.head);
    ageList.add(90,2);
    ageList.traverse(ageList.head);
    ageList.remove(0);
    ageList.remove(5);
    ageList.traverse(ageList.head);
    Node node = ageList.getNode(1);
    ageList.traverse(node);
  }
}
