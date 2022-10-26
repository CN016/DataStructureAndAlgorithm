package com.my016.graph;

public class Edge implements Comparable<Edge>{
    private final int v; // 顶点一
    private final int w; // 顶点二
    private final double weight; // 当前边的权重

    public Edge(int v, int w , double weight){
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double weight(){
        return  weight;
    }

    public int either(){
        return v;
    }

    public int other(int vertex){
        if (vertex == v){
            return w;
        }else {
            return v;
        }
    }

    @Override
    public int compareTo(Edge that) {
        int cmp;
        if (this.weight()>that.weight()){
            cmp = 1;
        }else if (this.weight()<that.weight()){
            cmp = -1;
        }else {
            cmp = 0;
        }
        return cmp;
    }
}
