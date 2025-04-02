package graph;

import java.util.ArrayList;
import java.util.List;
 

public class DiGraphImpl implements DiGraph{

	private List<GraphNode> nodeList = new ArrayList<>();

	@Override
	public Boolean addNode(GraphNode node) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addNode'");
	}

	@Override
	public Boolean removeNode(GraphNode node) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeNode'");
	}

	@Override
	public Boolean setNodeValue(GraphNode node, String newNodeValue) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setNodeValue'");
	}

	@Override
	public String getNodeValue(GraphNode node) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNodeValue'");
	}

	@Override
	public Boolean addEdge(GraphNode fromNode, GraphNode toNode, Integer weight) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addEdge'");
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
