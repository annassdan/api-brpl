package e.brpl.utils.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;


/**
 *
 * @param <Entity>
 * @param <ID>
 */
@NoRepositoryBean
@SuppressWarnings("unused")
public interface EBrplRepository<Entity, ID extends Serializable> extends PagingAndSortingRepository<Entity, ID>, JpaSpecificationExecutor<Entity> {


}
