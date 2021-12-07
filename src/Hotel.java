
public class Hotel {   
    public BinaryTree system = new BinaryTree();
    public Node wantedRoom, option1, option2;
    
    public Hotel(){
        
        system.root = new Node("Hotel");
        
	system.insert("Room");	
        system.insert("Suite");
	system.insert("Single Room");
        system.insert("Couple Room");
	system.insert("Master Room");
	system.insert("Mini Room");
        system.insert("Single Room");
	system.insert("Double Room");
        system.insert("King Room");
	system.insert("Queen Room");
        system.insert("Master Room with View");
	system.insert("Master Room without View");
        system.insert("Mini Room with View");
	system.insert("Mini Room without View");
        system.insert("Single Room with View");
	system.insert("Single Room without View");
        system.insert("Double Room with View");
	system.insert("Double Room without View");
        system.insert("King Room with View");
	system.insert("King Room without View");
        system.insert("Queen Room with View");
	system.insert("Queen Room without View");
	
		
		
	system.insert("3rd floor, Room 17 (Master)");
	system.insert("4th floor, Room 21 (Master)");
        system.insert("3rd floor, Room 19 (Master)");
	system.insert("4th floor, Room 23 (Master)");
        system.insert("3rd floor, Room 18 (Mini)");
	system.insert("4th floor, Room 22 (Mini)");
        system.insert("3rd floor, Room 20 (Mini)");
	system.insert("4th floor, Room 24 (Mini)");
		
        system.insert("1st floor, Room 1 (Single)");
	system.insert("2nd floor, Room 9 (Single)");
        system.insert("1st floor, Room 5 (Single)");
	system.insert("2nd floor, Room 13 (Single)");
        system.insert("1st floor, Room 2 (Double)");
	system.insert("2nd floor, Room 10 (Double)");
        system.insert("1st floor, Room 6 (Double)");
	system.insert("2nd floor, Room 14 (Double)");
        system.insert("1st floor, Room 3 (King)");
	system.insert("2nd floor, Room 11 (King)");
        system.insert("1st floor, Room 7 (King)");
	system.insert("2nd floor, Room 15 (King)");
        system.insert("1st floor, Room 4 (Queen)");
	system.insert("2nd floor, Room 12 (Queen)");
        system.insert("1st floor, Room 8 (Queen)");
	system.insert("2nd floor, Room 16 (Queen)");
        
                system.printLeaves(system.root);

	
    }
  
  
    public void setIndecies(int i, int j, int k){
        wantedRoom = system.root;
        
        
        switch(i){
            case 0:
                wantedRoom = wantedRoom.getLeft(); //Room
                break;
            case 1:
                wantedRoom = wantedRoom.getRight(); // Suite
                break;
        }
      
        if(i == 0){
            
        switch(j){
            case 0:
                wantedRoom = wantedRoom.getLeft().getLeft(); //Single Room
                break;
            case 1:
                wantedRoom = wantedRoom.getLeft().getRight(); //Double Room
                break;
            case 2:
                wantedRoom = wantedRoom.getRight().getLeft(); //King Room
                break;
            case 3:
                wantedRoom = wantedRoom.getRight().getRight(); //Queen Room
                break;
        }
        }else if(i == 1){
            switch(j){
                case 0:
                wantedRoom = wantedRoom.getLeft(); // Master Room
                break;
                case 1:
                wantedRoom = wantedRoom.getRight(); //Mini Room
                break;
                }
            
        }
        switch(k){
            case 0: 
                wantedRoom = wantedRoom.getLeft(); //with view
                break;
            case 1:
                wantedRoom = wantedRoom.getRight(); //without view
                break;
            }
            
        System.out.println(wantedRoom.getElement());
            
        option1 = wantedRoom.getLeft();
        option2 = wantedRoom.getRight();
        
    }
    
    public String[] getAvailableRoom(){ // show availabe rooms for customer
        String[] options = new String[2];
        options[0] = option1.getElement();
        options[1] = option2.getElement();
        return options;
    }
    

}
