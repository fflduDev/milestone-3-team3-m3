package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
		for (GenericTreeNode<Employee> node : nodes) {
			if (node.data.equals(manager)) {
				GenericTreeNode<Employee> child = new GenericTreeNode<>(newPerson);
				node.addChild(child); // correctly attach to parent
				nodes.add(child);     // keep track of it in the nodes list
				return;               // stop after adding
			}
		}
	}
	
	@Override
	public void removeEmployee(Employee firedPerson) {
		GenericTreeNode<Employee> toRemove = null;
		GenericTreeNode<Employee> parent = null;

		for (GenericTreeNode<Employee> node : nodes) {							//Find the node to remove and its parent
			if (node.data.equals(firedPerson)) {								//If the node is the root, set toRemove to the node
				toRemove = node;
				break;
			}
			if (node.children != null) {										//If the node has children
				for (GenericTreeNode<Employee> child : node.children) {
					if (child.data.equals(firedPerson)) {						//If the child is the one to remove, set toRemove to the child
						toRemove = child;
						parent = node;
						break;
					}
				}
			}
			if (toRemove != null) break;
		}
	
		if (toRemove == null){
			return;
		} 
	
		
		if (parent != null) {												//If it has a parent, transfer children and remove from parent's list
			if (toRemove.children != null) {								//If the node toRemove has children
				for (GenericTreeNode<Employee> child : toRemove.children) {	//For each child of the node to remove
					parent.addChild(child);									//Add the child to the parent
				}
			}
			parent.children.remove(toRemove);
		} 
		
		else {	
			if (!toRemove.children.isEmpty()) {
				nodes.set(0, toRemove.children.get(0)); 		//promote first child
				for (int i = 1; i < toRemove.children.size(); i++) {		//for each child of the node to remove
					nodes.get(0).addChild(toRemove.children.get(i));	//add the rest of the children to the new root
				}
			} 
			
			else {
				nodes.remove(toRemove);
			}
		}
		nodes.remove(toRemove);
	}
	

	@Override
	public void showOrgChartDepthFirst() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Displaying Depth Org Chart");

		if (!nodes.isEmpty()) {
			depthFirstTraversal(nodes.get(0), 0);
		}
		System.out.println();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();
	}

	private void depthFirstTraversal(GenericTreeNode<Employee> node, int depth) {
		if (depth == 0) {
			System.out.print(node.data); 							// Print root node without a newline
		} else {
			System.out.print(node.data + "     "); 				// Print child nodes inline
		}

		if (node.children != null && !node.children.isEmpty()) {
			System.out.println(); // Move to the next row for children
			for (GenericTreeNode<Employee> child : node.children) {
				depthFirstTraversal(child, depth + 1);
			}
		}
	}

	@Override
	public void showOrgChartBreadthFirst() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Displaying Breadth Org Chart");
	
		if (nodes.isEmpty()) return;
	
		Queue<GenericTreeNode<Employee>> queue = new LinkedList<>();
		queue.add(nodes.get(0)); 									// start from root
	
		while (!queue.isEmpty()) {
			GenericTreeNode<Employee> current = queue.poll();
			System.out.println(current.data);
	
			if (current.children != null) {
				for (GenericTreeNode<Employee> child : current.children) {
					queue.add(child);
				}
			}
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();
	}
}