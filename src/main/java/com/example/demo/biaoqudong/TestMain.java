package com.example.demo.biaoqudong;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * 描述:表驱动法就是将各个if  else的条件放到map中map的value
 * 应用Consumer，1入0出
 * @author songlianjie
 * @create 2020-03-11 10:33
 */
public class TestMain {

    private static Map<Integer,Consumer<int[]>> map = new HashMap<>();

    static {
        map.put(1,(int arr[]) ->{System.out.println(arr[0]);});
        map.put(2,(int arr[]) ->{System.out.println(arr[1]+""+arr[0]);});
        map.put(3,(int arr[]) ->{System.out.println(arr[2]+""+arr[1]+""+arr[0]);});
    }
    static int arr[] = {1,2,3,4,5,6,7,8};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; ) {
            int flag = (arr.length-i)>2?3:(arr.length-i);
            int arry[] = new int[3];
            System.arraycopy(arr,i,arry,0,flag);
            map.get(flag).accept(arry);
            i = i+3;
        }
    }

}