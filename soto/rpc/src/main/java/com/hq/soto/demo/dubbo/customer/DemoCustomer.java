package com.hq.soto.demo.dubbo.customer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.hq.scrati.framework.FrameworkInvoker;

public class DemoCustomer {
    @Autowired
    private FrameworkInvoker frameworkInvoker;

	public void getProvince(){
		Map<String, Object> map = new HashMap<>();
		map.put("params", "1");
		map.put("params2", "2");
		Object entity =  frameworkInvoker.invoke("management_baseParam_getProvince", "1.0", map);
		System.out.println(JSON.toJSON(entity).toString());
	}

}
