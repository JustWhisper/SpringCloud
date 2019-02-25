package com.springcloud.fegin.hystric;

import com.springcloud.fegin.fegin.BalancedFeign;

public class SchedualServiceHystric implements BalancedFeign {
	@Override
	public String sayFromClientOne() {
		return "此服务挂了";
	}
}
