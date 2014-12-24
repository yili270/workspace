package com.zuoye;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 
 * 1. 使用合适的集合，统计字符串“13913535174”出现最多的字符次数
 * 
 键盘录入字符串，统计字符串中每个字符出现的次数。
 "helloworld"

 "d(1)e(1)h(1)l(3)o(2)r(1)w(1)"
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// 键盘录入字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
	

		// 创建一个Map集合，经过简单的分析，我们知道创建的是TreeMap集合
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// 把字符串转成字符数组
		char[] chs = line.toCharArray();

		// 遍历数组得到每一个字符
		for (char ch : chs) {
			// 拿这个字符到TreeMap集合中找值
			Integer i = tm.get(ch);

			// 如果是null
			if (i == null) {
				tm.put(ch, 1);
			} else {
				// 如果不是null
				i++;
				tm.put(ch, i);
			}
		}

		StringBuilder sb = new StringBuilder();
		// 遍历TreeMap集合，拼接成一个字符串
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append("---").append(value).append("次\n");
		}
		String result = sb.toString();

		// 输出结果
		System.out.println(result);
	}
}
