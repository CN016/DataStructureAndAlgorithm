package com.my016.API;

import com.my016.list.Queue;

public class EdgeWeightedDigraph {
    private final int V;
    private int E;
    private Queue<DirectedEdge>[] adj;

    public EdgeWeightedDigraph(int V){
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

    public void addEdge(DirectedEdge e){
        int v = e.from();
        adj[v].enqueue(e);
        E++;
    }

    public Queue<DirectedEdge> adj(int v){
        return adj[v];
    }

    public Queue<DirectedEdge> edges(){
        Queue<DirectedEdge> allEdge = new Queue<>();

        for (int v = 0; v < this.V; v++) {
            for (DirectedEdge e : adj(v)) {
                allEdge.enqueue(e);
            }
        }

        return allEdge;
    }
}
