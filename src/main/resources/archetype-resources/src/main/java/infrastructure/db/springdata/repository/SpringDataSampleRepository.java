#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.db.springdata.repository;

import ${package}.infrastructure.db.springdata.dbo.SampleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO: Delete this sample class
 */

@Repository
public interface SpringDataSampleRepository extends MongoRepository<SampleEntity, Long> {
}
