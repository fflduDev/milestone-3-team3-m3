package tree;

import java.util.ArrayList;
import java.util.List;

public class OrgChartImpl implements OrgChart{

	//Employee is your generic 'E'..
	private List<GenericTreeNode<Employee>> nodes = new ArrayList<>();
	
	@Override
	public void addRoot(Employee e) {
		if (nodes.isEmpty()) {													//if the list of nodes is empty
			nodes.add(new GenericTreeNode<Employee>(e));						//add the employee to the list of nodes
		}
	}

	@Override
	public void clear() {														//clear the list of nodes
		nodes.clear();			
	}

	@Override
	public void addDirectReport(Employee manager, Employee newPerson) {
		for (GenericTreeNode<Employee> node : nodes) {								//for each node in the list of nodes
			if (node.data.equals(manager)) {										//if the node's data is equal to the manager's name
				node.addChild(new GenericTreeNode<Employee>(newPerson));			//add the new person as a child of the manager
			}
		}
		nodes.add(new GenericTreeNode<Employee>(newPerson));						//add the new person to the list of nodes
	}
	@Override
	public void removeEmployee(Employee firedPerson) {
		for (GenericTreeNode<Employee> node : nodes) {							//for each node in the list of nodes
			if (node.data.equals(firedPerson)) {								//if the node's data is equal to the name of the fired person
				nodes.remove(node);												//remove the node
			}
			

		}
	}

	@Override
	public void showOrgChartDepthFirst() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Displaying Depth Org Chart");					//print a message to indicate the org chart has been shown
		for (GenericTreeNode<Employee> node : nodes) {							//for each node in the list of nodes
			System.out.println(node.data);										//print the node's data
			if(node.children != null) {											//if the node has no children
				break;														//continue to the next node
			} else {
				System.out.println("No children");							//print a message to indicate the node has no children

			}

			for (GenericTreeNode<Employee> child : node.children) {				//for each child of the node
				System.out.println(child.data);									//print the child's data
			}
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println(" ");
	}

	@Override
	public void showOrgChartBreadthFirst() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Displayiing Breadth Org Chart");
		for (GenericTreeNode<Employee> node : nodes) {							//for each node in the list of nodes
			System.out.println(node.data);										//print the node's data
			if(node.children == null) {											//if the node has no children
				continue;														//continue to the next node
			}

			for (GenericTreeNode<Employee> child : node.children) {				//for each child of the node
				System.out.println(child.data);									//print the child's data
			}
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println(" ");
	}
	
}
