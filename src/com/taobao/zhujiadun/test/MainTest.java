package com.taobao.zhujiadun.test;

import com.taobao.zhujiadun.code.Main;

import junit.framework.TestCase;


public class MainTest extends TestCase{
	public void testMain(){
	 	Main m = new Main("zhujiadun");
	 	assertEquals("zhujiadun",m.info());		
	}
	public void testMain1(){
	 	Main m = new Main("zhujiadun1");
	 	assertEquals("zhujiadun1",m.info());		
	}
	public void testMainError(){
	 	Main m = new Main("zhujiadun1");
	 	assertEquals("zhujiadun",m.info());		
	}
}
