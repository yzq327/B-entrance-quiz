package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}

// TODO GTB-综合: * 完成度太低，无法针对各维度做出评价
// TODO GTB-工程实践: - application的所有代码应放在com.thoughtworks.capability.gtb.entrancequiz包里面
// TODO GTB-知识点: * 使用了CorsFilter设置跨域