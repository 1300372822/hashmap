package com.luban;

public class Node {

    private Object context;
    private Node next;

    public Node(Object context, Node next) {
        this.context = context;
        this.next = next;
    }

    public static void main(String[] args) {
        //尾节点next属性为null
        //(头)node1--------->node2------------->node3（尾）
        //头插直接将新的节点指向node1
        //尾插直接将node3节点指向新的节点
        Node headNode = new Node(new Object(),null);
        headNode.next = new Node(new Object(),null);//尾插
        new Node(new Object(),headNode);//头插

    }

    public Object getContext() {
        return context;
    }

    public void setContext(Object context) {
        this.context = context;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
