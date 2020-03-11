package com.example.demo.groupSort.dailimoshi;

/**
 * 描述:
 *
 * @author songlianjie
 * @create 2020-03-10 18:46
 */
public class TwoSortType implements SortType {

    @Override
    public void sort(int arry[]) {
        System.out.println(arry[1]+""+arry[0]+"     ");
    }
}