package com.my016.API;

import com.my016.graph.Edge;
import com.my016.graph.EdgeWeightedGraph;
import com.my016.heap.MaxPriorityQueue;
import com.my016.heap.MinPriorityQueue;
import com.my016.list.Queue;
import com.my016.union_find.UF;

public class KruskalMST {
    //保存最小生成树的所有边
    private Queue<Edge> mst;
    private UF uf;
    private MinPriorityQueue<Edge> pq;

    public KruskalMST(EdgeWeightedGraph G){
        this.mst = new Queue<>();
        this.uf = new UF(G.V());
        this.pq = new MinPriorityQueue<>(G.E()+1);

        for (Edge edge : G.edges()) {
            pq.insert(edge);
        }

        while (!pq.isEmpty()  && mst.size() < G.V() -1){
            Edge e = pq.delMin();

            int v = e.either();
            int w = e.other(v);

            if (uf.connected(v,w)){
                continue;
            }

            uf.union(v,w);
            mst.enqueue(e);
        }
    }

    public Queue<Edge> edges(){
        return mst;
    }
}
