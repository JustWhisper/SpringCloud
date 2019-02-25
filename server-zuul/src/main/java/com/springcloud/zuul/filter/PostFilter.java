package com.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class PostFilter extends ZuulFilter {

	private org.slf4j.Logger log = LoggerFactory.getLogger(PostFilter.class);

	public PostFilter(){
		super();
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		log.info("post....");
//		RequestContext ctx = RequestContext.getCurrentContext();
//		long total = System.currentTimeMillis() - (long) ctx.get("start");
//		log.info("the request use:total=" + total + "ms");
//        ctx.addZuulResponseHeader(); 增加反应的头
		return null;
	}
}
