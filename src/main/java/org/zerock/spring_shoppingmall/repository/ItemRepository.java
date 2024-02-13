package org.zerock.spring_shoppingmall.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.spring_shoppingmall.domain.Item;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemName(String itemName);


}
