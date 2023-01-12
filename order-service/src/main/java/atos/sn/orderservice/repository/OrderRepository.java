package atos.sn.orderservice.repository;

import atos.sn.orderservice.entities.Order;
import atos.sn.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {
}
