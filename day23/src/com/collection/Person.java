package com.collection;

public class Person implements Comparable{
	private int age;
	private String name;

	public Person() {
		super();
		
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
	Person p = (Person)o;
//		//1.按年龄比较,在比较明智
//		
		int res= this.age - p.age;
		if (res==0) {
			return this.name.compareTo(p.name);
		}else {
			return res;
		}
//		2.先比较名字
	// int res= this.name.compareTo(p.name);
//	 if (res==0) {
//		return this.age - p.age;
//	}else {
//		return res;
//	}
//	 return res==0?this.age - p.age:res;//.2
		
}
	
	
	
	
	
	
	
	public String toString() {
		return " age=" + age +"---"+ "name=" + name ;
	}
	
	
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
}