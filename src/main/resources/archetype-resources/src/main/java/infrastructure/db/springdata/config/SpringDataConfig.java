#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.db.springdata.config;

import ${package}.infrastructure.db.springdata.mapper.SampleMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories({"${package}.infrastructure.db.springdata.repository"})
public class SpringDataConfig {
    @Bean
    public SampleMapper sampleMapper() {
        return new SampleMapper();
    }
}
