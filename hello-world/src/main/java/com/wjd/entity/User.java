package com.wjd.entity;

import com.wjd.annotation.InitSex;
import com.wjd.annotation.ValidateAge;

/**
 * @author wangjd
 * @since 2020/9/28
 **/
public class User {
	/**
	 * 姓名
	 */
	private String userName;

	/**
	 * 年龄
	 */
	@ValidateAge(min = 20, max = 35, value = 22)
	private int age;

	/**
	 * 性别
	 */
	@InitSex(sex = InitSex.SEX_TYPE.MAN)
	private String sex;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}