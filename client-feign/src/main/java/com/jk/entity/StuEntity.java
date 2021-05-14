/** 
 * <pre>项目名称:jk_net_wh 
 * 文件名称:StuEntity.java 
 * 包名:com.jk.wh.entity 
 * 创建日期:2021年5月6日下午5:46:53 
 * Copyright (c) 2021, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.entity;

/** 
 * <pre>项目名称：jk_net_wh    
 * 类名称：StuEntity    
 * 类描述：    
 * 创建人：王虎
 * 创建时间：2021年5月6日 下午5:46:53    
 * 修改人：王虎
 * 修改时间：2021年5月6日 下午5:46:53    
 * 修改备注：       
 * @version </pre>    
 */
public class StuEntity {

	private String name;
	
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

	   
	   
	/**    
	 * <pre>创建一个新的实例 StuEntity.    
	 *    </pre>    
	 */
	public StuEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <pre>创建一个新的实例 StuEntity.    
	 *    
	 * @param name
	 * @param age</pre>    
	 */
	public StuEntity(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "StuEntity [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
