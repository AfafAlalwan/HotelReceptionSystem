
public class Node {
    
    private Node left, right;
    private String element;
    private Queue queue = new Queue();
    
    public Node(){
        element = null;
        left = right = null;
        setQueue(queue);
    }
    public Node(String element) {
        this.element= element;
        left = right = null;
        setQueue(queue);
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
    
    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue a) {
       this.queue = queue;
        }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }
    
       
}
 