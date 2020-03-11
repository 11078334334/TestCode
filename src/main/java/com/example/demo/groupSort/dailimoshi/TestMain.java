package com.example.demo.groupSort.dailimoshi;

/**
 * 描述:
 *
 * @author songlianjie
 * @create 2020-03-10 18:47
 */
public class TestMain {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < arr.length;) {
            int flag = (arr.length-i)>2?3:(arr.length-i);
            SortType sortType = SortTypeFactory.getSortTypeByKey(flag);
            int arry [] = new int[3];
            System.arraycopy(arr,i,arry,0,flag);
            sortType.sort(arry);
            i=i+3;
        }
    }
}