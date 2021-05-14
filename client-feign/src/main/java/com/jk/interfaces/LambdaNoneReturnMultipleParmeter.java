/** 
 * <pre>项目名称:jk_net_wh 
 * 文件名称:LambdaNoneReturnMultipleParmeter.java 
 * 包名:com.jk.wh.interfaces 
 * 创建日期:2021年5月6日下午2:56:30 
 * Copyright (c) 2021, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.interfaces;

/** 
 * <pre>项目名称：jk_net_wh    
 * 类名称：LambdaNoneReturnMultipleParmeter    
 * 类描述：    
 * 创建人：王虎
 * 创建时间：2021年5月6日 下午2:56:30    
 * 修改人：王虎
 * 修改时间：2021年5月6日 下午2:56:30    
 * 修改备注：       
 * @version </pre>    
 */
@FunctionalInterface
public interface LambdaNoneReturnMultipleParmeter {

	void test(int a, int b);

	/*函数式接口里允许定义默认方法
	在JAVA8中 ，对接口加了一个新特性：default
	可以使用default对接口方法进行修饰，被修饰的方法在接口中可以默认实现*/
	default void test2(){

	}

	// 函数式接口里允许定义静态方法
	static void LambdaNoneReturnMultipleParmeter(){

	}

	// 允许定义java.lang.Object里的public方法
	@Override
	boolean equals(Object obj);
}
