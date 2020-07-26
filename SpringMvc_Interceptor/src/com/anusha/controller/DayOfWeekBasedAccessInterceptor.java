package com.anusha.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		Calendar cal = Calendar.getInstance();

		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if (dayOfWeek == 1) {
			response.getWriter().write(
					"The website is closed on sunday; please try accessing it"
							+ "on any ather week day!!");
			return false;
		}
		return true;

	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelandview) throws Exception {
		System.out
				.println("HandlerInterceptorAdapter : Spring MVC called postHandle method for "
						+ request.getRequestURI().toString());
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) throws Exception {
		System.out
				.println("HandlerInterceptorAdapter : Spring MVC called aftercompletion method for "
						+ request.getRequestURI().toString());

	}

}
