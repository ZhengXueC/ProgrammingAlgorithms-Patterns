package employeeTree;



public class BinaryEmployeeTreeClass {

public BinaryEmployeeTreeNode rootTree;
	
	public BinaryEmployeeTreeClass() {
		
		rootTree=null;
		
	}
	//concrete methods
	//add an element to the binary search tree
	public void put(Employee emp) {
		//complete this
		BinaryEmployeeTreeNode newNodeTree=new BinaryEmployeeTreeNode();
		newNodeTree.info=emp;
		newNodeTree.Llink=null;
		newNodeTree.Rlink=null;
		
		BinaryEmployeeTreeNode currentNode;
		
		if(rootTree==null) {
			
			rootTree=newNodeTree;
			currentNode=rootTree;
		}
		else {
			
			currentNode=rootTree;
			
			while(true) {
			if(emp.emp_salary<currentNode.info.emp_salary) {
				if(currentNode.Llink==null) {
				
				currentNode.Llink=newNodeTree;//establish the left link
				break;
				//insert = true;
				}
				
					currentNode =currentNode.Llink;//update the link to go to next left one	
			}
			else {
				//go to right
				
					if(currentNode.Rlink==null) {				
					//go to left
					currentNode.Rlink=newNodeTree;//establish the right link
					//insert = true;
					break;
					}				
						currentNode =currentNode.Rlink;//update the link to go to next right one
											
				}		
		   }
		}	
	}
	public boolean search(double num) {
		
		BinaryEmployeeTreeNode currentNode; //will allow to traverse tree
		
		currentNode =rootTree;
		
		boolean found = false;//variable found will return T/F
		while(!found && currentNode!=null) { //traverse all the tree until completing the search
		if (num == currentNode.info.emp_salary) {
			
			found = true;
			
		}
		else {
			if(num<currentNode.info.emp_salary){
				
				currentNode = currentNode.Llink;
				
				
			}//traverse the left subtree
			
			else {
				
				currentNode = currentNode.Rlink;//traverse the right subtree			
			}			
		  }
		}		
		return found;	
	}
		

	
	public void InOrderTraversal() {
		
		inOrder(rootTree);
			
			
		}
	public void inOrder(BinaryEmployeeTreeNode oot) {
		if(oot.Llink!=null) {
			
			inOrder(oot.Llink);
			
		}
		System.out.print(oot.info);
		System.out.printf("	Employee Salary: %.2f\n",oot.info.emp_salary);
		
		if(oot.Rlink!=null) {
			
			inOrder(oot.Rlink);
		}
		

	}	
	
}
