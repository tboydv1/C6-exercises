package com.chp17;

import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {
        int result = IntStream.rangeClosed(1, 10)
                 .filter(x -> {
                             System.out.println("Before filter --> "+x);
                             return x % 2 == 0;
                         }
                 )
                 .map( (x) ->
                 {
                     System.out.println("Before mapping --> "+ x);
                     return (x * 3);
                 })
                 .sum();

        System.out.println(result);

    }
}
