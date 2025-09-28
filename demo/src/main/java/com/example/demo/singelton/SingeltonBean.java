package com.example.demo.singelton;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class SingeltonBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    // Using the application context to inject the prototye scoped bean in singelton
    // scoped bean
    public PrototypeBean getPrototypeBean() {
        return this.applicationContext.getBean(PrototypeBean.class);
    }

    // “Here, Spring will dynamically overrides getPrototypeBean() method annotated
    // with @Lookup and it will look up the bean which is the return type of this
    // method. Spring uses CGLIB library to do this.”
    @Lookup
    public PrototypeBean getPrototypeBeanFromLookup() {
        return null;
    }

    // Scoped Proxy
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public PrototypeBean getPrototypeBeanFromScope() {
        return new PrototypeBean();
    }

}
