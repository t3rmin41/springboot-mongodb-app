package com.domain.config;

import java.io.IOException;
import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
//import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;
import com.mongodb.ServerAddress;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@Configuration
public class MongoDbConfig extends AbstractMongoConfiguration {

  private static final String MONGO_DB_HOST = "127.0.0.1";
  private static final int MONGO_DB_PORT = 27017;
  private static final String MONGO_DB_NAME = "embedded_db";
  private static final String MONGO_DB_USERNAME = "test";
  private static final String MONGO_DB_PASSWORD = "test";

//  @Bean
//  public MongoTemplate mongoTemplate() throws IOException {
//    EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();
//    mongo.setBindIp(MONGO_DB_URL);
//    MongoClient mongoClient = mongo.getObject();
//    MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, MONGO_DB_NAME);
//    return mongoTemplate;
//  }

  @Bean
  public MongoDbFactory mongoDbFactory() throws Exception {
    SimpleMongoDbFactory factory = new SimpleMongoDbFactory(mongo(), MONGO_DB_NAME);
    return factory;
  }
  
  @Override
  protected String getDatabaseName() {
    return MONGO_DB_NAME;
  }


  @Override
  public Mongo mongo() throws Exception {
    MongoClient mongoClient = new MongoClient(new ServerAddress(MONGO_DB_HOST, MONGO_DB_PORT),
        Collections.singletonList(MongoCredential.createCredential(MONGO_DB_USERNAME, MONGO_DB_NAME, MONGO_DB_PASSWORD.toCharArray())));
    return mongoClient;
  }
  
  @Bean
  public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory, MongoMappingContext context) throws Exception {
    //MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory()), context);
    //converter.setTypeMapper(new DefaultMongoTypeMapper(null));
    //MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);
    MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
    return mongoTemplate;
  }



  
}
