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
		// find the manager
		for (GenericTreeNode<Employee> node : nodes) {							//for each node in the list of nodes
			if (node.data.equals(manager)) {									//if the node's data is equal to the name of the manager	
				node.addChild(new GenericTreeNode<Employee>(newPerson));		//add the new person as a child of the manager
			}
		}
		System.out.println("Manager not found. Please ensure the name of the manager is correct");
	}

	@Override
	public void removeEmployee(Employee firedPerson) {
		for (GenericTreeNode<Employee> node : nodes) {							//for each node in the list of nodes
			if (node.data.equals(firedPerson)) {								//if the node's data is equal to the name of the fired person
				nodes.remove(node);												//remove the node
			}
			

		}
	}
	
}
