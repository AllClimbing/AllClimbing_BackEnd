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
	
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			{
		
		//
		if(request.getMethod().equals("OPTIONS"))
			return true;
		
		
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
