package org.ejemplosclases.smga.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.ejemplosclases.smga.model.Order;

@Data
public class OrderRequest {
    @NotNull
    @Size(min = 1, max = 100)
    private String customerName;

    @NotNull
    @Size(min = 1, max = 100)
    private String product;

    @Positive
    private int quantity;
}

