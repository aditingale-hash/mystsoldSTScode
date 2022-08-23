package com.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.main.ServletConfig;

public class AppInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] classes=new Class[] {ServletConfig.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] str=new String[] {"/"};
		
		return str;
	}

}
