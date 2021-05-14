/** 
 * <pre>项目名称:jk_net_wh 
 * 文件名称:LambdaExercise.java 
 * 包名:lambda 
 * 创建日期:2021年5月6日下午5:44:54 
 * Copyright (c) 2021, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.jk.entity.StuEntity;

/** 
 * <pre>项目名称：jk_net_wh    
 * 类名称：LambdaExercise    
 * 类描述：    
 * 创建人：王虎
 * 创建时间：2021年5月6日 下午5:44:54    
 * 修改人：王虎
 * 修改时间：2021年5月6日 下午5:44:54    
 * 修改备注：       
 * @version </pre>    
 */
public class LambdaExercise {

	public static void main(String[] args) {
		
		/**
		 * 集合排序
		 */
		List<StuEntity> list = new ArrayList<>();
		list.add(new StuEntity("张三1",12));
		list.add(new StuEntity("张三2",15));
		list.add(new StuEntity("张三3",22));
		list.add(new StuEntity("张三4",52));
		list.add(new StuEntity("张三5",13));
		list.add(new StuEntity("张三6",22));
		
		//将排列的依据传入 具体的方法指向的是 内部元素的age相减 sort会依据结果的正负进行降序排列
        //sort 使用提供的 Comparator对此列表进行排序以比较元素。
		list.sort( (o1,o2) -> o2.getAge()-o1.getAge() );
		System.out.println(list);
		
		
		/**
		 * 集合遍历
		 */
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2,1,2,3,4,5,6,7);
		// 输出集合中的所有元素
		list2.forEach(System.out::println);
		//输出集合中所有的偶数
		list2.forEach(ele -> {
			if (ele % 2 == 0) {
				System.out.println("偶数："+ele);
			}
		});
		
		
		/**
		 * 删除集合中满足条件的元素
		 */
		
		//删除集合中年龄大于12的元素
		/*ListIterator<StuEntity> iterator = list.listIterator();
		while (iterator.hasNext()) {
			StuEntity stu = iterator.next();
			if (stu.getAge() > 12) {
				iterator.remove();
			}
		}*/
		 
		/**
		 * 将集合中的每一个元素都带入到接口Predicate的test方法中，
         * 如果返回值是true，则删除这个元素
		 */
		list.removeIf(ele -> ele.getAge() > 22);
		System.out.println(list);
		
		
		/**
		 * 开辟一条线程 做一个数字的输出
		 */
		
		new Thread(() -> System.out.println(Thread.currentThread().getName()+1)).start();
		
		new Thread(() -> {
			for (int i = 0; i < 4; i++) {
				System.out.println(Thread.currentThread().getName()+i);
			}
		}).start();


		
		
		/**
		 * 系统内置的一些函数式接口
		 * 
         * 常用的 函数式接口
         * Predicate<T>、Consumer<T>、Function<T,R>、Supplier<T>
         *
		 */
		
		// Predicate<T>              ：     参数是T 返回值boolean  
        // 在后续如果一个接口需要指定类型的参数，返回boolean时可以指向 Predicate
        //          IntPredicate            int -> boolean
        //          LongPredicate           long -> boolean
        //          DoublePredicate         double -> boolean

        // Consumer<T>               :      参数是T 无返回值(void)
        //          IntConsumer             int ->void
        //          LongConsumer            long ->void
        //          DoubleConsumer          double ->void

        // Function<T,R>             :      参数类型T  返回值R
        //          IntFunction<R>          int -> R
        //          LongFunction<R>         long -> R
        //          DoubleFunction<R>       double -> R
        //          IntToLongFunction       int -> long
        //          IntToDoubleFunction     int -> double
        //          LongToIntFunction       long -> int
        //          LongToDoubleFunction    long -> double
        //          DoubleToLongFunction    double -> long
        //          DoubleToIntFunction     double -> int

        // Supplier<T> : 参数 无 返回值T
        // UnaryOperator<T> :参数T 返回值 T
        // BiFunction<T,U,R> : 参数 T、U 返回值 R
        // BinaryOperator<T> ：参数 T、T 返回值 T
        // BiPredicate<T,U> :  参数T、U  返回值 boolean
        // BiConsumer<T,U> :    参数T、U 无返回值

		 
		/**
		 * Lambda闭包
		 */
		
		/**
         * lambda的闭包会提升包围变量的生命周期
         * 所以局部变量 num在getNumber()方法内被 get()引用 不会在getNumber()方法执行后销毁
         * 这种方法可以在外部获取到某一个方法的局部变量
         */
        int n=getNumber().get();
        System.out.println(n);

        int a=10;
        Consumer<Integer> c=ele->{
            System.out.println(a+1);
            //System.out.println(ele);
            //System.out.println(a++); 会报错
            //在lambda中引用局部变量 这个变量必须是一个常量
        };
        //a++; 这样也会导致内部报错
        //如果在内部已经引用局部变量 参数传递后 打印的还是 10
        c.accept(1);
    }
  
	private static Supplier<Integer> getNumber(){
		int num=10;
	    /**
	     * Supplier supplier=()->num;
	     * return supplier;
	     */
    	return ()-> num;

	}



	
}
