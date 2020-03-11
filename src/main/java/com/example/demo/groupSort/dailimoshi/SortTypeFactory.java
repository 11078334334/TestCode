package com.example.demo.groupSort.dailimoshi;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:生产SortType的工厂
 *
 * @author songlianjie
 * @create 2020-03-11 10:34
 */
public class SortTypeFactory {

    private static Map<Integer,SortType> map = new HashMap<>();
    static {
        map.put(3,new ThreeSortType());
        map.put(2,new TwoSortType());
        map.put(1,new OneSortType());
    }

    public static SortType getSortTypeByKey(int key){
        return map.get(key);
    }

}