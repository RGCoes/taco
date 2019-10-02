package sia.tacocloud.Repositories;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.Taco;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {
}
