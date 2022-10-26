package com.my016.graph;

import com.my016.list.Stack;

public class DepthFirstOrder {
    private boolean[] marked;
    private Stack<Integer> reversePost;

    public DepthFirstOrder(Digraph G){
        marked = new boolean[G.V()];
        reversePost = new Stack<>();

        for (int i = 0; i < G.V(); i++) {
            if (!marked[i]){
                dfs(G,i);
            }
        }
    }

    private void dfs(Digraph G, int v){
        marked[v] = true;

        for (Integer w : G.adj(v)) {
            if (!marked[w]){
                dfs(G,w);
            }
        }
        reversePost.push(v);
    }

    public Stack<Integer> reversePost(){
        return reversePost;
    }

}
