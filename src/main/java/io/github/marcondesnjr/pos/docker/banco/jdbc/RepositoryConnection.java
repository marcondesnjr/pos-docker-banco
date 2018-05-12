/*
 * 
 */
package io.github.marcondesnjr.pos.docker.banco.jdbc;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.sql.DataSource;
import org.postgresql.ds.PGPoolingDataSource;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
public class RepositoryConnection {
    
    @Inject
    private DBConfig dbConfig;
    
    private static final int MIN_CONNECTIONS = 1;
    private static final int MAX_CONNECTIONS = 1;
    
    @Produces
    @ApplicationScoped
    public DataSource getDataSource(){
        
    
        PGPoolingDataSource ds = new PGPoolingDataSource();
        ds.setDataSourceName("Main DataSource");
        
        
        ds.setServerName(dbConfig.getServerName());
        ds.setDatabaseName(dbConfig.getDataBaseName());
        ds.setPortNumber(dbConfig.getPort());
        ds.setUser(dbConfig.getUser());
        ds.setPassword(dbConfig.getPassword());
        
        ds.setInitialConnections(MIN_CONNECTIONS);
        ds.setMaxConnections(MAX_CONNECTIONS);
        
        return ds;
    
    }
    
}
