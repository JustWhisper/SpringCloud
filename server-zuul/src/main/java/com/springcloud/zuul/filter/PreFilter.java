package com.springcloud.zuul.filter;


import com.netflix.zuul.ZuulFilter;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Component
public class PreFilter extends ZuulFilter{

	private org.slf4j.Logger logger = LoggerFactory.getLogger(PreFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		logger.info("pre-模拟身份认证");
//		RequestContext ctx = RequestContext.getCurrentContext();
//		ctx.put("start",System.currentTimeMillis());
		return null;
	}
}
