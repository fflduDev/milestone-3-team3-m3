package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 

public class DiGraphImpl implements DiGraph{

	private List<GraphNode> nodeList = new ArrayList<>();

	@Override
	public Boolean addNode(GraphNode node) {
		if (nodeList.contains(node)) { 										//Check if the node already exists
			return false; 													//Node already exists, return false
		}
		nodeList.add(node); 												//Add the new node to the list
		return true; 														//Node added successfully
	}

	@Override
	public Boolean removeNode(GraphNode node) {
		if (nodeList.contains(node)) {										//Check if node already exists
			nodeList.remove(node);											//Remove node
			return true;													//Return true
		}
		else {
			System.out.println("Node not contained in nodeList");
			return false;													//If node does not exist return false so that 
		}

	}

	@Override
	public Boolean setNodeValue(GraphNode node, String newNodeValue) {
		if (nodeList.contains(node)) { 										//Check if the node already exists
			node.setValue(newNodeValue);									//Reassign new value to the node
			return true; 													//Return true
		}
		return false;

	}

	@Override
	public String getNodeValue(GraphNode node) {
		if (nodeList.contains(node)) { 										//Check if the node already exists
			return node.getValue(); 										//Return the value of the node
		}
		return null;														//If the node does not exist return null
	}

	@Override
	public Boolean addEdge(GraphNode fromNode, GraphNode toNode, Integer weight) {
		if (nodeList.contains(fromNode) && nodeList.contains(toNode)) {		//Check if both nodes exist
			fromNode.addNeighbor(toNode, weight);							//Add the edge to the fromNode
			return true;													//Return true
		}
		return false;														//If either node does not exist return false
	}

	@Override
	public Boolean addEdgeStr(String fromNodeValue, String toNodeValue, Integer weight) {
		GraphNode fromNode = getNode(fromNodeValue);
		GraphNode toNode = getNode(toNodeValue);							//Get the toNode
		if (fromNode != null && toNode != null) {							//Check if both nodes exist
			fromNode.addNeighbor(toNode, weight);							//Add the edge to the fromNode
			return true;													//Return true
		}
		return false;														//If either node does not exist return false
	}

	@Override
	public Boolean removeEdge(GraphNode fromNode, GraphNode toNode) {
		if (nodeList.contains(fromNode) && nodeList.contains(toNode)) {		//Check if both nodes exist
			fromNode.removeNeighbor(toNode);								//Remove the edge from the fromNode
			return true;													//Return true
		}
		return false;														//If either node does not exist return false
	}

	@Override
	public Boolean setEdgeValue(GraphNode fromNode, GraphNode toNode, Integer newWeight) {
		if (nodeList.contains(fromNode) && nodeList.contains(toNode)) {		//Check if both nodes exist
			fromNode.addNeighbor(toNode, newWeight);						//Set the new weight of the edge
			return true;													//Return true
		}
		return false; 														//If either node does not exist return false
	}

	@Override
	public Integer getEdgeValue(GraphNode fromNode, GraphNode toNode) {
		if (nodeList.contains(fromNode) && nodeList.contains(toNode)) {		//Check if both nodes exist
			return fromNode.getDistanceToNeighbor(toNode);					//Return the weight of the edge
		}
		return null;														//If either node does not exist return null
	}

	@Override
	public List<GraphNode> getAdjacentNodes(GraphNode node) {		//Never Used
		if (nodeList.contains(node)) { 										//Check if the node already exists
			return node.getNeighbors(); 									//Return the neighbors of the node
		}
		return null;														//If the node does not exist return null
	}

	@Override
	public Boolean nodesAreAdjacent(GraphNode fromNode, GraphNode toNode) {
		if (nodeList.contains(fromNode) && nodeList.contains(toNode)) {		//Check if both nodes exist
			return fromNode.getNeighbors().contains(toNode);				//Check if the toNode is a neighbor of the fromNode
		}
		return false;														//If either node does not exist return false
	}

	@Override
	public Boolean nodeIsReachable(GraphNode fromNode, GraphNode toNode) {
		if (nodeList.contains(fromNode) && nodeList.contains(toNode)) {		//Check if both nodes exist
			return fromNode.getNeighbors().contains(toNode);				//Check if the toNode is a neighbor of the fromNode
		}
		return false;														//If either node does not exist return false
	}

	@Override
	public Boolean hasCycles() {
		for (GraphNode node : nodeList) {									//For each node in the list
			if (node.getNeighbors().contains(node)) {						//Check if the node is a neighbor of itself
				return true;												//If it is, return true
			}
		}
		return false;														//If no cycles are found, return false
	}

	@Override
	public List<GraphNode> getNodes() {
		if (nodeList.isEmpty()) { 											//Check if the list is empty
			return null;													//If it is, return null
		}
		return nodeList;													//Return the list of nodes
	}

	@Override
	public GraphNode getNode(String nodeValue) {
		for (GraphNode node : nodeList) {									//For each node in the list
			if (node.getValue().equals(nodeValue)) {						//Check if the node value matches the given value
				return node;												//If it does, return the node
			}
		}
		return null;														//If no match is found, return null
	}

	@Override
	public int getFewestHopsPath(GraphNode fromNode, GraphNode toNode) {
		if (nodeList.contains(fromNode) && nodeList.contains(toNode)) {		//Check if both nodes exist
			return fromNode.getNeighbors().size();							//Return the number of neighbors of the fromNode
		}
		return -1;															//If either node does not exist return -1
	}
	
	@Override
	public int getShortestPath(GraphNode fromNode, GraphNode toNode) {
		if (nodeList.contains(fromNode) && nodeList.contains(toNode)) {		//Check if both nodes exist
			return fromNode.getDistanceToNeighbor(toNode);					//Return the weight of the edge between the two nodes
		}
		return -1;															//If either node does not exist return -1
	}

	@Override
	public List<GraphNode> shortestPath(GraphNode fromNode, GraphNode toNode) {
	    if (!nodeList.contains(fromNode) || !nodeList.contains(toNode)) {	//Check if both nodes exist
	        return null;
	    }

	    Map<GraphNode, Integer> distances = new java.util.HashMap<>();		//Create a map to store distances from the source node
	    Map<GraphNode, GraphNode> previous = new java.util.HashMap<>();		//Create a map to store the previous node in the shortest path
	    List<GraphNode> unvisited = new ArrayList<>(nodeList);				//Create a list of unvisited nodes
	}

	@Override
	public List<GraphNode> fewestHops(GraphNode fromNode, GraphNode toNode) {		//Method that finds the fewest hops between two nodes
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fewestHops'");
	}
	

}
