package graph;

import java.util.ArrayList;
import java.util.List;
 

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

		}

	}

	@Override
	public Boolean addEdge(GraphNode fromNode, GraphNode toNode, Integer weight) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addEdge'");
	}

	@Override
	public Boolean addEdgeStr(String fromNodeValue, String toNodeValue, Integer weight) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addEdgeStr'");
	}

	@Override
	public Boolean removeEdge(GraphNode fromNode, GraphNode toNode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeEdge'");
	}

	@Override
	public Boolean setEdgeValue(GraphNode fromNode, GraphNode toNode, Integer newWeight) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setEdgeValue'");
	}

	@Override
	public Integer getEdgeValue(GraphNode fromNode, GraphNode toNode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getEdgeValue'");
	}

	@Override
	public List<GraphNode> getAdjacentNodes(GraphNode node) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAdjacentNodes'");
	}

	@Override
	public Boolean nodesAreAdjacent(GraphNode fromNode, GraphNode toNode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'nodesAreAdjacent'");
	}

	@Override
	public Boolean nodeIsReachable(GraphNode fromNode, GraphNode toNode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'nodeIsReachable'");
	}

	@Override
	public Boolean hasCycles() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasCycles'");
	}

	@Override
	public List<GraphNode> getNodes() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNodes'");
	}

	@Override
	public GraphNode getNode(String nodeValue) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNode'");
	}

	@Override
	public int fewestHops(GraphNode fromNode, GraphNode toNode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fewestHops'");
	}

	@Override
	public int shortestPath(GraphNode fromNode, GraphNode toNode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'shortestPath'");
	}
	
	
	
}
