package com.ry.DI05;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Some {
	private School[] schools;
	private String[] myStrs;
	private List<School> myList;
	private Set<String> mySet;
	private Map<String, Object> myMap;
	private Properties  myPros;
	public void setSchools(School[] schools) {
		this.schools = schools;
	}
	public void setMyStrs(String[] myStrs) {
		this.myStrs = myStrs;
	}
	public void setMyList(List<School> myList) {
		this.myList = myList;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public void setMyMap(Map<String, Object> myMap) {
		this.myMap = myMap;
	}
	public void setMyPros(Properties myPros) {
		this.myPros = myPros;
	}
	@Override
	public String toString() {
		return "Some [myList=" + myList + ", myMap=" + myMap + ", myPros="
				+ myPros + ", mySet=" + mySet + ", myStrs="
				+ Arrays.toString(myStrs) + ", schools="
				+ Arrays.toString(schools) + "]";
	}
	
	
	
	
}
