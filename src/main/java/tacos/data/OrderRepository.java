package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.model.TacoOrder;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> findByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);

}
