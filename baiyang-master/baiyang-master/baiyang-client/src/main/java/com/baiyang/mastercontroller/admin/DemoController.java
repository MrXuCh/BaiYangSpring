package com.baiyang.mastercontroller.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baiyang.service.do_inteface.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Reference(version = "1.0.0")
	private DemoService demoService;

	@RequestMapping("demo")
	public String demo(){
		return demoService.baiyangHello("baiyang");
	}
}
