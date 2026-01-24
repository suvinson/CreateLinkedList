class Node 
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linkedlist
{
    Node head=null;

    void insertbegining(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void display()
    {
      Node temp=head;
      while(temp!=null)
      {
          System.out.print(temp.data+" ");
          temp=temp.next;
      }
      System.out.print("null");
    }

    public static void main(String args[])
    {
        Linkedlist list=new Linkedlist();
        list.insertbegining(1);
        list.insertbegining(2);
        list.insertbegining(3);

        list.display();
    }

}

