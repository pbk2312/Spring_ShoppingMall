package org.zerock.spring_shoppingmall.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item {

    @Id
    @Column(name = "item_num")
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long num;

    @Column(nullable = false,length = 50)
    private String item_name; // 상풍명

    @Column(nullable = false,length = 30)
    private int price; // 가격

    @Column(nullable = false)
    private int stockAmount; // 재고 수량

    @Lob
    @Column(nullable = false)
    private String itemDetail; //상품 상세 설명

    @Enumerated(EnumType.STRING) // 열거형필드 데이터베이스에 매핑
    private ItemSellStatus itemSellStatus; //상품 판매 상태



}
