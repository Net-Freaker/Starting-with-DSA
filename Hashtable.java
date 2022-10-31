// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Hashtable{
    Integer bucketindex;
    Integer size=0;
    HashNode[] buckets;
    public Hashtable(Integer capacity){
        this.bucketindex=capacity;
        this.buckets=new HashNode[bucketindex];
    }
    public class HashNode{
        Integer key;
        String value;
        HashNode next;
        public HashNode(Integer key,String value){
            this.key=key;
            this.value=value;
        }
    }
    public int getindex(Integer key){
        return key%bucketindex;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getlength(){
    
        return buckets.length;
    }
    public int getsize(){
        return size;
    }
    public void put(Integer key,String value){
        if(key==null || value==null){
            throw new IllegalArgumentException("key or value is null");
        }
    
        Integer index=getindex(key);
        HashNode head=buckets[index];
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
            }
            head=head.next;
        }
        size++;
        head=buckets[index];
        HashNode node=new HashNode(key,value);
        node.next=head;
        buckets[index]=node;

    }
    public String get(Integer key){
         if(key==null){
            throw new IllegalArgumentException("key or value is null");
        }
        Integer index=getindex(key);
        HashNode head=buckets[index];
        while(head!=null){
            if(head.key==key){
                return head.value;
               // break;
            }
            head=head.next;

        }
        return null;
        

    }
    public String remove(Integer key){
        Integer index=getindex(key);
        HashNode head=buckets[index];
        HashNode previous=null;
        while(head!=null){
            if(head.key==key){
                break;
            }
            previous=head;
            head=head.next;
        }
        if(head==null){
            return null;
        }
        if(previous!=null){
            previous.next=head.next;
        }
        else{
            buckets[index]=previous;
        }
        return head.value;
    }
    public static void main(String args[]){
        Hashtable table=new Hashtable(10);
        table.put(76,"hanu");
        table.put(21,"ram");
        table.put(23,"bugga");
        table.put(71,"aruna");
        System.out.println(table.get(71));
        System.out.print(table.get(21));
        System.out.println(table.remove(76));

    }
}
