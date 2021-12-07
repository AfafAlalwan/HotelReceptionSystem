import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    
	public Node root;
	private int NumberofNodes;
	
	public BinaryTree() {
		root = null;
		NumberofNodes = 0;
	}
	
	//insertion by level order traversal
        public void insert(String element)
    {
		Node temp = root;
		
        if (temp == null) {
            root = new Node(element);
            NumberofNodes++;
            return;
        }
        
        java.util.Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
 
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
 
            if (temp.getLeft() == null) {
                temp.setLeft(new Node(element));
                break;
            }
            else
                q.add(temp.getLeft());
 
            if (temp.getRight() == null) {
                temp.setRight(new Node(element));
                break;
            }
            else
                q.add(temp.getRight());
        }
        
        NumberofNodes++;
    }
	
	//print all 24 rooms
	public static void printLeaves(Node node) {
		
		if(node == null)
			return;
		
		if(node.getLeft() == null && node.getRight() == null)
			System.out.print(node.getElement() + " ");
		
		printLeaves(node.getLeft());
		printLeaves(node.getRight());
	}
	
	// search for node
	public int searchNode(Node temp,String element){  
		int result = 0;
		boolean flag = false;
        if(temp == null){  
          System.out.println("Tree is empty");  
        }  
        else{  
          if((temp.getLeft().getElement()).compareToIgnoreCase(element) == 0){  
        	result = 1;  
            flag = true;  
               return result;  
          }  else if((temp.getRight().getElement()).compareToIgnoreCase(element) == 0) {
        	  result = 2;
        	  flag = true;
        	   return result;
          }
          //Search in left subtree  
          if(flag == false && temp.getLeft() != null){  
             searchNode(temp, element);  
          }  
          //Search in right subtree  
          if(flag == false && temp.getRight() != null){  
             searchNode(temp, element);  
          }  
        }  
        
        return result;
      }  
        
        public Node searchGetNode(Node temp,String element){  
		Node roomName = new Node("");
		boolean flag = false;
        if(temp == null){  
          System.out.println("Tree is empty");  
        }  
        else{  
          if((temp.getLeft().getElement()).compareToIgnoreCase(element) == 0){  
               flag = true;  
        	return roomName= temp.getLeft();  
          }  else if((temp.getRight().getElement()).compareToIgnoreCase(element) == 0) {
        	  flag = true;
        	   return roomName = temp.getRight();
          }
          //Search in left subtree  
          if(flag == false && temp.getLeft() != null){  
             searchNode(temp, element);  
          }  
          //Search in right subtree  
          if(flag == false && temp.getRight() != null){  
             searchNode(temp, element);  
          }  
        }  
        
        return null;
      }  
             
	
}
