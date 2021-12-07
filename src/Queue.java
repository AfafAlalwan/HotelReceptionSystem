
public class Queue  < T extends Comparable < ? super T >> {
   
    private QueueNode front,rear;
    private int size;
   
    public Queue() {
        front=null;
        rear=null;
        size = 0;
    }
   
    public boolean isEmpty() {
        return front==null;
    }
        
    public void enqueue(String name)
    {
        QueueNode newNode=new QueueNode(name);
        if(isEmpty())
        {
            front=rear=newNode;
           
        }
                else{
        rear.setNext(newNode);
        rear=newNode;
        size++;
                }
       
    }
        
    public boolean dequeue() {
        if(isEmpty()) {
            return false;
        }
           
     front=front.getNext();
     if(front==null) {
         rear=null;
     }
        return true;
       
    }
       
    public void outputList() {
        QueueNode current=front;
       
        while(current!=null) {
            System.out.println(current.getElement()+"");
            current=current.getNext();
        }
       
    }
       
    public String getTop(){
            return front.getElement();
        }
        
          
//       
//        public boolean search(String element)
//        {
//            BinaryTree t=new BinaryTree();
//          int a= t.searchNode(rear, element);
//           if(a==1){
//               System.out.println("the room is taken");
//               return false;
//           }
//           else{
//                      
//                 System.out.println("the room is available");
//                      
//                       }
//               return true;
//           
//           }
}
