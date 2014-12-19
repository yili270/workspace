package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	
			Map<Integer, String> map =new HashMap<>();
		
			//1.添加元素
			System.out.println(map.put(123, "google"));
			System.out.println(map.put(123, "apple"));
			map.put(321,"baidu");
			map.put(11, "alibaba");
		
			System.out.println(map);
			System.out.println("==================");
//			//2.删除元素
//			System.out.println(map.remove(1));//key不存在 返回null
//			System.out.println(map.remove(11));//存在,移除键值对,并返回value
//			
//			System.out.println(map);
//			System.out.println("==================");
//			
//			//3.判断
//			System.out.println(map.containsKey(120));
//			System.out.println(map.containsValue("apple"));
//			System.out.println(map.isEmpty());
//			
//			//4.获取
//			System.out.println(map.get(119));
//			System.out.println(map.get(123));
//			System.out.println("==================");
			//5.遍历....
			//   a.得到key的集合
			// b.使用set集合的迭代器
			//  c. 使用 get加迭代器==遍历value
//			
//			Set<Integer> ks= map.keySet();
//			for (Iterator it = ks.iterator(); it.hasNext();) {
//				Integer integer = (Integer) it.next();
//				System.out.println(map.get(integer));
//				}
			
			Collection<String> cs=map.values();
			for (Iterator iterator = cs.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
				//System.out.println(map.get(integer));error
			}
			
	}

}
