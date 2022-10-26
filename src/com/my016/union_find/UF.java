package com.my016.union_find;

public class UF {
    //记录结点元素该元素所在组织的标识
    private int[] eleAndGroup;
    //并查集中数据的分组个数
    private int count;
    //初始化
    public UF(int N){
        //默认N个分组
        this.count = N;
        //初始化数组
        eleAndGroup = new int[N];

        for (int i = 0; i < N; i++) {
//            eleAndGroup[i] = [i];
        }
    }

    //查多少个分组
    public int getCount(){
        return count;
    }

    //元素p所在分组的标识符
    public int find(int p){
        return eleAndGroup[p];
    }

    //元素p和元素q是否在同一分组
    public boolean connected(int p,int q){
        return find(p)==find(q);
    }

    //元素p所在分组和元素q所在分组合并
    public void union(int p,int q){
        if (connected(p,q)){
            return;
        }
        //如果p和q不在同一个分组，则只需要将p元素所在组的所有的元素的组标识符修改为q元素所在组的标识符即可
        int pGroup = find(p);
        int qGroup = find(q);

        for (int i = 0; i < eleAndGroup.length; i++) {
            if (eleAndGroup[i] == pGroup){
                eleAndGroup[i] = qGroup;
            }
        }
        count--;
    }

}
