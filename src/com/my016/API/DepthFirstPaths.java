package com.my016.API;

import com.my016.graph.Graph;
import com.my016.list.Stack;

public class DepthFirstPaths {

    //是否被搜索
    private boolean[] marked;
    //起点
    private int s;
    //索引表起点，值代表起点s到当前顶点路径的最后一个顶点
    private int[] edgeTo;

    public DepthFirstPaths(Graph G,int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s=s;
        dfs(G,s);
    }

    //深度优先搜索找出G图中v顶点的所有相邻 顶点
    private void dfs(Graph G, int v){
        marked[v] = true;
        for (Integer w : G.adj(v)) {
            if (!marked[w]){
                edgeTo[w]=v;
                dfs(G,w);
            }
        }

    }

    public boolean hasPathTo(int v){
        return marked[v];
    }

    //找出s到v的路径
    public Stack<Integer> pathTo(int v){
        if (!hasPathTo(v)){
            return null;
        }

        Stack<Integer> path =new Stack<>();
        for (int x = v ; x!=s ; x = edgeTo[x]){
            path.push(x);
        }
        path.push(s);
        return path;

    }
}
