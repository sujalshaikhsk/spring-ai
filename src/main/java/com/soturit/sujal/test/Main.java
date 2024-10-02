package com.soturit.sujal.test;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
       int[] arr = {12, -34, 4, 5, 7, -4};

        Arrays.sort(arr);

        AtomicInteger i = new AtomicInteger(0);
        Arrays.stream(arr)
                .boxed()
                .map( element-> {
                            if (i.get() < 3) {
                                int i1 = element.intValue() * element.intValue();
                            }
                            return null;
                        }
                );

        }
}
