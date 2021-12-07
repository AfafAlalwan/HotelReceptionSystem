
public class QueueNode {
    
    private QueueNode next;
    private String element;

    public QueueNode() {
        next = null;
        element = null;
    }
    
    public QueueNode(String name) {
        next = null;
        element = name;
    }
    
    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
    
    public String getElement() {
        return element;
    }
    
    public void setElement(String element) {
        this.element = element;
    }
}
