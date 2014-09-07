package com.creacodetive.orm.inject;

import java.util.Properties;

import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;

import com.creacodetive.orm.dao.UserDAO;
import com.creacodetive.orm.dao.impl.UserDAOImpl;
import com.creacodetive.orm.mappers.UserMapper;
import com.creacodetive.utils.PropertiesUtil;
import com.google.inject.name.Names;

/**
 * Guice configuration module for the database access layer.
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public class OrmGuiceModule extends MyBatisModule
{

    private final Properties properties;

    public OrmGuiceModule()
    {
        properties = PropertiesUtil.getInstance().loadProperties("/orm.properties");
        String path = System.getProperty("orm.properties.path");
        if (path != null && this.properties != null){
            properties.putAll(PropertiesUtil.getInstance().loadProperties(path));
        }
    }
    
    @Override protected void initialize()
    {
   
    	Names.bindProperties(binder(), properties);
    	
        bindDataSourceProviderType(PooledDataSourceProvider.class);
        bindTransactionFactoryType(JdbcTransactionFactory.class);

        // binding DAOs
        binder().bind(UserDAO.class).to(UserDAOImpl.class);

        // loads mappers from the package
        addMapperClasses(UserMapper.class.getPackage().getName());
       
    }

}
