package com.example.demo.biaoqudong;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * 描述:应用Function  1入1出
 *
 * @author songlianjie
 * @create 2020-03-11 14:56
 */
public class TestMain1 {

    static Map<Integer,Function<int[],int[]>> map = new HashMap<>();

    static {
        map.put(1,(ints -> ints));
        map.put(2,(int arr[])->{return new int[]{arr[1],arr[0]};});
        map.put(3,(int arr[])->{return new int[]{arr[2],arr[1],arr[0]};});
    }

    static int arr[] = {1,2,3,4,5,6,7};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length;) {
            int length = arr.length-i;
            int flag = length>2?3:length;
            int arry[] = new int[flag];
            System.arraycopy(arr,i,arry,0,flag);
            int arry1[] = map.get(flag).apply(arry);
            System.out.println(Arrays.toString(arry1));
            i = i+3;
        }
    }

}