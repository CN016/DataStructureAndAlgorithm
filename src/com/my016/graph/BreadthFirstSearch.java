package com.my016.graph;

import com.my016.list.Queue;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int count;
    private Queue<Integer> waitSearch;


    private void dfs(Graph G,int v){
        //标记v点已搜索
        marked[v] = true;
        //v放入队列，等待搜索它的邻接表
        waitSearch.enqueue(v);

        while (!waitSearch.isEmpty()){
            Integer wait = waitSearch.dequeue();
            for (Integer w : G.adj(wait)) {
                if (!marked[w]){
                    dfs(G,w);
                }
            }
        }
        count++;
    }

    public boolean marked(int w){
        return marked[w];
    }

    public int count(){
        return count;
    }
}
