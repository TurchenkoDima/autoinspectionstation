package com.courseproject.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {

    // Метода запускается при старте приложения
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Создаём web конктекст
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        // Регистрируем в него два наших конфиг класса.
        context.register(SpringConfig.class, WebConfig.class);
        // Устанавливаем в web context сервлет контекст который приходит в метод
        context.setServletContext(servletContext);

        //Диспетчер сервлетов который распределяет запросы по контроллерам. Передаём его в ServletContext.
        // Это нужно чтобы не писать настройку диспетчера сервлетов в web-xml. Вот ссылка -> http://javastudy.ru/spring-mvc/spring-mvc-basic/
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/app/*");

    }
}
