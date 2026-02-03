package ru.javaops.cloudjava.ordersservice.storage.model;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;
import java.util.List;

/**
 * {@code @author:} TaranenkoAnt
 * {@code @createDate:} 03.02.2026
 *
 * CREATE TABLE IF NOT EXISTS orders (
 *     id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
 *     total_price NUMERIC(6, 2) NOT NULL,
 *     city TEXT NOT NULL,
 *     street TEXT NOT NULL,
 *     house INTEGER NOT NULL,
 *     apartment INTEGER NOT NULL,
 *     menu_line_items JSONB NOT NULL,
 *     status TEXT NOT NULL,
 *     created_by TEXT NOT NULL,
 *     created_at TIMESTAMP NOT NULL,
 *     updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
 * );
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MenuOrder {

    @Id
    private Long id;
    private double totalPrice;
    private String city;
    private String street;
    private int house;
    private int apartment;
    private List<MenuLineItem> menuLineItems;
    private String status;
    private String createdBy;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
