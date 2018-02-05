package ecoservices.warehouseservice.repository;

import ecoservices.warehouseservice.domain.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock, Long> {
}
