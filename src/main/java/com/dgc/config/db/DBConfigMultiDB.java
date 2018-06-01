package com.dgc.config.db;

//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
public class DBConfigMultiDB {

//	https://medium.com/@joeclever/using-multiple-datasources-with-spring-boot-and-spring-data-6430b00c02e7
//	https://github.com/eugenp/tutorials/tree/master/persistence-modules
		
//	@Bean(name = "pgDataSource")
//	@ConfigurationProperties(prefix = "pg.datasource")
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
//	}
//	
//	 @Bean(name = "pgEntityManagerFactory")
//	  public LocalContainerEntityManagerFactoryBean pgEntityManagerFactory(
//	    EntityManagerFactoryBuilder builder,
//	    @Qualifier("readDataSource") DataSource dataSource) {
//	    return
//	      builder
//	        .dataSource(dataSource)
//	        .packages("com.dgc.pg.domain")
//	        .persistenceUnit("read")
//	        .build();
//	  }
//
//	  @Bean(name = "pgTransactionManager")
//	  public PlatformTransactionManager pgTransactionManager(
//	    @Qualifier("pgEntityManagerFactory") EntityManagerFactory barEntityManagerFactory) {
//	    return new JpaTransactionManager(barEntityManagerFactory);
//	  }

}
