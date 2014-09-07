package com.creacodetive.api.inject;

import java.util.Properties;

import com.creacodetive.api.managers.PublicManager;
import com.creacodetive.api.managers.UserManager;
import com.creacodetive.api.managers.impl.PublicManagerImpl;
import com.creacodetive.api.managers.impl.UserManagerImpl;
import com.creacodetive.api.services.PublicService;
import com.creacodetive.api.services.UserService;
import com.creacodetive.api.services.impl.PublicServiceImpl;
import com.creacodetive.api.services.impl.UserServiceImpl;
import com.creacodetive.utils.PropertiesUtil;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

/**
 * Module in charge of binding all the interfaces to google guice
 * so the latter can handle all the injections when needed.
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public class ApiGuiceModule extends AbstractModule
{

    private Properties properties;

    public ApiGuiceModule()
    {
        loadProperties();
    }

    /**
     * This method will set the property attribute so the various properties within the file
     * can be injected and used directly in any class on the fly using @Inject @Named guice annotations.
     * @return
     */
    public Properties loadProperties()
    {
        properties = PropertiesUtil.getInstance().loadProperties("/api.properties");
        String path = System.getProperty("api.properties.path");
        if (path != null && this.properties != null)
        {
            properties.putAll(PropertiesUtil.getInstance().loadProperties(path));
        }
        return properties;
    }

    @Override
    public void configure()
    {
        Names.bindProperties(binder(), properties);
        initManagers();
        initServices(); 
    }

    private void initManagers()
    {
        bind(PublicManager.class).to(PublicManagerImpl.class).in(Singleton.class);
        bind(UserManager.class).to(UserManagerImpl.class).in(Singleton.class);
    }

    private void initServices()
    {
        bind(PublicService.class).to(PublicServiceImpl.class).in(Singleton.class);
        bind(UserService.class).to(UserServiceImpl.class).in(Singleton.class);
    }
    
}
