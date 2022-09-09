
public class Linkedlist{
    Listnode head;
    public static class Listnode{
        int data;
        Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
   /*  head=new ListNode(10);
    Listnode second=new Listnode(9);
    Listnode third=new Listnode(90);
    head.next=second;
    second.next=third;*/
    //third.next=null;
    static void display(Listnode head){
        Listnode current=head;
        int count=0;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
            count++;
        
        }
       // System.out.print(current.data+"-->");

        System.out.print("null");
        
        System.out.println("Count:"+count);
    }
    public void addFirstt(int value)
    {
        Listnode newnode=new Listnode(value);
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int value){
        Listnode newnode=new Listnode(value);
        if(head==null){
            head=newnode;
            
        }
        else{
            Listnode current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;

        }


    }
    //deleting at perticular position
    public void deleteatposition(int position)
    {
        int count=1;
        Listnode previous=head;
       
        while(count<position-1)
        {
            previous=previous.next;
            count++;
            
        }
        Listnode current=previous.next;
        previous.next=current.next;



    }
    public void addatpertcularpostion(int position,int value){
        Listnode previous=head;
        Listnode newnode=new Listnode(value);
        int count=1;
        while(count<position-1)
        {
            previous=previous.next;
            count++;
        }
        Listnode current=previous.next;
        previous.next=newnode;
        newnode.next=current;

    }
    //reverse a list
    Listnode reverse(Listnode head){
        Listnode current=head;
        Listnode previous=null;
        Listnode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            //head=current;
        }
        head=previous;
        return head;


        
    }
    /*void printlist(Listnode head)
    {
        while(head!=null){
            System.out.println(head.data+"-->");
            head=head.next;
        }
    }*/
    public static void main(String[] args) {
        Linkedlist sll=new Linkedlist();
        sll.head=new Listnode(7);
        Listnode second=new Listnode(8);
        Listnode third=new Listnode(6);
        Listnode fourth=new Listnode(78);
        
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
       // sll.addFirst(00);
       System.out.println("Beffore adding");
        display(sll.head);
       sll.addFirstt(00);
       sll.addLast(11);
       System.out.println("After adding");
        

        display(sll.head);
        sll.deleteatposition(1);
        display(sll.head);
        sll.addatpertcularpostion(2, 69);
    
       display(sll.head);
       Listnode content=sll.reverse(sll.head);
       System.out.println("AFter REversing");

       display(content);

    }




    
}