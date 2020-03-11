package com.example.demo.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述:
 *
 * @author songlianjie
 * @create 2020-03-11 17:45
 */
public class TestStream {

    public static void main(String[] args) {
        List<BigDecimal> list = new ArrayList<>();
        list.add(new BigDecimal(1));
        list.add(new BigDecimal(2));
        list.add(new BigDecimal(3));
        list.add(new BigDecimal(4));
        list.add(new BigDecimal(5));
        list.add(new BigDecimal(6));
        list.add(new BigDecimal(7));
        list.add(new BigDecimal(8));
        list.add(new BigDecimal(9));

        BigDecimal total = list.stream()
                //过滤大于10的
                /*.filter(i->i.compareTo(BigDecimal.valueOf(10))>0)
                .map(i -> i.multiply(BigDecimal.valueOf(0.9)))*/
                .reduce(BigDecimal.ZERO,BigDecimal::add);

        System.out.println(total);
        List<Integer> integerList = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Integer aa = integerList.stream().reduce(Integer.valueOf(1),(n, m)->n+m);
        System.out.println(aa);

       /* List<Integer> integerList = Arrays.asList(new Integer[]{4, 1, 3, 1, 5, 6, 7, 8, 9});

        integerList.stream().map(n->n+1)
                .distinct()
                .forEach(System.out::print);
        System.out.println();
        System.out.println("=====");

        integerList.stream().map(n->n+1)
                .distinct()
                .sorted()
                .forEach(System.out::print);
        integerList.stream().map(n -> n + 1)
                .distinct()
                .sorted();
        System.out.println();
        System.out.println("=====");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerStream.flatMap(n -> Stream.of(n+1))
                .forEach(System.out::print);*/
    }
}