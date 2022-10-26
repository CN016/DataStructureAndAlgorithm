package com.my016.graph;

public class DepthFirstSearch {
    //记录当前点是否被搜索过
    private boolean[] marked;
    //记录有多少个顶点与s顶点相通
    private int count;

    public DepthFirstSearch(Graph G,int s){
        marked = new boolean[G.V()];
        dfs(G,s);
    }

    private void dfs(Graph G , int v){
        marked[v] = true;

        for (Integer w : G.adj(v)) {
            if (!marked[w]){
                dfs(G,w);
            }
        }
        count ++;
    }

    public boolean marked(int w){
        return marked[w];
    }

    public int count(){
        return count;
    }
}

