public class  LinkListClass{
  public Node head;
  public LinkListClass(){
    this.head = null;
  }
  public void add(int data, int pos){
    Node newNode = new Node(data);
    if(pos==0){
      newNode.next = this.head;
      this.head = newNode;
    }else{
      Node current = this.head;
      for(int i = 0; i < pos-1; i++){
        if(current!=null){
          current = current.next;
        }else{
          System.out.println("Index out of range.");
        }
      }
      if(current!=null){
        newNode.next = current.next;
        current.next = newNode;
      }
    }
}
class Node{
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}
