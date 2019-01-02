package com.baiyang.serviceimpl.do_impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baiyang.service.do_inteface.DemoService;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
	@Override
	public String baiyangHello(String name) {
		return "Hello "+name;
	}
}
