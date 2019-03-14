package com.spb;

import com.spb.config.RootConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xinpc on 2019-03-14
 * SpringBoot 启动文件
 * @desc
 */
public class Application {

	public static void main(String[] args) {
		ApplicationContext application = new AnnotationConfigApplicationContext(RootConfig.class);
	}
}
