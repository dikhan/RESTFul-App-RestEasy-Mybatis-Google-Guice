package com.creacodetive.api.inject;

import com.creacodetive.orm.inject.OrmGuiceModule;
import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Main Guice configuration module.
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public class MainGuiceModule implements Module
{

    public void configure(Binder binder)
    {
        binder.install(new OrmGuiceModule());
        binder.install(new ApiGuiceModule());
    }
}
