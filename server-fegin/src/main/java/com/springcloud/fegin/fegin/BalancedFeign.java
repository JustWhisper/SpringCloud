package com.springcloud.fegin.fegin;

import com.springcloud.fegin.hystric.SchedualServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-center" , fallback = SchedualServiceHystric.class)
@EnableHystrix
public interface BalancedFeign {
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	String sayFromClientOne();
}
//
//@FeignClient()
//public interface TccClient{
//	/**
//	 * eureka service name
//	 */
//	String SERVICE_ID = "tcc";
//	/**
//	 * api prefix
//	 */
//	String API_PATH = "/api/v1/coordinator";
//
//	@RequestMapping(value = API_PATH + "/confirmation", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
//	void confirm(@RequestBody TccRequest request);
//
//	@RequestMapping(value = API_PATH + "/cancellation", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
//	void cancel(@RequestBody TccRequest request);
//		}
