package com.itheima;

public class Demo {
    public static void main(String[] args) {

        long sum=0;  //所有阶乘的和
        long fac=1;  //阶乘的乘积
        for (int i = 1; i <= 10; i++) {
            fac = fac * i;
            sum =fac + sum;
        }
        System.out.println(sum); //4037913
    }
}
