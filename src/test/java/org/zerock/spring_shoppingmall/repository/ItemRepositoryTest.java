package org.zerock.spring_shoppingmall.repository;

import jakarta.persistence.Lob;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.spring_shoppingmall.domain.Item;
import org.zerock.spring_shoppingmall.domain.ItemSellStatus;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;


    @Test
    void createItem() {
        for (int i = 0; i < 11; i++) {
            Item item = new Item();
            item.setItemName("상품"+i);
            item.setItemDetail("상품 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockAmount(10);
            item.setPrice(10000);


            Item saveItem = itemRepository.save(item);

            System.out.println(saveItem);
        }
    }

    @Test
    public void findByName() {
        this.createItem();
        List<Item> items = itemRepository.findByItemName("상품1");
        for (Item item : items) {
            System.out.println(item.toString());
        }

    }


}