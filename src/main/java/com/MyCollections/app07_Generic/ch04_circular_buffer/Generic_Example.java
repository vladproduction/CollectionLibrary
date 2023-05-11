package com.MyCollections.app07_Generic.ch04_circular_buffer;

public class Generic_Example {
    public static void main(String[] args) {
        Generic_CircularBuffer<String> data = new Generic_CircularBuffer<>(5);
        data.offer("a");
        data.offer("bc");
        data.offer("d");
        //data.offer(1); /*ClassCastException: java.lang.Integer cannot be cast to java.lang.String*/

        String value = concat(data);
        System.out.println(value);

    }

    private static String concat(Generic_CircularBuffer<String> buffer) {
        StringBuilder sb = new StringBuilder();
        String value;
        while ((value = buffer.pool()) != null) {
            sb.append(value);
        }
        return sb.toString();
    }
}
