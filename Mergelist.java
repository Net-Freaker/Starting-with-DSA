public class Mergelist{
    ListNode head;
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }
    static void display(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println();

    }
    public void insertatendd(ListNode node){
        //ListNode newnode=new ListNode(data);
        if(head==null){
            head=node;
        }
        ListNode curent=head;

        while(curent.next!=null){
            curent=curent.next;
           
            
        }
        curent.next=node;
        

    }
    
    static ListNode mergelist(ListNode a,ListNode b)
    {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(a!=null && b!=null)
        {
            if(a.data<=b.data)
         {
            temp.next=a;
            a=a.next;
         }
        else{
            temp.next=b;
            b=b.next;
            
            }
        temp=temp.next;
        }
        if(a==null){
            temp.next=b;
        }
        else{
            temp.next=a;
        }
        return dummy.next;
    }
    

    public static void main(String[] args) {
        Mergelist ml1=new Mergelist();
       ml1.head=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ml1.head.next=second;
        second.next=third;
        third.next=null;
        //display(ml1.head);
        ml1.insertatendd(new ListNode(6));
        ml1.insertatendd(new ListNode(12));;
        ml1.insertatendd(new ListNode(18));
        ml1.insertatendd(new ListNode(21));
        ml1.insertatendd(new ListNode(25));
        display(ml1.head);
        Mergelist ml2=new Mergelist();
       ml2.head=new ListNode(5);
        ListNode Sec=new ListNode(6);
        ml2.head.next=Sec;
        Sec.next=null;
        ml2.insertatendd(new ListNode(7));
        ml2.insertatendd(new ListNode(14));
        ml2.insertatendd(new ListNode(18));
        ml2.insertatendd(new ListNode(21));
        ml2.insertatendd(new ListNode(25));
        display(ml2.head);
        Mergelist ml3=new Mergelist();
        
       /*  ml3.head=new ListNode(0);
        ml3.head.next=null;/* */
        ml3.head=mergelist(ml1.head,ml2.head);
        
        display(ml3.head);
        

        
    }
}