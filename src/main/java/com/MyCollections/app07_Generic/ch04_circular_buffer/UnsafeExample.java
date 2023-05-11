package com.MyCollections.app07_Generic.ch04_circular_buffer;

public class UnsafeExample {
    public static void main(String[] args) {
        CircularBuffer data = new CircularBuffer(5);
        data.offer("a");
        data.offer("bc");
        data.offer("d");
        data.offer(1); /*ClassCastException: java.lang.Integer cannot be cast to java.lang.String*/

        String value = concat(data);
        System.out.println(value);


    }

    private static String concat(CircularBuffer buffer) {
        StringBuilder sb = new StringBuilder();
        String value;
        while ((value = (String) buffer.pool())!=null) {
            sb.append(value);
        }
        return sb.toString();
    }

}
