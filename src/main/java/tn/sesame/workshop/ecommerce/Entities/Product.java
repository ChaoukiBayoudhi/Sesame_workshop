package tn.sesame.workshop.ecommerce.Entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String label;
    BigDecimal price;
    int stock;
    LocalDate manifacturingDate;
    @Lob
    byte[] image;
}
