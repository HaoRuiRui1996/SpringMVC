package com.test.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final String LOCATION = "Q:/upload/";
    private static final long MAX_FILE_SIZE = 5242880L; //上传文件的最大容量
    private static final long MAX_REQUEST_SIZE = 26214400L; //一个multipart请求的最大容量
    private static final int FILE_SIZE_THRESHOLD = 0;  //文件达到一个指定的大小，写入临时文件路径

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        servletContext.addFilter("name", new CharacterEncodingFilter("UTF-8", true))
                .addMappingForUrlPatterns(null, false, "/*");
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        super.customizeRegistration(registration);
        registration.setMultipartConfig(getMultipartConfigElement());
    }

    public MultipartConfigElement getMultipartConfigElement() {
        return new MultipartConfigElement(LOCATION, MAX_FILE_SIZE, MAX_REQUEST_SIZE,
                FILE_SIZE_THRESHOLD);
    }



}
