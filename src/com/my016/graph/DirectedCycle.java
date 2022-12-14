package com.my016.graph;

public class DirectedCycle {

    private boolean[] marked;

    private boolean hasCycle;

    private boolean[] onStack;

    public DirectedCycle(Digraph G){

        marked = new boolean[G.V()];
        onStack = new boolean[G.V()];

        this.hasCycle = false;

        for (int v = 0; v < G.V(); v++) {

            if (!marked[v]){
                dfs(G,v);
            }
        }
    }

    //基于深度优先搜索，检测图G中是否有环
    private void dfs(Digraph G,int v){
        marked[v] = true;
        onStack[v] = true;

        for (Integer integer : G.adj(v)) {
            if (!marked[integer]){
                dfs(G,integer);
            }

            if (onStack[integer]){
                hasCycle = true;
                return;
            }
        }
        onStack[v] = false;
    }

    public boolean hasCycle(){
        return hasCycle;
    }
}
