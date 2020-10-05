package Rahul;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompartmentAlgo {

    Graph graph;

    public CompartmentAlgo(HashMap<Integer, Integer> compartments) {
        this.graph = new Graph();
        for (Map.Entry<Integer, Integer> entry : compartments.entrySet()) {
            Integer compartmentName = entry.getKey();
            Integer compartmentValue = entry.getValue();
            for (int i = 0; i < compartmentValue; i++) {
                graph.addEdge(compartmentName.toString(), (compartmentName + (i + 1)) + "");
            }
        }
    }

    List<String> getShortestPath(Integer startCompartment, Integer destCompartment) {
        return this.graph.shortestPath(startCompartment.toString(), destCompartment.toString());
    }

}
