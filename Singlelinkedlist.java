import java.time.format.FormatStyle;

public class Singlelinkedlist{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

public void display(){

    ListNode current =head;
    while(current!=null){
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.println("null");
}
//for the length
public void length(){
    if(head==null)
    {
        //return 0;
        System.out.println("Length is: 0");
    }
    int count =0;
    ListNode current=head;
    while(current!=null)
    {
        count++;
        current=current.next;
    }
    //return count;
    System.out.println("count is:"+count);
    
}
public void insertvalueatstart(int value)
{
    ListNode newnode=new ListNode(value);
    newnode.next=head;
    head=newnode;

}
public void insertatend(int value)
{
    ListNode newnode=new ListNode(value);

    if(head==null)
    {
        head=newnode;
        return;
    }
    else{
        ListNode current =head;
        while(current.next!=null)
        {
            current=current.next;

        }
        current.next=newnode;
    }
}

public void insertatposition(int value,int position)
{
    ListNode node=new ListNode(value);
    if(position==1)
    {
        node.next=head;
        head=node;
    }
    else{
        ListNode Previos=head;
        int count=1;
        while(count<position-1)
        {
            count++;
            Previos=Previos.next;
            
        }
        ListNode current = Previos.next;
        Previos.next=node;
        node.next=current;

    }
}
public static void main(String[] args) 
{
    Singlelinkedlist sll=new Singlelinkedlist();
    sll.head=new ListNode(11);
    ListNode Second=new ListNode(5);
    ListNode Third = new ListNode(7);
    ListNode Fourth =new ListNode(99);
    sll.head=Second;
    Second.next=Third;
    Third.next=Fourth;
   
    sll.length();
    sll.insertvalueatstart(69);
    sll.display(); 
   
  
    sll.insertatend(23);
    sll.display();   
    sll.insertatposition(22, 2);
    sll.display();
}
}