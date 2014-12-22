package com.listtest;

import java.util.Comparator;

public  class Student {

	String name;
	int score;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (score != other.score)
//			return false;
//		return true;
//	}
//	public int compareTo(Object o) {
//		Student p = (Student)o;
//			
//			int res= this.score - p.score;
//			if (res==0) {
//				return this.name.compareTo(p.name);
//			}else {
//				return res;
//			}
//			
//	}
//		
		
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
	
	
}
