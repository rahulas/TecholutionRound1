package Rahul;

import java.util.HashMap;
import java.util.List;

public class ShortestPathFinder {
    public static void main(String[] arg) {
        HashMap<Integer, Integer> compartments = new HashMap<>();
        /*compartments.put(1, 2);
        compartments.put(2, 3);
        compartments.put(3, 1);
        compartments.put(4, 1);
        compartments.put(5, 3);*/

        compartments.put(1, 2);
        compartments.put(2, 1);
        compartments.put(3, 4);
        compartments.put(4, 1);
        compartments.put(5, 2);
        compartments.put(6, 1);
        compartments.put(7, 1);
        compartments.put(8, 2);
        compartments.put(9, 2);
        compartments.put(10, 2);

        CompartmentAlgo compartmentAlgo = new CompartmentAlgo(compartments);
        //find shortest path between source compartment and destination
        List<String> result = compartmentAlgo.getShortestPath(1, 8);
        System.out.println("shortest path: " + result);
        System.out.println("Minimum Hops: " + (result.size() - 1));
    }


}
