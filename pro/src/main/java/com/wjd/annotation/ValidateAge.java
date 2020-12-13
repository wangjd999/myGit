package com.wjd.annotation;

import java.lang.annotation.*;

/**
 * 年龄校验
 *
 * @author wangjd
 * @since 2020/9/7
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Inherited
public @interface ValidateAge {

	/**
	 * 最小年龄
	 *
	 * @return 18
	 */
	int min() default 18;

	/**
	 * 最大年龄
	 *
	 * @return 99
	 */
	int max() default 99;

	/**
	 * 年龄值
	 *
	 * @return 20
	 */
	int value() default 20;
}