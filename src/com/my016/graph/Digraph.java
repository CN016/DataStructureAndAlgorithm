package com.my016.graph;

import com.my016.list.Queue;

public class Digraph {
    //顶点数目
    private final int V;
    //边的数目
    private int E;
    //邻接表
    private Queue<Integer>[] adj;

    public Digraph(int V){
        //顶点初始化
        this.V = V;
        //初始化边的数量
        this.E=0;
        //初始化邻接表
        this.adj = new Queue[V];
        //初始化空队列
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<>();
        }
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    //添加有向边 v->w
    public void addEdge(int v, int w){
        adj[v].enqueue(w);
        E++;
    }

    public Queue<Integer> adj(int v){
        return adj[v];
    }

    public Digraph reverse(){
        Digraph r = new Digraph(V);

        for (int v = 0; v < V; v++) {
            for (Integer integer : adj(v)) {
                r.addEdge(integer,v);
            }
        }

        return r;
    }


}
