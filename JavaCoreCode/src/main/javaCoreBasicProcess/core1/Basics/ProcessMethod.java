package core1.Basics;

import java.util.Arrays;

public class ProcessMethod {
    public static void main(String[] args) {
        farmer();
        cook();
        me();
        int[] arr = method(89 , 90) ;
        System.out.println(Arrays.toString(arr));
    }

    //农民伯伯
    public static void farmer(){
        System.out.println("播种");
        System.out.println("施肥");
        System.out.println("拔草");
        System.out.println("浇水");
        System.out.println("除虫");
        System.out.println("收割");
    }

    //厨师
    public static void cook(){
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
        System.out.println("上菜");
    }

    //我们自己
    public static void me(){
        System.out.println("洗手");
        System.out.println("吃菜");
    }

    // parameter
    public static int[] method(int a , int b){
        int sum = a + b ;
        int sub = a - b ;
        return new int[]{ sum , sub};
    }

    //两个整数相加
    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    //三个整数相加
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    //四个整数相加
    public static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

    public static void sum(double a,int b){
        System.out.println(a+b);
    }
}
