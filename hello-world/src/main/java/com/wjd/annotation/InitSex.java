package com.wjd.annotation;

import java.lang.annotation.*;

/**
 * 性别赋值
 *
 * @author wangjd
 * @since 2020/9/7
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Inherited
public @interface InitSex {

	/**
	 * 性别枚举（男，女）
	 */
	enum SEX_TYPE {MAN, WOMAN}

	SEX_TYPE sex() default SEX_TYPE.MAN;
}