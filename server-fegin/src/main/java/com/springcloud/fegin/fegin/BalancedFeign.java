package com.springcloud.fegin.fegin;

import com.springcloud.fegin.hystric.SchedualServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-center" , fallback = SchedualServiceHystric.class)
@EnableHystrix
public interface BalancedFeign {
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	String sayFromClientOne();
}
