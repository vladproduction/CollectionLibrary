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
        int step = 0;
        Node tmp = root;
        while (tmp.getNext()!=null){
            if (step==index){
                break;
            }
            tmp = tmp.getNext();
            step++;
        }
        Object currentValue = tmp.getValue();
        tmp.setValue(newObject);
        return currentValue;
    }

    @Override
    public void clear() {
        root = null;
        size=0;
    }

    @Override
    public void remove(int index) {
        int step = 0;
        if(index==0){
            root=root.getNext();
            size--;
            return;
        }
            if(index==size-1){
                Node tmp = root;
                while (tmp.getNext()!=null){
                    if(step==index-1){
                        break;
                    }
                    tmp = tmp.getNext();
                    step++;
                }
                tmp.setNext(null);
            }else{
                Node tmp = root;
                while (tmp.getNext()!=null){
                    if(step==index-1){
                        break;
                    }
                    tmp = tmp.getNext();
                    step++;
                }
                Node toDeleteNode = tmp.getNext();
                Node nextAfterDeleted = toDeleteNode.getNext();
                tmp.setNext(nextAfterDeleted);
            }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node tmp = root;
        while (tmp!=null){
            Object value = tmp.getValue();
            sb.append(value);
            sb.append(",");
            tmp = tmp.getNext();
        }
        int comaPosition = sb.length()-1;
        sb.deleteCharAt(comaPosition);
        sb.append("]");
        return sb.toString();
    }
}
