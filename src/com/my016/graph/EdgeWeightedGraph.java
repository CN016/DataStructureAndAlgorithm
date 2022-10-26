package com.my016.graph;

import com.my016.list.Queue;

public class EdgeWeightedGraph {
    //顶点总数
    private final int V;
    //边的总数
    private int E;
    //邻接表
    private Queue<Edge>[] adj;

    public EdgeWeightedGraph(int V){
        this.V = V;
        this.E = 0;
        this.adj = new Queue[V];
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

    public void addEdge(Edge e){
        int v = e.either();

        int w = e.other(v);

        adj[v].enqueue(e);
        adj[w].enqueue(e);

        E++;
    }

    public Queue<Edge> adj(int v){
        return adj[v];
    }

    public Queue<Edge> edges(){
        Queue<Edge> allEdge = new Queue<>();

        for (int v = 0; v < this.V; v++) {

            for (Edge e : adj(v)) {
                if (e.other(v) < v){
                    allEdge.enqueue(e);
                }
            }
        }
        return allEdge;
    }
}
