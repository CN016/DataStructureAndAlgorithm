package com.my016.tree;

import com.my016.list.Queue;

public class BinaryTree<Key extends Comparable<Key>,Value> {

    //根结点
    private Node root;
    private int N;

    public int size(){
        return N;
    }

    public void put(Key key , Value value){
        root = put(root,key,value);
    }

    private Node put(Node x , Key key , Value value){
        if (x == null){
            N++;
            return new Node(key,value , null,null);
        }
        int cmp = key.compareTo((Key) x.key);
        if (cmp > 0){
            //新的key大于当前key，继续寻找当前结点的右子结点
            x.right = put(x.right,key,value);
        }else if (cmp <0){
            x.left = put(x.left,key,value);
        }else {
            x.value =value;
        }
        return x ;
    }

    public Value get(Key key){
        return get(root,key);
    }

    private Value get(Node x , Key key){
        if (x==null){
            return null;
        }
        int cmp = key.compareTo((Key) x.key);
        if (cmp > 0){
            return (Value) get(x.right,key);
        }else if (cmp < 0){
            return (Value) get(x.left,key);
        }else {
            return (Value) x.value;
        }
    }

    public void delete(Key key){
        root = delete(root,key);
    }

    private Node delete(Node x, Key key) {
        if (x == null){
            return null;
        }
        int cmp = key.compareTo((Key) x.key);

        if (cmp > 0 ){
            x.right = delete(x.right,key);
        }else if (cmp < 0){
            x.left = delete(x.left , key);
        }else {
            //删除当前结点
            if (x.right == null){
                return x.left;
            }
            if (x.left == null){
                return x.right;
            }

            //左右都在
            //找右子树的最小结点
            Node minNode = x.right;
            while (minNode.left !=null){
                minNode = minNode.left;
            }
            //删
            Node n = x.right;
            while (n.left != null){
                if (n.left.left == null){
                    n.left = null;
                }else {
                    n = n.left;
                }
            }
            //3.3让被删除结点的左子树称为最小结点minNode的左子树，让被删除结点的右子树称为最小结点
            //minNode的右子树
            minNode.left = x.left;
            minNode.right = x.right;
            x= minNode;
            N--;
        }
        return x;
    }

    public Key min(){
        return (Key) min(root).key;
    }

    private Node min(Node x){
        if (x.left!=null){
            return min(x.left);
        }else {
            return x;
        }
    }

    public Key max(){
        return (Key) max(root).key;
    }

    private Node max(Node x){
        if (x.right!=null){
            return max(x.right);
        }else {
            return x;
        }
    }

    public Queue<Key> preErgodic(){
        Queue<Key> keys = new Queue<>();
        preErgodic(root,keys);
        return keys;
    }

    public Queue<Key> midErgodic(){
        Queue<Key> keys = new Queue<>();
        midErgodic(root,keys);
        return keys;
    }

    public Queue<Key> afterErgodic(){
        Queue<Key> keys = new Queue<>();
        afterErgodic(root,keys);
        return keys;
    }

    private void preErgodic(Node x ,Queue<Key> keys){
        if (x==null){
            return;
        }
        keys.enqueue((Key) x.key);
        if (x.left!=null){
            preErgodic(x.left,keys);
        }
        if (x.right!=null){
            preErgodic(x.right,keys);
        }
    }
    private void midErgodic(Node x ,Queue<Key> keys){
        if (x==null){
            return;
        }

        if (x.left!=null){
            preErgodic(x.left,keys);
        }
        keys.enqueue((Key) x.key);
        if (x.right!=null){
            preErgodic(x.right,keys);
        }
    }
    private void afterErgodic(Node x ,Queue<Key> keys){
        if (x==null){
            return;
        }

        if (x.left!=null){
            preErgodic(x.left,keys);
        }

        if (x.right!=null){
            preErgodic(x.right,keys);
        }
        keys.enqueue((Key) x.key);
    }

    public Queue<Key> layerErgodic(){
        Queue<Key> keys = new Queue<>();
        Queue<Node> nodes = new Queue<>();
        nodes.enqueue(root);

        while (!nodes.isEmpty()){
            Node x = nodes.dequeue();
            keys.enqueue((Key) x.key);
            if (x.left!=null){
                nodes.enqueue(x.left);
            }
            if (x.right!=null){
                nodes.enqueue(x.right);
            }
        }
        return keys;
    }

    public int maxDepth(){
        return maxDepth(root);
    }
    private int maxDepth(Node x){
        if (x==null){
            return 0;
        }

        int max = 0;
        int maxL = 0;
        int maxR = 0;

        //left
        if (x.left !=null){
            maxL = maxDepth(x.left);
        }
        //right
        if (x.right !=null){
            maxR = maxDepth(x.right);
        }

        max = maxL > maxR ? maxL+1 : maxR +1;

        return max;
    }



    private class Node<Key,Value>{
        public Key key;
        private Value value;

        public Node left;
        public Node right;

        public Node(Key key,Value value , Node left , Node right){
            this.key=key;
            this.value=value;
            this.left=left;
            this.right=right;
        }
    }
}
