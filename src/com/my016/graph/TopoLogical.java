package com.my016.graph;

import com.my016.list.Stack;

public class TopoLogical {
    private Stack<Integer> order;

    public TopoLogical(Digraph G){
        DirectedCycle dCycle = new DirectedCycle(G);
        if (!dCycle.hasCycle()){
            DepthFirstOrder depthFirstOrder = new DepthFirstOrder(G);
            order = depthFirstOrder.reversePost();
        }
    }

    private boolean isCycle(){
        return order == null;
    }

    public Stack<Integer> order(){
        return order;
    }
}
