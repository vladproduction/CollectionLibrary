package com.app03.linkedList;

import com.app03.MyList;

public class MyLinkedList implements MyList {
    private int size;
    private Node root; //root element(first node)

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(Object o) {
        if(root==null){ //check if root element is null
            root=new Node();
            root.setValue(o);

        }else{
            Node tmp = root;
            while (tmp.getNext()!=null){
                tmp=tmp.getNext();
            }
            Node nextNode = new Node();
            nextNode.setValue(o);
            tmp.setNext(nextNode);

        }
        size++;
    }

    @Override
    public Object get(int index) {
        int step = 0;
        Node tmp = root;
        while (tmp.getNext()!=null){
            if(step==index){
                break;
            }
            tmp=tmp.getNext();
            step++;
        }

        return tmp.getValue();
    }

    @Override
    public Object set(int index, Object newObject) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void remove(int index) {

    }
}
