package com.gaodev.java.collection.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * 常用方法
 *
 void add(int index, Object ele): 在index位置插入ele元素
 boolean addAll(int index, Collection eles): 从index位置开始将eles中的所有元素添加进来
 Object get(int index): 获取指定index位置的元素
 int indexOf(Object obj): 返回obj在集合中首次出现的位置
 int lastIndexOf(Object obj): 返回obj在当前集合中末次出现的位置
 Object remove(int index): 移除指定index位置的元素，并返回此元素
 Object set(int index, Object ele): 设置指定index位置的元素为ele
 List subList(int fromIndex, int toIndex): 返回从fromIndex到toIndex位置的子集合

 总结：常用方法
 增：add(Object obj)
 删：remove(int index) / remove(Object obj)
 改：set(int index, Object ele)
 查：get(int index)
 插：add(int index, Object ele)
 长度：size()

 遍历：
 Iterator迭代器方式
 增强for循环
 普通的循环
 */
public class ArrayList {

    /**
     * 常用方法
     * add/remove/size/isEmpty/contains/clear/toArrays等方法
     */

    public static void testArrayList(){
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        System.out.println(list.isEmpty()); // true,容器里面没有元素

        list.add("gaodev");
        System.out.println(list.isEmpty());// false,容器里面有元素
        list.add("gaoops");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("是否包含指定元素：" + list.contains("gaodev"));
        list.remove("gaoops");
        System.out.println(list);
        Object[] objects = list.toArray();
        System.out.println("转化成Object数组：" + Arrays.toString(objects));
        list.clear();
        System.out.println("清空所有元素：" + list);

    }

    /**
     * 两个List之间的元素处理
     * containsAll
     * addAll
     * removeAll
     * retainAll
     */
    public static void testArrayList2(){

    }

    /**
     * List中操作索引的常用方法
     * indexOf
     * lastIndexOf
     */
    public static void testArrayList3(){

    }

    /**
     * 遍历
     *
     * Iterator迭代器方式
     * 增强for循环
     * 普通的循环
     */
    public static void testArrayList4(){

        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        // 增强for循环
        for(Object obj : arrayList){
            System.out.println(obj);
        }

        for(Iterator it = arrayList.iterator(); it.hasNext();){
            Integer tmp = (Integer) it.next();
            System.out.println(tmp);
        }


    }

}
