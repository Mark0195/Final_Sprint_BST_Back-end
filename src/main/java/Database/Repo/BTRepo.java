package Database.Repo;

import Database.DataRest.BST;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "BST", path = "BST")
public interface BTRepo extends PagingAndSortingRepository<BST, Long> {
    List<BST> findById(@Param("id") long id);
    List<BST> findByInput(@Param("input") String input);
}
