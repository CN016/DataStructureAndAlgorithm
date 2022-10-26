package com.my016.API;

import com.my016.graph.Edge;
import com.my016.graph.EdgeWeightedGraph;
import com.my016.heap.IndexMinPriorityQueue;
import com.my016.list.Queue;

public class PrimMST {
    //索引是顶点，值是当前顶点和最小生成树之间的最短边
    private Edge[] edgeTo;
    //索引是顶点，值是最小生成树之间的最短边的权重
    private double[] distTo;
    //顶点是否在树中
    private boolean[] marked;
    //存放树中顶点与非树中顶点之间的有效横切边
    private IndexMinPriorityQueue<Double> pq;

    public PrimMST(EdgeWeightedGraph G){
        this.edgeTo = new Edge[G.V()];
        this.distTo = new double[G.V()];
        for (int i = 0; i < distTo.length; i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        this.marked = new boolean[G.V()];
        this.pq = new IndexMinPriorityQueue<>(G.V());
        distTo[0] = 0.0;
        pq.insert(0,0.0);
        while (!pq.isEmpty()){
            visit(G,pq.delMin());
        }
    }

    private void visit(EdgeWeightedGraph G, int v){
        marked[v] = true;
        for (Edge e : G.adj(v)) {
            int w = e.other(v);
            if (marked[w]){
                continue;
            }

            if (e.weight() < distTo[w]){
                edgeTo[w] = e;
                distTo[w] = e.weight();

                if (pq.contains(w)){
                    pq.changeItem(w,e.weight());
                }else {
                    pq.insert(w,e.weight());
                }
            }
        }
    }

    public Queue<Edge> edges(){
        Queue<Edge> edges = new Queue<>();

        for (int i = 0; i < marked.length; i++) {
            if (edgeTo[i]!=null){
                edges.enqueue(edgeTo[i]);
            }
        }
        return edges;
    }
}
