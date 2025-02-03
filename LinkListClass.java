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

  public void remove(int pos){
    Node current = this.head;
    if(current!=null){
      if (pos == 0){
        this.head = this.head.next;
      }else{
        for(int i = 0; i < pos-1; i++){
          current = current.next;
        }
        current.next = current.next.next;
      }
    }
  }

  public void traverse(Node node){
    Node current = node;
    if(current!=null){
      System.out.print(current.data);
      System.out.print(" -> ");
      while((current=current.next)!=null){
        System.out.print(current.data);
        System.out.print(" -> ");
      }
      System.out.print("null");
      System.out.println("");
    }
    else{
      System.out.println("Linked list is empty.");
    }
  }

  public Node getNode(int pos){
    Node current = this.head;
    if(pos==0){
      return current;
    }else{
      if(current!=null){
        int i = 0;
        for(; i < pos; i++){
          if(current.next!=null){
            current = current.next;
          }else{
            System.out.println("Index out of range.");
          }
        }
        if(i == pos){
          return current;
        }else{
          System.out.println("Index out of range");
          return null;
        }
      }else{
        return null;
      }
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
