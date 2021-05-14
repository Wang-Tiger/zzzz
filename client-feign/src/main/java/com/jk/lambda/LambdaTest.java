/** 
 * <pre>项目名称:jk_net_wh 
 * 文件名称:LambdaTest.java 
 * 包名:com.jk.wh.utils 
 * 创建日期:2021年5月6日下午2:15:44 
 * Copyright (c) 2021, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.lambda;

import com.jk.interfaces.*;

/** 
 * <pre>项目名称：jk_net_wh    
 * 类名称：LambdaTest    
 * 类描述：    
 * 创建人：王虎
 * 创建时间：2021年5月6日 下午2:15:44    
 * 修改人：王虎
 * 修改时间：2021年5月6日 下午2:15:44    
 * 修改备注：       
 * @version </pre>    
 */
public class LambdaTest {

	public static void main(String[] args) {

		/**
		 * 1.无参无返回
		 * 如果方法体中只有一条语句，此时大括号可以省略
		 */
		LambdaNoneReturnNoneParmeter lam1 = () -> System.out.println("无参无返回值");
		lam1.test();
		
		/**
		 * 2.无参有返回
		 */
		LambdaSingleReturnNoneParmeter lam2 = () -> {
			return 1;
		};
		int ret1 = lam2.test();
		System.out.println(ret1);
		
		/**
		 * 3.单参有返回
		 * 如果参数列表中，参数的数量只有一个 此时小括号可以省略
		 * 如果方法体中唯一的一条语句是一个返回语句
		 * 则省略大括号的同时 也必须省略return
		 */

		LambdaSingleReturnSingleParmeter lam3 = a -> a;
		int ret2 = lam3.test(10);
		System.out.println(ret2);
		
		/**
		 * 4.多参无返回
		 */
		LambdaNoneReturnMultipleParmeter lam4 = (int a,int b) -> {
			System.out.println(a+b);
		};
		lam4.test(10, 20);
		
		/**
		 * 5.单参无返回
		 */
		LambdaNoneReturnSingleParmeter lam5 = a -> System.out.println("单参无返回"+a);
		lam5.test(6);
		
		/**
		 * 6.多参有返回
		 * 如果需要省略类型，则每一个参数的类型都要省略，不能一个省略一个不省略
		 */
		LambdaSingleReturnMultipleParmeter lam6 = (a,b) -> a-b;
		int ret3 = lam6.test(4, 1);
		System.out.println(ret3);
		
		
		
		/**
		 * *方法引用：
		 * 可以快速的将一个Lambda表达式的实现指向一个已经实现的方法
		 * 方法的隶属者 如果是静态方法 隶属的就是一个类  其他的话就是隶属对象
		 * 语法：方法的隶属者::方法名
		 * 注意：
		 *  1.引用的方法中，参数数量和类型一定要和接口中定义的方法一致
		 *  2.返回值的类型也一定要和接口中的方法一致
		 */
		
		
		LambdaSingleReturnMultipleParmeter lam7 = (a,b) -> subtract(a,b);
		int ret4 = lam7.test(4, 1);
		System.out.println(ret4);
		
		LambdaSingleReturnMultipleParmeter lam8 = LambdaTest::subtract;
		int ret5 = lam8.test(5, 4);
		System.out.println(ret5);
		
		LambdaSingleReturnMultipleParmeter lam9 = new LambdaTest()::add;
		int ret6 = lam9.test(5, 4);
		System.out.println(ret6);
		
	}
	
	/**
	 * 自定义实现方法
	 */
	public static int subtract(int a,int b){
		
		return a-b;
	}
	
	public int add(int a,int b){
		return a+b;
	}
}
