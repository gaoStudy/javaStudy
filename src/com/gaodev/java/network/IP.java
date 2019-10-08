package com.gaodev.java.network;

import sun.net.util.IPAddressUtil;

public class IP {
    public static void main(String[] args){
            String ipv4 = "256.1.1.1";
            String ipv6 = "ABCD:EF01:2345:6789:ABCD:EF01:2345:6789";

        boolean res1 = IPAddressUtil.isIPv4LiteralAddress(ipv4);
        boolean res2 = IPAddressUtil.isIPv6LiteralAddress(ipv6);
//
        System.out.println(res1);//true
        System.out.println(res2);//false


//
//        boolean iptest1 = ipTest(ipv4);
//        System.out.println(iptest1);//true
//
//        boolean iptest2 = ipTest(ipv6);
//        System.out.println(iptest2);//true


    }

    public static  boolean ipTest(String ipStr){

        boolean iPv4LiteralAddress = IPAddressUtil.isIPv4LiteralAddress(ipStr);
        boolean iPv6LiteralAddress = IPAddressUtil.isIPv6LiteralAddress(ipStr);
        //ip有可能是v4,也有可能是v6,滿足任何一种都是合法的ip
        if (!(iPv4LiteralAddress||iPv6LiteralAddress)){
            return false;
        }
        return true;
    }

}
