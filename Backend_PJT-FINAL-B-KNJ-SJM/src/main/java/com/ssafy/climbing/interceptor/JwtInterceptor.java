package com.ssafy.climbing.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ssafy.climbing.util.JwtUtil;

@Component
public class JwtInterceptor implements HandlerInterceptor{
	private static final String HEADER_AUTH = "access-token";
	
	
	//인터셉터는 페이지변화는 없을 때
	@Autowired
	private JwtUtil jwtUtil;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			{
		
		System.out.println(request.getMethod());
		System.out.println(request.getHeader(HEADER_AUTH));
		
		String token = request.getHeader(HEADER_AUTH);
		
		if(token != null) {
			try {
				jwtUtil.valid(token);
				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return false;
			}
		}
		
		return false;
		
		
	}
}
