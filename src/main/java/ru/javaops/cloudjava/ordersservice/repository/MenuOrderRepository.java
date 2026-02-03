package ru.javaops.cloudjava.ordersservice.repository;


import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import ru.javaops.cloudjava.ordersservice.storage.model.MenuOrder;

/**
 * {@code @author:} TaranenkoAnt
 * {@code @createDate:} 03.02.2026
 */
public interface MenuOrderRepository extends ReactiveCrudRepository<Long, MenuOrder> {

    Flux<MenuOrder> findAllByCreatedAt(String username, Pageable pageable);
}
